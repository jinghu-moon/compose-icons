package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LayersMinus: ImageVector
    get() {
        if (_layersMinus != null) return _layersMinus!!
        _layersMinus = lucideOutlineIcon(
            name = "LayersMinus",
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
                    PathNode.CurveTo(21.783794f, 7.76067f, 22.018822f, 7.401156f, 22.018822f, 7.004f),
                    PathNode.CurveTo(22.018822f, 6.606845f, 21.783794f, 6.24733f, 21.42f, 6.088f),
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
                    PathNode.MoveTo(16.0f, 17.0f),
                    PathNode.LineTo(22.0f, 17.0f)
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
                    PathNode.MoveTo(2.003f, 11.995f),
                    PathNode.CurveTo(2.003079f, 12.391361f, 2.237251f, 12.750266f, 2.6f, 12.91f),
                    PathNode.LineTo(11.18f, 16.82f),
                    PathNode.CurveTo(11.44059f, 16.938728f, 11.723638f, 17.000113f, 12.01f, 17.0f)
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
                    PathNode.MoveTo(2.003f, 16.995f),
                    PathNode.CurveTo(2.003079f, 17.391361f, 2.237251f, 17.750269f, 2.6f, 17.91f),
                    PathNode.LineTo(11.18f, 21.82f),
                    PathNode.CurveTo(11.44059f, 21.938728f, 11.723638f, 22.000113f, 12.01f, 22.0f),
                    PathNode.CurveTo(12.296363f, 22.000113f, 12.579411f, 21.938728f, 12.84f, 21.82f),
                    PathNode.LineTo(14.95f, 20.86f)
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
                    PathNode.MoveTo(22.018f, 12.004f),
                    PathNode.CurveTo(22.018143f, 12.400961f, 21.783472f, 12.760422f, 21.42f, 12.92f),
                    PathNode.LineTo(21.243f, 13.0f)
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
        return _layersMinus!!
    }

private var _layersMinus: ImageVector? = null
