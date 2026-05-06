package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GenderEpicene: ImageVector
    get() {
        if (_genderEpicene != null) return _genderEpicene!!
        _genderEpicene = tablerOutlineIcon(
            name = "GenderEpicene",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.536 15.536c1.953-1.953 1.953-5.119 0-7.072C13.583 6.511 10.417 6.511 8.464 8.464c-1.953 1.953-1.953 5.119 0 7.072 1.953 1.953 5.119 1.953 7.072 0")
            addPathData("M15.536 15.535 21 10")
            addPathData("M3 14 8.464 8.465")
            addPathData("M12 12h.01")
        }
        return _genderEpicene!!
    }

private var _genderEpicene: ImageVector? = null
