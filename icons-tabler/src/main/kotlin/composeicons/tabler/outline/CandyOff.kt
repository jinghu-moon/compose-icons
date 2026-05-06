package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CandyOff: ImageVector
    get() {
        if (_candyOff != null) return _candyOff!!
        _candyOff = tablerOutlineIcon(
            name = "CandyOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.174 7.17l.119-.12c.781-.781 2.047-.781 2.828 0l2.829 2.83c.781 .781 .781 2.047 0 2.828l-.124 .124M14.826 14.832l-2.123 2.123c-.781 .781-2.047 .781-2.828 0L7.046 14.124c-.781-.781-.781-2.047 0-2.828L9.159 9.184")
            addPathData("M16.243 9.172l3.086-.772c.524-.131 .938-.534 1.082-1.055 .144-.521-.003-1.079-.385-1.461L17.81 3.667c-.352-.352-.856-.507-1.345-.413-.489 .094-.899 .425-1.095 .883L14.122 7.05")
            addPathData("M9.172 16.243l-.772 3.086c-.131 .524-.534 .938-1.055 1.082-.521 .144-1.079-.003-1.461-.385L3.667 17.81c-.352-.352-.507-.856-.413-1.345 .094-.489 .425-.899 .883-1.095L7.05 14.122")
            addPathData("M3 3 21 21")
        }
        return _candyOff!!
    }

private var _candyOff: ImageVector? = null
