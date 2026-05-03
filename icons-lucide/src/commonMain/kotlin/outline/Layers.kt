package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Layers: ImageVector
    get() {
        if (_layers != null) return _layers!!
        _layers = lucideOutlineIcon(
            name = "Layers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.83f, 2.18f),
                    PathNode.CurveTo(12.302794f, 1.939524f, 11.697206f, 1.939524f, 11.17f, 2.18f),
                    PathNode.LineTo(2.6f, 6.08f),
                    PathNode.CurveTo(2.237428f, 6.23987f, 2.003454f, 6.598747f, 2.003454f, 6.995f),
                    PathNode.CurveTo(2.003454f, 7.391254f, 2.237428f, 7.75013f, 2.6f, 7.91f),
                    PathNode.LineTo(11.18f, 11.82f),
                    PathNode.CurveTo(11.707206f, 12.060476f, 12.312794f, 12.060476f, 12.84f, 11.82f),
                    PathNode.LineTo(21.42f, 7.92f),
                    PathNode.CurveTo(21.782572f, 7.76013f, 22.016546f, 7.401254f, 22.016546f, 7.005f),
                    PathNode.CurveTo(22.016546f, 6.608747f, 21.782572f, 6.24987f, 21.42f, 6.09f),
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
                    PathNode.MoveTo(2.0f, 12.0f),
                    PathNode.CurveTo(1.999034f, 12.390571f, 2.225546f, 12.745961f, 2.58f, 12.91f),
                    PathNode.LineTo(11.18f, 16.82f),
                    PathNode.CurveTo(11.704372f, 17.057446f, 12.305628f, 17.057446f, 12.83f, 16.82f),
                    PathNode.LineTo(21.41f, 12.92f),
                    PathNode.CurveTo(21.771679f, 12.757434f, 22.003132f, 12.396521f, 22.0f, 12.0f)
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
                    PathNode.MoveTo(2.0f, 17.0f),
                    PathNode.CurveTo(1.999034f, 17.390572f, 2.225546f, 17.74596f, 2.58f, 17.91f),
                    PathNode.LineTo(11.18f, 21.82f),
                    PathNode.CurveTo(11.704372f, 22.057446f, 12.305628f, 22.057446f, 12.83f, 21.82f),
                    PathNode.LineTo(21.41f, 17.92f),
                    PathNode.CurveTo(21.771679f, 17.757435f, 22.003132f, 17.39652f, 22.0f, 17.0f)
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
        return _layers!!
    }

private var _layers: ImageVector? = null
