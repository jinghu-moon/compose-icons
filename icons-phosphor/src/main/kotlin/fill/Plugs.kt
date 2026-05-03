package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Plugs: ImageVector
    get() {
        if (_plugs != null) return _plugs!!
        _plugs = phosphorFillIcon(
            name = "Plugs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 149.660 149.660 L 131.310 168.000 L 149.660 186.340 C 152.786 189.466 152.786 194.534 149.660 197.660 C 146.534 200.786 141.466 200.786 138.340 197.660 L 132.000 191.310 L 108.690 214.630 C 96.179 227.097 75.941 227.097 63.430 214.630 L 58.060 209.250 L 29.660 237.660 C 26.534 240.786 21.466 240.786 18.340 237.660 C 15.214 234.534 15.214 229.466 18.340 226.340 L 46.750 197.940 L 41.370 192.570 C 35.367 186.569 31.995 178.428 31.995 169.940 C 31.995 161.452 35.367 153.311 41.370 147.310 L 64.690 124.000 L 58.340 117.660 C 55.214 114.534 55.214 109.466 58.340 106.340 C 61.466 103.214 66.534 103.214 69.660 106.340 L 88.000 124.690 L 106.340 106.340 C 109.466 103.214 114.534 103.214 117.660 106.340 C 120.786 109.466 120.786 114.534 117.660 117.660 L 99.310 136.000 L 120.000 156.690 L 138.340 138.340 C 141.466 135.214 146.534 135.214 149.660 138.340 C 152.786 141.466 152.786 146.534 149.660 149.660 ZM 237.660 18.340 C 236.159 16.838 234.123 15.994 232.000 15.994 C 229.877 15.994 227.841 16.838 226.340 18.340 L 197.940 46.750 L 192.570 41.370 C 180.061 28.897 159.819 28.897 147.310 41.370 L 124.000 64.690 L 117.660 58.340 C 114.534 55.214 109.466 55.214 106.340 58.340 C 103.214 61.466 103.214 66.534 106.340 69.660 L 186.340 149.660 C 189.466 152.786 194.534 152.786 197.660 149.660 C 200.786 146.534 200.786 141.466 197.660 138.340 L 191.310 132.000 L 214.630 108.690 C 220.633 102.689 224.005 94.548 224.005 86.060 C 224.005 77.572 220.633 69.431 214.630 63.430 L 209.250 58.060 L 237.660 29.660 C 239.162 28.159 240.006 26.123 240.006 24.000 C 240.006 21.877 239.162 19.841 237.660 18.340 Z"),
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
        return _plugs!!
    }

private var _plugs: ImageVector? = null
