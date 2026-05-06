package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Helicopter: ImageVector
    get() {
        if (_helicopter != null) return _helicopter!!
        _helicopter = tablerFilledIcon(
            name = "Helicopter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 5c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-6v1c4.642 0 8 2.218 8 6 0 1.657-1.343 3-3 3h-3v1h3c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-8c-.552 0-1-.448-1-1 0-.552 .448-1 1-1h3v-1h-2C10.348 17 9 15.652 9 14v-1.001L3 13c-.379-0-.725-.214-.894-.553l-1-2C.879 9.957 1.083 9.375 1.567 9.133c.483-.242 1.071-.056 1.327 .42L3.618 11 9 10.999l.005-.175C9.098 9.238 10.411 8 12 8v-1h-7C4.448 7 4 6.552 4 6 4 5.448 4.448 5 5 5ZM16.001 10.174 16 12h3.36c-.665-.906-1.825-1.539-3.359-1.826"),
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
        return _helicopter!!
    }

private var _helicopter: ImageVector? = null
