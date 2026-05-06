package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BasketPin: ImageVector
    get() {
        if (_basketPin != null) return _basketPin!!
        _basketPin = tablerOutlineIcon(
            name = "BasketPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 10 15 4")
            addPathData("M7 10 9 4")
            addPathData("M12 20h-4.756C5.763 20 4.504 18.92 4.279 17.456L3.024 10.304C2.935 9.727 3.103 9.14 3.483 8.698 3.863 8.255 4.417 8 5.001 8h13.999c.584-0 1.138 .255 1.518 .698 .38 .443 .548 1.03 .459 1.606l-.161 .92")
            addPathData("M13.866 13.28c-.364-.942-1.372-1.465-2.352-1.22-.98 .245-1.623 1.183-1.499 2.185 .124 1.002 .975 1.755 1.985 1.755")
            addPathData("M21.121 20.121c.858-.858 1.115-2.148 .651-3.269C21.307 15.73 20.213 14.999 19 14.999c-1.213 0-2.307 .731-2.772 1.852-.464 1.121-.207 2.412 .651 3.269 .418 .419 1.125 1.045 2.121 1.879 1.051-.89 1.759-1.516 2.121-1.879")
            addPathData("M19 18v.01")
        }
        return _basketPin!!
    }

private var _basketPin: ImageVector? = null
