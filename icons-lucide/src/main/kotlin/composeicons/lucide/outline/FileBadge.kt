package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileBadge: ImageVector
    get() {
        if (_fileBadge != null) return _fileBadge!!
        _fileBadge = lucideOutlineIcon(
            name = "FileBadge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 22h5c1.105 0 2-.895 2-2v-12c.002-.64-.253-1.254-.706-1.706L15.706 2.706C15.254 2.253 14.64 1.998 14 2h-8C4.895 2 4 2.895 4 4v3.3")
            addPathData("M14 2v5c0 .552 .448 1 1 1h5")
            addPathData("M7.69 16.479l1.29 4.88c.056 .19-.005 .395-.157 .523-.151 .128-.363 .155-.541 .068L6.439 21.101c-.277-.135-.602-.135-.879 .001l-1.846 .85c-.178 .083-.388 .055-.537-.073-.149-.128-.21-.331-.155-.52L4.312 16.479")
            addPathData("M9 14c0 1.657-1.343 3-3 3C4.343 17 3 15.657 3 14 3 12.343 4.343 11 6 11c1.657 0 3 1.343 3 3Z")
        }
        return _fileBadge!!
    }

private var _fileBadge: ImageVector? = null
