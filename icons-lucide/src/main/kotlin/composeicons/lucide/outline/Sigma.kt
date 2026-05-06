package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Sigma: ImageVector
    get() {
        if (_sigma != null) return _sigma!!
        _sigma = lucideOutlineIcon(
            name = "Sigma",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 7v-2C18 4.448 17.552 4 17 4h-10.5c-.189 0-.363 .107-.447 .276-.085 .169-.066 .372 .047 .524l4.5 6c.533 .711 .533 1.689 0 2.4L6.1 19.2c-.114 .152-.132 .354-.047 .524 .085 .169 .258 .276 .447 .276h10.5c.552 0 1-.448 1-1v-2"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _sigma!!
    }

private var _sigma: ImageVector? = null
