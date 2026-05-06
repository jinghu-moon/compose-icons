package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BuildingCog: ImageVector
    get() {
        if (_buildingCog != null) return _buildingCog!!
        _buildingCog = tablerOutlineIcon(
            name = "BuildingCog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 21h9")
            addPathData("M9 8h1")
            addPathData("M9 12h1")
            addPathData("M9 16h1")
            addPathData("M14 8h1")
            addPathData("M14 12h1")
            addPathData("M5 21v-16C5 4.47 5.211 3.961 5.586 3.586 5.961 3.211 6.47 3 7 3h10c.53 0 1.039 .211 1.414 .586C18.789 3.961 19 4.47 19 5v7")
            addPathData("M16 18c0 .53 .211 1.039 .586 1.414 .375 .375 .884 .586 1.414 .586 .53 0 1.039-.211 1.414-.586C19.789 19.039 20 18.53 20 18c0-.53-.211-1.039-.586-1.414C19.039 16.211 18.53 16 18 16c-.53 0-1.039 .211-1.414 .586C16.211 16.961 16 17.47 16 18")
            addPathData("M18 14.5v1.5")
            addPathData("M18 20v1.5")
            addPathData("M21.032 16.25 19.733 17")
            addPathData("M16.27 19l-1.3 .75")
            addPathData("M14.97 16.25 16.27 17")
            addPathData("M19.733 19l1.3 .75")
        }
        return _buildingCog!!
    }

private var _buildingCog: ImageVector? = null
