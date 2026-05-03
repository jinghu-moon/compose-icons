package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LampFloor: ImageVector
    get() {
        if (_lampFloor != null) return _lampFloor!!
        _lampFloor = lucideOutlineIcon(
            name = "LampFloor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 10.0f),
                    PathNode.LineTo(12.0f, 22.0f)
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
                    PathNode.MoveTo(17.929f, 7.629f),
                    PathNode.CurveTo(18.052105f, 7.937134f, 18.014347f, 8.286264f, 17.828213f, 8.560955f),
                    PathNode.CurveTo(17.64208f, 8.835647f, 17.331814f, 9.000122f, 17.0f, 9.0f),
                    PathNode.LineTo(7.0f, 9.0f),
                    PathNode.CurveTo(6.668363f, 8.99979f, 6.358403f, 8.835179f, 6.172506f, 8.560541f),
                    PathNode.CurveTo(5.98661f, 8.285903f, 5.948963f, 7.93697f, 6.072f, 7.629f),
                    PathNode.LineTo(8.072f, 2.629f),
                    PathNode.CurveTo(8.223675f, 2.24935f, 8.591173f, 2.000259f, 9.0f, 2.0f),
                    PathNode.LineTo(15.0f, 2.0f),
                    PathNode.CurveTo(15.408827f, 2.000259f, 15.776325f, 2.24935f, 15.928f, 2.629f),
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
                    PathNode.MoveTo(9.0f, 22.0f),
                    PathNode.LineTo(15.0f, 22.0f)
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
        return _lampFloor!!
    }

private var _lampFloor: ImageVector? = null
