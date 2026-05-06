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
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM218 128c.019 21.794-7.905 42.848-22.29 59.22L68.78 60.29C95.342 37.022 133.062 31.448 165.218 46.04 197.375 60.631 218.019 92.688 218 128ZM38 128C37.981 106.206 45.905 85.152 60.29 68.78L187.22 195.71c-26.562 23.268-64.282 28.842-96.438 14.25C58.625 195.369 37.981 163.312 38 128Z"),
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
