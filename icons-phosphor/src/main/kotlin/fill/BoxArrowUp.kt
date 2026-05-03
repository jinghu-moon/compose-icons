package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BoxArrowUp: ImageVector
    get() {
        if (_boxArrowUp != null) return _boxArrowUp!!
        _boxArrowUp = phosphorFillIcon(
            name = "BoxArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 223.160 68.420 L 207.160 36.420 C 205.803 33.709 203.031 31.998 200.000 32.000 L 56.000 32.000 C 52.969 31.998 50.197 33.709 48.840 36.420 L 32.840 68.420 C 32.289 69.533 32.001 70.758 32.000 72.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 72.000 C 223.999 70.758 223.711 69.533 223.160 68.420 ZM 165.660 141.660 C 164.159 143.162 162.123 144.006 160.000 144.006 C 157.877 144.006 155.841 143.162 154.340 141.660 L 136.000 123.310 L 136.000 184.000 C 136.000 188.418 132.418 192.000 128.000 192.000 C 123.582 192.000 120.000 188.418 120.000 184.000 L 120.000 123.310 L 101.660 141.660 C 98.534 144.786 93.466 144.786 90.340 141.660 C 87.214 138.534 87.214 133.466 90.340 130.340 L 122.340 98.340 C 123.841 96.838 125.877 95.994 128.000 95.994 C 130.123 95.994 132.159 96.838 133.660 98.340 L 165.660 130.340 C 167.162 131.841 168.006 133.877 168.006 136.000 C 168.006 138.123 167.162 140.159 165.660 141.660 ZM 52.940 64.000 L 60.940 48.000 L 195.060 48.000 L 203.060 64.000 Z"),
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
        return _boxArrowUp!!
    }

private var _boxArrowUp: ImageVector? = null
