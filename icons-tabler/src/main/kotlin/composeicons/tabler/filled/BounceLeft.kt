package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BounceLeft: ImageVector
    get() {
        if (_bounceLeft != null) return _bounceLeft!!
        _bounceLeft = tablerFilledIcon(
            name = "BounceLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.486 11.143c.473-.283 1.087-.13 1.371 .343 1.045 1.74 1.83 3.443 2.392 5.237l.172 .581 .092-.13c2.093-2.921 4.48-3.653 7.565-2.7l.238 .077c.524 .175 .808 .741 .633 1.265-.175 .524-.741 .808-1.265 .633-2.932-.978-4.73-.122-6.79 3.998-.433 .866-1.721 .673-1.88-.283C10.554 17.404 9.645 15.019 8.143 12.514c-.283-.473-.13-1.087 .343-1.371Z")
            addPathData("M6 4C4.343 4 3 5.343 3 7c0 1.657 1.343 3 3 3C7.657 10 9 8.657 9 7 9 5.343 7.657 4 6 4")
        }
        return _bounceLeft!!
    }

private var _bounceLeft: ImageVector? = null
