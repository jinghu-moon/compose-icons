package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ReceiptCent: ImageVector
    get() {
        if (_receiptCent != null) return _receiptCent!!
        _receiptCent = lucideOutlineIcon(
            name = "ReceiptCent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 7v10")
            addPathData("M14.828 14.829c-1.562 1.562-4.094 1.562-5.656 0C8.422 14.079 8 13.061 8 12c0-1.061 .421-2.078 1.172-2.828 1.562-1.562 4.094-1.562 5.656 0")
            addPathData("M4 3C4 2.448 4.448 2 5 2c.248-.001 .49 .068 .7 .2l.933 .6c.427 .273 .973 .273 1.4 0l.934-.6c.427-.273 .973-.273 1.4 0l.933 .6c.427 .273 .973 .273 1.4 0l.933-.6c.427-.273 .973-.273 1.4 0l.934 .6c.427 .273 .973 .273 1.4 0l.933-.6C18.51 2.068 18.752 1.999 19 2c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1-.248 .001-.49-.068-.7-.2l-.933-.6c-.427-.273-.973-.273-1.4 0l-.934 .6c-.427 .273-.973 .273-1.4 0l-.933-.6c-.427-.273-.973-.273-1.4 0l-.933 .6c-.427 .273-.973 .273-1.4 0l-.934-.6c-.427-.273-.973-.273-1.4 0l-.933 .6C5.49 21.932 5.248 22.001 5 22 4.448 22 4 21.552 4 21Z")
        }
        return _receiptCent!!
    }

private var _receiptCent: ImageVector? = null
