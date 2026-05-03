package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Lasso: ImageVector
    get() {
        if (_lasso != null) return _lasso!!
        _lasso = phosphorFillIcon(
            name = "Lasso",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(93.43f, 136.11f),
                    PathNode.CurveTo(87.60642f, 135.3812f, 81.81484f, 137.68272f, 78.08f, 142.21f),
                    PathNode.CurveTo(87.39f, 148.77f, 100.59f, 153.54f, 115.51f, 155.28f),
                    PathNode.CurveTo(110.41f, 143.33f, 101.72f, 137.0f, 93.43f, 136.11f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(224.0f, 216.83656f, 216.83656f, 224.0f, 208.0f, 224.0f),
                    PathNode.LineTo(127.65f, 224.0f),
                    PathNode.CurveTo(126.15086f, 223.9947f, 124.78053f, 223.1516f, 124.1f, 221.81581f),
                    PathNode.CurveTo(123.419464f, 220.48003f, 123.54299f, 218.87585f, 124.42f, 217.66f),
                    PathNode.CurveTo(131.92f, 207.43f, 136.0f, 194.42f, 136.0f, 179.82f),
                    PathNode.CurveTo(136.0f, 177.03f, 135.87f, 174.36f, 135.65f, 171.77f),
                    PathNode.CurveTo(176.79f, 169.33f, 208.0f, 147.47f, 208.0f, 120.0f),
                    PathNode.CurveTo(208.0f, 90.85f, 172.86f, 68.0f, 128.0f, 68.0f),
                    PathNode.CurveTo(83.14f, 68.0f, 48.0f, 90.84f, 48.0f, 120.0f),
                    PathNode.CurveTo(48.0f, 147.31f, 78.82f, 169.07f, 119.58f, 171.73f),
                    PathNode.CurveTo(119.861855f, 174.41743f, 120.00205f, 177.11783f, 120.0f, 179.82f),
                    PathNode.CurveTo(120.0f, 197.44f, 112.35f, 211.77f, 99.0f, 219.14f),
                    PathNode.CurveTo(92.972374f, 222.48529f, 86.16178f, 224.1629f, 79.27f, 224.0f),
                    PathNode.LineTo(48.0f, 224.0f),
                    PathNode.CurveTo(39.163445f, 224.0f, 32.0f, 216.83656f, 32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(32.0f, 39.163445f, 39.163445f, 32.0f, 48.0f, 32.0f),
                    PathNode.LineTo(208.0f, 32.0f),
                    PathNode.CurveTo(216.83656f, 32.0f, 224.0f, 39.163445f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 120.0f),
                    PathNode.CurveTo(192.0f, 100.49f, 162.69f, 84.0f, 128.0f, 84.0f),
                    PathNode.CurveTo(93.31f, 84.0f, 64.0f, 100.48f, 64.0f, 120.0f),
                    PathNode.CurveTo(64.04745f, 123.74555f, 65.08227f, 127.412285f, 67.0f, 130.63f),
                    PathNode.CurveTo(74.22889f, 122.92551f, 84.65648f, 119.0633f, 95.16f, 120.2f),
                    PathNode.CurveTo(110.16f, 121.83f, 126.0f, 133.6f, 132.7f, 155.88f),
                    PathNode.CurveTo(165.3f, 154.47f, 192.0f, 138.62f, 192.0f, 120.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _lasso!!
    }

private var _lasso: ImageVector? = null
