package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AddressBook: ImageVector
    get() {
        if (_addressBook != null) return _addressBook!!
        _addressBook = phosphorBoldIcon(
            name = "AddressBook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 20h-144C52.954 20 44 28.954 44 40v20h-12C25.373 60 20 65.373 20 72c0 6.627 5.373 12 12 12h12v32h-12c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h12v32h-12c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h12v20c0 11.046 8.954 20 20 20h144c11.046 0 20-8.954 20-20v-176C228 28.954 219.046 20 208 20ZM204 212h-136v-168h136ZM100.8 171.37c9.083-9.798 21.839-15.366 35.2-15.366 13.361 0 26.117 5.569 35.2 15.366 4.507 4.86 12.1 5.147 16.96 .64 4.86-4.507 5.147-12.1 .64-16.96-5.53-5.941-12.025-10.904-19.21-14.68 15.08-17.829 13.605-44.333-3.359-60.379-16.964-16.047-43.509-16.047-60.473 0-16.964 16.047-18.438 42.55-3.359 60.379-7.18 3.778-13.671 8.741-19.2 14.68-4.507 4.86-4.22 12.453 .64 16.96 4.86 4.507 12.453 4.22 16.96-.64ZM116 112c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20Z"),
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
