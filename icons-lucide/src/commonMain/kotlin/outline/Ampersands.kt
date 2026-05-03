package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Ampersands: ImageVector
    get() {
        if (_ampersands != null) return _ampersands!!
        _ampersands = lucideOutlineIcon(
            name = "Ampersands",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 17.0f),
                    PathNode.CurveTo(5.0f, 14.0f, 3.0f, 10.0f, 3.0f, 8.0f),
                    PathNode.CurveTo(3.0f, 6.895431f, 3.895431f, 6.0f, 5.0f, 6.0f),
                    PathNode.CurveTo(6.10457f, 6.0f, 7.0f, 6.895431f, 7.0f, 8.0f),
                    PathNode.CurveTo(7.0f, 10.5f, 2.0f, 10.5f, 2.0f, 14.0f),
                    PathNode.CurveTo(2.0f, 15.7f, 3.3f, 17.0f, 5.0f, 17.0f),
                    PathNode.CurveTo(7.8f, 17.0f, 10.0f, 14.8f, 10.0f, 12.0f)
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
                    PathNode.MoveTo(22.0f, 17.0f),
                    PathNode.CurveTo(17.0f, 14.0f, 15.0f, 10.0f, 15.0f, 8.0f),
                    PathNode.CurveTo(15.0f, 6.895431f, 15.895431f, 6.0f, 17.0f, 6.0f),
                    PathNode.CurveTo(18.10457f, 6.0f, 19.0f, 6.895431f, 19.0f, 8.0f),
                    PathNode.CurveTo(19.0f, 10.5f, 14.0f, 10.5f, 14.0f, 14.0f),
                    PathNode.CurveTo(14.0f, 15.7f, 15.3f, 17.0f, 17.0f, 17.0f),
                    PathNode.CurveTo(19.8f, 17.0f, 22.0f, 14.8f, 22.0f, 12.0f)
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
        return _ampersands!!
    }

private var _ampersands: ImageVector? = null
