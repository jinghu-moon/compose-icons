package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PlusMinus: ImageVector
    get() {
        if (_plusMinus != null) return _plusMinus!!
        _plusMinus = phosphorRegularIcon(
            name = "PlusMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 205.660 61.660 L 61.660 205.660 C 58.534 208.786 53.466 208.786 50.340 205.660 C 47.214 202.534 47.214 197.466 50.340 194.340 L 194.340 50.340 C 197.466 47.214 202.534 47.214 205.660 50.340 C 208.786 53.466 208.786 58.534 205.660 61.660 ZM 64.000 112.000 C 64.000 116.418 67.582 120.000 72.000 120.000 C 76.418 120.000 80.000 116.418 80.000 112.000 L 80.000 80.000 L 112.000 80.000 C 116.418 80.000 120.000 76.418 120.000 72.000 C 120.000 67.582 116.418 64.000 112.000 64.000 L 80.000 64.000 L 80.000 32.000 C 80.000 27.582 76.418 24.000 72.000 24.000 C 67.582 24.000 64.000 27.582 64.000 32.000 L 64.000 64.000 L 32.000 64.000 C 27.582 64.000 24.000 67.582 24.000 72.000 C 24.000 76.418 27.582 80.000 32.000 80.000 L 64.000 80.000 ZM 224.000 176.000 L 144.000 176.000 C 139.582 176.000 136.000 179.582 136.000 184.000 C 136.000 188.418 139.582 192.000 144.000 192.000 L 224.000 192.000 C 228.418 192.000 232.000 188.418 232.000 184.000 C 232.000 179.582 228.418 176.000 224.000 176.000 Z"),
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
