package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Laptop: ImageVector
    get() {
        if (_laptop != null) return _laptop!!
        _laptop = phosphorRegularIcon(
            name = "Laptop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 168h-8v-96C224 58.745 213.255 48 200 48h-144C42.745 48 32 58.745 32 72v96h-8c-4.418 0-8 3.582-8 8v16c0 13.255 10.745 24 24 24h176c13.255 0 24-10.745 24-24v-16c0-4.418-3.582-8-8-8ZM48 72c0-4.418 3.582-8 8-8h144c4.418 0 8 3.582 8 8v96h-160ZM224 192c0 4.418-3.582 8-8 8h-176c-4.418 0-8-3.582-8-8v-8h192ZM152 88c0 4.418-3.582 8-8 8h-32c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h32c4.418 0 8 3.582 8 8Z"),
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
        return _laptop!!
    }

private var _laptop: ImageVector? = null
