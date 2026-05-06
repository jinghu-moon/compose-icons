package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Analyze: ImageVector
    get() {
        if (_analyze != null) return _analyze!!
        _analyze = tablerFilledIcon(
            name = "Analyze",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.99 12.862c.374 2.699 2.261 4.946 4.854 5.782 2.593 .836 5.437 .114 7.317-1.858-.087-.202-.14-.417-.156-.637L17 16l.005-.15c.061-.814 .61-1.508 1.388-1.756 .777-.248 1.627 .002 2.147 .63 .52 .628 .607 1.51 .218 2.227-.388 .717-1.174 1.127-1.984 1.035-2.371 2.624-6.047 3.636-9.427 2.597C5.967 19.544 3.496 16.64 3.01 13.137c-.057-.537 .322-1.022 .857-1.097 .535-.074 1.032 .289 1.123 .822Z")
            addPathData("M12 8c2.183 0 3.963 1.75 3.999 3.933 .036 2.183-1.684 3.992-3.866 4.064C9.951 16.071 8.114 14.38 8.005 12.2L8 12l.005-.2C8.112 9.671 9.869 8 12 8Z")
            addPathData("M13.142 3.09c4.069 .525 7.283 3.708 7.848 7.772 .059 .538-.32 1.025-.856 1.099-.536 .075-1.034-.29-1.124-.823C18.569 7.967 16.06 5.483 12.885 5.074 10.644 4.782 8.398 5.576 6.837 7.21c.315 .73 .168 1.576-.375 2.157-.542 .581-1.377 .785-2.127 .521C3.586 9.624 3.064 8.942 3.006 8.149L3 8l.005-.15c.041-.541 .3-1.043 .718-1.39 .418-.347 .959-.508 1.498-.448C7.222 3.797 10.182 2.705 13.142 3.09Z")
        }
        return _analyze!!
    }

private var _analyze: ImageVector? = null
