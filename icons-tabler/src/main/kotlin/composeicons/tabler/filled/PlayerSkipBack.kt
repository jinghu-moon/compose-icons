package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayerSkipBack: ImageVector
    get() {
        if (_playerSkipBack != null) return _playerSkipBack!!
        _playerSkipBack = tablerFilledIcon(
            name = "PlayerSkipBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.496 4.136 7.496 11.136c-.307 .179-.497 .508-.497 .864 0 .356 .189 .685 .497 .864l12 7c.309 .181 .692 .182 1.002 .003 .311-.178 .502-.509 .502-.867v-14c0-.358-.191-.689-.502-.867-.311-.178-.693-.177-1.002 .003Z")
            addPathData("M4 4c.507 0 .934 .38 .993 .883L5 5v14c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L3 19v-14C3 4.448 3.448 4 4 4Z")
        }
        return _playerSkipBack!!
    }

private var _playerSkipBack: ImageVector? = null
