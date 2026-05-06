package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FadersHorizontal: ImageVector
    get() {
        if (_fadersHorizontal != null) return _fadersHorizontal!!
        _fadersHorizontal = phosphorBoldIcon(
            name = "FadersHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 80c0-6.627 5.373-12 12-12h28c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-28c-6.627 0-12-5.373-12-12ZM40 92h96v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-48c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v12h-96C33.373 68 28 73.373 28 80c0 6.627 5.373 12 12 12ZM216 164h-92c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h92c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM84 140c-6.627 0-12 5.373-12 12v12h-32c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h32v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-48c0-6.627-5.373-12-12-12Z"),
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
