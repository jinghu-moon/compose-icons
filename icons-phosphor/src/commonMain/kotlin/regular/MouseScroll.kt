package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MouseScroll: ImageVector
    get() {
        if (_mouseScroll != null) return _mouseScroll!!
        _mouseScroll = phosphorRegularIcon(
            name = "MouseScroll",
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
                    PathNode.MoveTo(192.0f, 176.0f),
                    PathNode.CurveTo(191.97244f, 202.49825f, 170.49825f, 223.97244f, 144.0f, 224.0f),
                    PathNode.LineTo(112.0f, 224.0f),
                    PathNode.CurveTo(85.501755f, 223.97244f, 64.02756f, 202.49825f, 64.0f, 176.0f),
                    PathNode.LineTo(64.0f, 80.0f),
                    PathNode.CurveTo(64.02756f, 53.501755f, 85.501755f, 32.02756f, 112.0f, 32.0f),
                    PathNode.LineTo(144.0f, 32.0f),
                    PathNode.CurveTo(170.49825f, 32.02756f, 191.97244f, 53.501755f, 192.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 83.31f),
                    PathNode.LineTo(136.0f, 172.69f),
                    PathNode.LineTo(146.34f, 162.34f),
                    PathNode.CurveTo(149.46593f, 159.21407f, 154.53407f, 159.21407f, 157.66f, 162.34f),
                    PathNode.CurveTo(160.78593f, 165.46593f, 160.78593f, 170.53407f, 157.66f, 173.66f),
                    PathNode.LineTo(133.66f, 197.66f),
                    PathNode.CurveTo(132.15945f, 199.16223f, 130.12328f, 200.00629f, 128.0f, 200.00629f),
                    PathNode.CurveTo(125.876724f, 200.00629f, 123.840546f, 199.16223f, 122.34f, 197.66f),
                    PathNode.LineTo(98.34f, 173.66f),
                    PathNode.CurveTo(95.214066f, 170.53407f, 95.214066f, 165.46593f, 98.34f, 162.34f),
                    PathNode.CurveTo(101.465935f, 159.21407f, 106.534065f, 159.21407f, 109.66f, 162.34f),
                    PathNode.LineTo(120.0f, 172.69f),
                    PathNode.LineTo(120.0f, 83.31f),
                    PathNode.LineTo(109.66f, 93.66f),
                    PathNode.CurveTo(106.534065f, 96.785934f, 101.465935f, 96.785934f, 98.34f, 93.66f),
                    PathNode.CurveTo(95.214066f, 90.534065f, 95.214066f, 85.465935f, 98.34f, 82.34f),
                    PathNode.LineTo(122.34f, 58.34f),
                    PathNode.CurveTo(123.840546f, 56.837784f, 125.876724f, 55.993706f, 128.0f, 55.993706f),
                    PathNode.CurveTo(130.12328f, 55.993706f, 132.15945f, 56.837784f, 133.66f, 58.34f),
                    PathNode.LineTo(157.66f, 82.34f),
                    PathNode.CurveTo(160.78593f, 85.465935f, 160.78593f, 90.534065f, 157.66f, 93.66f),
                    PathNode.CurveTo(154.53407f, 96.785934f, 149.46593f, 96.785934f, 146.34f, 93.66f),
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
        return _mouseScroll!!
    }

private var _mouseScroll: ImageVector? = null
