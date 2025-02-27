package mpo.dayon.common.version;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class Version {
    private static final Version VERSION_NULL = new Version(null);
    public static final String RELEASE_LOCATION = "https://github.com/retgal/Dayon/releases/";

    private final String numericVersion;
    private String latestVersion;

    private final int major;
    private final int minor;

    private Version(String numericVersion) {
        this.numericVersion = numericVersion == null ? "0.0.0" : numericVersion;

        final int firstDotPos = this.numericVersion.indexOf('.');
        final int lastDotPos = this.numericVersion.lastIndexOf('.');

        this.major = Integer.valueOf(this.numericVersion.substring(0, firstDotPos));
        this.minor = Integer.valueOf(this.numericVersion.substring(firstDotPos + 1, lastDotPos));
    }

    public static Version get() {
        final String v = Version.class.getPackage().getImplementationVersion();

        if (v == null) {
            return VERSION_NULL;
        }

        return new Version(v);
    }

    public boolean isNull() {
        return this == VERSION_NULL;
    }

    public int getMajor() {
        return major;
    }

    public int getMinor() {
        return minor;
    }

    @Override
    public String toString() {
        return 'v' + numericVersion;
    }

    boolean isLatestVersion() {
        return getLatestRelease().equals(numericVersion);
    }

    public String getLatestRelease() {
        if (latestVersion == null) {
            HttpsURLConnection conn = null;
            try {
                URL obj = new URL(RELEASE_LOCATION + "latest");
                conn = (HttpsURLConnection) obj.openConnection();
                conn.setInstanceFollowRedirects(false);
                conn.setReadTimeout(10000);
            } catch (IOException e) {
                // offline?
            } finally {
                Objects.requireNonNull(conn).disconnect();
            }

            String latestLocation = conn.getHeaderField("Location");
            if (latestLocation != null) {
                latestVersion = latestLocation.substring(latestLocation.lastIndexOf('v'));
            }
        }
        return latestVersion;
    }
}
