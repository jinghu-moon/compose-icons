package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FilePlay: ImageVector
    get() {
        if (_filePlay != null) return _filePlay!!
        _filePlay = lucideOutlineIcon(
            name = "FilePlay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 22C4.895 22 4 21.105 4 20v-16C4 2.895 4.895 2 6 2h8c.639-.001 1.253 .253 1.704 .706l3.588 3.588c.454 .451 .709 1.066 .708 1.706v12c0 1.105-.895 2-2 2Z")
            addPathData("M14 2v5c0 .552 .448 1 1 1h5")
            addPathData("M15.033 13.44c.2 .116 .323 .329 .323 .56 0 .231-.123 .444-.323 .56l-4.065 2.352c-.2 .116-.446 .116-.646 0-.2-.116-.323-.329-.322-.56v-4.704c-0-.231 .122-.444 .322-.559 .199-.116 .445-.116 .645-.001Z")
        }
        return _filePlay!!
    }

private var _filePlay: ImageVector? = null
