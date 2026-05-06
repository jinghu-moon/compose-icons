package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayerSkipForward: ImageVector
    get() {
        if (_playerSkipForward != null) return _playerSkipForward!!
        _playerSkipForward = tablerFilledIcon(
            name = "PlayerSkipForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 5v14c-0 .358 .191 .689 .502 .867 .311 .178 .693 .177 1.002-.003l12-7c.307-.179 .497-.508 .497-.864 0-.356-.189-.685-.497-.864L4.504 4.136C4.195 3.955 3.812 3.954 3.502 4.133 3.191 4.311 3 4.642 3 5Z")
            addPathData("M20 4c.507 0 .934 .38 .993 .883L21 5v14c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L19 19v-14c0-.552 .448-1 1-1Z")
        }
        return _playerSkipForward!!
    }

private var _playerSkipForward: ImageVector? = null
