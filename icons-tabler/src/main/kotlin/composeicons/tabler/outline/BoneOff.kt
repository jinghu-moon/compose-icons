package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BoneOff: ImageVector
    get() {
        if (_boneOff != null) return _boneOff!!
        _boneOff = tablerOutlineIcon(
            name = "BoneOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.5 8.502l.38-.38C11.919 7.162 11.723 5.677 12.401 4.5c.679-1.176 2.063-1.75 3.375-1.399C17.088 3.453 18 4.642 18 6c1.358-0 2.546 .911 2.898 2.223 .352 1.311-.221 2.696-1.397 3.375-1.176 .679-2.661 .484-3.621-.476l-.372 .372M13.5 13.502l-2.378 2.378c.944 .945 1.15 2.4 .504 3.57-.645 1.17-1.986 1.771-3.289 1.476C7.034 20.631 6.084 19.51 6.005 18.177v-.177h-.176C4.495 17.922 3.374 16.971 3.079 15.667c-.295-1.303 .308-2.645 1.478-3.29 1.17-.645 2.626-.438 3.571 .507l2.378-2.378")
            addPathData("M3 3 21 21")
        }
        return _boneOff!!
    }

private var _boneOff: ImageVector? = null
