package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.addPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MusicNotesMinus: ImageVector
    get() {
        if (_musicNotesMinus != null) return _musicNotesMinus!!
        _musicNotesMinus = phosphorFillIcon(
            name = "MusicNotesMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPathData("M224 40h-48c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h48c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z")
            addPathData("M162.13 76.5C147.577 69.654 140.497 52.961 145.69 37.74c.48-1.378 .171-2.907-.805-3.992-.976-1.084-2.465-1.551-3.885-1.218L78.06 48.25C74.503 49.139 72.005 52.333 72 56v110.1c-12.864-8.623-29.8-8.053-42.055 1.415-12.255 9.468-17.081 25.713-11.985 40.336 5.097 14.624 18.975 24.349 34.46 24.149C72.25 231.77 88 215.13 88 195.3v-93.05L161.26 83.94c1.619-.4 2.819-1.762 3.013-3.419 .194-1.656-.66-3.259-2.143-4.021Z")
            addPathData("M212 80h-8c-2.209 0-4 1.791-4 4v50.1c-12.864-8.623-29.8-8.053-42.055 1.415-12.255 9.468-17.081 25.713-11.985 40.336 5.097 14.624 18.975 24.349 34.46 24.149C200.25 199.77 216 183.14 216 163.3v-79.3c0-2.209-1.791-4-4-4Z")
        }
        return _musicNotesMinus!!
    }

private var _musicNotesMinus: ImageVector? = null
