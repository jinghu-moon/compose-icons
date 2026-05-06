package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowBigRightLine: ImageVector
    get() {
        if (_arrowBigRightLine != null) return _arrowBigRightLine!!
        _arrowBigRightLine = tablerFilledIcon(
            name = "ArrowBigRightLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.089 3.634C11.421 3.976 11 4.663 11 5.414L10.999 8h-4.999C5.448 8 5 8.448 5 9v6l.007 .117c.059 .503 .486 .883 .993 .883l4.999-.001L11 18.586c0 .809 .487 1.538 1.235 1.847 .747 .309 1.607 .138 2.179-.433L21 13.414c.781-.781 .781-2.047 0-2.828L14.414 4c-.572-.572-1.432-.744-2.18-.434l-.145 .068Z")
            addPathData("M3 8c.507 0 .934 .38 .993 .883L4 9v6c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L2 15v-6C2 8.448 2.448 8 3 8Z")
        }
        return _arrowBigRightLine!!
    }

private var _arrowBigRightLine: ImageVector? = null
