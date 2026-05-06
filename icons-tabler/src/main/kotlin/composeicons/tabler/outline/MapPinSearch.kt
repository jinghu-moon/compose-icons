package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapPinSearch: ImageVector
    get() {
        if (_mapPinSearch != null) return _mapPinSearch!!
        _mapPinSearch = tablerOutlineIcon(
            name = "MapPinSearch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.916 11.707c.301-1.243-.218-2.54-1.294-3.231-1.076-.691-2.471-.625-3.476 .166-1.005 .79-1.399 2.131-.981 3.339C9.583 13.189 10.721 14 12 14")
            addPathData("M11.991 21.485c-.527-.002-1.032-.212-1.404-.585L6.343 16.657C3.756 14.07 3.254 10.057 5.123 6.912 6.993 3.767 10.758 2.291 14.267 3.328c3.509 1.037 5.867 4.322 5.727 7.978")
            addPathData("M15 18c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M20.2 20.2 22 22")
        }
        return _mapPinSearch!!
    }

private var _mapPinSearch: ImageVector? = null
