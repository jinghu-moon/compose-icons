package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Microphone2: ImageVector
    get() {
        if (_microphone2 != null) return _microphone2!!
        _microphone2 = tablerOutlineIcon(
            name = "Microphone2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 12.9c2.162 .44 4.358-.589 5.402-2.533 1.044-1.944 .691-4.343-.87-5.903C17.971 2.904 15.572 2.552 13.629 3.597 11.685 4.642 10.657 6.838 11.098 9")
            addPathData("M15 12.9 11.098 9.001 3.585 17.585c-.781 .781-.782 2.047-.002 2.829 .781 .781 2.047 .782 2.829 .002L15 12.9")
        }
        return _microphone2!!
    }

private var _microphone2: ImageVector? = null
