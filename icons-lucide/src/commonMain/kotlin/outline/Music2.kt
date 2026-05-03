package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Music2: ImageVector
    get() {
        if (_music2 != null) return _music2!!
        _music2 = lucideOutlineIcon(
            name = "Music2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 18.0f),
                    PathNode.CurveTo(12.0f, 20.209139f, 10.209139f, 22.0f, 8.0f, 22.0f),
                    PathNode.CurveTo(5.790861f, 22.0f, 4.0f, 20.209139f, 4.0f, 18.0f),
                    PathNode.CurveTo(4.0f, 15.790861f, 5.790861f, 14.0f, 8.0f, 14.0f),
                    PathNode.CurveTo(10.209139f, 14.0f, 12.0f, 15.790861f, 12.0f, 18.0f),
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
                    PathNode.MoveTo(12.0f, 18.0f),
                    PathNode.LineTo(12.0f, 2.0f),
                    PathNode.LineTo(19.0f, 6.0f)
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
        return _music2!!
    }

private var _music2: ImageVector? = null
