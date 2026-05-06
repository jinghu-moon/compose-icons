package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Kayak: ImageVector
    get() {
        if (_kayak != null) return _kayak!!
        _kayak = tablerOutlineIcon(
            name = "Kayak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6.414 6.414c.781-.781 .781-2.047 0-2.828L5 2.172 2.172 5 3.586 6.414c.781 .781 2.047 .781 2.828 0")
            addPathData("M17.586 17.586c-.781 .781-.781 2.047 0 2.828L19 21.828 21.828 19 20.414 17.586c-.781-.781-2.047-.781-2.828 0")
            addPathData("M6.5 6.5l11 11")
            addPathData("M22 2.5C12.017 5.101 4.373 10.452 2 22 11.983 19.399 19.627 14.048 22 2.5")
            addPathData("M6.5 12.5l5 5")
            addPathData("M12.5 6.5l5 5")
        }
        return _kayak!!
    }

private var _kayak: ImageVector? = null
