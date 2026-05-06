package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.World: ImageVector
    get() {
        if (_world != null) return _world!!
        _world = tablerFilledIcon(
            name = "World",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21.165 16c-1.485 3.402-4.732 5.702-8.434 5.973 .256-.061 .478-.221 .617-.444 1.063-1.703 1.834-3.571 2.28-5.528Z")
            addPathData("M8.372 16c.446 1.958 1.217 3.827 2.28 5.53 .139 .223 .36 .382 .616 .443C7.566 21.701 4.32 19.402 2.835 16Z")
            addPathData("M13.57 16c-.351 1.358-.879 2.664-1.57 3.884C11.309 18.664 10.781 17.358 10.43 16")
            addPathData("M8.034 10c-.149 1.329-.149 2.671 0 4h-5.832C1.932 12.68 1.931 11.32 2.2 10Z")
            addPathData("M13.952 10c.167 1.328 .167 2.672 0 4h-3.904c-.167-1.328-.167-2.672 0-4Z")
            addPathData("M21.8 10c.267 1.32 .267 2.68-.002 4h-5.832c.149-1.329 .149-2.67 0-4Z")
            addPathData("M11.267 2.027c-.255 .061-.476 .221-.615 .444C9.589 4.174 8.818 6.043 8.372 8h-5.54C4.304 4.632 7.503 2.341 11.166 2.033Z")
            addPathData("M12 4.116c.691 1.221 1.219 2.527 1.57 3.885h-3.14c.34-1.317 .85-2.6 1.53-3.817Z")
            addPathData("M12.733 2.026c3.702 .273 6.948 2.573 8.435 5.974h-5.54C15.182 6.042 14.411 4.173 13.348 2.47c-.12-.193-.303-.339-.517-.414Z")
        }
        return _world!!
    }

private var _world: ImageVector? = null
