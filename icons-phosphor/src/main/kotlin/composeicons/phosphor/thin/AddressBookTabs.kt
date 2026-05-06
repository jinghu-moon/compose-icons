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
                pathData = parseSvgPathData("M208 36h-160C41.373 36 36 41.373 36 48v160c0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12v-160c0-6.627-5.373-12-12-12ZM188 100h24v56h-24ZM212 48v44h-24v-48h20c2.209 0 4 1.791 4 4ZM44 208v-160c0-2.209 1.791-4 4-4h132v168h-132c-2.209 0-4-1.791-4-4ZM208 212h-20v-48h24v44c0 2.209-1.791 4-4 4ZM147.88 167c-2.883-10.575-10.398-19.277-20.44-23.67 10.31-6.815 14.933-19.584 11.374-31.42C135.256 100.075 124.359 91.972 112 91.972c-12.359 0-23.256 8.103-26.814 19.939-3.558 11.836 1.064 24.604 11.374 31.42C86.525 147.73 79.016 156.43 76.13 167c-.551 2.137 .734 4.316 2.87 4.87 .326 .087 .662 .13 1 .13 1.823-.001 3.414-1.235 3.87-3C87 157 99.05 148 112 148c12.95 0 25.05 9 28.12 21 .552 2.143 2.737 3.432 4.88 2.88 2.143-.552 3.432-2.737 2.88-4.88ZM92 120c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20Z"),
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
