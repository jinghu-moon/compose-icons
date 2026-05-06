package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SplitVertical: ImageVector
    get() {
        if (_splitVertical != null) return _splitVertical!!
        _splitVertical = phosphorLightIcon(
            name = "SplitVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M214 152c0 3.314-2.686 6-6 6h-74v59.51l21.76-21.75c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333l-32 32c-2.343 2.34-6.137 2.34-8.48 0l-32-32c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147L122 217.51v-59.51h-74c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h160c3.314 0 6 2.686 6 6ZM48 110h160c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-74v-59.51l21.76 21.75c2.364 2.203 6.048 2.138 8.333-.147 2.285-2.285 2.35-5.969 .147-8.333l-32-32c-2.343-2.34-6.137-2.34-8.48 0l-32 32c-2.203 2.364-2.138 6.048 .147 8.333 2.285 2.285 5.969 2.35 8.333 .147L122 38.49v59.51h-74c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6Z"),
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
        return _splitVertical!!
    }

private var _splitVertical: ImageVector? = null
