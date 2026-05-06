package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Mickey: ImageVector
    get() {
        if (_mickey != null) return _mickey!!
        _mickey = tablerOutlineIcon(
            name = "Mickey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.5 3c1.161-0 2.247 .576 2.899 1.538 .651 .962 .783 2.184 .351 3.262C7.791 8.303 6.961 9.022 6.326 9.9 5.013 10.221 3.633 9.757 2.78 8.709 1.927 7.66 1.754 6.215 2.336 4.995 2.917 3.775 4.149 2.998 5.5 3")
            addPathData("M18.5 3c1.349 .001 2.578 .778 3.157 1.997 .579 1.219 .407 2.662-.444 3.709-.851 1.048-2.228 1.513-3.539 1.196C17.039 9.023 16.21 8.303 15.25 7.799c-.431-1.078-.299-2.3 .352-3.262C16.253 3.576 17.339 3 18.5 3")
            addPathData("M5 14c0 3.866 3.134 7 7 7 3.866 0 7-3.134 7-7C19 10.134 15.866 7 12 7 8.134 7 5 10.134 5 14")
        }
        return _mickey!!
    }

private var _mickey: ImageVector? = null
