package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Heart: ImageVector
    get() {
        if (_heart != null) return _heart!!
        _heart = phosphorLightIcon(
            name = "Heart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 178.000 42.000 C 157.000 42.000 138.740 51.470 128.000 67.340 C 117.260 51.470 99.000 42.000 78.000 42.000 C 44.879 42.039 18.039 68.879 18.000 102.000 C 18.000 131.200 36.200 161.590 72.100 192.310 C 88.550 206.328 106.320 218.719 125.160 229.310 C 126.933 230.263 129.067 230.263 130.840 229.310 C 149.680 218.719 167.450 206.328 183.900 192.310 C 219.800 161.590 238.000 131.200 238.000 102.000 C 237.961 68.879 211.121 42.039 178.000 42.000 ZM 128.000 217.110 C 111.590 207.640 30.000 157.720 30.000 102.000 C 30.028 75.502 51.502 54.028 78.000 54.000 C 98.280 54.000 115.310 64.830 122.450 82.270 C 123.375 84.521 125.567 85.990 128.000 85.990 C 130.433 85.990 132.625 84.521 133.550 82.270 C 140.690 64.830 157.720 54.000 178.000 54.000 C 204.498 54.028 225.972 75.502 226.000 102.000 C 226.000 157.720 144.410 207.640 128.000 217.110 Z"),
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
        return _heart!!
    }

private var _heart: ImageVector? = null
