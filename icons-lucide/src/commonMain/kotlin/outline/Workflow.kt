package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Workflow: ImageVector
    get() {
        if (_workflow != null) return _workflow!!
        _workflow = lucideOutlineIcon(
            name = "Workflow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 3.0f),
                    PathNode.LineTo(9.0f, 3.0f),
                    PathNode.CurveTo(10.104569f, 3.0f, 11.0f, 3.895431f, 11.0f, 5.0f),
                    PathNode.LineTo(11.0f, 9.0f),
                    PathNode.CurveTo(11.0f, 10.104569f, 10.104569f, 11.0f, 9.0f, 11.0f),
                    PathNode.LineTo(5.0f, 11.0f),
                    PathNode.CurveTo(3.895431f, 11.0f, 3.0f, 10.104569f, 3.0f, 9.0f),
                    PathNode.LineTo(3.0f, 5.0f),
                    PathNode.CurveTo(3.0f, 3.895431f, 3.895431f, 3.0f, 5.0f, 3.0f),
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
                    PathNode.MoveTo(7.0f, 11.0f),
                    PathNode.LineTo(7.0f, 15.0f),
                    PathNode.CurveTo(7.0f, 16.10457f, 7.895431f, 17.0f, 9.0f, 17.0f),
                    PathNode.LineTo(13.0f, 17.0f)
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
                    PathNode.MoveTo(15.0f, 13.0f),
                    PathNode.LineTo(19.0f, 13.0f),
                    PathNode.CurveTo(20.10457f, 13.0f, 21.0f, 13.895431f, 21.0f, 15.0f),
                    PathNode.LineTo(21.0f, 19.0f),
                    PathNode.CurveTo(21.0f, 20.10457f, 20.10457f, 21.0f, 19.0f, 21.0f),
                    PathNode.LineTo(15.0f, 21.0f),
                    PathNode.CurveTo(13.895431f, 21.0f, 13.0f, 20.10457f, 13.0f, 19.0f),
                    PathNode.LineTo(13.0f, 15.0f),
                    PathNode.CurveTo(13.0f, 13.895431f, 13.895431f, 13.0f, 15.0f, 13.0f),
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
        return _workflow!!
    }

private var _workflow: ImageVector? = null
