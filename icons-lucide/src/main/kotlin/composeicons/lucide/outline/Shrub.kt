package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Shrub: ImageVector
    get() {
        if (_shrub != null) return _shrub!!
        _shrub = lucideOutlineIcon(
            name = "Shrub",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 22.0f),
                    PathNode.LineTo(12.0f, 16.828f),
                    PathNode.CurveTo(11.999887f, 16.297611f, 11.789099f, 15.788985f, 11.414f, 15.414f),
                    PathNode.LineTo(9.5f, 13.5f)
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
                    PathNode.MoveTo(14.5f, 14.5f),
                    PathNode.LineTo(12.0f, 17.0f)
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
                    PathNode.MoveTo(17.0f, 8.8f),
                    PathNode.CurveTo(19.392181f, 10.172998f, 20.54015f, 13.000045f, 19.782413f, 15.652119f),
                    PathNode.CurveTo(19.02468f, 18.304192f, 16.556456f, 20.09804f, 13.8f, 20.0f),
                    PathNode.LineTo(10.0f, 20.0f),
                    PathNode.CurveTo(7.187169f, 19.80903f, 4.818141f, 17.82654f, 4.134359f, 15.091411f),
                    PathNode.CurveTo(3.450576f, 12.356281f, 4.607958f, 9.492188f, 7.0f, 8.0f),
                    PathNode.CurveTo(7.0f, 5.238577f, 9.238576f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(14.761424f, 3.0f, 17.0f, 5.238577f, 17.0f, 8.0f),
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
        return _shrub!!
    }

private var _shrub: ImageVector? = null
