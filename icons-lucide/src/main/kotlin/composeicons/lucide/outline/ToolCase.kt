package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ToolCase: ImageVector
    get() {
        if (_toolCase != null) return _toolCase!!
        _toolCase = lucideOutlineIcon(
            name = "ToolCase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 15h4")
            addPathData("M14.817 10.995 13.846 9.545 14.88 8.313c.571-.664 .643-1.622 .179-2.364C14.595 5.207 13.702 4.853 12.855 5.075l-1.82 .364L9.91 3.885C9.457 3.212 8.642 2.879 7.847 3.043 7.052 3.207 6.435 3.835 6.285 4.633L6.141 6.55 4.416 6.976C3.611 7.222 3.046 7.947 3.004 8.787c-.043 .841 .446 1.618 1.222 1.945l.657 .27")
            addPathData("M18.822 10.995 21.082 5.615c.104-.248 .104-.528-.001-.776-.105-.248-.305-.443-.556-.542L16.954 2.9c-.501-.196-1.067 .04-1.281 .533l-.924 2.122")
            addPathData("M4 12.006c-.002-.265 .102-.52 .289-.709 .186-.189 .44-.296 .705-.297h14.006c.552 0 1 .448 1 1v7c0 1.105-.895 2-2 2h-12C4.895 21 4 20.105 4 19Z")
        }
        return _toolCase!!
    }

private var _toolCase: ImageVector? = null
