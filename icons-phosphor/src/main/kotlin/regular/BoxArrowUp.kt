package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BoxArrowUp: ImageVector
    get() {
        if (_boxArrowUp != null) return _boxArrowUp!!
        _boxArrowUp = phosphorRegularIcon(
            name = "BoxArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 223.160 68.420 L 207.160 36.420 C 205.803 33.709 203.031 31.998 200.000 32.000 L 56.000 32.000 C 52.969 31.998 50.197 33.709 48.840 36.420 L 32.840 68.420 C 32.289 69.533 32.001 70.758 32.000 72.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 72.000 C 223.999 70.758 223.711 69.533 223.160 68.420 ZM 60.940 48.000 L 195.060 48.000 L 203.060 64.000 L 52.940 64.000 ZM 208.000 208.000 L 48.000 208.000 L 48.000 80.000 L 208.000 80.000 L 208.000 208.000 ZM 165.660 130.340 C 168.786 133.466 168.786 138.534 165.660 141.660 C 162.534 144.786 157.466 144.786 154.340 141.660 L 136.000 123.310 L 136.000 184.000 C 136.000 188.418 132.418 192.000 128.000 192.000 C 123.582 192.000 120.000 188.418 120.000 184.000 L 120.000 123.310 L 101.660 141.660 C 98.534 144.786 93.466 144.786 90.340 141.660 C 87.214 138.534 87.214 133.466 90.340 130.340 L 122.340 98.340 C 123.841 96.838 125.877 95.994 128.000 95.994 C 130.123 95.994 132.159 96.838 133.660 98.340 Z"),
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
        return _boxArrowUp!!
    }

private var _boxArrowUp: ImageVector? = null
