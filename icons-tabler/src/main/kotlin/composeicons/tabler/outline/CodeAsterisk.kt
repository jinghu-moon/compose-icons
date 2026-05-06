package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CodeAsterisk: ImageVector
    get() {
        if (_codeAsterisk != null) return _codeAsterisk!!
        _codeAsterisk = tablerOutlineIcon(
            name = "CodeAsterisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 19C4.895 19 4 18.105 4 17v-4L3 12 4 11v-4C4 5.895 4.895 5 6 5")
            addPathData("M12 11.875l3-1.687")
            addPathData("M12 11.875v3.375")
            addPathData("M12 11.875 9 10.188")
            addPathData("M12 11.875l3 1.688")
            addPathData("M12 8.5v3.375")
            addPathData("M12 11.875 9 13.563")
            addPathData("M18 19c1.105 0 2-.895 2-2v-4l1-1L20 11v-4C20 5.895 19.105 5 18 5")
        }
        return _codeAsterisk!!
    }

private var _codeAsterisk: ImageVector? = null
