package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.AddressBookTabs: ImageVector
    get() {
        if (_addressBookTabs != null) return _addressBookTabs!!
        _addressBookTabs = phosphorDuotoneIcon(
            name = "AddressBookTabs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 48.000 40.000 C 43.582 40.000 40.000 43.582 40.000 48.000 L 40.000 208.000 C 40.000 212.418 43.582 216.000 48.000 216.000 L 184.000 216.000 L 184.000 40.000 ZM 112.000 144.000 C 98.745 144.000 88.000 133.255 88.000 120.000 C 88.000 106.745 98.745 96.000 112.000 96.000 C 125.255 96.000 136.000 106.745 136.000 120.000 C 136.000 133.255 125.255 144.000 112.000 144.000 Z"),
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
                pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 192.000 104.000 L 208.000 104.000 L 208.000 152.000 L 192.000 152.000 ZM 208.000 88.000 L 192.000 88.000 L 192.000 48.000 L 208.000 48.000 ZM 48.000 48.000 L 176.000 48.000 L 176.000 208.000 L 48.000 208.000 ZM 208.000 208.000 L 192.000 208.000 L 192.000 168.000 L 208.000 168.000 L 208.000 208.000 ZM 151.750 166.000 C 149.161 156.334 143.023 148.000 134.560 142.660 C 143.751 133.523 146.524 119.744 141.582 107.763 C 136.641 95.783 124.960 87.965 112.000 87.965 C 99.040 87.965 87.359 95.783 82.418 107.763 C 77.476 119.744 80.249 133.523 89.440 142.660 C 80.983 148.006 74.846 156.338 72.250 166.000 C 71.145 170.280 73.720 174.645 78.000 175.750 C 82.280 176.855 86.645 174.280 87.750 170.000 C 90.390 159.750 100.810 152.000 112.000 152.000 C 123.190 152.000 133.620 159.730 136.250 170.000 C 137.355 174.280 141.720 176.855 146.000 175.750 C 150.280 174.645 152.855 170.280 151.750 166.000 ZM 96.000 120.000 C 96.000 111.163 103.163 104.000 112.000 104.000 C 120.837 104.000 128.000 111.163 128.000 120.000 C 128.000 128.837 120.837 136.000 112.000 136.000 C 103.163 136.000 96.000 128.837 96.000 120.000 Z"),
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
        return _addressBookTabs!!
    }

private var _addressBookTabs: ImageVector? = null
