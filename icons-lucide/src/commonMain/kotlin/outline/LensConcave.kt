package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LensConcave: ImageVector
    get() {
        if (_lensConcave != null) return _lensConcave!!
        _lensConcave = lucideOutlineIcon(
            name = "LensConcave",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 2.0f),
                    PathNode.CurveTo(6.621228f, 2.0f, 6.274965f, 2.214002f, 6.105573f, 2.552786f),
                    PathNode.CurveTo(5.936181f, 2.89157f, 5.972737f, 3.296982f, 6.2f, 3.6f),
                    PathNode.CurveTo(9.933333f, 8.577778f, 9.933333f, 15.422222f, 6.2f, 20.4f),
                    PathNode.CurveTo(5.972737f, 20.703018f, 5.936181f, 21.108427f, 6.105573f, 21.447214f),
                    PathNode.CurveTo(6.274965f, 21.785997f, 6.621228f, 22.0f, 7.0f, 22.0f),
                    PathNode.LineTo(17.0f, 22.0f),
                    PathNode.CurveTo(17.378773f, 22.0f, 17.725035f, 21.785997f, 17.894426f, 21.447214f),
                    PathNode.CurveTo(18.06382f, 21.108427f, 18.027264f, 20.703018f, 17.8f, 20.4f),
                    PathNode.CurveTo(14.066667f, 15.422222f, 14.066667f, 8.577778f, 17.8f, 3.6f),
                    PathNode.CurveTo(18.027264f, 3.296982f, 18.06382f, 2.89157f, 17.894426f, 2.552786f),
                    PathNode.CurveTo(17.725035f, 2.214002f, 17.378773f, 2.0f, 17.0f, 2.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _lensConcave!!
    }

private var _lensConcave: ImageVector? = null
