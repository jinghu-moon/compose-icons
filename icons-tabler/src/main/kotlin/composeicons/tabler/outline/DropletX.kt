package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DropletX: ImageVector
    get() {
        if (_dropletX != null) return _dropletX!!
        _dropletX = tablerOutlineIcon(
            name = "DropletX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.953 13.467c-.111-.916-.414-1.799-.889-2.59L13.174 3.617c-.42-.625-1.287-.803-1.936-.397-.163 .102-.303 .237-.41 .397L5.935 10.877c-1.695 2.838-1.035 6.441 1.567 8.546 1.583 1.271 3.629 1.812 5.633 1.49")
            addPathData("M22 22 17 17")
            addPathData("M17 22l5-5")
        }
        return _dropletX!!
    }

private var _dropletX: ImageVector? = null
