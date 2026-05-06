package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Golf: ImageVector
    get() {
        if (_golf != null) return _golf!!
        _golf = tablerFilledIcon(
            name = "Golf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 3c0-.356 .19-.686 .498-.865 .308-.179 .688-.18 .998-.003l7 4c.311 .178 .503 .509 .503 .868 0 .359-.192 .69-.503 .868L13 11.58v6.42c-0 .507-.38 .934-.883 .993L12 19c-.552 0-1-.448-1-1Z")
            addPathData("M14.135 17.168c.133-.229 .352-.397 .608-.465 .256-.068 .529-.032 .759 .102C16.418 17.337 17 18.096 17 19c0 1.84-2.319 3-5 3C9.319 22 7 20.84 7 19c0-.911 .577-1.66 1.498-2.195 .478-.277 1.09-.115 1.367 .363 .277 .478 .115 1.09-.363 1.367C9.137 18.747 9 18.925 9 19c0 .086 .179 .296 .622 .518 .6 .3 1.456 .482 2.378 .482 .922 0 1.777-.182 2.378-.482C14.821 19.296 15 19.086 15 19c0-.07-.142-.256-.502-.465-.229-.133-.397-.352-.465-.608-.068-.256-.032-.529 .102-.759")
        }
        return _golf!!
    }

private var _golf: ImageVector? = null
