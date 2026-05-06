package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandHipchat: ImageVector
    get() {
        if (_brandHipchat != null) return _brandHipchat!!
        _brandHipchat = tablerOutlineIcon(
            name = "BrandHipchat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17.802 17.292c0 0 .077-.055 .2-.149 1.843-1.425 3-3.49 3-5.789 0-4.286-4.03-7.764-9-7.764-4.97 0-9 3.478-9 7.764 0 4.288 4.03 7.646 9 7.646 .424 0 1.12-.028 2.088-.084 1.262 .82 3.104 1.493 4.716 1.493 .499 0 .734-.41 .414-.828-.486-.596-1.156-1.551-1.416-2.29l-.002 .001")
            addPathData("M7.5 13.5C10 16 14 16 16.5 13.5")
        }
        return _brandHipchat!!
    }

private var _brandHipchat: ImageVector? = null
