package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MessageCircle: ImageVector
    get() {
        if (_messageCircle != null) return _messageCircle!!
        _messageCircle = lucideOutlineIcon(
            name = "MessageCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.992 16.342c.147 .371 .18 .777 .094 1.167L2.021 20.799c-.07 .339 .041 .69 .293 .928 .252 .238 .609 .329 .943 .24l3.413-.998c.368-.073 .749-.041 1.099 .092 4.409 2.059 9.659 .646 12.439-3.348C22.987 13.72 22.489 8.306 19.028 4.886 15.567 1.467 10.147 1.035 6.187 3.863 2.228 6.692 .88 11.959 2.992 16.342"),
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
        return _messageCircle!!
    }

private var _messageCircle: ImageVector? = null
