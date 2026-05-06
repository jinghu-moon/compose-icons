package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HelpOff: ImageVector
    get() {
        if (_helpOff != null) return _helpOff!!
        _helpOff = tablerOutlineIcon(
            name = "HelpOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.641 5.631C2.123 9.143 2.119 14.842 5.631 18.36c3.512 3.517 9.211 3.522 12.729 .009M20.04 16.051C21.79 12.584 21.119 8.386 18.376 5.638 15.633 2.889 11.436 2.21 7.966 3.953")
            addPathData("M12 17v.01")
            addPathData("M12 13.5c-.023-.405 .119-.802 .394-1.1M14.5 10.5c.366-.956 .136-2.038-.586-2.763-.722-.725-1.803-.959-2.761-.598")
            addPathData("M3 3 21 21")
        }
        return _helpOff!!
    }

private var _helpOff: ImageVector? = null
