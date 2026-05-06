package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PrismLight: ImageVector
    get() {
        if (_prismLight != null) return _prismLight!!
        _prismLight = tablerOutlineIcon(
            name = "PrismLight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.731 19h11.539c.357-0 .687-.191 .866-.5 .179-.309 .179-.691-0-1l-5.769-10c-.179-.309-.509-.5-.866-.5-.357 0-.687 .191-.866 .5l-5.769 10c-.179 .309-.179 .69-0 1 .178 .309 .508 .5 .865 .5")
            addPathData("M2 13h4.45")
            addPathData("M18 5l-4.5 6")
            addPathData("M22 9l-7.75 3.25")
            addPathData("M22 15 15 13.5")
        }
        return _prismLight!!
    }

private var _prismLight: ImageVector? = null
