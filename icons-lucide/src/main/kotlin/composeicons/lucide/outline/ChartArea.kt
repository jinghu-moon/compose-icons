package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChartArea: ImageVector
    get() {
        if (_chartArea != null) return _chartArea!!
        _chartArea = lucideOutlineIcon(
            name = "ChartArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 3v16c0 1.105 .895 2 2 2h16")
            addPathData("M7 11.207c0-.132 .053-.259 .146-.353l2-2c.094-.094 .221-.147 .354-.147 .133 0 .26 .053 .354 .147l3.292 3.292c.094 .094 .221 .147 .354 .147 .133 0 .26-.053 .354-.147L18.146 7.854c.143-.143 .358-.186 .545-.109 .187 .077 .309 .26 .309 .462v7.793c0 .552-.448 1-1 1h-10C7.448 17 7 16.552 7 16Z")
        }
        return _chartArea!!
    }

private var _chartArea: ImageVector? = null
