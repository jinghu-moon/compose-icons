package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Cannabis: ImageVector
    get() {
        if (_cannabis != null) return _cannabis!!
        _cannabis = lucideOutlineIcon(
            name = "Cannabis",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 22.0f),
                    PathNode.LineTo(12.0f, 18.0f)
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
                    PathNode.MoveTo(7.0f, 12.0f),
                    PathNode.CurveTo(5.5f, 12.0f, 2.5f, 13.5f, 2.0f, 15.0f),
                    PathNode.CurveTo(5.5f, 16.5f, 8.0f, 16.0f, 8.0f, 16.0f),
                    PathNode.CurveTo(6.5f, 17.5f, 6.0f, 19.5f, 6.0f, 21.0f),
                    PathNode.CurveTo(8.5f, 21.0f, 10.5f, 19.5f, 12.0f, 18.0f),
                    PathNode.CurveTo(13.5f, 19.5f, 15.5f, 21.0f, 18.0f, 21.0f),
                    PathNode.CurveTo(18.0f, 19.5f, 17.5f, 17.5f, 16.0f, 16.0f),
                    PathNode.CurveTo(16.0f, 16.0f, 18.5f, 16.5f, 22.0f, 15.0f),
                    PathNode.CurveTo(21.5f, 13.5f, 18.5f, 12.0f, 17.0f, 12.0f),
                    PathNode.CurveTo(18.5f, 11.0f, 21.0f, 8.0f, 21.0f, 6.0f),
                    PathNode.CurveTo(18.5f, 6.0f, 15.5f, 7.5f, 14.0f, 9.0f),
                    PathNode.CurveTo(14.0f, 6.5f, 13.5f, 4.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(10.5f, 4.0f, 10.0f, 6.5f, 10.0f, 9.0f),
                    PathNode.CurveTo(8.5f, 7.5f, 5.5f, 6.0f, 3.0f, 6.0f),
                    PathNode.CurveTo(3.0f, 8.0f, 5.5f, 11.0f, 7.0f, 12.0f)
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
        return _cannabis!!
    }

private var _cannabis: ImageVector? = null
