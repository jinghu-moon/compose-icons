package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Tilde: ImageVector
    get() {
        if (_tilde != null) return _tilde!!
        _tilde = phosphorRegularIcon(
            name = "Tilde",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 222.230 130.590 C 207.720 148.590 193.390 158.190 178.430 159.760 C 176.935 159.919 175.433 159.999 173.930 160.000 C 154.630 160.000 138.540 146.900 122.930 134.200 C 108.020 122.060 93.930 110.590 79.230 112.200 C 68.720 113.300 57.920 120.920 46.230 135.480 C 43.394 138.646 38.578 139.042 35.263 136.382 C 31.949 133.722 31.293 128.934 33.770 125.480 C 48.280 107.480 62.610 97.880 77.570 96.310 C 98.890 94.060 116.260 108.200 133.050 121.870 C 147.960 134.010 162.050 145.490 176.750 143.870 C 187.260 142.770 198.060 135.150 209.750 120.590 C 211.476 118.184 214.390 116.927 217.325 117.325 C 220.260 117.723 222.734 119.709 223.758 122.488 C 224.781 125.267 224.186 128.384 222.210 130.590 Z"),
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
        return _tilde!!
    }

private var _tilde: ImageVector? = null
