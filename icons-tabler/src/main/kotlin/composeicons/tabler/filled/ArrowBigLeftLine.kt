package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowBigLeftLine: ImageVector
    get() {
        if (_arrowBigLeftLine != null) return _arrowBigLeftLine!!
        _arrowBigLeftLine = tablerFilledIcon(
            name = "ArrowBigLeftLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.586 4 3 10.586c-.781 .781-.781 2.047 0 2.828L9.586 20c.572 .572 1.432 .744 2.18 .434l.145-.068c.668-.342 1.089-1.029 1.089-1.78v-2.586h5c.552 0 1-.448 1-1v-6l-.007-.117C18.934 8.38 18.507 8 18 8L13 7.999v-2.585C13 4.605 12.513 3.876 11.765 3.567 11.018 3.257 10.158 3.428 9.586 4Z")
            addPathData("M4.415 12 11 5.414v3.586l.007 .117c.059 .503 .486 .883 .993 .883l5-.001v4L12 14c-.552 0-1 .448-1 1v3.586L4.415 12Z")
            addPathData("M21 8c.507 0 .934 .38 .993 .883L22 9v6c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L20 15v-6c0-.552 .448-1 1-1Z")
        }
        return _arrowBigLeftLine!!
    }

private var _arrowBigLeftLine: ImageVector? = null
