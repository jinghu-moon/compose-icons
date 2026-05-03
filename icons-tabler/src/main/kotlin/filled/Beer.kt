package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Beer: ImageVector
    get() {
        if (_beer != null) return _beer!!
        _beer = tablerFilledIcon(
            name = "Beer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 2.000 C 18.047 2.000 18.917 2.806 18.995 3.850 L 19.000 4.000 L 19.000 8.000 C 19.000 9.335 18.771 10.386 18.226 11.692 L 18.069 12.055 L 17.759 12.756 C 17.307 13.780 17.052 14.880 17.008 15.998 L 17.000 16.375 L 17.000 20.000 C 17.000 21.047 16.194 21.917 15.150 21.995 L 15.000 22.000 L 9.000 22.000 C 7.953 22.000 7.083 21.194 7.005 20.150 L 7.000 20.000 L 7.000 16.375 C 7.000 15.243 6.790 14.125 6.383 13.095 L 6.241 12.755 L 5.931 12.056 C 5.327 10.698 5.048 9.646 5.006 8.358 L 5.000 8.000 L 5.000 4.000 C 5.000 2.953 5.806 2.083 6.850 2.005 L 7.000 2.000 L 17.000 2.000 ZM 17.000 4.000 L 7.000 4.000 L 7.000 7.000 L 17.000 7.000 L 17.000 4.000 Z"),
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
        return _beer!!
    }

private var _beer: ImageVector? = null
