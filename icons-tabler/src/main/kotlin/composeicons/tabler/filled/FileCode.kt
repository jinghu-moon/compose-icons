package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileCode: ImageVector
    get() {
        if (_fileCode != null) return _fileCode!!
        _fileCode = tablerFilledIcon(
            name = "FileCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2l.117 .007c.459 .054 .822 .417 .876 .876L13 3v4l.005 .15c.074 .984 .854 1.767 1.838 1.844L15 9h4l.117 .007c.459 .054 .822 .417 .876 .876L20 10v9c0 1.589-1.238 2.902-2.824 2.995L17 22h-10C5.411 22 4.098 20.762 4.005 19.176L4 19v-14C4 3.411 5.238 2.098 6.824 2.005L7 2ZM10.447 13.106c-.494-.247-1.094-.047-1.341 .447l-1 2c-.141 .281-.141 .613 0 .894l1 2c.247 .494 .847 .694 1.341 .447l.102-.058c.424-.278 .572-.83 .345-1.283L10.118 16l.776-1.553c.247-.494 .047-1.094-.447-1.341M14.894 13.553c-.247-.494-.847-.694-1.341-.447l-.102 .058c-.424 .278-.572 .83-.345 1.283L13.88 16l-.775 1.553c-.227 .49-.023 1.072 .461 1.314 .483 .242 1.071 .056 1.327-.42l1-2c.141-.281 .141-.613 0-.894Z")
            addPathData("M19 7h-4L14.999 2.999Z")
        }
        return _fileCode!!
    }

private var _fileCode: ImageVector? = null
