package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AddressBook: ImageVector
    get() {
        if (_addressBook != null) return _addressBook!!
        _addressBook = phosphorFillIcon(
            name = "AddressBook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 112c0 13.255-10.745 24-24 24-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24ZM224 40v176c0 8.837-7.163 16-16 16h-144c-8.837 0-16-7.163-16-16v-24h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16v-40h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16v-40h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16v-24C48 31.163 55.163 24 64 24h144c8.837 0 16 7.163 16 16ZM190.4 163.2C183.316 153.703 173.87 146.225 163 141.51c12.193-11.132 16.293-28.611 10.323-44.004C167.354 82.113 152.54 71.97 136.03 71.97c-16.51 0-31.324 10.144-37.293 25.536-5.97 15.393-1.869 32.872 10.323 44.004-10.892 4.706-20.36 12.184-27.46 21.69-2.651 3.535-1.935 8.549 1.6 11.2 3.535 2.651 8.549 1.935 11.2-1.6C104.22 159.706 119.633 152 136 152c16.367 0 31.78 7.706 41.6 20.8 2.651 3.535 7.665 4.251 11.2 1.6 3.535-2.651 4.251-7.665 1.6-11.2Z"),
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
        return _addressBook!!
    }

private var _addressBook: ImageVector? = null
