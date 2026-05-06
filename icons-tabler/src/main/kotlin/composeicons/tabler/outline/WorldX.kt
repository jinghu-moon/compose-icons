package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WorldX: ImageVector
    get() {
        if (_worldX != null) return _worldX!!
        _worldX = tablerOutlineIcon(
            name = "WorldX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.929 13.131C21.399 9.417 19.522 5.8 16.214 4.047 12.907 2.295 8.859 2.773 6.051 5.247 3.242 7.722 2.258 11.677 3.58 15.179c1.322 3.502 4.674 5.82 8.418 5.821")
            addPathData("M3.6 9h16.8")
            addPathData("M3.6 15h9.9")
            addPathData("M11.5 3c-3.437 5.508-3.437 12.492 0 18")
            addPathData("M12.5 3c1.97 3.155 2.85 6.869 2.505 10.573")
            addPathData("M22 22 17 17")
            addPathData("M17 22l5-5")
        }
        return _worldX!!
    }

private var _worldX: ImageVector? = null
