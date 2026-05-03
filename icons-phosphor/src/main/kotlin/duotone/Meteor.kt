package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Meteor: ImageVector
    get() {
        if (_meteor != null) return _meteor!!
        _meteor = phosphorDuotoneIcon(
            name = "Meteor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 128.000 160.000 C 128.000 177.673 113.673 192.000 96.000 192.000 C 78.327 192.000 64.000 177.673 64.000 160.000 C 64.000 142.327 78.327 128.000 96.000 128.000 C 113.673 128.000 128.000 142.327 128.000 160.000 Z"),
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
                pathData = parseSvgPathData("M 96.000 120.000 C 73.909 120.000 56.000 137.909 56.000 160.000 C 56.000 182.091 73.909 200.000 96.000 200.000 C 118.091 200.000 136.000 182.091 136.000 160.000 C 136.000 137.909 118.091 120.000 96.000 120.000 ZM 96.000 184.000 C 82.745 184.000 72.000 173.255 72.000 160.000 C 72.000 146.745 82.745 136.000 96.000 136.000 C 109.255 136.000 120.000 146.745 120.000 160.000 C 120.000 173.255 109.255 184.000 96.000 184.000 ZM 221.660 122.340 C 223.162 123.841 224.006 125.877 224.006 128.000 C 224.006 130.123 223.162 132.159 221.660 133.660 L 173.660 181.660 C 170.534 184.786 165.466 184.786 162.340 181.660 C 159.214 178.534 159.214 173.466 162.340 170.340 L 210.340 122.340 C 211.841 120.838 213.877 119.994 216.000 119.994 C 218.123 119.994 220.159 120.838 221.660 122.340 ZM 165.660 133.660 C 162.534 136.786 157.466 136.786 154.340 133.660 C 151.214 130.534 151.214 125.466 154.340 122.340 L 178.340 98.340 C 181.466 95.214 186.534 95.214 189.660 98.340 C 192.786 101.466 192.786 106.534 189.660 109.660 ZM 229.660 69.660 L 213.660 85.660 C 210.534 88.786 205.466 88.786 202.340 85.660 C 199.214 82.534 199.214 77.466 202.340 74.340 L 218.340 58.340 C 221.466 55.214 226.534 55.214 229.660 58.340 C 232.786 61.466 232.786 66.534 229.660 69.660 ZM 122.340 90.340 L 194.340 18.340 C 197.466 15.214 202.534 15.214 205.660 18.340 C 208.786 21.466 208.786 26.534 205.660 29.660 L 133.660 101.660 C 130.534 104.786 125.466 104.786 122.340 101.660 C 119.214 98.534 119.214 93.466 122.340 90.340 ZM 146.910 199.600 C 150.032 202.724 150.032 207.786 146.910 210.910 C 128.772 229.346 102.139 236.638 77.139 230.012 C 52.140 223.386 32.614 203.860 25.988 178.861 C 19.362 153.861 26.654 127.228 45.090 109.090 L 127.830 26.340 C 130.956 23.214 136.024 23.214 139.150 26.340 C 142.276 29.466 142.276 34.534 139.150 37.660 L 56.400 120.400 C 34.530 142.270 34.530 177.730 56.400 199.600 C 78.270 221.470 113.730 221.470 135.600 199.600 C 138.724 196.478 143.786 196.478 146.910 199.600 Z"),
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
