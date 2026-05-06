package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TestPipeOff: ImageVector
    get() {
        if (_testPipeOff != null) return _testPipeOff!!
        _testPipeOff = tablerOutlineIcon(
            name = "TestPipeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 8.04C18.662 9.355 17.329 10.675 16 12M14 14c-1.085 1.085-3.125 3.14-6.122 6.164-1.116 1.116-2.925 1.116-4.04 0C2.722 19.049 2.721 17.24 3.837 16.124 6.855 13.124 8.91 11.087 10 10M12 8c.872-.872 2.191-2.205 3.959-4")
            addPathData("M7 13h6")
            addPathData("M19 15l1.5 1.6M19.76 19.773c-.746 .307-1.604 .136-2.175-.434-.571-.57-.743-1.427-.437-2.174")
            addPathData("M15 3l6 6")
            addPathData("M3 3 21 21")
        }
        return _testPipeOff!!
    }

private var _testPipeOff: ImageVector? = null
