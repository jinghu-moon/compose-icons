package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CircleStar: ImageVector
    get() {
        if (_circleStar != null) return _circleStar!!
        _circleStar = lucideOutlineIcon(
            name = "CircleStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12c0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10Z")
            addPathData("M11.051 7.616c.136-.416 .526-.695 .963-.69 .437 .005 .821 .295 .946 .714l.737 1.452c.145 .286 .42 .485 .737 .535l1.634 .256c.432 .002 .813 .28 .947 .69 .134 .41-.011 .86-.359 1.116l-1.172 1.168c-.228 .227-.333 .549-.282 .866l.259 1.613c.146 .415 .004 .877-.35 1.138-.354 .261-.838 .259-1.191-.004l-1.465-.75c-.286-.147-.626-.147-.912 0l-1.465 .75c-.353 .261-.834 .261-1.188 .001-.353-.26-.496-.72-.351-1.134l.258-1.613c.051-.318-.054-.64-.282-.867L7.359 11.705c-.36-.249-.516-.704-.385-1.122 .131-.418 .519-.702 .957-.7L9.564 9.627c.317-.05 .592-.249 .737-.535Z")
        }
        return _circleStar!!
    }

private var _circleStar: ImageVector? = null
