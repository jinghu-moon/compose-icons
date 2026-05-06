package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ReceiptRussianRuble: ImageVector
    get() {
        if (_receiptRussianRuble != null) return _receiptRussianRuble!!
        _receiptRussianRuble = lucideOutlineIcon(
            name = "ReceiptRussianRuble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 3C4 2.448 4.448 2 5 2c.248-.001 .49 .068 .7 .2l.933 .6c.427 .273 .973 .273 1.4 0l.934-.6c.427-.273 .973-.273 1.4 0l.933 .6c.427 .273 .973 .273 1.4 0l.933-.6c.427-.273 .973-.273 1.4 0l.934 .6c.427 .273 .973 .273 1.4 0l.933-.6C18.51 2.068 18.752 1.999 19 2c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1-.248 .001-.49-.068-.7-.2l-.933-.6c-.427-.273-.973-.273-1.4 0l-.934 .6c-.427 .273-.973 .273-1.4 0l-.933-.6c-.427-.273-.973-.273-1.4 0l-.933 .6c-.427 .273-.973 .273-1.4 0l-.934-.6c-.427-.273-.973-.273-1.4 0l-.933 .6C5.49 21.932 5.248 22.001 5 22 4.448 22 4 21.552 4 21Z")
            addPathData("M8 11h5c1.105 0 2-.895 2-2C15 7.895 14.105 7 13 7h-3v10")
            addPathData("M8 15h5")
        }
        return _receiptRussianRuble!!
    }

private var _receiptRussianRuble: ImageVector? = null
