package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Backspace: ImageVector
    get() {
        if (_backspace != null) return _backspace!!
        _backspace = phosphorDuotoneIcon(
            name = "Backspace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 56.0f),
                    PathNode.LineTo(224.0f, 200.0f),
                    PathNode.CurveTo(224.0f, 204.41827f, 220.41827f, 208.0f, 216.0f, 208.0f),
                    PathNode.LineTo(68.53f, 208.0f),
                    PathNode.CurveTo(65.72069f, 208.00087f, 63.116795f, 206.5281f, 61.67f, 204.12f),
                    PathNode.LineTo(16.0f, 128.0f),
                    PathNode.LineTo(61.67f, 51.88f),
                    PathNode.CurveTo(63.116795f, 49.47189f, 65.72069f, 47.99913f, 68.53f, 48.0f),
                    PathNode.LineTo(216.0f, 48.0f),
                    PathNode.CurveTo(220.41827f, 48.0f, 224.0f, 51.581722f, 224.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(68.53f, 40.0f),
                    PathNode.CurveTo(62.913544f, 40.01618f, 57.712524f, 42.96165f, 54.81f, 47.77f),
                    PathNode.LineTo(9.14f, 123.88f),
                    PathNode.CurveTo(7.616696f, 126.41546f, 7.616696f, 129.58453f, 9.14f, 132.12f),
                    PathNode.LineTo(54.81f, 208.23f),
                    PathNode.CurveTo(57.712524f, 213.03835f, 62.913544f, 215.98383f, 68.53f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(224.83656f, 216.0f, 232.0f, 208.83656f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(61.67f, 204.12f),
                    PathNode.LineTo(68.53f, 200.0f),
                    PathNode.LineTo(68.53f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 200.0f),
                    PathNode.LineTo(68.53f, 200.0f),
                    PathNode.LineTo(25.33f, 128.0f),
                    PathNode.LineTo(68.53f, 56.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(106.34f, 146.34f),
                    PathNode.LineTo(124.69f, 128.0f),
                    PathNode.LineTo(106.34f, 109.66f),
                    PathNode.CurveTo(103.214066f, 106.534065f, 103.214066f, 101.465935f, 106.34f, 98.34f),
                    PathNode.CurveTo(109.465935f, 95.214066f, 114.534065f, 95.214066f, 117.66f, 98.34f),
                    PathNode.LineTo(136.0f, 116.69f),
                    PathNode.LineTo(154.34f, 98.34f),
                    PathNode.CurveTo(157.46593f, 95.214066f, 162.53407f, 95.214066f, 165.66f, 98.34f),
                    PathNode.CurveTo(168.78593f, 101.465935f, 168.78593f, 106.534065f, 165.66f, 109.66f),
                    PathNode.LineTo(147.31f, 128.0f),
                    PathNode.LineTo(165.66f, 146.34f),
                    PathNode.CurveTo(168.78593f, 149.46593f, 168.78593f, 154.53407f, 165.66f, 157.66f),
                    PathNode.CurveTo(162.53407f, 160.78593f, 157.46593f, 160.78593f, 154.34f, 157.66f),
                    PathNode.LineTo(136.0f, 139.31f),
                    PathNode.LineTo(117.66f, 157.66f),
                    PathNode.CurveTo(114.534065f, 160.78593f, 109.465935f, 160.78593f, 106.34f, 157.66f),
                    PathNode.CurveTo(103.214066f, 154.53407f, 103.214066f, 149.46593f, 106.34f, 146.34f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _backspace!!
    }

private var _backspace: ImageVector? = null
