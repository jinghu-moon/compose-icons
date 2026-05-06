package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GitCherryPick: ImageVector
    get() {
        if (_gitCherryPick != null) return _gitCherryPick!!
        _gitCherryPick = tablerOutlineIcon(
            name = "GitCherryPick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C10 10.343 8.657 9 7 9 5.343 9 4 10.343 4 12")
            addPathData("M7 3v6")
            addPathData("M7 15v6")
            addPathData("M13 7h2.5L17 12l-1.5 5h-2.5")
            addPathData("M17 12h3")
        }
        return _gitCherryPick!!
    }

private var _gitCherryPick: ImageVector? = null
