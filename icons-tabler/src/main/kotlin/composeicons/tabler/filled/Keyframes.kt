package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Keyframes: ImageVector
    get() {
        if (_keyframes != null) return _keyframes!!
        _keyframes = tablerFilledIcon(
            name = "Keyframes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 4c-.776 .004-1.51 .355-2 .957L1.645 10.197c-.856 1.046-.859 2.549-.007 3.598l4.368 5.256C6.505 19.651 7.23 20 8 20c.776-.004 1.51-.355 2-.957l4.355-5.24c.856-1.046 .859-2.549 .007-3.598L9.994 4.949C9.504 4.351 8.773 4.003 8 4Z")
            addPathData("M16.382 4.214c.396-.311 .961-.279 1.32 .074l.084 .094 4.576 5.823c.808 .993 .848 2.396 .13 3.419l-.12 .158-4.586 5.836c-.326 .415-.919 .505-1.353 .206-.435-.299-.562-.885-.291-1.338l.072-.104 4.596-5.85c.226-.28 .25-.672 .06-.978l-.07-.1L16.214 5.618c-.341-.434-.266-1.063 .168-1.404Z")
            addPathData("M12.382 4.214c.396-.311 .961-.279 1.32 .074l.084 .094 4.576 5.823c.808 .993 .848 2.396 .13 3.419l-.12 .158-4.586 5.836c-.326 .415-.919 .505-1.353 .206-.435-.299-.562-.885-.291-1.338l.072-.104 4.596-5.85c.226-.28 .25-.672 .06-.978l-.07-.1L12.214 5.618c-.341-.434-.266-1.063 .168-1.404Z")
        }
        return _keyframes!!
    }

private var _keyframes: ImageVector? = null
