package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Scroll: ImageVector
    get() {
        if (_scroll != null) return _scroll!!
        _scroll = phosphorFillIcon(
            name = "Scroll",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.8f, 169.6f),
                    PathNode.CurveTo(219.41524f, 168.56142f, 217.73096f, 168.0f, 216.0f, 168.0f),
                    PathNode.LineTo(208.0f, 168.0f),
                    PathNode.LineTo(208.0f, 64.0f),
                    PathNode.CurveTo(208.0f, 46.32689f, 193.67311f, 32.0f, 176.0f, 32.0f),
                    PathNode.LineTo(40.0f, 32.0f),
                    PathNode.CurveTo(22.326887f, 32.0f, 8.0f, 46.32689f, 8.0f, 64.0f),
                    PathNode.CurveTo(8.0f, 77.61f, 18.05f, 85.54f, 19.2f, 86.4f),
                    PathNode.LineTo(19.2f, 86.4f),
                    PathNode.CurveTo(20.580975f, 87.4458f, 22.26774f, 88.00806f, 24.0f, 88.0f),
                    PathNode.CurveTo(27.41816f, 87.99064f, 30.452759f, 85.81059f, 31.552633f, 82.57421f),
                    PathNode.CurveTo(32.652508f, 79.33783f, 31.574642f, 75.76017f, 28.87f, 73.67f),
                    PathNode.LineTo(28.87f, 73.67f),
                    PathNode.CurveTo(28.83f, 73.62f, 24.0f, 69.74f, 24.0f, 64.0f),
                    PathNode.CurveTo(24.0f, 55.163445f, 31.163445f, 48.0f, 40.0f, 48.0f),
                    PathNode.CurveTo(48.836555f, 48.0f, 56.0f, 55.163445f, 56.0f, 64.0f),
                    PathNode.LineTo(56.0f, 192.0f),
                    PathNode.CurveTo(56.0f, 209.67311f, 70.32689f, 224.0f, 88.0f, 224.0f),
                    PathNode.LineTo(200.0f, 224.0f),
                    PathNode.CurveTo(217.67311f, 224.0f, 232.0f, 209.67311f, 232.0f, 192.0f),
                    PathNode.CurveTo(232.0f, 178.39f, 222.0f, 170.46f, 220.8f, 169.6f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 96.0f),
                    PathNode.LineTo(168.0f, 96.0f),
                    PathNode.CurveTo(172.41827f, 96.0f, 176.0f, 99.58172f, 176.0f, 104.0f),
                    PathNode.CurveTo(176.0f, 108.41828f, 172.41827f, 112.0f, 168.0f, 112.0f),
                    PathNode.LineTo(104.0f, 112.0f),
                    PathNode.CurveTo(99.58172f, 112.0f, 96.0f, 108.41828f, 96.0f, 104.0f),
                    PathNode.CurveTo(96.0f, 99.58172f, 99.58172f, 96.0f, 104.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 136.0f),
                    PathNode.CurveTo(96.0f, 131.58173f, 99.58172f, 128.0f, 104.0f, 128.0f),
                    PathNode.LineTo(168.0f, 128.0f),
                    PathNode.CurveTo(172.41827f, 128.0f, 176.0f, 131.58173f, 176.0f, 136.0f),
                    PathNode.CurveTo(176.0f, 140.41827f, 172.41827f, 144.0f, 168.0f, 144.0f),
                    PathNode.LineTo(104.0f, 144.0f),
                    PathNode.CurveTo(99.58172f, 144.0f, 96.0f, 140.41827f, 96.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 208.0f),
                    PathNode.LineTo(107.71f, 208.0f),
                    PathNode.CurveTo(110.527504f, 203.13895f, 112.00765f, 197.61855f, 112.0f, 192.0f),
                    PathNode.CurveTo(112.002f, 189.2876f, 111.59406f, 186.59048f, 110.79f, 184.0f),
                    PathNode.LineTo(212.79f, 184.0f),
                    PathNode.CurveTo(214.776f, 186.20256f, 215.91998f, 189.03596f, 216.02f, 192.0f),
                    PathNode.CurveTo(216.02f, 196.24693f, 214.33154f, 200.31963f, 211.32664f, 203.32079f),
                    PathNode.CurveTo(208.32173f, 206.32195f, 204.24693f, 208.00531f, 200.0f, 208.0f),
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
        return _scroll!!
    }

private var _scroll: ImageVector? = null
