package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MedicineSyrup: ImageVector
    get() {
        if (_medicineSyrup != null) return _medicineSyrup!!
        _medicineSyrup = tablerOutlineIcon(
            name = "MedicineSyrup",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 21h8c.552 0 1-.448 1-1v-10C17 8.343 15.657 7 14 7h-4C8.343 7 7 8.343 7 10v10c0 .552 .448 1 1 1")
            addPathData("M10 14h4")
            addPathData("M12 12v4")
            addPathData("M10 7v-3c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v3")
        }
        return _medicineSyrup!!
    }

private var _medicineSyrup: ImageVector? = null
