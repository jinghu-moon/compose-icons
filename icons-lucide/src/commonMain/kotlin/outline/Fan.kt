package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Fan: ImageVector
    get() {
        if (_fan != null) return _fan!!
        _fan = lucideOutlineIcon(
            name = "Fan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.827f, 16.379f),
                    PathNode.CurveTo(8.686441f, 17.460718f, 6.110052f, 17.183474f, 4.248643f, 15.671105f),
                    PathNode.CurveTo(2.387233f, 14.158737f, 1.588414f, 11.693674f, 2.209f, 9.377f),
                    PathNode.LineTo(7.621f, 10.827f),
                    PathNode.CurveTo(6.539282f, 8.686441f, 6.816527f, 6.110052f, 8.328895f, 4.248643f),
                    PathNode.CurveTo(9.841263f, 2.387233f, 12.306326f, 1.588414f, 14.623f, 2.209f),
                    PathNode.LineTo(13.173f, 7.621f),
                    PathNode.CurveTo(15.313559f, 6.539282f, 17.889948f, 6.816527f, 19.751358f, 8.328895f),
                    PathNode.CurveTo(21.612766f, 9.841263f, 22.411585f, 12.306326f, 21.791f, 14.623f),
                    PathNode.LineTo(16.379f, 13.173f),
                    PathNode.CurveTo(17.460718f, 15.313559f, 17.183474f, 17.889948f, 15.671105f, 19.751358f),
                    PathNode.CurveTo(14.158737f, 21.612766f, 11.693674f, 22.411585f, 9.377f, 21.791f),
                    PathNode.LineTo(10.827f, 16.379f),
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
                    PathNode.MoveTo(12.0f, 12.0f),
                    PathNode.LineTo(12.0f, 12.01f)
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
        return _fan!!
    }

private var _fan: ImageVector? = null
