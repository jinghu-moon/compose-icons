package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileSignal: ImageVector
    get() {
        if (_fileSignal != null) return _fileSignal!!
        _fileSignal = tablerFilledIcon(
            name = "FileSignal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2l.117 .007c.459 .054 .822 .417 .876 .876L13 3v4l.005 .15c.074 .984 .854 1.767 1.838 1.844L15 9h4l.117 .007c.459 .054 .822 .417 .876 .876L20 10v9c0 1.589-1.238 2.902-2.824 2.995L17 22h-10C5.411 22 4.098 20.762 4.005 19.176L4 19v-14C4 3.411 5.238 2.098 6.824 2.005L7 2ZM10.232 11.818c-.391-.39-1.024-.39-1.414 0C7.974 12.662 7.5 13.807 7.5 15c0 1.193 .474 2.338 1.318 3.182 .392 .379 1.016 .374 1.402-.012 .386-.386 .391-1.009 .012-1.402C9.763 16.299 9.5 15.663 9.5 15c0-.663 .263-1.299 .732-1.768 .39-.391 .39-1.024 0-1.414M15.182 11.818c-.392-.379-1.016-.374-1.402 .012-.386 .386-.391 1.009-.012 1.402 .469 .469 .732 1.105 .732 1.768 0 .663-.263 1.299-.732 1.768-.379 .392-.374 1.016 .012 1.402 .386 .386 1.009 .391 1.402 .012 .844-.844 1.318-1.989 1.318-3.182 0-1.193-.474-2.338-1.318-3.182M12 14c-.552 0-1 .448-1 1l.007 .127c.062 .525 .523 .911 1.052 .88 .528-.031 .941-.468 .941-.997l-.007-.127C12.934 14.38 12.507 14 12 14")
            addPathData("M19 7h-4L14.999 2.999Z")
        }
        return _fileSignal!!
    }

private var _fileSignal: ImageVector? = null
