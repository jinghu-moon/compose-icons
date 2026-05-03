package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Tablets: ImageVector
    get() {
        if (_tablets != null) return _tablets!!
        _tablets = lucideOutlineIcon(
            name = "Tablets",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 7.0f),
                    PathNode.CurveTo(12.0f, 9.761424f, 9.761424f, 12.0f, 7.0f, 12.0f),
                    PathNode.CurveTo(4.238577f, 12.0f, 2.0f, 9.761424f, 2.0f, 7.0f),
                    PathNode.CurveTo(2.0f, 4.238577f, 4.238577f, 2.0f, 7.0f, 2.0f),
                    PathNode.CurveTo(9.761424f, 2.0f, 12.0f, 4.238577f, 12.0f, 7.0f),
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
                    PathNode.MoveTo(22.0f, 17.0f),
                    PathNode.CurveTo(22.0f, 19.761423f, 19.761423f, 22.0f, 17.0f, 22.0f),
                    PathNode.CurveTo(14.238576f, 22.0f, 12.0f, 19.761423f, 12.0f, 17.0f),
                    PathNode.CurveTo(12.0f, 14.238576f, 14.238576f, 12.0f, 17.0f, 12.0f),
                    PathNode.CurveTo(19.761423f, 12.0f, 22.0f, 14.238576f, 22.0f, 17.0f),
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
                    PathNode.MoveTo(12.0f, 17.0f),
                    PathNode.LineTo(22.0f, 17.0f)
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
                    PathNode.MoveTo(3.46f, 10.54f),
                    PathNode.LineTo(10.54f, 3.46f)
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
        return _tablets!!
    }

private var _tablets: ImageVector? = null
