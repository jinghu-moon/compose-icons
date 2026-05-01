package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HandPlatter: ImageVector
    get() {
        if (_handPlatter != null) return _handPlatter!!
        _handPlatter = lucideOutlineIcon(
            name = "HandPlatter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.LineTo(12.0f, 2.0f)
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
                    PathNode.MoveTo(15.4f, 17.4f),
                    PathNode.LineTo(18.6f, 14.6f),
                    PathNode.CurveTo(19.400812f, 13.826801f, 20.676802f, 13.849187f, 21.45f, 14.65f),
                    PathNode.CurveTo(22.223198f, 15.450813f, 22.200813f, 16.7268f, 21.4f, 17.5f),
                    PathNode.LineTo(17.8f, 20.8f),
                    PathNode.CurveTo(17.1f, 21.6f, 16.1f, 22.0f, 15.0f, 22.0f),
                    PathNode.LineTo(11.0f, 22.0f),
                    PathNode.CurveTo(9.9f, 22.0f, 8.9f, 21.6f, 8.2f, 20.8f),
                    PathNode.LineTo(6.898f, 19.336f),
                    PathNode.CurveTo(6.708394f, 19.122484f, 6.436552f, 19.00021f, 6.151f, 19.0f),
                    PathNode.LineTo(5.0f, 19.0f)
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
                    PathNode.MoveTo(2.0f, 14.0f),
                    PathNode.LineTo(14.0f, 14.0f),
                    PathNode.CurveTo(15.104569f, 14.0f, 16.0f, 14.895431f, 16.0f, 16.0f),
                    PathNode.CurveTo(16.0f, 17.10457f, 15.104569f, 18.0f, 14.0f, 18.0f),
                    PathNode.LineTo(12.0f, 18.0f)
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
                    PathNode.MoveTo(4.0f, 10.0f),
                    PathNode.LineTo(20.0f, 10.0f)
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
                    PathNode.MoveTo(5.0f, 10.0f),
                    PathNode.CurveTo(5.0f, 6.134007f, 8.134007f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(15.865993f, 3.0f, 19.0f, 6.134007f, 19.0f, 10.0f)
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
                    PathNode.MoveTo(5.0f, 14.0f),
                    PathNode.LineTo(5.0f, 20.0f),
                    PathNode.CurveTo(5.0f, 20.552284f, 4.552285f, 21.0f, 4.0f, 21.0f),
                    PathNode.LineTo(2.0f, 21.0f)
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
        return _handPlatter!!
    }

private var _handPlatter: ImageVector? = null
