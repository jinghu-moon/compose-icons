package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Basket: ImageVector
    get() {
        if (_basket != null) return _basket!!
        _basket = tablerFilledIcon(
            name = "Basket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.949 3.684 17.053 7h1.947c.879-0 1.714 .385 2.284 1.055 .57 .669 .818 1.555 .678 2.422l-1.252 7.131c-.3 1.952-1.979 3.392-3.954 3.392h-9.512C5.277 21.002 3.601 19.572 3.294 17.629L2.036 10.456C1.903 9.591 2.154 8.711 2.724 8.047 3.294 7.383 4.125 7 5 7h1.945L8.05 3.684c.175-.524 .741-.808 1.265-.633 .524 .175 .808 .741 .633 1.265L9.053 7h5.893L14.051 4.316c-.175-.524 .109-1.09 .633-1.265 .524-.175 1.09 .109 1.265 .633M12 11c-1.589-0-2.902 1.238-2.995 2.824L9 14c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3"),
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
        return _basket!!
    }

private var _basket: ImageVector? = null
