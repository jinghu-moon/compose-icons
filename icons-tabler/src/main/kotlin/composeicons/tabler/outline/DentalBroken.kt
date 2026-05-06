package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DentalBroken: ImageVector
    get() {
        if (_dentalBroken != null) return _dentalBroken!!
        _dentalBroken = tablerOutlineIcon(
            name = "DentalBroken",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 5.5C10.926 4.914 9.417 4 8 4 5.9 4 4 5.247 4 9c0 4.899 1.056 8.41 2.671 10.537 .573 .756 1.97 .521 2.567-.236 .398-.505 .819-1.439 1.262-2.801C10.792 15.729 11.392 14.996 12 15c.602 0 1.21 .737 1.5 1.5 .443 1.362 .864 2.295 1.262 2.8 .597 .759 2 .993 2.567 .237C18.944 17.41 20 13.9 20 9 20 5.26 18.092 4 16 4c-1.423 0-2.92 .911-4 1.5")
            addPathData("M12 5.5 13 8l-2 2 2 2")
        }
        return _dentalBroken!!
    }

private var _dentalBroken: ImageVector? = null
