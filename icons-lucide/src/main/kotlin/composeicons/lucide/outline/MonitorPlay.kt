package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MonitorPlay: ImageVector
    get() {
        if (_monitorPlay != null) return _monitorPlay!!
        _monitorPlay = lucideOutlineIcon(
            name = "MonitorPlay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.033 9.44c.2 .116 .323 .329 .323 .56 0 .231-.123 .444-.323 .56l-4.065 2.352c-.2 .116-.446 .116-.646 0-.2-.116-.323-.329-.322-.56v-4.704c-0-.231 .122-.444 .322-.559 .199-.116 .445-.116 .645-.001Z")
            addPathData("M12 17v4")
            addPathData("M8 21h8")
            addPathData("M4 3h16c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-16C2.895 17 2 16.105 2 15v-10C2 3.895 2.895 3 4 3Z")
        }
        return _monitorPlay!!
    }

private var _monitorPlay: ImageVector? = null
