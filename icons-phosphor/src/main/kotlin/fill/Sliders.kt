package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Sliders: ImageVector
    get() {
        if (_sliders != null) return _sliders!!
        _sliders = phosphorFillIcon(
            name = "Sliders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 84.000 136.000 C 83.999 148.382 75.866 159.292 64.000 162.830 L 64.000 216.000 C 64.000 220.418 60.418 224.000 56.000 224.000 C 51.582 224.000 48.000 220.418 48.000 216.000 L 48.000 162.830 C 36.138 159.289 28.009 148.379 28.009 136.000 C 28.009 123.621 36.138 112.711 48.000 109.170 L 48.000 40.000 C 48.000 35.582 51.582 32.000 56.000 32.000 C 60.418 32.000 64.000 35.582 64.000 40.000 L 64.000 109.170 C 75.866 112.708 83.999 123.618 84.000 136.000 ZM 136.000 61.170 L 136.000 40.000 C 136.000 35.582 132.418 32.000 128.000 32.000 C 123.582 32.000 120.000 35.582 120.000 40.000 L 120.000 61.170 C 108.138 64.711 100.009 75.621 100.009 88.000 C 100.009 100.379 108.138 111.289 120.000 114.830 L 120.000 216.000 C 120.000 220.418 123.582 224.000 128.000 224.000 C 132.418 224.000 136.000 220.418 136.000 216.000 L 136.000 114.830 C 147.862 111.289 155.991 100.379 155.991 88.000 C 155.991 75.621 147.862 64.711 136.000 61.170 ZM 208.000 141.170 L 208.000 40.000 C 208.000 35.582 204.418 32.000 200.000 32.000 C 195.582 32.000 192.000 35.582 192.000 40.000 L 192.000 141.170 C 180.138 144.711 172.009 155.621 172.009 168.000 C 172.009 180.379 180.138 191.289 192.000 194.830 L 192.000 216.000 C 192.000 220.418 195.582 224.000 200.000 224.000 C 204.418 224.000 208.000 220.418 208.000 216.000 L 208.000 194.830 C 219.862 191.289 227.991 180.379 227.991 168.000 C 227.991 155.621 219.862 144.711 208.000 141.170 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _sliders!!
    }

private var _sliders: ImageVector? = null
