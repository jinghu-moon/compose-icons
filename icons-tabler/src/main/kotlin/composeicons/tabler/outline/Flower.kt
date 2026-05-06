package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Flower: ImageVector
    get() {
        if (_flower != null) return _flower!!
        _flower = tablerOutlineIcon(
            name = "Flower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 10.343 13.657 9 12 9 10.343 9 9 10.343 9 12")
            addPathData("M12 2c1.657 0 3 1.343 3 3 0 .562-.259 1.442-.776 2.64L13.5 9 15.26 7.107c.499-.6 .922-1 1.27-1.205 .685-.398 1.5-.505 2.264-.299 .764 .206 1.414 .71 1.806 1.398 .823 1.434 .337 3.263-1.09 4.098-.374 .217-.99 .396-1.846 .535L15 12l2.4 .326c1 .145 1.698 .337 2.11 .576 1.427 .835 1.913 2.664 1.09 4.098-.392 .688-1.042 1.191-1.806 1.397-.764 .206-1.579 .099-2.264-.299-.348-.202-.771-.604-1.27-1.205L13.5 15l.724 1.36C14.74 17.559 15 18.439 15 19c0 1.657-1.343 3-3 3C10.343 22 9 20.657 9 19c0-.562 .259-1.442 .776-2.64L10.5 15 8.74 16.893c-.499 .601-.922 1-1.27 1.205-.685 .398-1.5 .505-2.264 .299C4.442 18.191 3.792 17.688 3.4 17 2.577 15.566 3.063 13.737 4.49 12.902c.374-.218 .99-.396 1.846-.536L9 12 6.6 11.675c-1-.145-1.698-.337-2.11-.576C3.063 10.264 2.576 8.434 3.4 7 3.791 6.312 4.442 5.809 5.206 5.602c.764-.206 1.579-.099 2.264 .299 .348 .203 .771 .604 1.27 1.205L10.5 9C9.5 6.708 9 5.375 9 5 9 3.343 10.343 2 12 2")
        }
        return _flower!!
    }

private var _flower: ImageVector? = null
