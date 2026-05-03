package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Swap: ImageVector
    get() {
        if (_swap != null) return _swap!!
        _swap = phosphorRegularIcon(
            name = "Swap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 48.000 L 224.000 152.000 C 224.000 160.837 216.837 168.000 208.000 168.000 L 99.310 168.000 L 109.660 178.340 C 112.786 181.466 112.786 186.534 109.660 189.660 C 106.534 192.786 101.466 192.786 98.340 189.660 L 74.340 165.660 C 72.838 164.159 71.994 162.123 71.994 160.000 C 71.994 157.877 72.838 155.841 74.340 154.340 L 98.340 130.340 C 101.466 127.214 106.534 127.214 109.660 130.340 C 112.786 133.466 112.786 138.534 109.660 141.660 L 99.310 152.000 L 208.000 152.000 L 208.000 48.000 L 96.000 48.000 L 96.000 56.000 C 96.000 60.418 92.418 64.000 88.000 64.000 C 83.582 64.000 80.000 60.418 80.000 56.000 L 80.000 48.000 C 80.000 39.163 87.163 32.000 96.000 32.000 L 208.000 32.000 C 216.837 32.000 224.000 39.163 224.000 48.000 ZM 168.000 192.000 C 163.582 192.000 160.000 195.582 160.000 200.000 L 160.000 208.000 L 48.000 208.000 L 48.000 104.000 L 156.690 104.000 L 146.340 114.340 C 143.214 117.466 143.214 122.534 146.340 125.660 C 149.466 128.786 154.534 128.786 157.660 125.660 L 181.660 101.660 C 183.162 100.159 184.006 98.123 184.006 96.000 C 184.006 93.877 183.162 91.841 181.660 90.340 L 157.660 66.340 C 154.534 63.214 149.466 63.214 146.340 66.340 C 143.214 69.466 143.214 74.534 146.340 77.660 L 156.690 88.000 L 48.000 88.000 C 39.163 88.000 32.000 95.163 32.000 104.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 160.000 224.000 C 168.837 224.000 176.000 216.837 176.000 208.000 L 176.000 200.000 C 176.000 195.582 172.418 192.000 168.000 192.000 Z"),
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
        return _swap!!
    }

private var _swap: ImageVector? = null
