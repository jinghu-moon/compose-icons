package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Speedboat: ImageVector
    get() {
        if (_speedboat != null) return _speedboat!!
        _speedboat = tablerFilledIcon(
            name = "Speedboat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 7c.334-0 .646 .167 .832 .445L16.534 10h5.466c.369-0 .708 .203 .882 .528 .174 .325 .155 .719-.049 1.026l-3.1 4.66c-.742 1.116-1.993 1.787-3.333 1.786h-14.4c-.328-0-.635-.161-.822-.431-.187-.27-.229-.613-.114-.92l1.5-4c.146-.39 .519-.649 .936-.649h1.756L6.156 9h-.156C5.493 9 5.066 8.62 5.007 8.117L5 8C5 7.448 5.448 7 6 7ZM7.343 12h1.887c.383 0 .762-.074 1.12-.219l3.557-1.418q.186-.075 .377-.135L13.464 9h-5.22Z"),
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
        return _speedboat!!
    }

private var _speedboat: ImageVector? = null
