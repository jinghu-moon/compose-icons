package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FlowerOff: ImageVector
    get() {
        if (_flowerOff != null) return _flowerOff!!
        _flowerOff = tablerOutlineIcon(
            name = "FlowerOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.875 9.882c-1.154 1.175-1.145 3.062 .022 4.225 1.166 1.164 3.052 1.169 4.225 .013M14.703 10.697c-.298-.617-.799-1.114-1.418-1.409")
            addPathData("M9 5C9 3.343 10.343 2 12 2c1.657 0 3 1.343 3 3 0 .562-.259 1.442-.776 2.64L13.5 9 15.26 7.107c.499-.6 .922-1 1.27-1.205 .685-.398 1.5-.505 2.264-.299 .764 .206 1.414 .71 1.806 1.398 .823 1.434 .337 3.263-1.09 4.098-.374 .217-.99 .396-1.846 .535l-1.779 .244M16.177 12.16l1.223 .166c1 .145 1.698 .337 2.11 .576 1.327 .777 1.856 2.429 1.226 3.832M18.459 18.467c-.666 .099-1.347-.031-1.929-.369-.348-.202-.771-.604-1.27-1.205L13.5 15l.724 1.36C14.74 17.559 15 18.439 15 19c0 1.657-1.343 3-3 3C10.343 22 9 20.657 9 19c0-.562 .259-1.442 .776-2.64L10.5 15 8.74 16.893c-.499 .601-.922 1-1.27 1.205-.685 .398-1.5 .505-2.264 .299C4.442 18.191 3.792 17.688 3.4 17 2.577 15.566 3.063 13.737 4.49 12.902c.374-.218 .99-.396 1.846-.536L9 12 6.6 11.675c-1-.145-1.698-.337-2.11-.576C3.063 10.264 2.576 8.434 3.4 7 3.849 6.21 4.636 5.67 5.534 5.533")
            addPathData("M3 3 21 21")
        }
        return _flowerOff!!
    }

private var _flowerOff: ImageVector? = null
