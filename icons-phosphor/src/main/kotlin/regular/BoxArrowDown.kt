package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BoxArrowDown: ImageVector
    get() {
        if (_boxArrowDown != null) return _boxArrowDown!!
        _boxArrowDown = phosphorRegularIcon(
            name = "BoxArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 223.160 68.420 L 207.160 36.420 C 205.803 33.709 203.031 31.998 200.000 32.000 L 56.000 32.000 C 52.969 31.998 50.197 33.709 48.840 36.420 L 32.840 68.420 C 32.289 69.533 32.001 70.758 32.000 72.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 72.000 C 223.999 70.758 223.711 69.533 223.160 68.420 ZM 60.940 48.000 L 195.060 48.000 L 203.060 64.000 L 52.940 64.000 ZM 208.000 208.000 L 48.000 208.000 L 48.000 80.000 L 208.000 80.000 L 208.000 208.000 ZM 165.660 146.340 C 167.162 147.841 168.006 149.877 168.006 152.000 C 168.006 154.123 167.162 156.159 165.660 157.660 L 133.660 189.660 C 132.159 191.162 130.123 192.006 128.000 192.006 C 125.877 192.006 123.841 191.162 122.340 189.660 L 90.340 157.660 C 87.214 154.534 87.214 149.466 90.340 146.340 C 93.466 143.214 98.534 143.214 101.660 146.340 L 120.000 164.690 L 120.000 104.000 C 120.000 99.582 123.582 96.000 128.000 96.000 C 132.418 96.000 136.000 99.582 136.000 104.000 L 136.000 164.690 L 154.340 146.340 C 155.841 144.838 157.877 143.994 160.000 143.994 C 162.123 143.994 164.159 144.838 165.660 146.340 Z"),
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
        return _boxArrowDown!!
    }

private var _boxArrowDown: ImageVector? = null
