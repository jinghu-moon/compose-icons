package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlphabetKorean: ImageVector
    get() {
        if (_alphabetKorean != null) return _alphabetKorean!!
        _alphabetKorean = tablerOutlineIcon(
            name = "AlphabetKorean",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 7h6c0 2.5-1.593 8.474-6 10")
            addPathData("M16 5v14-14")
            addPathData("M16 12h2")
        }
        return _alphabetKorean!!
    }

private var _alphabetKorean: ImageVector? = null
