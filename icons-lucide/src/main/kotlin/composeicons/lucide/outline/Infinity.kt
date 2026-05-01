package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Infinity: ImageVector
    get() {
        if (_infinity != null) return _infinity!!
        _infinity = lucideOutlineIcon(
            name = "Infinity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 16.0f),
                    PathNode.CurveTo(11.0f, 16.0f, 13.0f, 8.0f, 18.0f, 8.0f),
                    PathNode.CurveTo(20.209139f, 8.0f, 22.0f, 9.790861f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 14.209139f, 20.209139f, 16.0f, 18.0f, 16.0f),
                    PathNode.CurveTo(13.0f, 16.0f, 11.0f, 8.0f, 6.0f, 8.0f),
                    PathNode.CurveTo(3.790861f, 8.0f, 2.0f, 9.790861f, 2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 14.209139f, 3.790861f, 16.0f, 6.0f, 16.0f)
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
        return _infinity!!
    }

private var _infinity: ImageVector? = null
