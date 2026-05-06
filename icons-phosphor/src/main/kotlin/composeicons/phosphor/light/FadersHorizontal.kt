package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FadersHorizontal: ImageVector
    get() {
        if (_fadersHorizontal != null) return _fadersHorizontal!!
        _fadersHorizontal = phosphorLightIcon(
            name = "FadersHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M178 80c0-3.314 2.686-6 6-6h32c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-32c-3.314 0-6-2.686-6-6ZM40 86h106v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-48c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v18h-106c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6ZM216 170h-96c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h96c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM88 146c-3.314 0-6 2.686-6 6v18h-42c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h42v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-48c0-3.314-2.686-6-6-6Z"),
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
        return _fadersHorizontal!!
    }

private var _fadersHorizontal: ImageVector? = null
