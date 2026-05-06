package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AssemblyOff: ImageVector
    get() {
        if (_assemblyOff != null) return _assemblyOff!!
        _assemblyOff = tablerOutlineIcon(
            name = "AssemblyOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.376 18.377l-5.284 3.343c-.68 .373-1.504 .373-2.184 0L4.158 17.45C3.446 17.06 3.003 16.314 3 15.502v-7.285C3 7.408 3.443 6.663 4.158 6.27L5.486 5.487M8 4 10.908 2.29c.7-.386 1.55-.386 2.25 0l6.75 3.98h-.033c.7 .398 1.13 1.143 1.125 1.948v7.284c0 .417-.118 .817-.33 1.16")
            addPathData("M14.855 14.855l-2.37 1.519c-.302 .167-.668 .167-.97 0l-3-1.922C8.197 14.275 7.999 13.94 8 13.576v-3.278c0-.364 .197-.7 .514-.877l.563-.336M11.514 7.631c.311-.173 .689-.173 1 0l3 1.79h-.014c.312 .181 .503 .516 .5 .877v1.702")
            addPathData("M3 3 21 21")
        }
        return _assemblyOff!!
    }

private var _assemblyOff: ImageVector? = null
