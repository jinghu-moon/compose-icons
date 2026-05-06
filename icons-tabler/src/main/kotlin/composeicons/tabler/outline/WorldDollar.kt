package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WorldDollar: ImageVector
    get() {
        if (_worldDollar != null) return _worldDollar!!
        _worldDollar = tablerOutlineIcon(
            name = "WorldDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.876 10.51C20.063 5.667 15.517 2.369 10.661 3.1 5.805 3.831 2.431 8.32 3.079 13.188c.648 4.868 5.08 8.318 9.958 7.752")
            addPathData("M3.6 9h16.8")
            addPathData("M3.6 15h9.9")
            addPathData("M11.5 3c-3.437 5.508-3.437 12.492 0 18")
            addPathData("M12.5 3c1.689 2.705 2.582 5.831 2.578 9.02")
            addPathData("M21 15h-2.5C17.672 15 17 15.672 17 16.5c0 .828 .672 1.5 1.5 1.5h1c.828 0 1.5 .672 1.5 1.5C21 20.328 20.328 21 19.5 21h-2.5")
            addPathData("M19 21v1M19 14v1")
        }
        return _worldDollar!!
    }

private var _worldDollar: ImageVector? = null
