package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.KeyframeAlignHorizontal: ImageVector
    get() {
        if (_keyframeAlignHorizontal != null) return _keyframeAlignHorizontal!!
        _keyframeAlignHorizontal = tablerOutlineIcon(
            name = "KeyframeAlignHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.816 16.58C12.609 16.847 12.312 17 12 17c-.312 0-.61-.153-.816-.42L8.276 12.832c-.369-.493-.369-1.171 0-1.664L11.184 7.42C11.391 7.153 11.688 7 12 7c.312 0 .61 .153 .816 .42l2.908 3.748c.369 .493 .369 1.171 0 1.664l-2.908 3.748")
            addPathData("M3 12h2")
            addPathData("M19 12h2")
        }
        return _keyframeAlignHorizontal!!
    }

private var _keyframeAlignHorizontal: ImageVector? = null
