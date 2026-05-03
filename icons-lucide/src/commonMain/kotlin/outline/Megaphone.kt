package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Megaphone: ImageVector
    get() {
        if (_megaphone != null) return _megaphone!!
        _megaphone = lucideOutlineIcon(
            name = "Megaphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 6.0f),
                    PathNode.CurveTo(14.041379f, 6.078347f, 17.013905f, 5.087505f, 19.4f, 3.2f),
                    PathNode.CurveTo(19.703018f, 2.972737f, 20.108427f, 2.936181f, 20.447214f, 3.105573f),
                    PathNode.CurveTo(20.785997f, 3.274965f, 21.0f, 3.621228f, 21.0f, 4.0f),
                    PathNode.LineTo(21.0f, 16.0f),
                    PathNode.CurveTo(21.0f, 16.378773f, 20.785997f, 16.725035f, 20.447214f, 16.894426f),
                    PathNode.CurveTo(20.108427f, 17.06382f, 19.703018f, 17.027264f, 19.4f, 16.8f),
                    PathNode.CurveTo(17.013905f, 14.912496f, 14.041379f, 13.921654f, 11.0f, 14.0f),
                    PathNode.LineTo(5.0f, 14.0f),
                    PathNode.CurveTo(3.895431f, 14.0f, 3.0f, 13.104569f, 3.0f, 12.0f),
                    PathNode.LineTo(3.0f, 8.0f),
                    PathNode.CurveTo(3.0f, 6.895431f, 3.895431f, 6.0f, 5.0f, 6.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 14.0f),
                    PathNode.CurveTo(6.0f, 16.596443f, 6.842135f, 19.122847f, 8.4f, 21.2f),
                    PathNode.CurveTo(9.062741f, 22.083656f, 10.316344f, 22.262741f, 11.2f, 21.6f),
                    PathNode.CurveTo(12.083655f, 20.937258f, 12.262742f, 19.683655f, 11.6f, 18.8f),
                    PathNode.CurveTo(10.561423f, 17.41523f, 10.0f, 15.730962f, 10.0f, 14.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 6.0f),
                    PathNode.LineTo(8.0f, 14.0f)
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
        return _megaphone!!
    }

private var _megaphone: ImageVector? = null
