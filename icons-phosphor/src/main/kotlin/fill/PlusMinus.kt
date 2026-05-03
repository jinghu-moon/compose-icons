package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PlusMinus: ImageVector
    get() {
        if (_plusMinus != null) return _plusMinus!!
        _plusMinus = phosphorFillIcon(
            name = "PlusMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 56.000 96.000 C 56.000 91.582 59.582 88.000 64.000 88.000 L 80.000 88.000 L 80.000 72.000 C 80.000 67.582 83.582 64.000 88.000 64.000 C 92.418 64.000 96.000 67.582 96.000 72.000 L 96.000 88.000 L 112.000 88.000 C 116.418 88.000 120.000 91.582 120.000 96.000 C 120.000 100.418 116.418 104.000 112.000 104.000 L 96.000 104.000 L 96.000 120.000 C 96.000 124.418 92.418 128.000 88.000 128.000 C 83.582 128.000 80.000 124.418 80.000 120.000 L 80.000 104.000 L 64.000 104.000 C 59.582 104.000 56.000 100.418 56.000 96.000 ZM 80.000 192.000 C 76.762 192.003 73.842 190.053 72.603 187.062 C 71.364 184.071 72.049 180.628 74.340 178.340 L 170.340 82.340 C 173.466 79.214 178.534 79.214 181.660 82.340 C 184.786 85.466 184.786 90.534 181.660 93.660 L 85.660 189.660 C 84.158 191.160 82.122 192.002 80.000 192.000 ZM 192.000 184.000 L 144.000 184.000 C 139.582 184.000 136.000 180.418 136.000 176.000 C 136.000 171.582 139.582 168.000 144.000 168.000 L 192.000 168.000 C 196.418 168.000 200.000 171.582 200.000 176.000 C 200.000 180.418 196.418 184.000 192.000 184.000 Z"),
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
        return _plusMinus!!
    }

private var _plusMinus: ImageVector? = null
