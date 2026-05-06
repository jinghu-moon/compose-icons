package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Settings: ImageVector
    get() {
        if (_settings != null) return _settings!!
        _settings = lucideOutlineIcon(
            name = "Settings",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.671 4.136C9.785 2.935 10.794 2.017 12 2.017c1.207 0 2.215 .917 2.33 2.119 .067 .76 .501 1.439 1.161 1.821 .661 .381 1.466 .416 2.158 .094 1.096-.498 2.391-.082 2.994 .96 .602 1.042 .315 2.372-.664 3.073-.624 .438-.996 1.153-.996 1.916 0 .763 .372 1.477 .996 1.915 .979 .701 1.266 2.03 .664 3.073-.602 1.042-1.897 1.458-2.994 .96-.692-.322-1.497-.287-2.158 .094-.661 .381-1.094 1.061-1.161 1.821-.114 1.201-1.123 2.119-2.33 2.119-1.207 0-2.215-.917-2.33-2.119C9.604 19.103 9.17 18.423 8.509 18.042c-.661-.381-1.467-.416-2.158-.094-1.096 .498-2.391 .082-2.994-.96-.602-1.042-.315-2.372 .664-3.073 .624-.438 .996-1.153 .996-1.915 0-.763-.372-1.477-.996-1.916C3.044 9.383 2.757 8.054 3.359 7.013 3.961 5.971 5.254 5.555 6.35 6.051c.692 .322 1.497 .287 2.158-.094C9.168 5.575 9.602 4.896 9.669 4.136")
            addPathData("M15 12c0 1.657-1.343 3-3 3C10.343 15 9 13.657 9 12 9 10.343 10.343 9 12 9c1.657 0 3 1.343 3 3Z")
        }
        return _settings!!
    }

private var _settings: ImageVector? = null
