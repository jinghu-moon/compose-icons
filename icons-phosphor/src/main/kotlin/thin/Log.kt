package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Log: ImageVector
    get() {
        if (_log != null) return _log!!
        _log = phosphorThinIcon(
            name = "Log",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 136.000 C 208.000 140.418 204.418 144.000 200.000 144.000 C 195.582 144.000 192.000 140.418 192.000 136.000 C 192.000 131.582 195.582 128.000 200.000 128.000 C 204.418 128.000 208.000 131.582 208.000 136.000 ZM 244.000 136.000 C 244.000 153.830 239.620 170.660 231.680 183.380 C 223.360 196.670 212.110 204.000 200.000 204.000 L 56.000 204.000 C 43.890 204.000 32.640 196.670 24.320 183.380 C 16.380 170.660 12.000 153.830 12.000 136.000 C 12.000 118.170 16.380 101.340 24.320 88.620 C 32.640 75.330 43.890 68.000 56.000 68.000 L 94.340 68.000 L 133.170 29.170 C 133.921 28.420 134.939 27.999 136.000 28.000 L 168.000 28.000 C 170.209 28.000 172.000 29.791 172.000 32.000 C 172.000 34.209 170.209 36.000 168.000 36.000 L 137.660 36.000 L 105.660 68.000 L 200.000 68.000 C 212.110 68.000 223.360 75.330 231.680 88.620 C 239.620 101.340 244.000 118.170 244.000 136.000 ZM 179.130 196.000 C 174.875 192.398 171.226 188.137 168.320 183.380 C 164.619 177.340 161.768 170.819 159.850 164.000 L 80.000 164.000 C 77.791 164.000 76.000 162.209 76.000 160.000 C 76.000 157.791 77.791 156.000 80.000 156.000 L 157.910 156.000 C 156.633 149.410 155.993 142.713 156.000 136.000 C 156.000 118.170 160.380 101.340 168.320 88.620 C 171.226 83.863 174.875 79.602 179.130 76.000 L 56.000 76.000 C 40.360 76.000 27.000 92.720 22.060 116.000 L 104.000 116.000 C 106.209 116.000 108.000 117.791 108.000 120.000 C 108.000 122.209 106.209 124.000 104.000 124.000 L 20.720 124.000 C 20.239 127.982 19.999 131.989 20.000 136.000 C 20.000 169.080 36.150 196.000 56.000 196.000 ZM 236.000 136.000 C 236.000 102.920 219.850 76.000 200.000 76.000 C 180.150 76.000 164.000 102.920 164.000 136.000 C 164.000 169.080 180.150 196.000 200.000 196.000 C 219.850 196.000 236.000 169.080 236.000 136.000 Z"),
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
        return _log!!
    }

private var _log: ImageVector? = null
