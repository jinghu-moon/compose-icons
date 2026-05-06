package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandLivewire: ImageVector
    get() {
        if (_brandLivewire != null) return _brandLivewire!!
        _brandLivewire = tablerOutlineIcon(
            name = "BrandLivewire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.982 18.777C20.61 19.325 20.33 20 19.576 20c-1.269 0-1.337-1.913-2.607-1.913C15.699 18.087 15.769 20 14.499 20c-1.268 0-1.337-1.913-2.607-1.913C10.623 18.087 10.692 20 9.422 20 8.154 20 8.085 18.087 6.815 18.087 5.545 18.087 5.615 20 4.345 20c-.398 0-.679-.189-.915-.448C2.49 17.948 1.996 16.121 2 14.262 2 8.593 6.477 4 12 4c5.524 0 10 4.594 10 10.261 0 1.62-.366 3.152-1.018 4.516")
            addPathData("M20.982 18.777C20.61 19.325 20.33 20 19.576 20c-1.269 0-1.337-1.913-2.607-1.913C15.699 18.087 15.769 20 14.499 20c-1.268 0-1.337-1.913-2.607-1.913C10.623 18.087 10.692 20 9.422 20 8.154 20 8.085 18.087 6.815 18.087 5.545 18.087 5.615 20 4.345 20c-.398 0-.679-.189-.915-.448C2.49 17.948 1.996 16.121 2 14.262 2 8.593 6.477 4 12 4c5.524 0 10 4.594 10 10.261 0 1.62-.366 3.152-1.018 4.516")
            addPathData("M11.5 16C14.667 16 16 14.252 16 11.769 16 9.285 13.986 7 11.5 7 9.015 7 7 9.286 7 11.769 7 14.252 8.333 16 11.5 16")
            addPathData("M10 11c.552 0 1-.448 1-1C11 9.448 10.552 9 10 9 9.448 9 9 9.448 9 10c0 .552 .448 1 1 1")
        }
        return _brandLivewire!!
    }

private var _brandLivewire: ImageVector? = null
