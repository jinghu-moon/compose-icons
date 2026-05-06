package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AdjustmentsUp: ImageVector
    get() {
        if (_adjustmentsUp != null) return _adjustmentsUp!!
        _adjustmentsUp = tablerOutlineIcon(
            name = "AdjustmentsUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 10c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C8 8.895 7.105 8 6 8 4.895 8 4 8.895 4 10")
            addPathData("M6 4v4")
            addPathData("M6 12v8")
            addPathData("M13.927 15.462c-.278-.996-1.27-1.616-2.287-1.429-1.017 .187-1.724 1.118-1.631 2.148 .094 1.03 .957 1.819 1.991 1.819")
            addPathData("M12 4v10")
            addPathData("M12 18v2")
            addPathData("M16 7c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C20 5.895 19.105 5 18 5c-1.105 0-2 .895-2 2")
            addPathData("M18 4v1")
            addPathData("M18 9v3")
            addPathData("M19 22v-6")
            addPathData("M22 19 19 16l-3 3")
        }
        return _adjustmentsUp!!
    }

private var _adjustmentsUp: ImageVector? = null
