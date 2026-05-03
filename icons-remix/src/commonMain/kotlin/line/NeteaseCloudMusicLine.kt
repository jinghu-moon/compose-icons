package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.NeteaseCloudMusicLine: ImageVector
    get() {
        if (_neteaseCloudMusicLine != null) return _neteaseCloudMusicLine!!
        _neteaseCloudMusicLine = remixIcon(
            name = "NeteaseCloudMusicLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.422 11.375 C 10.128 12.403 10.434 13.439 11.206 14.028 C 12.267 14.838 13.771 14.329 14.080 13.033 C 14.160 12.696 14.183 12.311 14.107 11.977 C 13.877 10.976 13.586 9.989 13.315 8.981 C 11.984 9.135 10.772 10.153 10.422 11.375 ZM 15.970 11.088 C 16.243 12.100 16.255 13.105 15.844 14.087 C 14.715 16.778 11.122 17.229 9.270 14.914 C 7.968 13.287 7.991 10.953 9.330 9.180 C 10.110 8.148 11.134 7.473 12.378 7.126 C 12.501 7.092 12.624 7.058 12.757 7.022 C 12.673 6.607 12.569 6.206 12.514 5.798 C 12.337 4.481 13.026 3.295 14.258 2.757 C 15.484 2.223 16.966 2.542 17.789 3.517 C 18.194 3.997 18.183 4.599 17.763 4.982 C 17.351 5.359 16.767 5.328 16.328 4.891 C 16.081 4.646 15.818 4.451 15.451 4.456 C 14.926 4.462 14.464 4.874 14.506 5.393 C 14.543 5.861 14.679 6.324 14.806 6.779 C 14.828 6.857 15.022 6.914 15.144 6.932 C 16.478 7.129 17.648 7.663 18.617 8.608 C 21.174 11.101 21.477 15.139 19.288 18.048 C 17.759 20.080 15.679 21.216 13.161 21.457 C 8.540 21.898 4.497 18.928 3.462 14.399 C 2.515 10.255 4.840 5.831 8.795 4.250 C 9.381 4.016 9.938 4.219 10.166 4.748 C 10.398 5.285 10.147 5.834 9.556 6.098 C 7.188 7.158 5.739 8.953 5.341 11.521 C 4.808 14.955 6.997 18.298 10.342 19.243 C 13.064 20.012 15.999 19.076 17.649 16.912 C 19.235 14.833 19.048 11.813 17.222 10.039 C 16.717 9.548 16.125 9.215 15.399 9.026 C 15.597 9.742 15.788 10.414 15.970 11.088 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _neteaseCloudMusicLine!!
    }

private var _neteaseCloudMusicLine: ImageVector? = null
