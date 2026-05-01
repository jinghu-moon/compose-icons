package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LassoSelect: ImageVector
    get() {
        if (_lassoSelect != null) return _lassoSelect!!
        _lassoSelect = lucideOutlineIcon(
            name = "LassoSelect",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 22.0f),
                    PathNode.CurveTo(5.740971f, 21.055729f, 5.0f, 19.573786f, 5.0f, 18.0f)
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
                    PathNode.MoveTo(7.0f, 16.93f),
                    PathNode.CurveTo(7.96f, 17.36f, 8.96f, 17.67f, 9.99f, 17.84f)
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
                    PathNode.MoveTo(3.34f, 14.0f),
                    PathNode.CurveTo(2.480593f, 12.842431f, 2.011339f, 11.441671f, 2.0f, 10.0f),
                    PathNode.CurveTo(2.0f, 5.58f, 6.48f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(17.52f, 2.0f, 22.0f, 5.58f, 22.0f, 10.0f),
                    PathNode.CurveTo(21.984999f, 10.678905f, 21.873894f, 11.352262f, 21.67f, 12.0f)
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
                    PathNode.MoveTo(5.0f, 18.0f),
                    PathNode.CurveTo(6.10457f, 18.0f, 7.0f, 17.10457f, 7.0f, 16.0f),
                    PathNode.CurveTo(7.0f, 14.895431f, 6.10457f, 14.0f, 5.0f, 14.0f),
                    PathNode.CurveTo(3.895431f, 14.0f, 3.0f, 14.895431f, 3.0f, 16.0f),
                    PathNode.CurveTo(3.0f, 17.10457f, 3.895431f, 18.0f, 5.0f, 18.0f),
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
                    PathNode.MoveTo(14.33f, 22.0f),
                    PathNode.LineTo(14.24f, 22.0f),
                    PathNode.CurveTo(14.100924f, 21.954058f, 14.005163f, 21.826376f, 14.0f, 21.68f),
                    PathNode.LineTo(14.0f, 11.68f),
                    PathNode.CurveTo(13.999921f, 11.49606f, 14.14614f, 11.34541f, 14.33f, 11.34f),
                    PathNode.CurveTo(14.41f, 11.34f, 14.48f, 11.37f, 14.54f, 11.42f),
                    PathNode.LineTo(21.88f, 17.42f),
                    PathNode.CurveTo(21.992f, 17.50748f, 22.035416f, 17.65684f, 21.98776f, 17.79073f),
                    PathNode.CurveTo(21.940105f, 17.924618f, 21.812086f, 18.012957f, 21.67f, 18.01f),
                    PathNode.LineTo(17.18f, 18.01f),
                    PathNode.LineTo(14.61f, 21.86f),
                    PathNode.CurveTo(14.5439f, 21.948132f, 14.440166f, 22.0f, 14.33f, 22.0f),
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
        return _lassoSelect!!
    }

private var _lassoSelect: ImageVector? = null
