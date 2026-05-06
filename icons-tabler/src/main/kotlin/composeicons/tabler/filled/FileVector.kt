package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileVector: ImageVector
    get() {
        if (_fileVector != null) return _fileVector!!
        _fileVector = tablerFilledIcon(
            name = "FileVector",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2l.117 .007c.459 .054 .822 .417 .876 .876L13 3v4l.005 .15c.074 .984 .854 1.767 1.838 1.844L15 9h4l.117 .007c.459 .054 .822 .417 .876 .876L20 10v9c0 1.589-1.238 2.902-2.824 2.995L17 22h-10C5.411 22 4.098 20.762 4.005 19.176L4 19v-14C4 3.411 5.238 2.098 6.824 2.005L7 2ZM14.5 11c-.994-0-1.894 .589-2.292 1.5h-.208c-1.612 0-3.015 1.101-3.399 2.666-.91 .35-1.532 1.197-1.596 2.17L7 17.5c-0 1.224 .886 2.268 2.094 2.467 1.208 .199 2.382-.506 2.774-1.665 .393-1.159-.112-2.432-1.192-3.008 .261-.489 .77-.794 1.324-.794h.208c.499 1.144 1.766 1.745 2.968 1.407 1.202-.338 1.97-1.511 1.8-2.748C16.805 11.922 15.749 11 14.5 11M9.5 17c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5C9.224 18 9 17.776 9 17.5 9 17.224 9.224 17 9.5 17M14.5 13c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5C14.224 14 14 13.776 14 13.5c0-.276 .224-.5 .5-.5")
            addPathData("M19 7h-4L14.999 2.999Z")
        }
        return _fileVector!!
    }

private var _fileVector: ImageVector? = null
