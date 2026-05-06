package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FidgetSpinner: ImageVector
    get() {
        if (_fidgetSpinner != null) return _fidgetSpinner!!
        _fidgetSpinner = tablerOutlineIcon(
            name = "FidgetSpinner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 16v.01")
            addPathData("M6 16v.01")
            addPathData("M12 5v.01")
            addPathData("M12 12v.01")
            addPathData("M12 1c1.811-0 3.396 1.215 3.864 2.964 .469 1.749-.295 3.594-1.863 4.5l.001 .072c1.329 .768 2.101 2.228 1.987 3.758l.22 .128c.495-.248 1.037-.39 1.591-.417L18 12c1.639 0 3.112 1 3.717 2.523 .605 1.523 .22 3.261-.972 4.386-1.192 1.125-2.949 1.409-4.435 .717-1.486-.692-2.399-2.22-2.305-3.856l-.28-.16C13.204 15.86 12.618 16 12 16c-.619 0-1.205-.14-1.728-.391l-.279 .16L10 16c-0 1.788-1.187 3.359-2.907 3.847C5.373 20.335 3.537 19.623 2.597 18.102c-.94-1.521-.756-3.481 .45-4.801 1.206-1.32 3.142-1.679 4.741-.88l.222-.129C7.897 10.762 8.67 9.303 9.998 8.536L10 8.465C8.824 7.786 8.073 6.556 8.005 5.2L8 5C8 2.791 9.791 1 12 1")
        }
        return _fidgetSpinner!!
    }

private var _fidgetSpinner: ImageVector? = null
