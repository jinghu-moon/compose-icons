package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Soup: ImageVector
    get() {
        if (_soup != null) return _soup!!
        _soup = tablerFilledIcon(
            name = "Soup",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 10c1.105 0 2 .895 2 2v.5c0 1.694-2.247 5.49-3.983 6.983L18 19.496v.504c0 1.047-.806 1.917-1.85 1.995L16 22h-8C6.895 22 6 21.105 6 20v-.496l-.065-.053C4.175 17.955 2.141 14.486 2.007 12.681L2 12.5v-.5c0-1.105 .895-2 2-2Z")
            addPathData("M11.417 3.188c.29-.22 .676-.266 1.009-.119 .333 .147 .56 .463 .593 .825 .033 .362-.134 .714-.435 .918-.375 .27-.593 .706-.583 1.209-.01 .461 .208 .898 .583 1.167 .301 .204 .468 .555 .435 .918-.033 .362-.26 .678-.593 .825-.333 .147-.719 .101-1.009-.119C10.516 8.17 9.987 7.127 10 6.021 9.977 4.901 10.507 3.841 11.417 3.188")
            addPathData("M15.417 3.188c.29-.22 .676-.266 1.009-.119 .333 .147 .56 .463 .593 .825 .033 .362-.134 .714-.435 .918-.375 .27-.593 .706-.583 1.209-.01 .461 .208 .898 .583 1.167 .301 .204 .468 .555 .435 .918-.033 .362-.26 .678-.593 .825-.333 .147-.719 .101-1.009-.119C14.516 8.17 13.987 7.127 14 6.021c-.023-1.12 .507-2.18 1.417-2.833")
            addPathData("M7.417 3.188c.29-.22 .676-.266 1.009-.119 .333 .147 .56 .463 .593 .825 .033 .362-.134 .714-.435 .918C8.208 5.082 7.99 5.518 8 6.021c-.01 .461 .208 .898 .583 1.167 .301 .204 .468 .555 .435 .918-.033 .362-.26 .678-.593 .825-.333 .147-.719 .101-1.009-.119C6.516 8.17 5.987 7.127 6 6.021 5.977 4.901 6.507 3.841 7.417 3.188")
        }
        return _soup!!
    }

private var _soup: ImageVector? = null
