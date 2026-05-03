package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowSquareOut: ImageVector
    get() {
        if (_arrowSquareOut != null) return _arrowSquareOut!!
        _arrowSquareOut = phosphorFillIcon(
            name = "ArrowSquareOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 192.000 136.000 L 192.000 208.000 C 192.000 216.837 184.837 224.000 176.000 224.000 L 48.000 224.000 C 39.163 224.000 32.000 216.837 32.000 208.000 L 32.000 80.000 C 32.000 71.163 39.163 64.000 48.000 64.000 L 120.000 64.000 C 124.418 64.000 128.000 67.582 128.000 72.000 C 128.000 76.418 124.418 80.000 120.000 80.000 L 48.000 80.000 L 48.000 208.000 L 176.000 208.000 L 176.000 136.000 C 176.000 131.582 179.582 128.000 184.000 128.000 C 188.418 128.000 192.000 131.582 192.000 136.000 ZM 224.000 40.000 C 224.000 35.582 220.418 32.000 216.000 32.000 L 152.000 32.000 C 148.762 31.997 145.842 33.947 144.603 36.938 C 143.364 39.929 144.049 43.372 146.340 45.660 L 172.690 72.000 L 130.340 114.340 C 127.214 117.466 127.214 122.534 130.340 125.660 C 133.466 128.786 138.534 128.786 141.660 125.660 L 184.000 83.310 L 210.340 109.660 C 212.628 111.951 216.071 112.636 219.062 111.397 C 222.053 110.158 224.003 107.238 224.000 104.000 Z"),
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
        return _arrowSquareOut!!
    }

private var _arrowSquareOut: ImageVector? = null
