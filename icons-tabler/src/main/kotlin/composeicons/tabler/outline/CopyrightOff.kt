package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CopyrightOff: ImageVector
    get() {
        if (_copyrightOff != null) return _copyrightOff!!
        _copyrightOff = tablerOutlineIcon(
            name = "CopyrightOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 9.75c-.214-.188-.453-.345-.711-.466M9.879 9.88c-1.157 1.153-1.176 3.021-.042 4.197 1.118 1.161 2.952 1.237 4.163 .173")
            addPathData("M20.042 16.045C21.79 12.576 21.115 8.378 18.368 5.632 15.622 2.885 11.424 2.21 7.955 3.958M5.637 5.635C3.332 7.902 2.42 11.231 3.248 14.356c.828 3.125 3.268 5.566 6.393 6.395 3.125 .829 6.454-.082 8.722-2.386")
            addPathData("M3 3 21 21")
        }
        return _copyrightOff!!
    }

private var _copyrightOff: ImageVector? = null
