package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LayersPlus: ImageVector
    get() {
        if (_layersPlus != null) return _layersPlus!!
        _layersPlus = lucideOutlineIcon(
            name = "LayersPlus",
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
                    PathNode.CurveTo(11.44059f, 11.938728f, 11.723638f, 12.000113f, 12.01f, 12.0f),
                    PathNode.CurveTo(12.296363f, 12.000113f, 12.579411f, 11.938728f, 12.84f, 11.82f),
                    PathNode.LineTo(21.42f, 7.92f),
                    PathNode.CurveTo(21.783182f, 7.760399f, 22.017681f, 7.401204f, 22.017681f, 7.0045f),
                    PathNode.CurveTo(22.017681f, 6.607796f, 21.783182f, 6.248601f, 21.42f, 6.089f),
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
                    PathNode.MoveTo(16.0f, 17.0f),
                    PathNode.LineTo(22.0f, 17.0f)
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
                    PathNode.MoveTo(19.0f, 14.0f),
                    PathNode.LineTo(19.0f, 20.0f)
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
                    PathNode.CurveTo(11.439208f, 16.937342f, 11.720469f, 16.998026f, 12.005f, 16.998f)
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
                    PathNode.LineTo(14.946f, 20.858f)
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
        return _layersPlus!!
    }

private var _layersPlus: ImageVector? = null
