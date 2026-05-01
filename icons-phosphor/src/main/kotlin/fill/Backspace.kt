package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Backspace: ImageVector
    get() {
        if (_backspace != null) return _backspace!!
        _backspace = phosphorFillIcon(
            name = "Backspace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(68.53f, 40.0f),
                    PathNode.CurveTo(62.91562f, 40.024006f, 57.71817f, 42.96746f, 54.81f, 47.77f),
                    PathNode.LineTo(9.14f, 123.88f),
                    PathNode.CurveTo(7.616696f, 126.41546f, 7.616696f, 129.58453f, 9.14f, 132.12f),
                    PathNode.LineTo(54.81f, 208.23f),
                    PathNode.LineTo(54.81f, 208.23f),
                    PathNode.CurveTo(57.716763f, 213.034f, 62.9151f, 215.97795f, 68.53f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(224.83656f, 216.0f, 232.0f, 208.83656f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(165.66f, 146.34f),
                    PathNode.CurveTo(168.78593f, 149.46593f, 168.78593f, 154.53407f, 165.66f, 157.66f),
                    PathNode.CurveTo(162.53407f, 160.78593f, 157.46593f, 160.78593f, 154.34f, 157.66f),
                    PathNode.LineTo(136.0f, 139.31f),
                    PathNode.LineTo(117.65f, 157.66f),
                    PathNode.CurveTo(114.52407f, 160.78317f, 109.45817f, 160.78093f, 106.335f, 157.655f),
                    PathNode.CurveTo(103.21183f, 154.52907f, 103.214066f, 149.46317f, 106.34f, 146.34f),
                    PathNode.LineTo(124.69f, 128.0f),
                    PathNode.LineTo(106.34f, 109.66f),
                    PathNode.CurveTo(103.214066f, 106.53683f, 103.21183f, 101.47094f, 106.335f, 98.345f),
                    PathNode.CurveTo(109.45817f, 95.21907f, 114.52407f, 95.21683f, 117.65f, 98.34f),
                    PathNode.LineTo(136.0f, 116.69f),
                    PathNode.LineTo(154.34f, 98.34f),
                    PathNode.CurveTo(157.46593f, 95.214066f, 162.53407f, 95.214066f, 165.66f, 98.34f),
                    PathNode.CurveTo(168.78593f, 101.465935f, 168.78593f, 106.534065f, 165.66f, 109.66f),
                    PathNode.LineTo(147.31f, 128.0f),
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
        return _backspace!!
    }

private var _backspace: ImageVector? = null
