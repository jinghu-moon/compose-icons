package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LeafyGreen: ImageVector
    get() {
        if (_leafyGreen != null) return _leafyGreen!!
        _leafyGreen = lucideOutlineIcon(
            name = "LeafyGreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 22c1.25-.987 2.27-1.975 3.9-2.2 1.411-0 2.77 .536 3.8 1.5 1.086 .761 2.478 .934 3.717 .463 1.239-.471 2.164-1.526 2.47-2.816 1.324 .236 2.666-.307 3.453-1.398 .787-1.091 .879-2.536 .237-3.718 1.166-.377 2.05-1.336 2.331-2.528C22.189 10.11 21.825 8.857 20.95 8c1.367-1.367 1.367-3.583 0-4.95C19.583 1.683 17.367 1.683 16 3.05 15.143 2.175 13.89 1.811 12.697 2.092c-1.193 .281-2.152 1.165-2.528 2.331C8.987 3.781 7.542 3.873 6.451 4.66 5.36 5.447 4.817 6.789 5.053 8.113 3.775 8.424 2.731 9.344 2.262 10.574c-.469 1.229-.303 2.611 .443 3.694 .794 1.152 1.704 2.444 1.495 3.832C3.926 19.743 3.014 20.732 2 22")
            addPathData("M2 22 17 7")
        }
        return _leafyGreen!!
    }

private var _leafyGreen: ImageVector? = null
