package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Citrus: ImageVector
    get() {
        if (_citrus != null) return _citrus!!
        _citrus = lucideOutlineIcon(
            name = "Citrus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.66f, 17.67f),
                    PathNode.CurveTo(21.880707f, 17.880308f, 22.00225f, 18.174097f, 21.99463f, 18.478867f),
                    PathNode.CurveTo(21.98701f, 18.783632f, 21.85094f, 19.070984f, 21.62f, 19.27f),
                    PathNode.CurveTo(16.849327f, 23.190758f, 9.88198f, 22.850906f, 5.515537f, 18.484463f),
                    PathNode.CurveTo(1.149093f, 14.11802f, 0.809243f, 7.150673f, 4.73f, 2.38f),
                    PathNode.CurveTo(4.932475f, 2.151295f, 5.220932f, 2.017078f, 5.526292f, 2.009491f),
                    PathNode.CurveTo(5.831652f, 2.001905f, 6.126417f, 2.121631f, 6.34f, 2.34f),
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
                    PathNode.MoveTo(19.65f, 15.66f),
                    PathNode.CurveTo(16.502056f, 18.645529f, 11.548114f, 18.57776f, 8.483015f, 15.507237f),
                    PathNode.CurveTo(5.417918f, 12.436714f, 5.358908f, 7.48266f, 8.350001f, 4.34f)
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
                    PathNode.MoveTo(14.0f, 10.0f),
                    PathNode.LineTo(8.5f, 15.5f)
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
                    PathNode.MoveTo(14.0f, 17.85f),
                    PathNode.LineTo(14.0f, 10.0f),
                    PathNode.LineTo(6.15f, 10.0f)
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
        return _citrus!!
    }

private var _citrus: ImageVector? = null
