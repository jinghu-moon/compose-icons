package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberZero: ImageVector
    get() {
        if (_numberZero != null) return _numberZero!!
        _numberZero = phosphorFillIcon(
            name = "NumberZero",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(157.68f, 88.39f),
                    PathNode.CurveTo(164.34f, 98.52f, 168.0f, 112.59f, 168.0f, 128.0f),
                    PathNode.CurveTo(168.0f, 143.41f, 164.34f, 157.47f, 157.68f, 167.61f),
                    PathNode.CurveTo(150.55f, 178.49f, 140.56f, 184.0f, 128.0f, 184.0f),
                    PathNode.CurveTo(115.44f, 184.0f, 105.45f, 178.49f, 98.32f, 167.61f),
                    PathNode.CurveTo(91.66f, 157.47f, 88.0f, 143.41f, 88.0f, 128.0f),
                    PathNode.CurveTo(88.0f, 112.59f, 91.66f, 98.52f, 98.32f, 88.39f),
                    PathNode.CurveTo(105.45f, 77.51f, 115.44f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(140.56f, 72.0f, 150.55f, 77.51f, 157.68f, 88.39f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(216.0f, 224.83656f, 208.83656f, 232.0f, 200.0f, 232.0f),
                    PathNode.LineTo(56.0f, 232.0f),
                    PathNode.CurveTo(47.163445f, 232.0f, 40.0f, 224.83656f, 40.0f, 216.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(40.0f, 31.163445f, 47.163445f, 24.0f, 56.0f, 24.0f),
                    PathNode.LineTo(200.0f, 24.0f),
                    PathNode.CurveTo(208.83656f, 24.0f, 216.0f, 31.163445f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 128.0f),
                    PathNode.CurveTo(184.0f, 109.51f, 179.4f, 92.32f, 171.06f, 79.61f),
                    PathNode.CurveTo(160.92f, 64.16f, 146.0f, 56.0f, 128.0f, 56.0f),
                    PathNode.CurveTo(110.0f, 56.0f, 95.08f, 64.16f, 84.94f, 79.61f),
                    PathNode.CurveTo(76.6f, 92.32f, 72.0f, 109.51f, 72.0f, 128.0f),
                    PathNode.CurveTo(72.0f, 146.49f, 76.6f, 163.68f, 84.94f, 176.39f),
                    PathNode.CurveTo(95.08f, 191.84f, 110.0f, 200.0f, 128.0f, 200.0f),
                    PathNode.CurveTo(146.0f, 200.0f, 160.92f, 191.84f, 171.06f, 176.39f),
                    PathNode.CurveTo(179.4f, 163.68f, 184.0f, 146.49f, 184.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _numberZero!!
    }

private var _numberZero: ImageVector? = null
