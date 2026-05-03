package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AddressBookTabs: ImageVector
    get() {
        if (_addressBookTabs != null) return _addressBookTabs!!
        _addressBookTabs = phosphorThinIcon(
            name = "AddressBookTabs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 36.000 L 48.000 36.000 C 41.373 36.000 36.000 41.373 36.000 48.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 48.000 C 220.000 41.373 214.627 36.000 208.000 36.000 ZM 188.000 100.000 L 212.000 100.000 L 212.000 156.000 L 188.000 156.000 ZM 212.000 48.000 L 212.000 92.000 L 188.000 92.000 L 188.000 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 ZM 44.000 208.000 L 44.000 48.000 C 44.000 45.791 45.791 44.000 48.000 44.000 L 180.000 44.000 L 180.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 ZM 208.000 212.000 L 188.000 212.000 L 188.000 164.000 L 212.000 164.000 L 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 ZM 147.880 167.000 C 144.997 156.425 137.482 147.723 127.440 143.330 C 137.750 136.515 142.373 123.746 138.814 111.910 C 135.256 100.075 124.359 91.972 112.000 91.972 C 99.641 91.972 88.744 100.075 85.186 111.910 C 81.627 123.746 86.250 136.515 96.560 143.330 C 86.525 147.730 79.016 156.430 76.130 167.000 C 75.579 169.137 76.864 171.316 79.000 171.870 C 79.326 171.957 79.662 172.000 80.000 172.000 C 81.823 171.999 83.414 170.765 83.870 169.000 C 87.000 157.000 99.050 148.000 112.000 148.000 C 124.950 148.000 137.050 157.000 140.120 169.000 C 140.672 171.143 142.857 172.432 145.000 171.880 C 147.143 171.328 148.432 169.143 147.880 167.000 ZM 92.000 120.000 C 92.000 108.954 100.954 100.000 112.000 100.000 C 123.046 100.000 132.000 108.954 132.000 120.000 C 132.000 131.046 123.046 140.000 112.000 140.000 C 100.954 140.000 92.000 131.046 92.000 120.000 Z"),
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
