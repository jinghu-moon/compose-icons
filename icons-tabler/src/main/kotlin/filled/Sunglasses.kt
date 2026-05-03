package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Sunglasses: ImageVector
    get() {
        if (_sunglasses != null) return _sunglasses!!
        _sunglasses = tablerFilledIcon(
            name = "Sunglasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.000 3.000 C 8.552 3.000 9.000 3.448 9.000 4.000 C 9.000 4.552 8.552 5.000 8.000 5.000 L 6.743 5.000 L 4.343 13.000 L 10.000 13.000 C 10.552 13.000 11.000 13.448 11.000 14.000 L 11.000 15.000 L 13.000 15.000 L 13.000 14.000 C 13.000 13.448 13.448 13.000 14.000 13.000 L 19.656 13.000 L 17.256 5.000 L 16.000 5.000 C 15.493 5.000 15.066 4.620 15.007 4.117 L 15.000 4.000 C 15.000 3.448 15.448 3.000 16.000 3.000 L 18.000 3.000 C 18.442 3.000 18.831 3.290 18.958 3.713 L 21.968 13.749 L 21.990 13.861 L 21.998 13.941 L 22.000 16.500 C 21.999 18.888 20.134 20.859 17.750 20.992 C 15.367 21.125 13.294 19.373 13.028 17.000 L 10.972 17.000 C 10.706 19.373 8.633 21.125 6.250 20.992 C 3.866 20.859 2.001 18.888 2.000 16.500 L 2.000 13.982 L 2.004 13.911 L 2.018 13.808 L 2.036 13.732 L 5.042 3.712 C 5.169 3.289 5.559 3.000 6.000 3.000 Z"),
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
        return _sunglasses!!
    }

private var _sunglasses: ImageVector? = null
