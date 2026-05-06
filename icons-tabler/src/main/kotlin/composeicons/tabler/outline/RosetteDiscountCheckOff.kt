package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RosetteDiscountCheckOff: ImageVector
    get() {
        if (_rosetteDiscountCheckOff != null) return _rosetteDiscountCheckOff!!
        _rosetteDiscountCheckOff = tablerOutlineIcon(
            name = "RosetteDiscountCheckOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 12l2 2 1.5-1.5M14.5 10.5 15 10")
            addPathData("M8.887 4.89c.325-.107 .62-.289 .863-.53l.7-.7c.413-.415 .974-.649 1.56-.649 .586 0 1.147 .233 1.56 .649l.7 .7c.412 .41 .97 .64 1.55 .64h1c1.215 0 2.2 .985 2.2 2.2v1c0 .58 .23 1.138 .64 1.55l.7 .7c.415 .413 .649 .974 .649 1.56 0 .586-.233 1.147-.649 1.56l-.7 .7c-.24 .241-.421 .535-.528 .858M18.375 18.376c-.412 .413-.972 .645-1.555 .644h-1c-.581 0-1.138 .23-1.55 .64l-.7 .7c-.413 .415-.974 .649-1.56 .649-.586 0-1.147-.233-1.56-.649l-.7-.7c-.412-.41-.969-.64-1.55-.64h-1C5.985 19.02 5 18.035 5 16.82v-1c-0-.581-.23-1.138-.64-1.55l-.7-.7c-.415-.413-.649-.974-.649-1.56 0-.586 .233-1.147 .649-1.56l.7-.7C4.77 9.338 5 8.781 5 8.2v-1C5 6.596 5.244 6.048 5.638 5.65")
            addPathData("M3 3 21 21")
        }
        return _rosetteDiscountCheckOff!!
    }

private var _rosetteDiscountCheckOff: ImageVector? = null
