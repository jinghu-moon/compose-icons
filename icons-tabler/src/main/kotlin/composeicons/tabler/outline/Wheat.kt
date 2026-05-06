package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Wheat: ImageVector
    get() {
        if (_wheat != null) return _wheat!!
        _wheat = tablerOutlineIcon(
            name = "Wheat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.014 21.514v-3.75")
            addPathData("M5.93 9.504l-.43 1.604c-.712 2.659 .866 5.391 3.524 6.105 .997 .268 1.993 .535 2.99 .801v-3.44C11.85 12.469 10.377 10.695 8.338 10.148L5.93 9.504")
            addPathData("M13.744 11.164c.454-.454 .815-.994 1.061-1.587 .246-.594 .372-1.23 .372-1.873 0-.643-.126-1.279-.372-1.872C14.559 5.238 14.199 4.699 13.744 4.244L12.014 2.514 10.284 4.244c-.454 .454-.815 .994-1.06 1.588-.246 .594-.372 1.23-.373 1.872 0 .643 .127 1.279 .373 1.873 .246 .594 .606 1.133 1.06 1.587")
            addPathData("M18.099 9.504l.43 1.604c.712 2.659-.866 5.391-3.525 6.105-.997 .268-1.994 .535-2.99 .801v-3.44c.164-2.105 1.637-3.879 3.677-4.426l2.408-.644")
        }
        return _wheat!!
    }

private var _wheat: ImageVector? = null
