package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CopyPlus: ImageVector
    get() {
        if (_copyPlus != null) return _copyPlus!!
        _copyPlus = lucideOutlineIcon(
            name = "CopyPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 12.0f),
                    PathNode.LineTo(15.0f, 18.0f)
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
                    PathNode.MoveTo(12.0f, 15.0f),
                    PathNode.LineTo(18.0f, 15.0f)
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
                    PathNode.MoveTo(10.0f, 8.0f),
                    PathNode.LineTo(20.0f, 8.0f),
                    PathNode.CurveTo(21.10457f, 8.0f, 22.0f, 8.895431f, 22.0f, 10.0f),
                    PathNode.LineTo(22.0f, 20.0f),
                    PathNode.CurveTo(22.0f, 21.10457f, 21.10457f, 22.0f, 20.0f, 22.0f),
                    PathNode.LineTo(10.0f, 22.0f),
                    PathNode.CurveTo(8.895431f, 22.0f, 8.0f, 21.10457f, 8.0f, 20.0f),
                    PathNode.LineTo(8.0f, 10.0f),
                    PathNode.CurveTo(8.0f, 8.895431f, 8.895431f, 8.0f, 10.0f, 8.0f),
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
                    PathNode.MoveTo(4.0f, 16.0f),
                    PathNode.CurveTo(2.9f, 16.0f, 2.0f, 15.1f, 2.0f, 14.0f),
                    PathNode.LineTo(2.0f, 4.0f),
                    PathNode.CurveTo(2.0f, 2.9f, 2.9f, 2.0f, 4.0f, 2.0f),
                    PathNode.LineTo(14.0f, 2.0f),
                    PathNode.CurveTo(15.1f, 2.0f, 16.0f, 2.9f, 16.0f, 4.0f)
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
        return _copyPlus!!
    }

private var _copyPlus: ImageVector? = null
