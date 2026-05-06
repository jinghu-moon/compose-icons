package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandNotion: ImageVector
    get() {
        if (_brandNotion != null) return _brandNotion!!
        _brandNotion = tablerOutlineIcon(
            name = "BrandNotion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 17.5v-6.5h.5l4 6h.5v-6.5")
            addPathData("M19.077 20.071 7.547 20.958c-.341 .026-.671-.124-.876-.397L4.2 17.267C4.07 17.094 4 16.883 4 16.667v-10.741c0-.522 .402-.957 .923-.997L16.312 4.053c.446-.034 .89 .082 1.262 .33l1.535 1.023c.557 .371 .891 .995 .891 1.664v12.004c-0 .522-.402 .957-.923 .997")
            addPathData("M4.5 5.5 7 8")
            addPathData("M20 7 7 8v12.5")
        }
        return _brandNotion!!
    }

private var _brandNotion: ImageVector? = null
