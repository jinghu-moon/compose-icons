package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Quote: ImageVector
    get() {
        if (_quote != null) return _quote!!
        _quote = lucideOutlineIcon(
            name = "Quote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 3.0f),
                    PathNode.CurveTo(14.895431f, 3.0f, 14.0f, 3.895431f, 14.0f, 5.0f),
                    PathNode.LineTo(14.0f, 11.0f),
                    PathNode.CurveTo(14.0f, 12.104569f, 14.895431f, 13.0f, 16.0f, 13.0f),
                    PathNode.CurveTo(16.552284f, 13.0f, 17.0f, 13.447715f, 17.0f, 14.0f),
                    PathNode.LineTo(17.0f, 15.0f),
                    PathNode.CurveTo(17.0f, 16.10457f, 16.10457f, 17.0f, 15.0f, 17.0f),
                    PathNode.CurveTo(14.447715f, 17.0f, 14.0f, 17.447716f, 14.0f, 18.0f),
                    PathNode.LineTo(14.0f, 20.0f),
                    PathNode.CurveTo(14.0f, 20.552284f, 14.447715f, 21.0f, 15.0f, 21.0f),
                    PathNode.CurveTo(18.31371f, 21.0f, 21.0f, 18.31371f, 21.0f, 15.0f),
                    PathNode.LineTo(21.0f, 5.0f),
                    PathNode.CurveTo(21.0f, 3.895431f, 20.10457f, 3.0f, 19.0f, 3.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 3.0f),
                    PathNode.CurveTo(3.895431f, 3.0f, 3.0f, 3.895431f, 3.0f, 5.0f),
                    PathNode.LineTo(3.0f, 11.0f),
                    PathNode.CurveTo(3.0f, 12.104569f, 3.895431f, 13.0f, 5.0f, 13.0f),
                    PathNode.CurveTo(5.552285f, 13.0f, 6.0f, 13.447715f, 6.0f, 14.0f),
                    PathNode.LineTo(6.0f, 15.0f),
                    PathNode.CurveTo(6.0f, 16.10457f, 5.10457f, 17.0f, 4.0f, 17.0f),
                    PathNode.CurveTo(3.447715f, 17.0f, 3.0f, 17.447716f, 3.0f, 18.0f),
                    PathNode.LineTo(3.0f, 20.0f),
                    PathNode.CurveTo(3.0f, 20.552284f, 3.447715f, 21.0f, 4.0f, 21.0f),
                    PathNode.CurveTo(7.313709f, 21.0f, 10.0f, 18.31371f, 10.0f, 15.0f),
                    PathNode.LineTo(10.0f, 5.0f),
                    PathNode.CurveTo(10.0f, 3.895431f, 9.104569f, 3.0f, 8.0f, 3.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _quote!!
    }

private var _quote: ImageVector? = null
