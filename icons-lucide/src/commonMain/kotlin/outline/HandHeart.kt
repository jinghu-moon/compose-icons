package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HandHeart: ImageVector
    get() {
        if (_handHeart != null) return _handHeart!!
        _handHeart = lucideOutlineIcon(
            name = "HandHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 14.0f),
                    PathNode.LineTo(13.0f, 14.0f),
                    PathNode.CurveTo(14.104569f, 14.0f, 15.0f, 13.104569f, 15.0f, 12.0f),
                    PathNode.CurveTo(15.0f, 10.895431f, 14.104569f, 10.0f, 13.0f, 10.0f),
                    PathNode.LineTo(10.0f, 10.0f),
                    PathNode.CurveTo(9.4f, 10.0f, 8.9f, 10.2f, 8.6f, 10.6f),
                    PathNode.LineTo(3.0f, 16.0f)
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
                    PathNode.MoveTo(14.45f, 13.39f),
                    PathNode.LineTo(19.5f, 8.696f),
                    PathNode.CurveTo(20.196f, 8.0f, 21.0f, 6.85f, 21.0f, 5.75f),
                    PathNode.CurveTo(21.000257f, 4.610441f, 20.297659f, 3.588779f, 19.233461f, 3.181247f),
                    PathNode.CurveTo(18.169264f, 2.773716f, 16.963968f, 3.064753f, 16.203f, 3.913f),
                    PathNode.CurveTo(16.150743f, 3.96973f, 16.077131f, 4.002006f, 16.0f, 4.002006f),
                    PathNode.CurveTo(15.92287f, 4.002006f, 15.849257f, 3.96973f, 15.797f, 3.913f),
                    PathNode.CurveTo(15.036031f, 3.064753f, 13.830736f, 2.773716f, 12.76654f, 3.181247f),
                    PathNode.CurveTo(11.702343f, 3.588779f, 10.999743f, 4.610441f, 11.0f, 5.75f),
                    PathNode.CurveTo(11.0f, 6.95f, 11.802f, 7.998f, 12.5f, 8.696f),
                    PathNode.LineTo(16.0f, 11.95f)
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
                    PathNode.MoveTo(2.0f, 15.0f),
                    PathNode.LineTo(8.0f, 21.0f)
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
                    PathNode.MoveTo(7.0f, 20.0f),
                    PathNode.LineTo(8.6f, 18.6f),
                    PathNode.CurveTo(8.9f, 18.2f, 9.4f, 18.0f, 10.0f, 18.0f),
                    PathNode.LineTo(14.0f, 18.0f),
                    PathNode.CurveTo(15.1f, 18.0f, 16.1f, 17.6f, 16.8f, 16.8f),
                    PathNode.LineTo(21.4f, 12.4f),
                    PathNode.CurveTo(22.203575f, 11.640609f, 22.239391f, 10.373574f, 21.48f, 9.57f),
                    PathNode.CurveTo(20.720608f, 8.766426f, 19.453575f, 8.730609f, 18.65f, 9.49f)
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
        return _handHeart!!
    }

private var _handHeart: ImageVector? = null
