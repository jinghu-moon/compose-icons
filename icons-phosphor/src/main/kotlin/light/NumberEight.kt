package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberEight: ImageVector
    get() {
        if (_numberEight != null) return _numberEight!!
        _numberEight = phosphorLightIcon(
            name = "NumberEight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 151.620 119.450 C 169.371 108.828 177.848 87.664 172.338 67.725 C 166.828 47.786 148.686 33.977 128.000 33.977 C 107.314 33.977 89.172 47.786 83.662 67.725 C 78.152 87.664 86.629 108.828 104.380 119.450 C 81.760 130.453 69.732 155.617 75.378 180.129 C 81.023 204.642 102.846 222.010 128.000 222.010 C 153.154 222.010 174.977 204.642 180.622 180.129 C 186.268 155.617 174.240 130.453 151.620 119.450 ZM 94.000 80.000 C 94.000 61.222 109.222 46.000 128.000 46.000 C 146.778 46.000 162.000 61.222 162.000 80.000 C 162.000 98.778 146.778 114.000 128.000 114.000 C 109.222 114.000 94.000 98.778 94.000 80.000 ZM 128.000 210.000 C 104.804 210.000 86.000 191.196 86.000 168.000 C 86.000 144.804 104.804 126.000 128.000 126.000 C 151.196 126.000 170.000 144.804 170.000 168.000 C 170.000 191.196 151.196 210.000 128.000 210.000 Z"),
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
        return _numberEight!!
    }

private var _numberEight: ImageVector? = null
