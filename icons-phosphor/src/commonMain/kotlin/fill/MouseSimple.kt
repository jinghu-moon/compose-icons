package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MouseSimple: ImageVector
    get() {
        if (_mouseSimple != null) return _mouseSimple!!
        _mouseSimple = phosphorFillIcon(
            name = "MouseSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(144.0f, 16.0f),
                    PathNode.LineTo(112.0f, 16.0f),
                    PathNode.CurveTo(76.66977f, 16.03858f, 48.03858f, 44.66977f, 48.0f, 80.0f),
                    PathNode.LineTo(48.0f, 176.0f),
                    PathNode.CurveTo(48.03858f, 211.33023f, 76.66977f, 239.96143f, 112.0f, 240.0f),
                    PathNode.LineTo(144.0f, 240.0f),
                    PathNode.CurveTo(179.33023f, 239.96143f, 207.96143f, 211.33023f, 208.0f, 176.0f),
                    PathNode.LineTo(208.0f, 80.0f),
                    PathNode.CurveTo(207.96143f, 44.66977f, 179.33023f, 16.03858f, 144.0f, 16.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 112.0f),
                    PathNode.CurveTo(136.0f, 116.41828f, 132.41827f, 120.0f, 128.0f, 120.0f),
                    PathNode.CurveTo(123.58172f, 120.0f, 120.0f, 116.41828f, 120.0f, 112.0f),
                    PathNode.LineTo(120.0f, 64.0f),
                    PathNode.CurveTo(120.0f, 59.581722f, 123.58172f, 56.0f, 128.0f, 56.0f),
                    PathNode.CurveTo(132.41827f, 56.0f, 136.0f, 59.581722f, 136.0f, 64.0f),
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
        return _mouseSimple!!
    }

private var _mouseSimple: ImageVector? = null
