package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MeatOff: ImageVector
    get() {
        if (_meatOff != null) return _meatOff!!
        _meatOff = tablerOutlineIcon(
            name = "MeatOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.62 8.382 15.586 6.415c-.64-.64-.771-1.63-.318-2.414 .452-.784 1.375-1.166 2.249-.932C18.392 3.303 19 4.095 19 5c.905-.001 1.698 .607 1.933 1.482 .235 .874-.147 1.798-.931 2.25-.784 .453-1.775 .322-2.415-.318l-1.82 1.821")
            addPathData("M5.904 18.596c2.733 2.734 5.9 4 7.07 2.829 1.172-1.172-.094-4.338-2.828-7.071C7.413 11.62 4.246 10.354 3.076 11.525c-1.172 1.172 .094 4.338 2.828 7.071")
            addPathData("M7.5 16l1 1")
            addPathData("M12.975 21.425c1.582-1.582 2.679-3.407 3.242-5.2")
            addPathData("M16.6 12.6c-.16-1.238-.653-2.345-1.504-3.195C14.246 8.555 13.141 8.061 11.904 7.902")
            addPathData("M8.274 8.284C6.482 8.847 4.658 9.944 3.076 11.526")
            addPathData("M3 3 21 21")
        }
        return _meatOff!!
    }

private var _meatOff: ImageVector? = null
