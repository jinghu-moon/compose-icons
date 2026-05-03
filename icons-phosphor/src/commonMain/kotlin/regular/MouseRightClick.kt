package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MouseRightClick: ImageVector
    get() {
        if (_mouseRightClick != null) return _mouseRightClick!!
        _mouseRightClick = phosphorRegularIcon(
            name = "MouseRightClick",
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
                    PathNode.MoveTo(136.0f, 83.31f),
                    PathNode.LineTo(175.49f, 43.82f),
                    PathNode.CurveTo(180.06805f, 47.805862f, 183.85703f, 52.615856f, 186.66f, 58.0f),
                    PathNode.LineTo(140.66f, 104.0f),
                    PathNode.LineTo(136.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(191.78f, 75.53f),
                    PathNode.CurveTo(191.92f, 77.0f, 192.0f, 78.53f, 192.0f, 80.0f),
                    PathNode.LineTo(192.0f, 104.0f),
                    PathNode.LineTo(163.31f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(161.41f, 35.28f),
                    PathNode.LineTo(136.0f, 60.69f),
                    PathNode.LineTo(136.0f, 32.0f),
                    PathNode.LineTo(144.0f, 32.0f),
                    PathNode.CurveTo(149.95717f, 31.997284f, 155.8622f, 33.10978f, 161.41f, 35.28f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 32.0f),
                    PathNode.LineTo(120.0f, 32.0f),
                    PathNode.LineTo(120.0f, 104.0f),
                    PathNode.LineTo(64.0f, 104.0f),
                    PathNode.LineTo(64.0f, 80.0f),
                    PathNode.CurveTo(64.02756f, 53.501755f, 85.501755f, 32.02756f, 112.0f, 32.0f),
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
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _mouseRightClick!!
    }

private var _mouseRightClick: ImageVector? = null
