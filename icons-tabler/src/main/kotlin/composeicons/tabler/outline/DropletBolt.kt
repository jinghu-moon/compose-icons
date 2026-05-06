package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DropletBolt: ImageVector
    get() {
        if (_dropletBolt != null) return _dropletBolt!!
        _dropletBolt = tablerOutlineIcon(
            name = "DropletBolt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.628 12.076c-.148-.417-.337-.819-.564-1.199L13.174 3.617c-.42-.625-1.287-.803-1.936-.397-.163 .102-.303 .237-.41 .397L5.935 10.877c-1.695 2.838-1.035 6.441 1.567 8.546 1.7 1.375 3.906 1.852 5.958 1.431")
            addPathData("M19 16l-2 3h4l-2 3")
        }
        return _dropletBolt!!
    }

private var _dropletBolt: ImageVector? = null
