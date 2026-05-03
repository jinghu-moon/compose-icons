package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Meteor: ImageVector
    get() {
        if (_meteor != null) return _meteor!!
        _meteor = phosphorFillIcon(
            name = "Meteor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 136.000 160.000 C 136.000 182.091 118.091 200.000 96.000 200.000 C 73.909 200.000 56.000 182.091 56.000 160.000 C 56.000 137.909 73.909 120.000 96.000 120.000 C 118.091 120.000 136.000 137.909 136.000 160.000 ZM 210.340 122.340 L 162.340 170.340 C 159.214 173.466 159.214 178.534 162.340 181.660 C 165.466 184.786 170.534 184.786 173.660 181.660 L 221.660 133.660 C 224.786 130.534 224.786 125.466 221.660 122.340 C 218.534 119.214 213.466 119.214 210.340 122.340 ZM 189.660 109.660 C 192.786 106.534 192.786 101.466 189.660 98.340 C 186.534 95.214 181.466 95.214 178.340 98.340 L 154.340 122.340 C 151.214 125.466 151.214 130.534 154.340 133.660 C 157.466 136.786 162.534 136.786 165.660 133.660 ZM 229.660 58.340 C 228.159 56.838 226.123 55.994 224.000 55.994 C 221.877 55.994 219.841 56.838 218.340 58.340 L 202.340 74.340 C 199.214 77.466 199.214 82.534 202.340 85.660 C 205.466 88.786 210.534 88.786 213.660 85.660 L 229.660 69.660 C 231.162 68.159 232.006 66.123 232.006 64.000 C 232.006 61.877 231.162 59.841 229.660 58.340 ZM 122.340 101.660 C 123.841 103.162 125.877 104.006 128.000 104.006 C 130.123 104.006 132.159 103.162 133.660 101.660 L 205.660 29.660 C 208.786 26.534 208.786 21.466 205.660 18.340 C 202.534 15.214 197.466 15.214 194.340 18.340 L 122.340 90.340 C 120.838 91.841 119.994 93.877 119.994 96.000 C 119.994 98.123 120.838 100.159 122.340 101.660 ZM 135.600 199.600 C 113.730 221.470 78.270 221.470 56.400 199.600 C 34.530 177.730 34.530 142.270 56.400 120.400 L 139.150 37.660 C 142.276 34.534 142.276 29.466 139.150 26.340 C 136.024 23.214 130.956 23.214 127.830 26.340 L 45.090 109.090 C 26.654 127.228 19.362 153.861 25.988 178.861 C 32.614 203.860 52.140 223.386 77.139 230.012 C 102.139 236.638 128.772 229.346 146.910 210.910 C 149.898 207.765 149.835 202.811 146.767 199.743 C 143.699 196.675 138.745 196.612 135.600 199.600 Z"),
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
        return _meteor!!
    }

private var _meteor: ImageVector? = null
