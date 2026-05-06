package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.AddressBook: ImageVector
    get() {
        if (_addressBook != null) return _addressBook!!
        _addressBook = phosphorDuotoneIcon(
            name = "AddressBook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-144c-4.418 0-8 3.582-8 8v176c0 4.418 3.582 8 8 8h144c4.418 0 8-3.582 8-8v-176c0-4.418-3.582-8-8-8ZM136 144c-17.673 0-32-14.327-32-32 0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32Z"),
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
                pathData = parseSvgPathData("M83.19 174.4c1.698 1.276 3.834 1.825 5.937 1.525 2.103-.3 4-1.424 5.273-3.125C104.22 159.706 119.633 152 136 152c16.367 0 31.78 7.706 41.6 20.8 2.651 3.535 7.665 4.251 11.2 1.6 3.535-2.651 4.251-7.665 1.6-11.2C183.316 153.703 173.87 146.225 163 141.51c12.193-11.132 16.293-28.611 10.323-44.004C167.354 82.113 152.54 71.97 136.03 71.97c-16.51 0-31.324 10.144-37.293 25.536-5.97 15.393-1.869 32.872 10.323 44.004-10.892 4.706-20.36 12.184-27.46 21.69-2.653 3.532-1.941 8.546 1.59 11.2ZM112 112c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24-13.255 0-24-10.745-24-24ZM208 24h-144C55.163 24 48 31.163 48 40v24h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v40h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v40h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v24c0 8.837 7.163 16 16 16h144c8.837 0 16-7.163 16-16v-176c0-8.837-7.163-16-16-16ZM208 216h-144v-176h144Z"),
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
