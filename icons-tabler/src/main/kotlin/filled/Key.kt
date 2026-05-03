package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Key: ImageVector
    get() {
        if (_key != null) return _key!!
        _key = tablerFilledIcon(
            name = "Key",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.520 2.000 C 15.549 2.000 16.535 2.409 17.262 3.136 L 20.864 6.738 C 21.591 7.465 22.000 8.451 22.000 9.479 C 22.000 10.508 21.591 11.494 20.864 12.221 L 18.221 14.864 C 16.898 16.186 14.821 16.376 13.280 15.316 L 13.175 15.238 L 7.293 21.121 C 6.838 21.575 6.249 21.870 5.613 21.964 L 5.393 21.991 L 5.172 22.000 L 4.000 22.000 C 2.986 22.000 2.133 21.241 2.009 20.177 L 2.000 20.000 L 2.000 18.828 C 2.000 18.124 2.248 17.442 2.730 16.868 L 2.879 16.707 L 3.293 16.293 C 3.480 16.105 3.735 16.000 4.000 16.000 L 5.000 16.000 L 5.000 15.000 C 5.000 14.493 5.380 14.066 5.883 14.007 L 6.000 14.000 L 7.000 14.000 L 7.000 13.000 C 7.000 12.780 7.072 12.567 7.206 12.392 L 7.293 12.292 L 8.761 10.823 L 8.685 10.720 C 8.286 10.139 8.051 9.461 8.007 8.757 L 8.000 8.521 C 8.000 7.492 8.409 6.506 9.136 5.779 L 11.779 3.136 C 12.506 2.409 13.492 2.001 14.520 2.000M 15.015 7.000 L 14.995 7.000 C 13.890 7.000 12.995 7.895 12.995 9.000 C 12.995 10.105 13.890 11.000 14.995 11.000 L 15.015 11.000 C 16.120 11.000 17.015 10.105 17.015 9.000 C 17.015 7.895 16.120 7.000 15.015 7.000"),
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
        return _key!!
    }

private var _key: ImageVector? = null
