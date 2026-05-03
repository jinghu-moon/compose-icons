package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Tag: ImageVector
    get() {
        if (_tag != null) return _tag!!
        _tag = lucideOutlineIcon(
            name = "Tag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.586f, 2.586f),
                    PathNode.CurveTo(12.211015f, 2.210901f, 11.70239f, 2.000113f, 11.172f, 2.0f),
                    PathNode.LineTo(4.0f, 2.0f),
                    PathNode.CurveTo(2.895431f, 2.0f, 2.0f, 2.895431f, 2.0f, 4.0f),
                    PathNode.LineTo(2.0f, 11.172f),
                    PathNode.CurveTo(2.000113f, 11.70239f, 2.210901f, 12.211015f, 2.586f, 12.586f),
                    PathNode.LineTo(11.29f, 21.29f),
                    PathNode.CurveTo(12.236154f, 22.23018f, 13.763846f, 22.23018f, 14.71f, 21.29f),
                    PathNode.LineTo(21.29f, 14.71f),
                    PathNode.CurveTo(22.23018f, 13.763846f, 22.23018f, 12.236154f, 21.29f, 11.29f),
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
                    PathNode.MoveTo(8.0f, 7.5f),
                    PathNode.CurveTo(8.0f, 7.776143f, 7.776143f, 8.0f, 7.5f, 8.0f),
                    PathNode.CurveTo(7.223858f, 8.0f, 7.0f, 7.776143f, 7.0f, 7.5f),
                    PathNode.CurveTo(7.0f, 7.223858f, 7.223858f, 7.0f, 7.5f, 7.0f),
                    PathNode.CurveTo(7.776143f, 7.0f, 8.0f, 7.223858f, 8.0f, 7.5f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _tag!!
    }

private var _tag: ImageVector? = null
