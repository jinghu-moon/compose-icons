package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Prohibit: ImageVector
    get() {
        if (_prohibit != null) return _prohibit!!
        _prohibit = phosphorLightIcon(
            name = "Prohibit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 218.000 128.000 C 218.019 149.794 210.095 170.848 195.710 187.220 L 68.780 60.290 C 95.342 37.022 133.062 31.448 165.218 46.040 C 197.375 60.631 218.019 92.688 218.000 128.000 ZM 38.000 128.000 C 37.981 106.206 45.905 85.152 60.290 68.780 L 187.220 195.710 C 160.658 218.978 122.938 224.552 90.782 209.960 C 58.625 195.369 37.981 163.312 38.000 128.000 Z"),
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
        return _prohibit!!
    }

private var _prohibit: ImageVector? = null
