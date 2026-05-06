package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ReplaceUser: ImageVector
    get() {
        if (_replaceUser != null) return _replaceUser!!
        _replaceUser = tablerOutlineIcon(
            name = "ReplaceUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 11v-3c0-.53-.211-1.039-.586-1.414C20.039 6.211 19.53 6 19 6h-6M13 6l3 3M13 6 16 3")
            addPathData("M3 13.013v3c0 .53 .211 1.039 .586 1.414 .375 .375 .884 .586 1.414 .586h6M11 18.013 8 15.013 11 18.013l-3 3")
            addPathData("M16 16.502c0 .53 .211 1.039 .586 1.414 .375 .375 .884 .586 1.414 .586 .53 0 1.039-.211 1.414-.586 .375-.375 .586-.884 .586-1.414 0-.53-.211-1.039-.586-1.414-.375-.375-.884-.586-1.414-.586-.53 0-1.039 .211-1.414 .586-.375 .375-.586 .884-.586 1.414")
            addPathData("M4 4.502c0 .53 .211 1.039 .586 1.414 .375 .375 .884 .586 1.414 .586 .53 0 1.039-.211 1.414-.586C7.789 5.541 8 5.032 8 4.502 8 3.972 7.789 3.463 7.414 3.088 7.039 2.713 6.53 2.502 6 2.502c-.53 0-1.039 .211-1.414 .586C4.211 3.463 4 3.972 4 4.502")
            addPathData("M21 21.499c0-.53-.211-1.039-.586-1.414-.375-.375-.884-.586-1.414-.586h-2c-.53 0-1.039 .211-1.414 .586-.375 .375-.586 .884-.586 1.414")
            addPathData("M9 9.499C9 8.969 8.789 8.46 8.414 8.085 8.039 7.71 7.53 7.499 7 7.499h-2c-.53 0-1.039 .211-1.414 .586C3.211 8.46 3 8.969 3 9.499")
        }
        return _replaceUser!!
    }

private var _replaceUser: ImageVector? = null
