package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Crutches: ImageVector
    get() {
        if (_crutches != null) return _crutches!!
        _crutches = tablerOutlineIcon(
            name = "Crutches",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 5C8 3.895 8.895 3 10 3h4c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-4C8.895 7 8 6.105 8 5")
            addPathData("M11 21h2")
            addPathData("M12 21v-4.092c0-.592 .175-1.171 .504-1.664l.992-1.488c.329-.493 .504-1.072 .504-1.664v-5.092")
            addPathData("M12 21v-4.092c-0-.592-.175-1.171-.504-1.664l-.992-1.488c-.329-.493-.504-1.072-.504-1.664v-5.092")
            addPathData("M10 11h4")
        }
        return _crutches!!
    }

private var _crutches: ImageVector? = null
