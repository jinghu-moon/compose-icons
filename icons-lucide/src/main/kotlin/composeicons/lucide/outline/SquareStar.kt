package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquareStar: ImageVector
    get() {
        if (_squareStar != null) return _squareStar!!
        _squareStar = lucideOutlineIcon(
            name = "SquareStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.035 7.69c.136-.416 .526-.695 .963-.69 .437 .005 .821 .295 .946 .714l.737 1.452c.145 .286 .42 .485 .737 .535l1.634 .256c.432 .002 .813 .28 .947 .69 .134 .41-.011 .86-.359 1.116l-1.172 1.168c-.228 .227-.333 .549-.282 .866l.259 1.613c.146 .415 .004 .877-.35 1.138-.354 .261-.838 .259-1.191-.004l-1.465-.75c-.286-.147-.626-.147-.912 0l-1.465 .75c-.353 .261-.834 .261-1.188 .001-.353-.26-.496-.72-.351-1.134l.258-1.613c.051-.317-.054-.639-.282-.866L7.343 11.779c-.36-.249-.516-.704-.385-1.122 .131-.418 .519-.702 .957-.7L9.548 9.701c.317-.05 .592-.249 .737-.535Z")
            addPathData("M5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14C3 3.895 3.895 3 5 3Z")
        }
        return _squareStar!!
    }

private var _squareStar: ImageVector? = null
