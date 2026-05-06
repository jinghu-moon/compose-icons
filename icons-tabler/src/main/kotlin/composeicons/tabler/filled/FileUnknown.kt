package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileUnknown: ImageVector
    get() {
        if (_fileUnknown != null) return _fileUnknown!!
        _fileUnknown = tablerFilledIcon(
            name = "FileUnknown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2l.117 .007c.459 .054 .822 .417 .876 .876L13 3v4l.005 .15c.074 .984 .854 1.767 1.838 1.844L15 9h4l.117 .007c.459 .054 .822 .417 .876 .876L20 10v9c0 1.589-1.238 2.902-2.824 2.995L17 22h-10C5.411 22 4.098 20.762 4.005 19.176L4 19v-14C4 3.411 5.238 2.098 6.824 2.005L7 2ZM12 17c-.507 0-.934 .38-.993 .883L11 18.01c.001 .529 .413 .966 .941 .997 .528 .031 .989-.355 1.052-.88L13 18c0-.552-.448-1-1-1M13.136 11.273c-1.03-.525-2.286-.275-3.037 .604-.345 .401-.317 1.002 .063 1.37 .38 .368 .981 .376 1.371 .019l.088-.09c.15-.176 .401-.227 .608-.122 .206 .105 .313 .338 .259 .563-.054 .225-.256 .383-.488 .382-.552-.001-1 .447-1.001 .999-.001 .552 .447 1 .999 1.001 1.156 0 2.161-.792 2.432-1.915 .27-1.124-.265-2.286-1.295-2.812")
            addPathData("M19 7h-4L14.999 2.999Z")
        }
        return _fileUnknown!!
    }

private var _fileUnknown: ImageVector? = null
