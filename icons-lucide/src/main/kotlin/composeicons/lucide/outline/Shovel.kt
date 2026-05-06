package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Shovel: ImageVector
    get() {
        if (_shovel != null) return _shovel!!
        _shovel = lucideOutlineIcon(
            name = "Shovel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21.56 4.56c.282 .281 .44 .663 .44 1.061 0 .398-.158 .78-.44 1.061l-.47 .47C19.914 8.295 18.038 8.282 16.878 7.122c-.563-.563-.879-1.326-.879-2.122 0-.796 .316-1.559 .879-2.122l.44-.44c.586-.586 1.535-.586 2.121 0Z")
            addPathData("M3 22C2.448 22 2 21.552 2 21v-3.586c0-.265 .105-.52 .293-.707L5.648 13.352c.471-.47 1.233-.47 1.704 0l3.296 3.296c.47 .471 .47 1.233 0 1.704L7.293 21.707c-.187 .188-.442 .293-.707 .293Z")
            addPathData("M9 15 16.879 7.122")
        }
        return _shovel!!
    }

private var _shovel: ImageVector? = null
