package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HomeHeart: ImageVector
    get() {
        if (_homeHeart != null) return _homeHeart!!
        _homeHeart = tablerOutlineIcon(
            name = "HomeHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 12 12 3 3 12h2v7c0 1.105 .895 2 2 2h6")
            addPathData("M9 21v-6c0-1.105 .895-2 2-2h2c.39 0 .754 .112 1.061 .304")
            addPathData("M19 21.5l2.518-2.58c.648-.674 .648-1.739 0-2.413-.307-.319-.73-.5-1.173-.5-.443 0-.866 .18-1.173 .5l-.168 .172-.168-.172c-.307-.319-.73-.5-1.173-.5-.443 0-.866 .18-1.173 .5-.648 .674-.648 1.738 0 2.412L19 21.509v-.009")
        }
        return _homeHeart!!
    }

private var _homeHeart: ImageVector? = null
