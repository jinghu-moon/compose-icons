package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Link: ImageVector
    get() {
        if (_link != null) return _link!!
        _link = tablerFilledIcon(
            name = "Link",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.707 8.293c.39 .391 .39 1.023 0 1.414l-6 6c-.251 .26-.623 .364-.973 .273-.35-.092-.623-.365-.714-.714-.092-.35 .013-.721 .273-.973l6-6c.391-.39 1.023-.39 1.414 0")
            addPathData("M19.242 4.757c2.343 2.344 2.342 6.143-.052 8.534l-.534 .464c-.417 .362-1.049 .318-1.411-.099-.362-.417-.318-1.049 .099-1.411l.483-.416c.75-.75 1.172-1.768 1.172-2.829 0-1.061-.421-2.078-1.172-2.828C16.265 4.609 13.732 4.609 12.22 6.118l-.463 .536c-.361 .418-.993 .464-1.411 .103C9.928 6.396 9.882 5.764 10.243 5.346l.513-.59C11.881 3.631 13.408 2.999 14.999 2.999c1.591 0 3.118 .633 4.243 1.758")
            addPathData("M6.75 10.338c.365 .414 .326 1.046-.088 1.411l-.483 .425c-.755 .746-1.18 1.763-1.18 2.825 0 1.061 .425 2.079 1.18 2.825 1.568 1.552 4.089 1.569 5.678 .038l.34-.458c.33-.443 .957-.536 1.4-.206 .443 .33 .536 .957 .206 1.4l-.397 .534-.1 .114c-2.364 2.337-6.169 2.337-8.533 0C3.638 18.123 3 16.594 3 14.998c0-1.595 .638-3.124 1.814-4.284l.524-.463c.414-.365 1.045-.326 1.411 .087")
        }
        return _link!!
    }

private var _link: ImageVector? = null
