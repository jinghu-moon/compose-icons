package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileScissors: ImageVector
    get() {
        if (_fileScissors != null) return _fileScissors!!
        _fileScissors = tablerFilledIcon(
            name = "FileScissors",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2l.117 .007c.459 .054 .822 .417 .876 .876L13 3v4l.005 .15c.074 .984 .854 1.767 1.838 1.844L15 9h4l.117 .007c.459 .054 .822 .417 .876 .876L20 10v9c0 1.589-1.238 2.902-2.824 2.995L17 22h-10C5.411 22 4.098 20.762 4.005 19.176L4 19v-14C4 3.411 5.238 2.098 6.824 2.005L7 2ZM9.707 11.293c-.251-.26-.623-.364-.973-.273-.35 .092-.623 .365-.714 .714-.092 .35 .013 .721 .273 .973L10.585 15 9.517 16.067c-.575-.153-1.189-.042-1.675 .303-.485 .345-.792 .888-.837 1.481L7 18c.001 .776 .451 1.482 1.155 1.81 .704 .328 1.534 .219 2.129-.279 .595-.498 .848-1.296 .649-2.047L12 16.415l1.067 1.068c-.032 .12-.053 .244-.062 .368L13 18c0 .857 .546 1.618 1.357 1.893 .811 .275 1.708 .003 2.229-.676 .522-.679 .553-1.616 .077-2.328-.476-.712-1.352-1.043-2.18-.822L13.415 15l2.292-2.293c.379-.392 .374-1.016-.012-1.402-.386-.386-1.009-.391-1.402-.012L12 13.585Z")
            addPathData("M19 7h-4L14.999 2.999Z")
        }
        return _fileScissors!!
    }

private var _fileScissors: ImageVector? = null
