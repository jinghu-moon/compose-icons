package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LivePhotoOff: ImageVector
    get() {
        if (_livePhotoOff != null) return _livePhotoOff!!
        _livePhotoOff = tablerOutlineIcon(
            name = "LivePhotoOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.296 11.29c-.391 .39-.391 1.024-0 1.415 .39 .391 1.024 .391 1.415 0")
            addPathData("M8.473 8.456C7.202 9.718 6.703 11.564 7.165 13.295c.462 1.731 1.815 3.082 3.547 3.542 1.731 .46 3.577-.042 4.837-1.315M16.914 12.931c.307-1.619-.203-3.285-1.364-4.454C14.39 7.308 12.728 6.785 11.107 7.08")
            addPathData("M15.9 20.11v.01")
            addPathData("M19.04 17.61v.01")
            addPathData("M20.77 14v.01")
            addPathData("M20.77 10v.01")
            addPathData("M19.04 6.39v.01")
            addPathData("M15.9 3.89v.01")
            addPathData("M12 3v.01")
            addPathData("M8.1 3.89v.01")
            addPathData("M4.96 6.39v.01")
            addPathData("M3.23 10v.01")
            addPathData("M3.23 14v.01")
            addPathData("M4.96 17.61v.01")
            addPathData("M8.1 20.11v.01")
            addPathData("M12 21v.01")
            addPathData("M3 3 21 21")
        }
        return _livePhotoOff!!
    }

private var _livePhotoOff: ImageVector? = null
