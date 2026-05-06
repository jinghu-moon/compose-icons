package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.InputSpark: ImageVector
    get() {
        if (_inputSpark != null) return _inputSpark!!
        _inputSpark = tablerOutlineIcon(
            name = "InputSpark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 22.5c.419-1.73 1.77-3.081 3.5-3.5C20.77 18.581 19.419 17.23 19 15.5c-.419 1.73-1.77 3.081-3.5 3.5 1.73 .419 3.081 1.77 3.5 3.5")
            addPathData("M20 11.5v-2.5C20 7.895 19.105 7 18 7h-12C4.895 7 4 7.895 4 9v5c0 1.105 .895 2 2 2h7")
        }
        return _inputSpark!!
    }

private var _inputSpark: ImageVector? = null
