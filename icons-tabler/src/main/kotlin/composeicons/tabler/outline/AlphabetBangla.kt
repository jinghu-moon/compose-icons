package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlphabetBangla: ImageVector
    get() {
        if (_alphabetBangla != null) return _alphabetBangla!!
        _alphabetBangla = tablerOutlineIcon(
            name = "AlphabetBangla",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 12c.904-.027 3 2 3 7")
            addPathData("M10 11c0-.955 0-2 .786-2.677 1.262-1.089 3.025 .55 3.2 2.06 .086 .741-.215 3.109-1.489 4.527-.475 .53-.904 .992-1.711 1.074-.75 .076-1.364-.122-2.076-.588C7.572 14.653 6.383 13.399 5.374 11.666 4.296 9.817 3.714 8.553 3 6")
            addPathData("M7.37 7.072c.769-.836 5.246-4.094 8.4-.202 .382 .472 .573 .708 .9 1.63 .326 .921 .326 1.562 .326 2.844v7.656")
            addPathData("M17 10C17 8.011 18.5 6 21 6")
        }
        return _alphabetBangla!!
    }

private var _alphabetBangla: ImageVector? = null
