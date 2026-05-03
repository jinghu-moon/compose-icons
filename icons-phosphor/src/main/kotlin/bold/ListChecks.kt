package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ListChecks: ImageVector
    get() {
        if (_listChecks != null) return _listChecks!!
        _listChecks = phosphorBoldIcon(
            name = "ListChecks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 128.000 C 228.000 134.627 222.627 140.000 216.000 140.000 L 128.000 140.000 C 121.373 140.000 116.000 134.627 116.000 128.000 C 116.000 121.373 121.373 116.000 128.000 116.000 L 216.000 116.000 C 222.627 116.000 228.000 121.373 228.000 128.000 ZM 128.000 76.000 L 216.000 76.000 C 222.627 76.000 228.000 70.627 228.000 64.000 C 228.000 57.373 222.627 52.000 216.000 52.000 L 128.000 52.000 C 121.373 52.000 116.000 57.373 116.000 64.000 C 116.000 70.627 121.373 76.000 128.000 76.000 ZM 216.000 180.000 L 128.000 180.000 C 121.373 180.000 116.000 185.373 116.000 192.000 C 116.000 198.627 121.373 204.000 128.000 204.000 L 216.000 204.000 C 222.627 204.000 228.000 198.627 228.000 192.000 C 228.000 185.373 222.627 180.000 216.000 180.000 ZM 79.510 39.510 L 56.000 63.000 L 48.490 55.480 C 43.796 50.786 36.184 50.786 31.490 55.480 C 26.796 60.174 26.796 67.786 31.490 72.480 L 47.490 88.480 C 49.742 90.739 52.800 92.009 55.990 92.009 C 59.180 92.009 62.238 90.739 64.490 88.480 L 96.490 56.480 C 101.184 51.786 101.184 44.174 96.490 39.480 C 91.796 34.786 84.184 34.786 79.490 39.480 ZM 79.510 103.510 L 56.000 127.000 L 48.490 119.480 C 43.796 114.786 36.184 114.786 31.490 119.480 C 26.796 124.174 26.796 131.786 31.490 136.480 L 47.490 152.480 C 49.742 154.739 52.800 156.009 55.990 156.009 C 59.180 156.009 62.238 154.739 64.490 152.480 L 96.490 120.480 C 101.184 115.786 101.184 108.174 96.490 103.480 C 91.796 98.786 84.184 98.786 79.490 103.480 ZM 79.510 167.510 L 56.000 191.000 L 48.490 183.480 C 43.796 178.786 36.184 178.786 31.490 183.480 C 26.796 188.174 26.796 195.786 31.490 200.480 L 47.490 216.480 C 49.742 218.739 52.800 220.009 55.990 220.009 C 59.180 220.009 62.238 218.739 64.490 216.480 L 96.490 184.480 C 101.184 179.786 101.184 172.174 96.490 167.480 C 91.796 162.786 84.184 162.786 79.490 167.480 Z"),
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
        return _listChecks!!
    }

private var _listChecks: ImageVector? = null
