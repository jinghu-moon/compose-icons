package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Blend: ImageVector
    get() {
        if (_blend != null) return _blend!!
        _blend = lucideOutlineIcon(
            name = "Blend",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 9.0f),
                    PathNode.CurveTo(16.0f, 12.865993f, 12.865993f, 16.0f, 9.0f, 16.0f),
                    PathNode.CurveTo(5.134007f, 16.0f, 2.0f, 12.865993f, 2.0f, 9.0f),
                    PathNode.CurveTo(2.0f, 5.134007f, 5.134007f, 2.0f, 9.0f, 2.0f),
                    PathNode.CurveTo(12.865993f, 2.0f, 16.0f, 5.134007f, 16.0f, 9.0f),
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
                    PathNode.MoveTo(22.0f, 15.0f),
                    PathNode.CurveTo(22.0f, 18.865993f, 18.865993f, 22.0f, 15.0f, 22.0f),
                    PathNode.CurveTo(11.134007f, 22.0f, 8.0f, 18.865993f, 8.0f, 15.0f),
                    PathNode.CurveTo(8.0f, 11.134007f, 11.134007f, 8.0f, 15.0f, 8.0f),
                    PathNode.CurveTo(18.865993f, 8.0f, 22.0f, 11.134007f, 22.0f, 15.0f),
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
        return _blend!!
    }

private var _blend: ImageVector? = null
