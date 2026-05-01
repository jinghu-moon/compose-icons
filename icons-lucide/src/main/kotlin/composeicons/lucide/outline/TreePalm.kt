package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TreePalm: ImageVector
    get() {
        if (_treePalm != null) return _treePalm!!
        _treePalm = lucideOutlineIcon(
            name = "TreePalm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 8.0f),
                    PathNode.CurveTo(13.0f, 5.24f, 10.54f, 3.0f, 7.5f, 3.0f),
                    PathNode.CurveTo(4.46f, 3.0f, 2.0f, 5.24f, 2.0f, 8.0f),
                    PathNode.LineTo(4.0f, 8.0f),
                    PathNode.LineTo(5.0f, 7.0f),
                    PathNode.LineTo(6.0f, 8.0f),
                    PathNode.LineTo(10.0f, 8.0f)
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
                    PathNode.MoveTo(13.0f, 7.14f),
                    PathNode.CurveTo(14.012608f, 6.391351f, 15.240724f, 5.991336f, 16.5f, 6.0f),
                    PathNode.CurveTo(19.54f, 6.0f, 22.0f, 8.24f, 22.0f, 11.0f),
                    PathNode.LineTo(19.0f, 11.0f),
                    PathNode.LineTo(18.0f, 10.0f),
                    PathNode.LineTo(17.0f, 11.0f),
                    PathNode.LineTo(14.0f, 11.0f)
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
                    PathNode.MoveTo(5.89f, 9.71f),
                    PathNode.CurveTo(3.74f, 11.86f, 3.59f, 15.18f, 5.54f, 17.14f),
                    PathNode.LineTo(9.78f, 12.89f),
                    PathNode.LineTo(10.48f, 12.19f),
                    PathNode.LineTo(11.19f, 11.48f),
                    PathNode.LineTo(13.31f, 9.36f),
                    PathNode.CurveTo(11.36f, 7.4f, 8.04f, 7.56f, 5.89f, 9.71f)
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
                    PathNode.MoveTo(11.0f, 15.5f),
                    PathNode.CurveTo(11.5f, 18.0f, 10.83f, 20.0f, 10.0f, 22.0f),
                    PathNode.LineTo(14.0f, 22.0f),
                    PathNode.CurveTo(16.0f, 16.5f, 13.5f, 10.0f, 13.0f, 8.0f)
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
        return _treePalm!!
    }

private var _treePalm: ImageVector? = null
