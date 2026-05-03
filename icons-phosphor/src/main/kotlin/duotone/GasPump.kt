package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GasPump: ImageVector
    get() {
        if (_gasPump != null) return _gasPump!!
        _gasPump = phosphorDuotoneIcon(
            name = "GasPump",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 168.000 56.000 L 168.000 216.000 L 56.000 216.000 L 56.000 56.000 C 56.000 47.163 63.163 40.000 72.000 40.000 L 152.000 40.000 C 160.837 40.000 168.000 47.163 168.000 56.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 241.000 69.660 L 221.660 50.340 C 218.534 47.214 213.466 47.214 210.340 50.340 C 207.214 53.466 207.214 58.534 210.340 61.660 L 229.660 81.000 C 231.153 82.494 231.994 84.518 232.000 86.630 L 232.000 168.000 C 232.000 172.418 228.418 176.000 224.000 176.000 C 219.582 176.000 216.000 172.418 216.000 168.000 L 216.000 128.000 C 216.000 114.745 205.255 104.000 192.000 104.000 L 176.000 104.000 L 176.000 56.000 C 176.000 42.745 165.255 32.000 152.000 32.000 L 72.000 32.000 C 58.745 32.000 48.000 42.745 48.000 56.000 L 48.000 208.000 L 32.000 208.000 C 27.582 208.000 24.000 211.582 24.000 216.000 C 24.000 220.418 27.582 224.000 32.000 224.000 L 192.000 224.000 C 196.418 224.000 200.000 220.418 200.000 216.000 C 200.000 211.582 196.418 208.000 192.000 208.000 L 176.000 208.000 L 176.000 120.000 L 192.000 120.000 C 196.418 120.000 200.000 123.582 200.000 128.000 L 200.000 168.000 C 200.000 181.255 210.745 192.000 224.000 192.000 C 237.255 192.000 248.000 181.255 248.000 168.000 L 248.000 86.630 C 248.024 80.266 245.504 74.156 241.000 69.660 ZM 64.000 208.000 L 64.000 56.000 C 64.000 51.582 67.582 48.000 72.000 48.000 L 152.000 48.000 C 156.418 48.000 160.000 51.582 160.000 56.000 L 160.000 208.000 ZM 144.000 112.000 C 144.000 116.418 140.418 120.000 136.000 120.000 L 88.000 120.000 C 83.582 120.000 80.000 116.418 80.000 112.000 C 80.000 107.582 83.582 104.000 88.000 104.000 L 136.000 104.000 C 140.418 104.000 144.000 107.582 144.000 112.000 Z"),
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
        return _gasPump!!
    }

private var _gasPump: ImageVector? = null
