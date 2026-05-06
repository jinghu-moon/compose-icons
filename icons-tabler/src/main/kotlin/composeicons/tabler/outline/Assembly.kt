package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Assembly: ImageVector
    get() {
        if (_assembly != null) return _assembly!!
        _assembly = tablerOutlineIcon(
            name = "Assembly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.875 6.27c.7 .398 1.13 1.143 1.125 1.948v7.284c0 .809-.443 1.555-1.158 1.948l-6.75 4.27c-.68 .373-1.504 .373-2.184 0L4.158 17.45C3.446 17.06 3.003 16.314 3 15.502v-7.285C3 7.408 3.443 6.663 4.158 6.27L10.908 2.29c.7-.386 1.55-.386 2.25 0l6.75 3.98h-.033")
            addPathData("M15.5 9.422c.312 .18 .503 .515 .5 .876v3.277c0 .364-.197 .7-.515 .877l-3 1.922c-.302 .167-.668 .167-.97 0l-3-1.922C8.197 14.275 7.999 13.94 8 13.576v-3.278c0-.364 .197-.7 .514-.877l3-1.79c.311-.174 .69-.174 1 0l3 1.79h-.014v.001")
        }
        return _assembly!!
    }

private var _assembly: ImageVector? = null
