package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.GardenCart: ImageVector
    get() {
        if (_gardenCart != null) return _gardenCart!!
        _gardenCart = tablerFilledIcon(
            name = "GardenCart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.324 3c.817 .001 1.552 .499 1.855 1.258L6.276 7h14.724c.326 0 .632 .159 .819 .426 .187 .267 .232 .608 .121 .915l-.046 .106-2.934 5.871c1.581 .726 2.389 2.502 1.897 4.171-.492 1.669-2.135 2.722-3.857 2.474C15.279 20.715 14.001 19.24 14 17.5l.005-.192c.031-.572 .203-1.128 .499-1.618l-2.446-.258L8.612 20.182c-.477 .65-1.296 .95-2.08 .762l-.154-.044C5.556 20.631 5 19.865 5 19v-9.804L3.321 5h-1.321C1.493 5 1.066 4.62 1.007 4.117L1 4C1 3.448 1.448 3 2 3ZM17.5 16C16.672 16 16 16.672 16 17.5c0 .828 .672 1.5 1.5 1.5C18.328 19 19 18.328 19 17.5 19 16.672 18.328 16 17.5 16M7 13.502 6.998 19 9.781 15.167C8.779 14.955 7.867 14.44 7.167 13.693Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _gardenCart!!
    }

private var _gardenCart: ImageVector? = null
