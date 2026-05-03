package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AddressBookTabs: ImageVector
    get() {
        if (_addressBookTabs != null) return _addressBookTabs!!
        _addressBookTabs = phosphorFillIcon(
            name = "AddressBookTabs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 184.000 48.000 L 208.000 48.000 L 208.000 88.000 L 184.000 88.000 ZM 184.000 104.000 L 208.000 104.000 L 208.000 152.000 L 184.000 152.000 ZM 146.000 175.750 C 143.945 176.278 141.763 175.968 139.937 174.888 C 138.110 173.807 136.787 172.046 136.260 169.990 C 133.630 159.730 123.200 151.990 112.010 151.990 C 100.820 151.990 90.400 159.730 87.760 169.990 C 86.655 174.270 82.290 176.845 78.010 175.740 C 73.730 174.635 71.155 170.270 72.260 165.990 C 74.856 156.328 80.993 147.996 89.450 142.650 C 80.259 133.513 77.486 119.734 82.428 107.753 C 87.369 95.773 99.050 87.955 112.010 87.955 C 124.970 87.955 136.651 95.773 141.592 107.753 C 146.534 119.734 143.761 133.513 134.570 142.650 C 143.031 147.994 149.166 156.332 151.750 166.000 C 152.282 168.055 151.974 170.238 150.896 172.067 C 149.817 173.895 148.056 175.220 146.000 175.750 ZM 208.000 208.000 L 184.000 208.000 L 184.000 168.000 L 208.000 168.000 L 208.000 208.000 ZM 128.000 120.000 C 128.000 128.837 120.837 136.000 112.000 136.000 C 103.163 136.000 96.000 128.837 96.000 120.000 C 96.000 111.163 103.163 104.000 112.000 104.000 C 120.837 104.000 128.000 111.163 128.000 120.000 Z"),
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
        return _addressBookTabs!!
    }

private var _addressBookTabs: ImageVector? = null
