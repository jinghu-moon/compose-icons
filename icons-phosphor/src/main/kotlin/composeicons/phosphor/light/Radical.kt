package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Radical: ImageVector
    get() {
        if (_radical != null) return _radical!!
        _radical = phosphorLightIcon(
            name = "Radical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M246 80v24c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-18h-101.84L85.62 210.11c-.877 2.345-3.117 3.899-5.62 3.899-2.503 0-4.743-1.554-5.62-3.899L26.38 82.11c-1.165-3.104 .406-6.565 3.51-7.73 3.104-1.165 6.565 .406 7.73 3.51L80 190.91l42.38-113c.873-2.349 3.114-3.908 5.62-3.91h112c3.314 0 6 2.686 6 6Z"),
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
        return _radical!!
    }

private var _radical: ImageVector? = null
