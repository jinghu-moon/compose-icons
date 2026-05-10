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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM184 48h24v40h-24ZM184 104h24v48h-24ZM146 175.75c-2.055 .528-4.237 .218-6.063-.862-1.827-1.08-3.149-2.842-3.677-4.898-2.63-10.26-13.06-18-24.25-18-11.19 0-21.61 7.74-24.25 18-1.105 4.28-5.47 6.855-9.75 5.75-4.28-1.105-6.855-5.47-5.75-9.75 2.596-9.662 8.733-17.994 17.19-23.34C80.259 133.513 77.486 119.734 82.428 107.753 87.369 95.773 99.05 87.955 112.01 87.955c12.96 0 24.641 7.817 29.582 19.798 4.942 11.981 2.169 25.76-7.022 34.897 8.461 5.344 14.596 13.682 17.18 23.35 .532 2.055 .224 4.238-.854 6.067-1.079 1.829-2.84 3.154-4.896 3.683ZM208 208h-24v-40h24v40ZM128 120c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16Z"),
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
