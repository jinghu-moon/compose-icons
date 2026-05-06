package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ThumbDown: ImageVector
    get() {
        if (_thumbDown != null) return _thumbDown!!
        _thumbDown = tablerFilledIcon(
            name = "ThumbDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 21.008c1.588 0 2.901-1.238 2.995-2.823L16 18.008v-4h2c1.522 0 2.802-1.139 2.98-2.65l.015-.173L21 11.008l-.02-.196L19.974 5.78C19.593 4.155 18.472 2.984 17.164 3L17 3.008h-8c-.507 0-.934 .38-.993 .884L8 4.008l.001 9.536c0 .357 .191 .687 .5 .866 .866 .5 1.425 1.399 1.492 2.396l.007 .202v1c0 1.657 1.343 3 3 3Z")
            addPathData("M5 14.008c.507-0 .934-.38 .993-.883L6 13.008v-9C6 3.501 5.62 3.074 5.117 3.015L5 3.008h-1C2.953 3.008 2.083 3.816 2.005 4.86L2 5.01v7c0 1.046 .807 1.916 1.85 1.994L4 14.009h1Z")
        }
        return _thumbDown!!
    }

private var _thumbDown: ImageVector? = null
