package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LensConcave: ImageVector
    get() {
        if (_lensConcave != null) return _lensConcave!!
        _lensConcave = lucideOutlineIcon(
            name = "LensConcave",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 2c-.379 0-.725 .214-.894 .553-.169 .339-.133 .744 .094 1.047 3.733 4.978 3.733 11.822 0 16.8-.227 .303-.264 .708-.094 1.047C6.275 21.786 6.621 22 7 22h10c.379 0 .725-.214 .894-.553 .169-.339 .133-.744-.094-1.047C14.067 15.422 14.067 8.578 17.8 3.6c.227-.303 .264-.708 .094-1.047C17.725 2.214 17.379 2 17 2Z"),
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
        return _lensConcave!!
    }

private var _lensConcave: ImageVector? = null
