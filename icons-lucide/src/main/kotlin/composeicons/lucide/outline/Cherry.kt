package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Cherry: ImageVector
    get() {
        if (_cherry != null) return _cherry!!
        _cherry = lucideOutlineIcon(
            name = "Cherry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 17.0f),
                    PathNode.CurveTo(2.0f, 19.761423f, 4.238577f, 22.0f, 7.0f, 22.0f),
                    PathNode.CurveTo(9.761424f, 22.0f, 12.0f, 19.761423f, 12.0f, 17.0f),
                    PathNode.CurveTo(12.0f, 14.24f, 9.5f, 12.0f, 7.0f, 14.0f),
                    PathNode.CurveTo(4.5f, 12.0f, 2.0f, 14.24f, 2.0f, 17.0f),
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
                    PathNode.MoveTo(12.0f, 17.0f),
                    PathNode.CurveTo(12.0f, 19.761423f, 14.238576f, 22.0f, 17.0f, 22.0f),
                    PathNode.CurveTo(19.761423f, 22.0f, 22.0f, 19.761423f, 22.0f, 17.0f),
                    PathNode.CurveTo(22.0f, 14.24f, 19.5f, 12.0f, 17.0f, 14.0f),
                    PathNode.CurveTo(14.5f, 12.0f, 12.0f, 14.24f, 12.0f, 17.0f),
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
                    PathNode.MoveTo(7.0f, 14.0f),
                    PathNode.CurveTo(10.22f, 11.09f, 11.29f, 5.25f, 12.0f, 2.0f),
                    PathNode.CurveTo(13.66f, 4.38f, 16.94f, 11.0f, 17.0f, 14.0f)
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
                    PathNode.MoveTo(22.0f, 9.0f),
                    PathNode.CurveTo(17.71f, 9.0f, 14.86f, 6.67f, 12.0f, 2.0f),
                    PathNode.CurveTo(17.71f, 2.0f, 22.0f, 6.67f, 22.0f, 9.0f),
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
        }
        return _cherry!!
    }

private var _cherry: ImageVector? = null
