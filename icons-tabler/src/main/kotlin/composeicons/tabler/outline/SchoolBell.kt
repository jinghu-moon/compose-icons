package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SchoolBell: ImageVector
    get() {
        if (_schoolBell != null) return _schoolBell!!
        _schoolBell = tablerOutlineIcon(
            name = "SchoolBell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 17c0 1.657 1.343 3 3 3")
            addPathData("M14.805 6.37 17.588 3.586c.781-.781 2.047-.781 2.829-0 .781 .781 .781 2.047 0 2.829L17.633 9.2")
            addPathData("M16.505 7.495c1.924 1.924 2.001 5.018 .176 7.035l-.176 .184-1.867 1.867c-.598 .597-.958 1.391-1.013 2.234l-.008 .23v.934c0 .327-.13 .64-.36 .871-.174 .175-.449 .201-.652 .06l-.07-.06L3.15 11.466c-.096-.096-.15-.226-.15-.361 0-.135 .054-.265 .15-.361 .198-.198 .456-.322 .732-.353l.139-.008h.933c.848 0 1.663-.309 2.297-.864l.168-.157L9.286 7.495l.16-.153c2.015-1.847 5.126-1.779 7.059 .153")
        }
        return _schoolBell!!
    }

private var _schoolBell: ImageVector? = null
