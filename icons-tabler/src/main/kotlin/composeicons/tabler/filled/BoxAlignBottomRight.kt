package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BoxAlignBottomRight: ImageVector
    get() {
        if (_boxAlignBottomRight != null) return _boxAlignBottomRight!!
        _boxAlignBottomRight = tablerFilledIcon(
            name = "BoxAlignBottomRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 12h-5c-1.105 0-2 .895-2 2v5c0 1.105 .895 2 2 2h5c1.105 0 2-.895 2-2v-5c0-1.105-.895-2-2-2Z")
            addPathData("M20 8c.507 0 .934 .38 .993 .883L21 9.01c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L19 9c0-.552 .448-1 1-1Z")
            addPathData("M20 3c.507 0 .934 .38 .993 .883L21 4.01c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L19 4c0-.552 .448-1 1-1Z")
            addPathData("M15 3c.507 0 .934 .38 .993 .883L16 4.01c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L14 4c0-.552 .448-1 1-1Z")
            addPathData("M9 3c.507 0 .934 .38 .993 .883L10 4.01c-.001 .529-.413 .966-.941 .997C8.53 5.038 8.069 4.652 8.007 4.127L8 4C8 3.448 8.448 3 9 3Z")
            addPathData("M9 19c.507 0 .934 .38 .993 .883l.007 .127c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L8 20c0-.552 .448-1 1-1Z")
            addPathData("M4 3c.507 0 .934 .38 .993 .883L5 4.01c-.001 .529-.413 .966-.941 .997C3.53 5.038 3.069 4.652 3.007 4.127L3 4C3 3.448 3.448 3 4 3Z")
            addPathData("M4 8c.507 0 .934 .38 .993 .883L5 9.01c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L3 9C3 8.448 3.448 8 4 8Z")
            addPathData("M4 14c.507 0 .934 .38 .993 .883L5 15.01c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L3 15c0-.552 .448-1 1-1Z")
            addPathData("M4 19c.507 0 .934 .38 .993 .883L5 20.01c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L3 20c0-.552 .448-1 1-1Z")
        }
        return _boxAlignBottomRight!!
    }

private var _boxAlignBottomRight: ImageVector? = null
