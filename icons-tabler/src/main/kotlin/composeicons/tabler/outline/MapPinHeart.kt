package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapPinHeart: ImageVector
    get() {
        if (_mapPinHeart != null) return _mapPinHeart!!
        _mapPinHeart = tablerOutlineIcon(
            name = "MapPinHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 11C14.999 9.471 13.849 8.187 12.329 8.019 10.809 7.852 9.406 8.854 9.072 10.346c-.334 1.492 .508 2.997 1.955 3.493")
            addPathData("M11.76 21.47c-.444-.053-.857-.254-1.173-.57L6.343 16.657C3.777 14.091 3.26 10.118 5.084 6.98 6.907 3.843 10.615 2.326 14.115 3.285c3.5 .959 5.916 4.155 5.885 7.784")
            addPathData("M18 22l3.35-3.284c.415-.403 .65-.956 .651-1.534 .001-.578-.232-1.132-.646-1.537-.869-.85-2.257-.852-3.129-.006l-.224 .22-.223-.22c-.869-.849-2.256-.852-3.128-.006-.415 .403-.65 .956-.651 1.534-.001 .578 .232 1.133 .645 1.537L18 22")
        }
        return _mapPinHeart!!
    }

private var _mapPinHeart: ImageVector? = null
