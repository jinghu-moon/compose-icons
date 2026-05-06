package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CameraBitcoin: ImageVector
    get() {
        if (_cameraBitcoin != null) return _cameraBitcoin!!
        _cameraBitcoin = tablerOutlineIcon(
            name = "CameraBitcoin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 20h-7C3.895 20 3 19.105 3 18v-9C3 7.895 3.895 7 5 7h1C7.105 7 8 6.105 8 5 8 4.448 8.448 4 9 4h6c.552 0 1 .448 1 1 0 1.105 .895 2 2 2h1c1.105 0 2 .895 2 2v1")
            addPathData("M14.477 11.307C13.672 10.129 12.148 9.681 10.833 10.236c-1.315 .555-2.056 1.96-1.773 3.359C9.343 14.994 10.573 16 12 16")
            addPathData("M17 21v-6")
            addPathData("M19 15v-1.5")
            addPathData("M19 22.5v-1.5")
            addPathData("M17 18h3")
            addPathData("M19 18h.5c.828 0 1.5 .672 1.5 1.5C21 20.328 20.328 21 19.5 21h-3.5")
            addPathData("M19 18h.5C20.328 18 21 17.328 21 16.5 21 15.672 20.328 15 19.5 15h-3.5")
        }
        return _cameraBitcoin!!
    }

private var _cameraBitcoin: ImageVector? = null
