package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Rainbow: ImageVector
    get() {
        if (_rainbow != null) return _rainbow!!
        _rainbow = phosphorFillIcon(
            name = "Rainbow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 48.000 C 61.756 48.072 8.072 101.756 8.000 168.000 L 8.000 184.000 C 8.000 188.418 11.582 192.000 16.000 192.000 L 240.000 192.000 C 244.418 192.000 248.000 188.418 248.000 184.000 L 248.000 168.000 C 247.928 101.756 194.244 48.072 128.000 48.000 ZM 160.000 176.000 C 155.582 176.000 152.000 172.418 152.000 168.000 C 152.000 154.745 141.255 144.000 128.000 144.000 C 114.745 144.000 104.000 154.745 104.000 168.000 C 104.000 172.418 100.418 176.000 96.000 176.000 C 91.582 176.000 88.000 172.418 88.000 168.000 C 88.000 145.909 105.909 128.000 128.000 128.000 C 150.091 128.000 168.000 145.909 168.000 168.000 C 168.000 172.418 164.418 176.000 160.000 176.000 ZM 192.000 176.000 C 187.582 176.000 184.000 172.418 184.000 168.000 C 184.000 137.072 158.928 112.000 128.000 112.000 C 97.072 112.000 72.000 137.072 72.000 168.000 C 72.000 172.418 68.418 176.000 64.000 176.000 C 59.582 176.000 56.000 172.418 56.000 168.000 C 56.000 128.236 88.235 96.000 128.000 96.000 C 167.764 96.000 200.000 128.236 200.000 168.000 C 200.000 172.418 196.418 176.000 192.000 176.000 ZM 224.000 176.000 C 219.582 176.000 216.000 172.418 216.000 168.000 C 216.000 119.399 176.601 80.000 128.000 80.000 C 79.399 80.000 40.000 119.399 40.000 168.000 C 40.000 172.418 36.418 176.000 32.000 176.000 C 27.582 176.000 24.000 172.418 24.000 168.000 C 24.000 110.562 70.562 64.000 128.000 64.000 C 185.438 64.000 232.000 110.562 232.000 168.000 C 232.000 172.418 228.418 176.000 224.000 176.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _rainbow!!
    }

private var _rainbow: ImageVector? = null
