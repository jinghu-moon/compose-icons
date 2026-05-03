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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.949 3.684 L 17.053 7.000 L 19.000 7.000 C 19.879 7.000 20.714 7.385 21.284 8.055 C 21.854 8.724 22.102 9.609 21.962 10.477 L 20.710 17.608 C 20.410 19.560 18.731 21.000 16.756 21.000 L 7.244 21.000 C 5.277 21.002 3.601 19.572 3.294 17.629 L 2.036 10.456 C 1.903 9.591 2.154 8.711 2.724 8.047 C 3.294 7.383 4.125 7.000 5.000 7.000 L 6.945 7.000 L 8.050 3.684 C 8.225 3.160 8.791 2.876 9.315 3.051 C 9.839 3.226 10.123 3.792 9.948 4.316 L 9.053 7.000 L 14.946 7.000 L 14.051 4.316 C 13.876 3.792 14.160 3.226 14.684 3.051 C 15.208 2.876 15.774 3.160 15.949 3.684M 12.000 11.000 C 10.411 11.000 9.098 12.238 9.005 13.824 L 9.000 14.000 C 9.000 15.657 10.343 17.000 12.000 17.000 C 13.657 17.000 15.000 15.657 15.000 14.000 C 15.000 12.343 13.657 11.000 12.000 11.000"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _basket!!
    }

private var _basket: ImageVector? = null
