package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WashingMachine: ImageVector
    get() {
        if (_washingMachine != null) return _washingMachine!!
        _washingMachine = phosphorLightIcon(
            name = "WashingMachine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 34h-160C40.268 34 34 40.268 34 48v160c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-160c0-7.732-6.268-14-14-14ZM210 208c0 1.105-.895 2-2 2h-160c-1.105 0-2-.895-2-2v-160c0-1.105 .895-2 2-2h160c1.105 0 2 .895 2 2ZM128 66C93.758 66 66 93.758 66 128c0 34.242 27.758 62 62 62 34.242 0 62-27.758 62-62C189.961 93.774 162.226 66.039 128 66ZM128 178C100.386 178 78 155.614 78 128c0-27.614 22.386-50 50-50 27.614 0 50 22.386 50 50-.033 27.601-22.399 49.967-50 50ZM198 68c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM124.24 116.24l-16 16c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333l16-16c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333ZM156.24 115.76c2.34 2.343 2.34 6.137 0 8.48l-32 32c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333l32-32c2.343-2.34 6.137-2.34 8.48 0Z"),
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
        return _washingMachine!!
    }

private var _washingMachine: ImageVector? = null
