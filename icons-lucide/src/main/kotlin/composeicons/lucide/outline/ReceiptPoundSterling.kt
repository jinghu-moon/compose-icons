package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ReceiptPoundSterling: ImageVector
    get() {
        if (_receiptPoundSterling != null) return _receiptPoundSterling!!
        _receiptPoundSterling = lucideOutlineIcon(
            name = "ReceiptPoundSterling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 17v-7.5C10 8.119 11.119 7 12.5 7 13.881 7 15 8.119 15 9.5")
            addPathData("M4 3C4 2.448 4.448 2 5 2c.248-.001 .49 .068 .7 .2l.933 .6c.427 .273 .973 .273 1.4 0l.934-.6c.427-.273 .973-.273 1.4 0l.933 .6c.427 .273 .973 .273 1.4 0l.933-.6c.427-.273 .973-.273 1.4 0l.934 .6c.427 .273 .973 .273 1.4 0l.933-.6C18.51 2.068 18.752 1.999 19 2c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1-.248 .001-.49-.068-.7-.2l-.933-.6c-.427-.273-.973-.273-1.4 0l-.934 .6c-.427 .273-.973 .273-1.4 0l-.933-.6c-.427-.273-.973-.273-1.4 0l-.933 .6c-.427 .273-.973 .273-1.4 0l-.934-.6c-.427-.273-.973-.273-1.4 0l-.933 .6C5.49 21.932 5.248 22.001 5 22 4.448 22 4 21.552 4 21Z")
            addPathData("M8 13h5")
            addPathData("M8 17h7")
        }
        return _receiptPoundSterling!!
    }

private var _receiptPoundSterling: ImageVector? = null
