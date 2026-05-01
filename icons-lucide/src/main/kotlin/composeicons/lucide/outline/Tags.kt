package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Tags: ImageVector
    get() {
        if (_tags != null) return _tags!!
        _tags = lucideOutlineIcon(
            name = "Tags",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.172f, 2.0f),
                    PathNode.CurveTo(13.70239f, 2.000113f, 14.211015f, 2.210901f, 14.586f, 2.586f),
                    PathNode.LineTo(21.296f, 9.296f),
                    PathNode.CurveTo(21.75035f, 9.74664f, 22.005917f, 10.36007f, 22.005917f, 11.0f),
                    PathNode.CurveTo(22.005917f, 11.63993f, 21.75035f, 12.25336f, 21.296f, 12.704f),
                    PathNode.LineTo(16.704f, 17.296f),
                    PathNode.CurveTo(16.25336f, 17.75035f, 15.63993f, 18.005917f, 15.0f, 18.005917f),
                    PathNode.CurveTo(14.36007f, 18.005917f, 13.74664f, 17.75035f, 13.296f, 17.296f),
                    PathNode.LineTo(6.586f, 10.586f),
                    PathNode.CurveTo(6.210902f, 10.211015f, 6.000114f, 9.70239f, 6.0f, 9.172f),
                    PathNode.LineTo(6.0f, 3.0f),
                    PathNode.CurveTo(6.0f, 2.447715f, 6.447716f, 2.0f, 7.0f, 2.0f),
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
                    PathNode.MoveTo(2.0f, 7.0f),
                    PathNode.LineTo(2.0f, 13.172f),
                    PathNode.CurveTo(2.000113f, 13.70239f, 2.210901f, 14.211015f, 2.586f, 14.586f),
                    PathNode.LineTo(9.296f, 21.296f),
                    PathNode.CurveTo(10.15581f, 22.162462f, 11.529027f, 22.245518f, 12.487f, 21.489f)
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
                    PathNode.MoveTo(11.0f, 6.5f),
                    PathNode.CurveTo(11.0f, 6.776143f, 10.776142f, 7.0f, 10.5f, 7.0f),
                    PathNode.CurveTo(10.223858f, 7.0f, 10.0f, 6.776143f, 10.0f, 6.5f),
                    PathNode.CurveTo(10.0f, 6.223858f, 10.223858f, 6.0f, 10.5f, 6.0f),
                    PathNode.CurveTo(10.776142f, 6.0f, 11.0f, 6.223858f, 11.0f, 6.5f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _tags!!
    }

private var _tags: ImageVector? = null
