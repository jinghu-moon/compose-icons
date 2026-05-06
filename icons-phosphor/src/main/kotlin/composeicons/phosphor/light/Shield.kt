package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Shield: ImageVector
    get() {
        if (_shield != null) return _shield!!
        _shield = phosphorLightIcon(
            name = "Shield",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 42h-160C40.268 42 34 48.268 34 56v56c0 51.94 25.12 83.4 46.2 100.64 22.73 18.6 45.27 24.89 46.22 25.15 1.034 .282 2.126 .282 3.16 0 .95-.26 23.49-6.55 46.22-25.15C196.88 195.4 222 163.94 222 112v-56c0-7.732-6.268-14-14-14ZM210 112c0 37.76-13.94 68.39-41.44 91.06-12.064 9.907-25.799 17.58-40.56 22.66C113.237 220.645 99.501 212.971 87.44 203.06 59.94 180.39 46 149.76 46 112v-56c0-1.105 .895-2 2-2h160c1.105 0 2 .895 2 2Z"),
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
        return _shield!!
    }

private var _shield: ImageVector? = null
