package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileHorizontal: ImageVector
    get() {
        if (_fileHorizontal != null) return _fileHorizontal!!
        _fileHorizontal = tablerFilledIcon(
            name = "FileHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12l-.007-.117c-.054-.459-.417-.822-.876-.876L21 11h-4l-.15-.005c-.984-.074-1.767-.854-1.844-1.838L15 9v-4l-.007-.117c-.054-.459-.417-.822-.876-.876L14 4h-9C3.411 4 2.098 5.238 2.005 6.824L2 7v10c-0 1.589 1.238 2.902 2.824 2.995L5 20h14c1.589 0 2.902-1.238 2.995-2.824L22 17Z")
            addPathData("M17 5v4l4.001 .001Z")
        }
        return _fileHorizontal!!
    }

private var _fileHorizontal: ImageVector? = null
