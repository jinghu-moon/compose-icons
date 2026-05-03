package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AddressBookTabs: ImageVector
    get() {
        if (_addressBookTabs != null) return _addressBookTabs!!
        _addressBookTabs = phosphorLightIcon(
            name = "AddressBookTabs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 34.000 L 48.000 34.000 C 40.268 34.000 34.000 40.268 34.000 48.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 48.000 C 222.000 40.268 215.732 34.000 208.000 34.000 ZM 190.000 102.000 L 210.000 102.000 L 210.000 154.000 L 190.000 154.000 ZM 210.000 48.000 L 210.000 90.000 L 190.000 90.000 L 190.000 46.000 L 208.000 46.000 C 209.105 46.000 210.000 46.895 210.000 48.000 ZM 46.000 208.000 L 46.000 48.000 C 46.000 46.895 46.895 46.000 48.000 46.000 L 178.000 46.000 L 178.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 ZM 208.000 210.000 L 190.000 210.000 L 190.000 166.000 L 210.000 166.000 L 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 ZM 149.810 166.510 C 147.098 156.459 140.382 147.961 131.230 143.000 C 140.923 134.909 144.512 121.615 140.209 109.745 C 135.906 97.875 124.631 89.970 112.005 89.970 C 99.379 89.970 88.104 97.875 83.801 109.745 C 79.498 121.615 83.087 134.909 92.780 143.000 C 83.626 147.956 76.906 156.451 74.190 166.500 C 73.362 169.709 75.291 172.982 78.500 173.810 C 81.709 174.638 84.982 172.709 85.810 169.500 C 88.670 158.380 99.930 150.000 112.000 150.000 C 124.070 150.000 135.340 158.380 138.190 169.490 C 139.018 172.699 142.291 174.628 145.500 173.800 C 148.709 172.972 150.638 169.699 149.810 166.490 ZM 94.000 120.000 C 94.000 110.059 102.059 102.000 112.000 102.000 C 121.941 102.000 130.000 110.059 130.000 120.000 C 130.000 129.941 121.941 138.000 112.000 138.000 C 102.059 138.000 94.000 129.941 94.000 120.000 Z"),
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
