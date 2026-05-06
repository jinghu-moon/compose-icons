package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MapPinHouse: ImageVector
    get() {
        if (_mapPinHouse != null) return _mapPinHouse!!
        _mapPinHouse = lucideOutlineIcon(
            name = "MapPinHouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 22c-.552 0-1-.448-1-1v-4c-0-.334 .167-.646 .445-.832l3-2c.336-.224 .774-.224 1.11 0l3 2c.278 .186 .445 .498 .445 .832v4c0 .552-.448 1-1 1Z")
            addPathData("M18 10C18 5.582 14.418 2 10 2 5.582 2 2 5.582 2 10c0 4.993 5.539 10.193 7.399 11.799 .173 .13 .384 .2 .601 .2")
            addPathData("M18 22v-3")
            addPathData("M13 10c0 1.657-1.343 3-3 3C8.343 13 7 11.657 7 10 7 8.343 8.343 7 10 7c1.657 0 3 1.343 3 3Z")
        }
        return _mapPinHouse!!
    }

private var _mapPinHouse: ImageVector? = null
