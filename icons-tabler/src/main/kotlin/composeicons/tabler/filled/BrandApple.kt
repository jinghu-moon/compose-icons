package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandApple: ImageVector
    get() {
        if (_brandApple != null) return _brandApple!!
        _brandApple = tablerFilledIcon(
            name = "BrandApple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.079 5.999l.239 .012c1.43 .097 3.434 1.013 4.508 2.586 .159 .233 .212 .522 .147 .796-.066 .274-.244 .508-.491 .644-.05 .028-.372 .158-.497 .217-.255 .119-.497 .263-.722 .431-.614 .461-.948 1.009-.942 1.694 .01 .885 .339 1.454 .907 1.846 .208 .143 .436 .253 .666 .33 .126 .043 .426 .116 .444 .122 .397 .143 .662 .52 .662 .942C20 18.24 16.96 22 14.714 22c-.79 0-1.272-.091-1.983-.315l-.098-.031c-.463-.146-.702-.192-1.133-.192-.52 0-.863 .06-1.518 .237l-.197 .053c-.575 .153-.964 .226-1.5 .248C5.536 22 3 16.907 3 12.928 3 9.058 4.786 6.008 8.286 6.008c.297 0 .598 .045 .909 .128 .403 .107 .774 .26 1.296 .508 .787 .374 .948 .44 1.009 .44h.016c.03-.003 .128-.047 1.056-.457 1.061-.467 1.864-.685 2.746-.616l-.24-.012Z")
            addPathData("M14 1c.552 0 1 .448 1 1 0 1.657-1.343 3-3 3C11.448 5 11 4.552 11 4 11 2.343 12.343 1 14 1Z")
        }
        return _brandApple!!
    }

private var _brandApple: ImageVector? = null
