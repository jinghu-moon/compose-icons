package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Boules: ImageVector
    get() {
        if (_boules != null) return _boules!!
        _boules = phosphorLightIcon(
            name = "Boules",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 187.220 60.290 L 60.290 187.220 C 55.364 181.600 51.155 175.389 47.760 168.730 L 168.760 47.730 C 175.410 51.136 181.611 55.355 187.220 60.290 ZM 195.710 68.780 C 200.636 74.400 204.845 80.611 208.240 87.270 L 87.240 208.270 C 80.581 204.875 74.370 200.666 68.750 195.740 ZM 128.000 38.000 C 137.790 37.991 147.515 39.586 156.790 42.720 L 42.720 156.790 C 33.446 129.321 37.972 99.065 54.880 75.513 C 71.788 51.961 99.007 37.997 128.000 38.000 ZM 128.000 218.000 C 118.210 218.009 108.485 216.414 99.210 213.280 L 213.280 99.210 C 222.554 126.679 218.028 156.935 201.120 180.487 C 184.212 204.039 156.993 218.003 128.000 218.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _boules!!
    }

private var _boules: ImageVector? = null
