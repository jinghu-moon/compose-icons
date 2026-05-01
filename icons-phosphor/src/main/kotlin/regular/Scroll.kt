package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Scroll: ImageVector
    get() {
        if (_scroll != null) return _scroll!!
        _scroll = phosphorRegularIcon(
            name = "Scroll",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(96.0f, 104.0f),
                    PathNode.CurveTo(96.0f, 99.58172f, 99.58172f, 96.0f, 104.0f, 96.0f),
                    PathNode.LineTo(168.0f, 96.0f),
                    PathNode.CurveTo(172.41827f, 96.0f, 176.0f, 99.58172f, 176.0f, 104.0f),
                    PathNode.CurveTo(176.0f, 108.41828f, 172.41827f, 112.0f, 168.0f, 112.0f),
                    PathNode.LineTo(104.0f, 112.0f),
                    PathNode.CurveTo(99.58172f, 112.0f, 96.0f, 108.41828f, 96.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 144.0f),
                    PathNode.LineTo(168.0f, 144.0f),
                    PathNode.CurveTo(172.41827f, 144.0f, 176.0f, 140.41827f, 176.0f, 136.0f),
                    PathNode.CurveTo(176.0f, 131.58173f, 172.41827f, 128.0f, 168.0f, 128.0f),
                    PathNode.LineTo(104.0f, 128.0f),
                    PathNode.CurveTo(99.58172f, 128.0f, 96.0f, 131.58173f, 96.0f, 136.0f),
                    PathNode.CurveTo(96.0f, 140.41827f, 99.58172f, 144.0f, 104.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 192.0f),
                    PathNode.CurveTo(232.0f, 209.67311f, 217.67311f, 224.0f, 200.0f, 224.0f),
                    PathNode.LineTo(88.0f, 224.0f),
                    PathNode.CurveTo(70.32689f, 224.0f, 56.0f, 209.67311f, 56.0f, 192.0f),
                    PathNode.LineTo(56.0f, 64.0f),
                    PathNode.CurveTo(56.0f, 55.163445f, 48.836555f, 48.0f, 40.0f, 48.0f),
                    PathNode.CurveTo(31.163445f, 48.0f, 24.0f, 55.163445f, 24.0f, 64.0f),
                    PathNode.CurveTo(24.0f, 69.74f, 28.83f, 73.62f, 28.88f, 73.66f),
                    PathNode.LineTo(28.88f, 73.66f),
                    PathNode.CurveTo(31.59462f, 75.74905f, 32.678032f, 79.33454f, 31.5745f, 82.5773f),
                    PathNode.CurveTo(30.470964f, 85.82007f, 27.425388f, 88.00044f, 24.0f, 88.0f),
                    PathNode.CurveTo(22.270004f, 88.00298f, 20.586979f, 87.437294f, 19.21f, 86.39f),
                    PathNode.LineTo(19.21f, 86.39f),
                    PathNode.CurveTo(18.05f, 85.54f, 8.0f, 77.61f, 8.0f, 64.0f),
                    PathNode.CurveTo(8.0f, 46.32689f, 22.326887f, 32.0f, 40.0f, 32.0f),
                    PathNode.LineTo(176.0f, 32.0f),
                    PathNode.CurveTo(193.67311f, 32.0f, 208.0f, 46.32689f, 208.0f, 64.0f),
                    PathNode.LineTo(208.0f, 168.0f),
                    PathNode.LineTo(216.0f, 168.0f),
                    PathNode.CurveTo(217.73096f, 168.0f, 219.41524f, 168.56142f, 220.8f, 169.6f),
                    PathNode.CurveTo(222.0f, 170.46f, 232.0f, 178.39f, 232.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.26f, 173.48f),
                    PathNode.CurveTo(97.381325f, 170.17015f, 100.505615f, 167.95811f, 104.0f, 168.0f),
                    PathNode.LineTo(192.0f, 168.0f),
                    PathNode.LineTo(192.0f, 64.0f),
                    PathNode.CurveTo(192.0f, 55.163445f, 184.83656f, 48.0f, 176.0f, 48.0f),
                    PathNode.LineTo(67.69f, 48.0f),
                    PathNode.CurveTo(70.519394f, 52.85706f, 72.00685f, 58.37893f, 72.0f, 64.0f),
                    PathNode.LineTo(72.0f, 192.0f),
                    PathNode.CurveTo(72.0f, 200.83656f, 79.163445f, 208.0f, 88.0f, 208.0f),
                    PathNode.CurveTo(96.836555f, 208.0f, 104.0f, 200.83656f, 104.0f, 192.0f),
                    PathNode.CurveTo(104.0f, 186.26f, 99.17f, 182.38f, 99.12f, 182.34f),
                    PathNode.CurveTo(96.32094f, 180.33774f, 95.15989f, 176.7409f, 96.26f, 173.48f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 192.0f),
                    PathNode.CurveTo(215.9f, 189.03596f, 214.756f, 186.20256f, 212.77f, 184.0f),
                    PathNode.LineTo(118.77f, 184.0f),
                    PathNode.CurveTo(119.57406f, 186.59048f, 119.982f, 189.2876f, 119.98f, 192.0f),
                    PathNode.CurveTo(119.98766f, 197.61855f, 118.50751f, 203.13895f, 115.69f, 208.0f),
                    PathNode.LineTo(200.0f, 208.0f),
                    PathNode.CurveTo(208.83656f, 208.0f, 216.0f, 200.83656f, 216.0f, 192.0f),
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
        return _scroll!!
    }

private var _scroll: ImageVector? = null
