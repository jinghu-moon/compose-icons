package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FilmStrip: ImageVector
    get() {
        if (_filmStrip != null) return _filmStrip!!
        _filmStrip = phosphorRegularIcon(
            name = "FilmStrip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40h-176C31.163 40 24 47.163 24 56v144c0 8.837 7.163 16 16 16h176c8.837 0 16-7.163 16-16v-144c0-8.837-7.163-16-16-16ZM40 88h80v80h-80ZM136 72v-16h32v16ZM120 72h-32v-16h32ZM120 184v16h-32v-16ZM136 184h32v16h-32ZM136 168v-80h80v80ZM216 72h-32v-16h32ZM72 56v16h-32v-16ZM40 184h32v16h-32ZM216 200h-32v-16h32v16Z"),
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
        return _filmStrip!!
    }

private var _filmStrip: ImageVector? = null
