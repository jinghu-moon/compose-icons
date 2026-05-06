package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileEuro: ImageVector
    get() {
        if (_fileEuro != null) return _fileEuro!!
        _fileEuro = tablerFilledIcon(
            name = "FileEuro",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2l.117 .007c.459 .054 .822 .417 .876 .876L13 3v4l.005 .15c.074 .984 .854 1.767 1.838 1.844L15 9h4l.117 .007c.459 .054 .822 .417 .876 .876L20 10v9c0 1.589-1.238 2.902-2.824 2.995L17 22h-10C5.411 22 4.098 20.762 4.005 19.176L4 19v-14C4 3.411 5.238 2.098 6.824 2.005L7 2ZM14.334 11.23c-1.057-.374-2.223-.288-3.214 .239C10.13 11.996 9.407 12.914 9.126 14h-.126c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h.126c.281 1.086 1.004 2.004 1.994 2.531 .99 .527 2.156 .613 3.214 .239 .514-.189 .78-.756 .598-1.273-.183-.516-.747-.789-1.266-.612l-.156 .049c-.873 .231-1.792-.152-2.243-.934h.733c.552 0 1-.448 1-1 0-.552-.448-1-1-1h-.733q.056-.097 .124-.19c.523-.706 1.446-.989 2.275-.695l.112 .032c.517 .119 1.038-.186 1.186-.696 .148-.51-.129-1.046-.63-1.222")
            addPathData("M19 7h-4L14.999 2.999Z")
        }
        return _fileEuro!!
    }

private var _fileEuro: ImageVector? = null
