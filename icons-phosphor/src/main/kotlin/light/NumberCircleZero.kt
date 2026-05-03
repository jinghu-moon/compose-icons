package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberCircleZero: ImageVector
    get() {
        if (_numberCircleZero != null) return _numberCircleZero!!
        _numberCircleZero = phosphorLightIcon(
            name = "NumberCircleZero",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 128.000 74.000 C 114.480 74.000 103.310 80.120 95.710 91.710 C 89.450 101.240 86.000 114.130 86.000 128.000 C 86.000 141.870 89.450 154.760 95.700 164.290 C 103.310 175.880 114.470 182.000 128.000 182.000 C 141.530 182.000 152.690 175.880 160.290 164.290 C 166.550 154.760 170.000 141.870 170.000 128.000 C 170.000 114.130 166.550 101.240 160.300 91.710 C 152.690 80.120 141.520 74.000 128.000 74.000 ZM 128.000 170.000 C 107.280 170.000 98.000 148.910 98.000 128.000 C 98.000 107.090 107.280 86.000 128.000 86.000 C 148.720 86.000 158.000 107.090 158.000 128.000 C 158.000 148.910 148.720 170.000 128.000 170.000 Z"),
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
        return _numberCircleZero!!
    }

private var _numberCircleZero: ImageVector? = null
