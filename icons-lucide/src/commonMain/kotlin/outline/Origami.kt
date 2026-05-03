package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Origami: ImageVector
    get() {
        if (_origami != null) return _origami!!
        _origami = lucideOutlineIcon(
            name = "Origami",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 12.0f),
                    PathNode.LineTo(12.0f, 4.0f),
                    PathNode.CurveTo(12.0f, 3.447715f, 12.447715f, 3.0f, 13.0f, 3.0f),
                    PathNode.LineTo(19.297f, 3.0f),
                    PathNode.CurveTo(19.715387f, 3.000038f, 20.089523f, 3.260534f, 20.234741f, 3.652912f),
                    PathNode.CurveTo(20.37996f, 4.045289f, 20.265556f, 4.486592f, 19.948f, 4.759f),
                    PathNode.LineTo(15.252f, 8.784f)
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
                    PathNode.MoveTo(12.0f, 21.0f),
                    PathNode.LineTo(4.586f, 13.586f),
                    PathNode.CurveTo(4.210902f, 13.211015f, 4.000114f, 12.70239f, 4.0f, 12.172f),
                    PathNode.LineTo(4.0f, 6.415f),
                    PathNode.CurveTo(4.002018f, 6.011546f, 4.245816f, 5.648659f, 4.618568f, 5.494273f),
                    PathNode.CurveTo(4.99132f, 5.339888f, 5.420306f, 5.424124f, 5.707f, 5.708f),
                    PathNode.LineTo(20.0f, 20.009f)
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
                    PathNode.MoveTo(12.214f, 3.381f),
                    PathNode.LineTo(20.628f, 18.347f),
                    PathNode.CurveTo(20.848045f, 18.738794f, 20.779734f, 19.22925f, 20.461f, 19.546f),
                    PathNode.LineTo(19.293f, 20.709f),
                    PathNode.CurveTo(19.105425f, 20.89557f, 18.851562f, 21.00021f, 18.587f, 21.0f),
                    PathNode.LineTo(6.351f, 21.0f),
                    PathNode.CurveTo(6.12384f, 21.000107f, 5.903413f, 20.922869f, 5.726f, 20.781f),
                    PathNode.LineTo(3.25f, 18.8f),
                    PathNode.CurveTo(2.917343f, 18.534008f, 2.789676f, 18.086496f, 2.931916f, 17.685024f),
                    PathNode.CurveTo(3.074156f, 17.28355f, 3.455083f, 17.016233f, 3.881f, 17.019f),
                    PathNode.LineTo(8.046f, 17.046f)
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
        return _origami!!
    }

private var _origami: ImageVector? = null
