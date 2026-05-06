package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Drumstick: ImageVector
    get() {
        if (_drumstick != null) return _drumstick!!
        _drumstick = lucideOutlineIcon(
            name = "Drumstick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.4 15.63c-3.073 .986-5.9-.048-6.968-2.548C7.365 10.583 8.308 7.204 10.756 4.756 13.204 2.308 16.583 1.365 19.082 2.432c2.5 1.068 3.533 3.895 2.548 6.968-1.432-.817-3.538-.322-5.045 1.185-1.507 1.507-2.002 3.613-1.185 5.045")
            addPathData("M8.29 12.71 5.69 15.31c-.868-.478-1.936-.399-2.723 .203-.787 .601-1.146 1.611-.913 2.574 .232 .963 1.012 1.698 1.987 1.874 .191 .962 .927 1.723 1.882 1.947 .955 .224 1.952-.132 2.551-.909 .598-.777 .687-1.832 .227-2.698l2.59-2.59")
        }
        return _drumstick!!
    }

private var _drumstick: ImageVector? = null
