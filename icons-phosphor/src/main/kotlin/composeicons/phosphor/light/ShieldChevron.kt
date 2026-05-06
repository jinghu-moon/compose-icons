package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShieldChevron: ImageVector
    get() {
        if (_shieldChevron != null) return _shieldChevron!!
        _shieldChevron = phosphorLightIcon(
            name = "ShieldChevron",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 42h-160C40.268 42 34 48.268 34 56v56c0 51.94 25.12 83.4 46.2 100.64 22.73 18.6 45.27 24.89 46.22 25.15 1.034 .282 2.126 .282 3.16 0 .95-.26 23.49-6.55 46.22-25.15C196.88 195.4 222 163.94 222 112v-56c0-7.732-6.268-14-14-14ZM168.56 203.06c-12.064 9.907-25.799 17.58-40.56 22.66C113.237 220.645 99.501 212.971 87.44 203.06 77.279 194.797 68.63 184.833 61.88 173.61L128 127.32l66.12 46.29c-6.75 11.223-15.399 21.187-25.56 29.45ZM210 112c0 18.75-3.44 35.75-10.28 50.88L131.44 115.08c-2.066-1.445-4.814-1.445-6.88 0L56.28 162.88C49.44 147.75 46 130.75 46 112v-56c0-1.105 .895-2 2-2h160c1.105 0 2 .895 2 2Z"),
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
        return _shieldChevron!!
    }

private var _shieldChevron: ImageVector? = null
