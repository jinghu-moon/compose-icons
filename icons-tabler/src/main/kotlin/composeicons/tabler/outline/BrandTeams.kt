package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTeams: ImageVector
    get() {
        if (_brandTeams != null) return _brandTeams!!
        _brandTeams = tablerOutlineIcon(
            name = "BrandTeams",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7h10v10h-10v-10")
            addPathData("M6 10h4")
            addPathData("M8 10v4")
            addPathData("M8.104 17c.47 2.274 2.483 4 4.896 4 2.761 0 5-2.239 5-5v-7h-5")
            addPathData("M18 18c2.209 0 4-1.791 4-4v-5h-4")
            addPathData("M13.003 8.83c1.321 .465 2.789-.046 3.535-1.231 .746-1.185 .573-2.729-.417-3.72C15.13 2.889 13.586 2.715 12.401 3.462c-1.185 .746-1.696 2.214-1.231 3.535")
            addPathData("M15.83 8.36c.933 .838 2.343 .854 3.295 .039 .953-.815 1.154-2.21 .471-3.262C18.913 4.086 17.556 3.703 16.424 4.243")
        }
        return _brandTeams!!
    }

private var _brandTeams: ImageVector? = null
