package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCypress: ImageVector
    get() {
        if (_brandCypress != null) return _brandCypress!!
        _brandCypress = tablerOutlineIcon(
            name = "BrandCypress",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.48 17.007C21.777 13.576 21.445 9.022 18.674 5.961 15.904 2.899 11.405 2.116 7.763 4.06 4.121 6.005 2.268 10.178 3.27 14.184 4.272 18.189 7.871 20.999 12 21c.896 0 1.691-.573 1.974-1.423L17.5 9")
            addPathData("M13.5 9l2 6")
            addPathData("M10.764 9.411C9.507 8.674 7.901 8.948 6.959 10.059c-.942 1.112-.95 2.74-.017 3.86 .933 1.12 2.535 1.408 3.799 .682")
        }
        return _brandCypress!!
    }

private var _brandCypress: ImageVector? = null
