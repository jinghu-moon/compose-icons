package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberCircleSeven: ImageVector
    get() {
        if (_numberCircleSeven != null) return _numberCircleSeven!!
        _numberCircleSeven = phosphorLightIcon(
            name = "NumberCircleSeven",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 156.910 84.560 C 158.034 86.162 158.306 88.210 157.640 90.050 L 125.640 178.050 C 124.778 180.422 122.524 182.000 120.000 182.000 C 119.318 181.992 118.642 181.870 118.000 181.640 C 116.504 181.097 115.285 179.981 114.612 178.539 C 113.939 177.096 113.866 175.446 114.410 173.950 L 143.430 94.000 L 104.000 94.000 C 100.686 94.000 98.000 91.314 98.000 88.000 C 98.000 84.686 100.686 82.000 104.000 82.000 L 152.000 82.000 C 153.956 82.002 155.788 82.957 156.910 84.560 Z"),
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
        return _numberCircleSeven!!
    }

private var _numberCircleSeven: ImageVector? = null
