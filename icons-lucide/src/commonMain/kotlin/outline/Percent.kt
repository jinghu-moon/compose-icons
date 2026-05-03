package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Percent: ImageVector
    get() {
        if (_percent != null) return _percent!!
        _percent = lucideOutlineIcon(
            name = "Percent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 5.0f),
                    PathNode.LineTo(5.0f, 19.0f)
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
                    PathNode.MoveTo(9.0f, 6.5f),
                    PathNode.CurveTo(9.0f, 7.880712f, 7.880712f, 9.0f, 6.5f, 9.0f),
                    PathNode.CurveTo(5.119288f, 9.0f, 4.0f, 7.880712f, 4.0f, 6.5f),
                    PathNode.CurveTo(4.0f, 5.119288f, 5.119288f, 4.0f, 6.5f, 4.0f),
                    PathNode.CurveTo(7.880712f, 4.0f, 9.0f, 5.119288f, 9.0f, 6.5f),
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
                    PathNode.MoveTo(20.0f, 17.5f),
                    PathNode.CurveTo(20.0f, 18.880713f, 18.880713f, 20.0f, 17.5f, 20.0f),
                    PathNode.CurveTo(16.119287f, 20.0f, 15.0f, 18.880713f, 15.0f, 17.5f),
                    PathNode.CurveTo(15.0f, 16.119287f, 16.119287f, 15.0f, 17.5f, 15.0f),
                    PathNode.CurveTo(18.880713f, 15.0f, 20.0f, 16.119287f, 20.0f, 17.5f),
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
        return _percent!!
    }

private var _percent: ImageVector? = null
