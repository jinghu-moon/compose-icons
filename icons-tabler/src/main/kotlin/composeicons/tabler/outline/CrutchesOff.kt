package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CrutchesOff: ImageVector
    get() {
        if (_crutchesOff != null) return _crutchesOff!!
        _crutchesOff = tablerOutlineIcon(
            name = "CrutchesOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.178 4.174C8.502 3.459 9.215 3 10 3h4c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-3")
            addPathData("M11 21h2")
            addPathData("M12 21v-4.092c0-.592 .175-1.171 .504-1.664l.992-1.488c.034-.051 .066-.102 .097-.155M14 10v-3")
            addPathData("M12 21v-4.092c-0-.592-.175-1.171-.504-1.664l-.992-1.488c-.329-.493-.504-1.072-.504-1.664v-2.092")
            addPathData("M10 11h1")
            addPathData("M3 3 21 21")
        }
        return _crutchesOff!!
    }

private var _crutchesOff: ImageVector? = null
