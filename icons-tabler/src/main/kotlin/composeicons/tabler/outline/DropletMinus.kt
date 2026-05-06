package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DropletMinus: ImageVector
    get() {
        if (_dropletMinus != null) return _dropletMinus!!
        _dropletMinus = tablerOutlineIcon(
            name = "DropletMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.946 15.083c.188-1.461-.122-2.943-.882-4.206L13.174 3.617c-.42-.625-1.287-.803-1.936-.397-.163 .102-.303 .237-.41 .397L5.935 10.877c-1.695 2.838-1.035 6.441 1.567 8.546 1.434 1.153 3.256 1.709 5.089 1.555")
            addPathData("M16 19h6")
        }
        return _dropletMinus!!
    }

private var _dropletMinus: ImageVector? = null
