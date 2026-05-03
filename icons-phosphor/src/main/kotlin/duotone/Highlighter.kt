package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Highlighter: ImageVector
    get() {
        if (_highlighter != null) return _highlighter!!
        _highlighter = phosphorDuotoneIcon(
            name = "Highlighter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 136.000 176.000 L 96.000 216.000 L 24.000 192.000 L 88.000 128.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 253.660 106.340 C 252.159 104.838 250.123 103.994 248.000 103.994 C 245.877 103.994 243.841 104.838 242.340 106.340 L 192.000 156.690 L 109.660 74.340 L 109.660 74.340 L 107.310 72.000 L 157.660 21.660 C 160.786 18.534 160.786 13.466 157.660 10.340 C 154.534 7.214 149.466 7.214 146.340 10.340 L 96.000 60.690 C 91.031 65.660 89.887 73.291 93.180 79.500 L 72.000 100.690 C 65.757 106.938 65.757 117.062 72.000 123.310 L 76.690 128.000 L 18.340 186.340 C 16.378 188.301 15.571 191.138 16.209 193.838 C 16.847 196.538 18.838 198.714 21.470 199.590 L 93.470 223.590 C 94.285 223.864 95.140 224.002 96.000 224.000 C 98.122 224.002 100.158 223.160 101.660 221.660 L 136.000 187.310 L 140.690 192.000 C 146.938 198.243 157.062 198.243 163.310 192.000 L 184.490 170.820 C 190.701 174.118 198.338 172.974 203.310 168.000 L 253.660 117.660 C 255.162 116.159 256.006 114.123 256.006 112.000 C 256.006 109.877 255.162 107.841 253.660 106.340 ZM 93.840 206.850 L 38.840 188.500 L 88.000 139.310 L 124.690 176.000 ZM 152.000 180.690 L 141.660 170.340 L 141.660 170.340 L 93.660 122.340 L 93.660 122.340 L 83.310 112.000 L 104.000 91.310 L 172.690 160.000 Z"),
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
        return _highlighter!!
    }

private var _highlighter: ImageVector? = null
