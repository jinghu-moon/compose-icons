package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.NoteOff: ImageVector
    get() {
        if (_noteOff != null) return _noteOff!!
        _noteOff = tablerOutlineIcon(
            name = "NoteOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 20l3.505-3.505M18.505 14.495l1.501-1.501")
            addPathData("M17 13h3v-7C20 4.895 19.105 4 18 4h-10M4.573 4.6C4.218 4.96 4 5.453 4 6v12c0 1.105 .895 2 2 2h7v-6c0-.272 .109-.519 .285-.699")
            addPathData("M3 3 21 21")
        }
        return _noteOff!!
    }

private var _noteOff: ImageVector? = null
