package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BoxAlignTop: ImageVector
    get() {
        if (_boxAlignTop != null) return _boxAlignTop!!
        _boxAlignTop = tablerFilledIcon(
            name = "BoxAlignTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 3.005h-14c-1.105 0-2 .895-2 2v5c0 .552 .448 1 1 1h16c.552 0 1-.448 1-1v-5c0-1.105-.895-2-2-2Z")
            addPathData("M4 13.995c.507 0 .934 .38 .993 .883L5 15.005c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L3 14.995c0-.552 .448-1 1-1Z")
            addPathData("M4 18.995c.507 0 .934 .38 .993 .883L5 20.005c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L3 19.995c0-.552 .448-1 1-1Z")
            addPathData("M9 18.995c.507 0 .934 .38 .993 .883l.007 .127c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L8 19.995c0-.552 .448-1 1-1Z")
            addPathData("M15 18.995c.507 0 .934 .38 .993 .883l.007 .127c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L14 19.995c0-.552 .448-1 1-1Z")
            addPathData("M20 18.995c.507 0 .934 .38 .993 .883l.007 .127c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L19 19.995c0-.552 .448-1 1-1Z")
            addPathData("M20 13.995c.507 0 .934 .38 .993 .883l.007 .127c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L19 14.995c0-.552 .448-1 1-1Z")
        }
        return _boxAlignTop!!
    }

private var _boxAlignTop: ImageVector? = null
