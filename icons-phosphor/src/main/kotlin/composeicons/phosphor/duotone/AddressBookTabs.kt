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
            addPath(
                pathData = parseSvgPathData("M48 40c-4.418 0-8 3.582-8 8v160c0 4.418 3.582 8 8 8h136v-176ZM112 144C98.745 144 88 133.255 88 120 88 106.745 98.745 96 112 96c13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM192 104h16v48h-16ZM208 88h-16v-40h16ZM48 48h128v160h-128ZM208 208h-16v-40h16v40ZM151.75 166c-2.589-9.666-8.727-18-17.19-23.34 9.191-9.137 11.964-22.916 7.022-34.897C136.641 95.783 124.96 87.965 112 87.965c-12.96 0-24.641 7.817-29.582 19.798-4.942 11.981-2.169 25.76 7.022 34.897C80.983 148.006 74.846 156.338 72.25 166c-1.105 4.28 1.47 8.645 5.75 9.75 4.28 1.105 8.645-1.47 9.75-5.75C90.39 159.75 100.81 152 112 152c11.19 0 21.62 7.73 24.25 18 1.105 4.28 5.47 6.855 9.75 5.75 4.28-1.105 6.855-5.47 5.75-9.75ZM96 120c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16Z"),
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
