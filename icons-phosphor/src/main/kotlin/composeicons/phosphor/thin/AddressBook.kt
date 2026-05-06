package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AddressBook: ImageVector
    get() {
        if (_addressBook != null) return _addressBook!!
        _addressBook = phosphorThinIcon(
            name = "AddressBook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M154.7 142.75c13.794-8.385 20.32-24.928 15.966-40.472C166.312 86.734 152.143 75.988 136 75.988c-16.143 0-30.312 10.746-34.666 26.29-4.354 15.544 2.172 32.087 15.966 40.472-12.995 3.951-24.384 11.959-32.5 22.85-1.325 1.767-.967 4.275 .8 5.6 1.767 1.325 4.275 .967 5.6-.8C101.776 156.299 118.374 148 136 148c17.626 0 34.224 8.299 44.8 22.4 1.325 1.767 3.833 2.125 5.6 .8 1.767-1.325 2.125-3.833 .8-5.6-8.118-10.889-19.506-18.896-32.5-22.85ZM108 112c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28-15.464 0-28-12.536-28-28ZM208 28h-144C57.373 28 52 33.373 52 40v28h-20c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h20v48h-20c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h20v48h-20c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h20v28c0 6.627 5.373 12 12 12h144c6.627 0 12-5.373 12-12v-176c0-6.627-5.373-12-12-12ZM212 216c0 2.209-1.791 4-4 4h-144c-2.209 0-4-1.791-4-4v-176c0-2.209 1.791-4 4-4h144c2.209 0 4 1.791 4 4Z"),
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
