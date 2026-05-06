package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HomeInfinity: ImageVector
    get() {
        if (_homeInfinity != null) return _homeInfinity!!
        _homeInfinity = tablerOutlineIcon(
            name = "HomeInfinity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 14v-2h2L12 3 3 12h2v7c0 1.105 .895 2 2 2h2.5")
            addPathData("M9 21v-6c0-1.105 .895-2 2-2h2c.728 0 1.398 .395 1.75 1.032")
            addPathData("M15.536 17.586c-.82-.781-2.109-.781-2.929 0-.387 .368-.607 .879-.607 1.414 0 .535 .219 1.046 .607 1.414 .809 .781 2.12 .781 2.929 0 .809-.781-.805 .778 0 0l1.46-1.41 1.46-1.419")
            addPathData("M15.54 17.582 17 19.002l1.46 1.41c.809 .78-.805-.779 0 0 .805 .779 2.12 .781 2.929 0 .387-.368 .607-.879 .607-1.414 0-.535-.219-1.046-.607-1.414-.82-.781-2.109-.781-2.929 0")
        }
        return _homeInfinity!!
    }

private var _homeInfinity: ImageVector? = null
