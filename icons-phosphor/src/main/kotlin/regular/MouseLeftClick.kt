package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MouseLeftClick: ImageVector
    get() {
        if (_mouseLeftClick != null) return _mouseLeftClick!!
        _mouseLeftClick = phosphorRegularIcon(
            name = "MouseLeftClick",
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
                    PathNode.MoveTo(192.0f, 80.0f),
                    PathNode.LineTo(192.0f, 104.0f),
                    PathNode.LineTo(136.0f, 104.0f),
                    PathNode.LineTo(136.0f, 32.0f),
                    PathNode.LineTo(144.0f, 32.0f),
                    PathNode.CurveTo(170.49825f, 32.02756f, 191.97244f, 53.501755f, 192.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(115.31f, 104.0f),
                    PathNode.LineTo(69.31f, 58.0f),
                    PathNode.CurveTo(72.12189f, 52.61333f, 75.92117f, 47.80316f, 80.51f, 43.82f),
                    PathNode.LineTo(120.0f, 83.31f),
                    PathNode.LineTo(120.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 80.0f),
                    PathNode.CurveTo(64.0f, 78.49f, 64.08f, 77.0f, 64.22f, 75.53f),
                    PathNode.LineTo(92.69f, 104.0f),
                    PathNode.LineTo(64.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 32.0f),
                    PathNode.LineTo(120.0f, 60.69f),
                    PathNode.LineTo(94.59f, 35.28f),
                    PathNode.CurveTo(100.137794f, 33.10978f, 106.04283f, 31.997284f, 112.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 224.0f),
                    PathNode.LineTo(112.0f, 224.0f),
                    PathNode.CurveTo(85.501755f, 223.97244f, 64.02756f, 202.49825f, 64.0f, 176.0f),
                    PathNode.LineTo(64.0f, 120.0f),
                    PathNode.LineTo(192.0f, 120.0f),
                    PathNode.LineTo(192.0f, 176.0f),
                    PathNode.CurveTo(191.97244f, 202.49825f, 170.49825f, 223.97244f, 144.0f, 224.0f),
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
        return _mouseLeftClick!!
    }

private var _mouseLeftClick: ImageVector? = null
