package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TipJar: ImageVector
    get() {
        if (_tipJar != null) return _tipJar!!
        _tipJar = phosphorFillIcon(
            name = "TipJar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.000 48.810 L 184.000 32.000 C 184.000 23.163 176.837 16.000 168.000 16.000 L 88.000 16.000 C 79.163 16.000 72.000 23.163 72.000 32.000 L 72.000 48.810 C 53.388 52.629 40.020 69.000 40.000 88.000 L 40.000 200.000 C 40.000 222.091 57.909 240.000 80.000 240.000 L 176.000 240.000 C 198.091 240.000 216.000 222.091 216.000 200.000 L 216.000 88.000 C 215.980 69.000 202.612 52.629 184.000 48.810 ZM 120.000 32.000 L 136.000 32.000 L 136.000 48.000 L 120.000 48.000 ZM 88.000 32.000 L 104.000 32.000 L 104.000 48.000 L 88.000 48.000 ZM 136.000 184.000 L 136.000 192.000 C 136.000 196.418 132.418 200.000 128.000 200.000 C 123.582 200.000 120.000 196.418 120.000 192.000 L 120.000 184.000 L 112.000 184.000 C 107.582 184.000 104.000 180.418 104.000 176.000 C 104.000 171.582 107.582 168.000 112.000 168.000 L 136.000 168.000 C 140.418 168.000 144.000 164.418 144.000 160.000 C 144.000 155.582 140.418 152.000 136.000 152.000 L 120.000 152.000 C 106.745 152.000 96.000 141.255 96.000 128.000 C 96.000 114.745 106.745 104.000 120.000 104.000 L 120.000 96.000 C 120.000 91.582 123.582 88.000 128.000 88.000 C 132.418 88.000 136.000 91.582 136.000 96.000 L 136.000 104.000 L 144.000 104.000 C 148.418 104.000 152.000 107.582 152.000 112.000 C 152.000 116.418 148.418 120.000 144.000 120.000 L 120.000 120.000 C 115.582 120.000 112.000 123.582 112.000 128.000 C 112.000 132.418 115.582 136.000 120.000 136.000 L 136.000 136.000 C 149.255 136.000 160.000 146.745 160.000 160.000 C 160.000 173.255 149.255 184.000 136.000 184.000 ZM 168.000 48.000 L 152.000 48.000 L 152.000 32.000 L 168.000 32.000 Z"),
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
        return _tipJar!!
    }

private var _tipJar: ImageVector? = null
