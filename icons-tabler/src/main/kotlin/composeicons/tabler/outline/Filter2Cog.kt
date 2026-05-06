package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Filter2Cog: ImageVector
    get() {
        if (_filter2Cog != null) return _filter2Cog!!
        _filter2Cog = tablerOutlineIcon(
            name = "Filter2Cog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6h16")
            addPathData("M6 12h12")
            addPathData("M9 18h3")
            addPathData("M19.001 21c-.53 0-1.039-.211-1.414-.586-.375-.375-.586-.884-.586-1.414 0-.53 .211-1.039 .586-1.414 .375-.375 .884-.586 1.414-.586M19.001 21c.53 0 1.039-.211 1.414-.586 .375-.375 .586-.884 .586-1.414 0-.53-.211-1.039-.586-1.414C20.04 17.211 19.531 17 19.001 17M19.001 21v1.5M19.001 17v-1.5M22.032 17.25 20.733 18 17.27 20l-1.3 .75M15.97 17.25 17.27 18 20.733 20l1.3 .75")
        }
        return _filter2Cog!!
    }

private var _filter2Cog: ImageVector? = null
