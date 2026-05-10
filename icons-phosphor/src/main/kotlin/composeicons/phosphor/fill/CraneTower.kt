package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.addPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CraneTower: ImageVector
    get() {
        if (_craneTower != null) return _craneTower!!
        _craneTower = phosphorFillIcon(
            name = "CraneTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPathData("M127.73 208h-15.73v-44c0-2.209-1.791-4-4-4h-64c-2.209 0-4 1.791-4 4v44h-15.73c-4.291-.068-7.903 3.195-8.27 7.47-.147 2.212 .631 4.386 2.147 6.003 1.517 1.617 3.636 2.532 5.853 2.527h104c2.217 .005 4.336-.91 5.853-2.527 1.516-1.617 2.294-3.791 2.147-6.003-.367-4.275-3.979-7.538-8.27-7.47Z")
            addPathData("M239.73 80h-130.79L87.16 36.42C85.803 33.709 83.031 31.998 80 32h-32c-4.418 0-8 3.582-8 8v40h-15.73C19.979 79.932 16.367 83.195 16 87.47c-.147 2.212 .631 4.386 2.147 6.003C19.664 95.09 21.783 96.005 24 96h16v44c0 2.209 1.791 4 4 4h64c2.209 0 4-1.791 4-4v-44h96v88h-16v-7.73c.053-4.281-3.205-7.879-7.47-8.25-2.212-.147-4.386 .631-6.003 2.147-1.617 1.517-2.532 3.636-2.527 5.853v8c0 8.837 7.163 16 16 16h16c8.837 0 16-7.163 16-16v-88.02h16c2.217 .005 4.336-.91 5.853-2.527 1.516-1.617 2.294-3.791 2.147-6.003-.367-4.275-3.979-7.538-8.27-7.47ZM56 80v-32h19.06l16 32Z")
        }
        return _craneTower!!
    }

private var _craneTower: ImageVector? = null
