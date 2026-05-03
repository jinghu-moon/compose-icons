package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Octagon: ImageVector
    get() {
        if (_octagon != null) return _octagon!!
        _octagon = lucideOutlineIcon(
            name = "Octagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.586f, 16.726f),
                    PathNode.CurveTo(2.210901f, 16.351015f, 2.000113f, 15.84239f, 2.0f, 15.312f),
                    PathNode.LineTo(2.0f, 8.688f),
                    PathNode.CurveTo(2.000113f, 8.15761f, 2.210901f, 7.648986f, 2.586f, 7.274f),
                    PathNode.LineTo(7.274f, 2.586f),
                    PathNode.CurveTo(7.648986f, 2.210901f, 8.15761f, 2.000113f, 8.688f, 2.0f),
                    PathNode.LineTo(15.312f, 2.0f),
                    PathNode.CurveTo(15.84239f, 2.000113f, 16.351015f, 2.210901f, 16.726f, 2.586f),
                    PathNode.LineTo(21.414f, 7.274f),
                    PathNode.CurveTo(21.789099f, 7.648986f, 21.999887f, 8.15761f, 22.0f, 8.688f),
                    PathNode.LineTo(22.0f, 15.312f),
                    PathNode.CurveTo(21.999887f, 15.84239f, 21.789099f, 16.351015f, 21.414f, 16.726f),
                    PathNode.LineTo(16.726f, 21.414f),
                    PathNode.CurveTo(16.351015f, 21.789099f, 15.84239f, 21.999887f, 15.312f, 22.0f),
                    PathNode.LineTo(8.688f, 22.0f),
                    PathNode.CurveTo(8.15761f, 21.999887f, 7.648986f, 21.789099f, 7.274f, 21.414f),
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
        return _octagon!!
    }

private var _octagon: ImageVector? = null
