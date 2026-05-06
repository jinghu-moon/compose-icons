package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AddressBookTabs: ImageVector
    get() {
        if (_addressBookTabs != null) return _addressBookTabs!!
        _addressBookTabs = phosphorBoldIcon(
            name = "AddressBookTabs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 28h-160C36.954 28 28 36.954 28 48v160c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-160C228 36.954 219.046 28 208 28ZM188 108h16v40h-16ZM204 84h-16v-32h16ZM52 52h112v152h-112ZM188 204v-32h16v32ZM151.62 165c-2.409-9.115-7.733-17.192-15.16-23 11.457-14.79 9.676-35.891-4.098-48.551C118.588 80.789 97.412 80.789 83.638 93.449 69.864 106.109 68.083 127.21 79.54 142c-7.42 5.814-12.742 13.889-15.16 23-1.657 6.418 2.202 12.963 8.62 14.62 6.418 1.657 12.963-2.202 14.62-8.62 2.2-8.54 11-15 20.38-15 9.38 0 18.19 6.44 20.38 15 1.657 6.418 8.202 10.277 14.62 8.62 6.418-1.657 10.277-8.202 8.62-14.62ZM96 120c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12Z"),
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
