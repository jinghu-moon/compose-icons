package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Paintbrush: ImageVector
    get() {
        if (_paintbrush != null) return _paintbrush!!
        _paintbrush = lucideOutlineIcon(
            name = "Paintbrush",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.622 17.897 3.942 14.984")
            addPathData("M18.376 2.622c.829-.829 2.173-.829 3.002 0 .829 .829 .829 2.173 0 3.002L17.36 9.643c-.195 .195-.195 .512 0 .707l.944 .944c.941 .941 .941 2.467 0 3.408l-.944 .944c-.195 .195-.512 .195-.707 0L8.354 7.348c-.195-.195-.195-.512 0-.707l.944-.944c.941-.941 2.467-.941 3.408 0l.944 .944c.195 .195 .512 .195 .707 0Z")
            addPathData("M9 8C7.196 10.71 5.03 11.46 2.417 11.948c-.176 .032-.323 .155-.385 .323-.062 .168-.031 .357 .083 .496l7.32 8.883c.305 .324 .789 .408 1.185 .204C12.735 20.405 16 16.792 16 15")
        }
        return _paintbrush!!
    }

private var _paintbrush: ImageVector? = null
