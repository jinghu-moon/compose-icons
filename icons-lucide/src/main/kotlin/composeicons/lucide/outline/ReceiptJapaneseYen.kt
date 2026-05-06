package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ReceiptJapaneseYen: ImageVector
    get() {
        if (_receiptJapaneseYen != null) return _receiptJapaneseYen!!
        _receiptJapaneseYen = lucideOutlineIcon(
            name = "ReceiptJapaneseYen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 10 15 7")
            addPathData("M4 3C4 2.448 4.448 2 5 2c.248-.001 .49 .068 .7 .2l.933 .6c.427 .273 .973 .273 1.4 0l.934-.6c.427-.273 .973-.273 1.4 0l.933 .6c.427 .273 .973 .273 1.4 0l.933-.6c.427-.273 .973-.273 1.4 0l.934 .6c.427 .273 .973 .273 1.4 0l.933-.6C18.51 2.068 18.752 1.999 19 2c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1-.248 .001-.49-.068-.7-.2l-.933-.6c-.427-.273-.973-.273-1.4 0l-.934 .6c-.427 .273-.973 .273-1.4 0l-.933-.6c-.427-.273-.973-.273-1.4 0l-.933 .6c-.427 .273-.973 .273-1.4 0l-.934-.6c-.427-.273-.973-.273-1.4 0l-.933 .6C5.49 21.932 5.248 22.001 5 22 4.448 22 4 21.552 4 21Z")
            addPathData("M9 11h6")
            addPathData("M9 15h6")
            addPathData("M9 7l3 3v7")
        }
        return _receiptJapaneseYen!!
    }

private var _receiptJapaneseYen: ImageVector? = null
