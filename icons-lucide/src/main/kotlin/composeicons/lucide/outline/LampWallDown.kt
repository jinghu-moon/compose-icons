package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LampWallDown: ImageVector
    get() {
        if (_lampWallDown != null) return _lampWallDown!!
        _lampWallDown = lucideOutlineIcon(
            name = "LampWallDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.929f, 18.629f),
                    PathNode.CurveTo(20.052105f, 18.937134f, 20.014347f, 19.286264f, 19.828213f, 19.560955f),
                    PathNode.CurveTo(19.64208f, 19.835646f, 19.331814f, 20.000122f, 19.0f, 20.0f),
                    PathNode.LineTo(9.0f, 20.0f),
                    PathNode.CurveTo(8.668363f, 19.99979f, 8.358403f, 19.835178f, 8.172507f, 19.560541f),
                    PathNode.CurveTo(7.98661f, 19.285904f, 7.948963f, 18.93697f, 8.072f, 18.629f),
                    PathNode.LineTo(10.072f, 13.629f),
                    PathNode.CurveTo(10.223675f, 13.24935f, 10.591173f, 13.000258f, 11.0f, 13.0f),
                    PathNode.LineTo(17.0f, 13.0f),
                    PathNode.CurveTo(17.408827f, 13.000258f, 17.776325f, 13.24935f, 17.928f, 13.629f),
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
                    PathNode.MoveTo(6.0f, 3.0f),
                    PathNode.CurveTo(7.10457f, 3.0f, 8.0f, 3.895431f, 8.0f, 5.0f),
                    PathNode.LineTo(8.0f, 7.0f),
                    PathNode.CurveTo(8.0f, 8.10457f, 7.10457f, 9.0f, 6.0f, 9.0f),
                    PathNode.LineTo(5.0f, 9.0f),
                    PathNode.CurveTo(4.447716f, 9.0f, 4.0f, 8.552285f, 4.0f, 8.0f),
                    PathNode.LineTo(4.0f, 4.0f),
                    PathNode.CurveTo(4.0f, 3.447715f, 4.447716f, 3.0f, 5.0f, 3.0f),
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
                    PathNode.MoveTo(8.0f, 6.0f),
                    PathNode.LineTo(12.0f, 6.0f),
                    PathNode.CurveTo(13.104569f, 6.0f, 14.0f, 6.895431f, 14.0f, 8.0f),
                    PathNode.LineTo(14.0f, 13.0f)
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
        return _lampWallDown!!
    }

private var _lampWallDown: ImageVector? = null
