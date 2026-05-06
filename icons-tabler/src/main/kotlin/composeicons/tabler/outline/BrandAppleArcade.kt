package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAppleArcade: ImageVector
    get() {
        if (_brandAppleArcade != null) return _brandAppleArcade!!
        _brandAppleArcade = tablerOutlineIcon(
            name = "BrandAppleArcade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 5c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C14 3.895 13.105 3 12 3c-1.105 0-2 .895-2 2")
            addPathData("M20 12.5v4.75c.007 .111-.012 .222-.055 .325-.067 .161-.191 .291-.348 .366l-5.462 2.58c-1.352 .638-2.918 .638-4.27 0L4.403 17.941c-.264-.125-.423-.4-.401-.691v-4.75")
            addPathData("M4.431 12.216 10.065 9.884c1.239-.512 2.631-.512 3.87 0l5.634 2.332c.255 .104 .424 .35 .43 .625 .006 .275-.152 .528-.402 .644l-5.462 2.543c-1.354 .629-2.916 .629-4.27 0L4.403 13.485c-.252-.114-.411-.368-.405-.644 .006-.276 .176-.523 .433-.626")
            addPathData("M12 7v6")
        }
        return _brandAppleArcade!!
    }

private var _brandAppleArcade: ImageVector? = null
