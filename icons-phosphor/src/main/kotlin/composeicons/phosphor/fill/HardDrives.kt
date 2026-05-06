package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HardDrives: ImageVector
    get() {
        if (_hardDrives != null) return _hardDrives!!
        _hardDrives = phosphorFillIcon(
            name = "HardDrives",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPathData("M208 40h-160C39.163 40 32 47.163 32 56v48c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-48c0-8.837-7.163-16-16-16ZM180 92c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12Z")
            addPathData("M208 136h-160c-8.837 0-16 7.163-16 16v48c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-48c0-8.837-7.163-16-16-16ZM180 188c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12Z")
        }
        return _hardDrives!!
    }

private var _hardDrives: ImageVector? = null
