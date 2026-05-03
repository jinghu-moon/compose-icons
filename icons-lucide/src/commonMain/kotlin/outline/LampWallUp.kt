package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LampWallUp: ImageVector
    get() {
        if (_lampWallUp != null) return _lampWallUp!!
        _lampWallUp = lucideOutlineIcon(
            name = "LampWallUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.929f, 9.629f),
                    PathNode.CurveTo(20.052105f, 9.937134f, 20.014347f, 10.286263f, 19.828213f, 10.560955f),
                    PathNode.CurveTo(19.64208f, 10.835647f, 19.331814f, 11.000122f, 19.0f, 11.0f),
                    PathNode.LineTo(9.0f, 11.0f),
                    PathNode.CurveTo(8.668363f, 10.99979f, 8.358403f, 10.835179f, 8.172507f, 10.560541f),
                    PathNode.CurveTo(7.98661f, 10.285903f, 7.948963f, 9.93697f, 8.072f, 9.629f),
                    PathNode.LineTo(10.072f, 4.629f),
                    PathNode.CurveTo(10.223675f, 4.24935f, 10.591173f, 4.000259f, 11.0f, 4.0f),
                    PathNode.LineTo(17.0f, 4.0f),
                    PathNode.CurveTo(17.408827f, 4.000259f, 17.776325f, 4.24935f, 17.928f, 4.629f),
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
                    PathNode.MoveTo(6.0f, 15.0f),
                    PathNode.CurveTo(7.10457f, 15.0f, 8.0f, 15.895431f, 8.0f, 17.0f),
                    PathNode.LineTo(8.0f, 19.0f),
                    PathNode.CurveTo(8.0f, 20.10457f, 7.10457f, 21.0f, 6.0f, 21.0f),
                    PathNode.LineTo(5.0f, 21.0f),
                    PathNode.CurveTo(4.447716f, 21.0f, 4.0f, 20.552284f, 4.0f, 20.0f),
                    PathNode.LineTo(4.0f, 16.0f),
                    PathNode.CurveTo(4.0f, 15.447715f, 4.447716f, 15.0f, 5.0f, 15.0f),
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
                    PathNode.MoveTo(8.0f, 18.0f),
                    PathNode.LineTo(12.0f, 18.0f),
                    PathNode.CurveTo(13.104569f, 18.0f, 14.0f, 17.10457f, 14.0f, 16.0f),
                    PathNode.LineTo(14.0f, 11.0f)
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
        return _lampWallUp!!
    }

private var _lampWallUp: ImageVector? = null
