package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MouseRight: ImageVector
    get() {
        if (_mouseRight != null) return _mouseRight!!
        _mouseRight = lucideOutlineIcon(
            name = "MouseRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 7.318f),
                    PathNode.LineTo(12.0f, 10.0f)
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
                    PathNode.MoveTo(19.0f, 10.0f),
                    PathNode.LineTo(19.0f, 15.0f),
                    PathNode.CurveTo(19.0f, 18.865993f, 15.865993f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(8.134007f, 22.0f, 5.0f, 18.865993f, 5.0f, 15.0f),
                    PathNode.LineTo(5.0f, 9.0f),
                    PathNode.CurveTo(5.0f, 5.473f, 7.608f, 2.485f, 11.0f, 2.0f)
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
                    PathNode.MoveTo(19.0f, 4.0f),
                    PathNode.CurveTo(19.0f, 5.10457f, 18.10457f, 6.0f, 17.0f, 6.0f),
                    PathNode.CurveTo(15.895431f, 6.0f, 15.0f, 5.10457f, 15.0f, 4.0f),
                    PathNode.CurveTo(15.0f, 2.895431f, 15.895431f, 2.0f, 17.0f, 2.0f),
                    PathNode.CurveTo(18.10457f, 2.0f, 19.0f, 2.895431f, 19.0f, 4.0f),
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
        return _mouseRight!!
    }

private var _mouseRight: ImageVector? = null
