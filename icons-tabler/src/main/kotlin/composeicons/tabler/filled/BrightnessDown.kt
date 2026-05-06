package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrightnessDown: ImageVector
    get() {
        if (_brightnessDown != null) return _brightnessDown!!
        _brightnessDown = tablerFilledIcon(
            name = "BrightnessDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 8c2.183 0 3.963 1.75 3.999 3.933 .036 2.183-1.684 3.992-3.866 4.064C9.951 16.071 8.114 14.38 8.005 12.2L8 12l.005-.2C8.112 9.671 9.869 8 12 8Z")
            addPathData("M12 4c.507 0 .934 .38 .993 .883L13 5.01c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L11 5c0-.552 .448-1 1-1Z")
            addPathData("M17 6c.507 0 .934 .38 .993 .883L18 7.01c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L16 7c0-.552 .448-1 1-1Z")
            addPathData("M19 11c.507 0 .934 .38 .993 .883l.007 .127c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L18 12c0-.552 .448-1 1-1Z")
            addPathData("M17 16c.507 0 .934 .38 .993 .883l.007 .127c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L16 17c0-.552 .448-1 1-1Z")
            addPathData("M12 18c.507 0 .934 .38 .993 .883l.007 .127c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L11 19c0-.552 .448-1 1-1Z")
            addPathData("M7 16c.507 0 .934 .38 .993 .883L8 17.01c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L6 17c0-.552 .448-1 1-1Z")
            addPathData("M5 11c.507 0 .934 .38 .993 .883L6 12.01c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L4 12c0-.552 .448-1 1-1Z")
            addPathData("M7 6c.507 0 .934 .38 .993 .883L8 7.01c-.001 .529-.413 .966-.941 .997C6.53 8.038 6.069 7.652 6.007 7.127L6 7C6 6.448 6.448 6 7 6Z")
        }
        return _brightnessDown!!
    }

private var _brightnessDown: ImageVector? = null
