package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.addPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Stack: ImageVector
    get() {
        if (_stack != null) return _stack!!
        _stack = phosphorFillIcon(
            name = "Stack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPathData("M220 169.09l-92 53.65L36 169.09c-3.781-1.882-8.373-.502-10.489 3.154-2.116 3.655-1.026 8.325 2.489 10.666l96 56c2.49 1.452 5.57 1.452 8.06 0l96-56c2.509-1.42 4.061-4.08 4.061-6.963-0-2.883-1.551-5.543-4.061-6.963-2.509-1.42-5.589-1.379-8.06 .106Z")
            addPathData("M220 121.09l-92 53.65L36 121.09c-3.781-1.882-8.373-.502-10.489 3.154-2.116 3.655-1.026 8.325 2.489 10.666l96 56c2.49 1.452 5.57 1.452 8.06 0l96-56c2.509-1.42 4.061-4.08 4.061-6.963-0-2.883-1.551-5.543-4.061-6.963-2.509-1.42-5.589-1.379-8.06 .106Z")
            addPathData("M28 86.91l96 56c2.49 1.452 5.57 1.452 8.06 0l96-56c2.458-1.434 3.969-4.065 3.969-6.91 0-2.845-1.511-5.476-3.969-6.91l-96-56c-2.49-1.452-5.57-1.452-8.06 0L28 73.09C25.542 74.524 24.031 77.155 24.031 80c0 2.845 1.511 5.476 3.969 6.91Z")
        }
        return _stack!!
    }

private var _stack: ImageVector? = null
