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
                pathData = parseSvgPathData("M208 34h-160C40.268 34 34 40.268 34 48v160c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-160c0-7.732-6.268-14-14-14ZM190 102h20v52h-20ZM210 48v42h-20v-44h18c1.105 0 2 .895 2 2ZM46 208v-160c0-1.105 .895-2 2-2h130v164h-130c-1.105 0-2-.895-2-2ZM208 210h-18v-44h20v42c0 1.105-.895 2-2 2ZM149.81 166.51C147.098 156.459 140.382 147.961 131.23 143c9.693-8.091 13.282-21.385 8.979-33.255C135.906 97.875 124.631 89.97 112.005 89.97c-12.626 0-23.901 7.905-28.204 19.775-4.303 11.87-.714 25.164 8.979 33.255-9.154 4.956-15.874 13.451-18.59 23.5-.828 3.209 1.101 6.482 4.31 7.31 3.209 .828 6.482-1.101 7.31-4.31C88.67 158.38 99.93 150 112 150c12.07 0 23.34 8.38 26.19 19.49 .828 3.209 4.101 5.138 7.31 4.31 3.209-.828 5.138-4.101 4.31-7.31ZM94 120c0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18Z"),
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
