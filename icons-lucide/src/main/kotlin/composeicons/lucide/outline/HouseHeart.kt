package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HouseHeart: ImageVector
    get() {
        if (_houseHeart != null) return _houseHeart!!
        _houseHeart = lucideOutlineIcon(
            name = "HouseHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.62 13.8c-.573-.597-.772-1.461-.517-2.249 .254-.788 .921-1.372 1.735-1.522 .814-.149 1.645 .16 2.162 .807 .52-.639 1.348-.943 2.158-.792 .81 .151 1.473 .732 1.728 1.516 .255 .784 .061 1.644-.505 2.242l-2.626 2.856c-.19 .218-.464 .344-.753 .344-.289 0-.564-.125-.753-.344Z")
            addPathData("M3 10C3 9.411 3.259 8.852 3.709 8.472L10.709 2.472c.745-.63 1.837-.63 2.582 0l7 6c.45 .38 .709 .939 .709 1.528v9c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19Z")
        }
        return _houseHeart!!
    }

private var _houseHeart: ImageVector? = null
