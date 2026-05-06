package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MedicalCrossOff: ImageVector
    get() {
        if (_medicalCrossOff != null) return _medicalCrossOff!!
        _medicalCrossOff = tablerOutlineIcon(
            name = "MedicalCrossOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17.928 17.733l-.574-.331L14 15.464v4.536c0 .552-.448 1-1 1h-2c-.552 0-1-.448-1-1v-4.536L6.072 17.732c-.478 .276-1.09 .112-1.366-.366L3.706 15.634c-.276-.478-.112-1.09 .366-1.366L7.999 12 4.072 9.732C3.594 9.456 3.43 8.844 3.706 8.366L4.706 6.634c.276-.478 .888-.642 1.366-.366l.333 .192M10 6v-2c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v4.535L17.928 6.268c.478-.276 1.09-.112 1.366 .366l1 1.732c.276 .478 .112 1.09-.366 1.366L16.001 12l3.927 2.269c.478 .276 .642 .888 .366 1.366l-.24 .416")
            addPathData("M3 3 21 21")
        }
        return _medicalCrossOff!!
    }

private var _medicalCrossOff: ImageVector? = null
