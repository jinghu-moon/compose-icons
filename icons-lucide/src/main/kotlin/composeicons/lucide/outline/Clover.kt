package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Clover: ImageVector
    get() {
        if (_clover != null) return _clover!!
        _clover = lucideOutlineIcon(
            name = "Clover",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16.17 7.83 2 22")
            addPathData("M4.02 12C3.222 11.333 2.854 10.282 3.063 9.264 3.272 8.245 4.023 7.423 5.018 7.123c.996-.299 2.076-.028 2.812 .707C7.095 7.094 6.824 6.014 7.123 5.018 7.423 4.023 8.245 3.272 9.264 3.063c1.019-.209 2.07 .159 2.736 .957 .667-.798 1.718-1.166 2.736-.957 1.019 .209 1.841 .96 2.14 1.955 .299 .996 .028 2.076-.707 2.812 .736-.735 1.816-1.006 2.812-.707 .996 .299 1.747 1.121 1.955 2.14 .209 1.019-.159 2.07-.957 2.736 .798 .667 1.166 1.718 .957 2.736-.209 1.019-.96 1.841-1.955 2.14-.996 .299-2.076 .028-2.812-.707 .735 .736 1.006 1.816 .707 2.812-.299 .996-1.121 1.747-2.14 1.955-1.019 .209-2.07-.159-2.736-.957-.667 .798-1.718 1.166-2.736 .957C8.245 20.728 7.423 19.977 7.123 18.982c-.299-.996-.028-2.076 .707-2.812-1.152 1.058-2.942 .982-4-.17C2.772 14.848 2.848 13.058 4 12")
            addPathData("M7.83 7.83l8.34 8.34")
        }
        return _clover!!
    }

private var _clover: ImageVector? = null
