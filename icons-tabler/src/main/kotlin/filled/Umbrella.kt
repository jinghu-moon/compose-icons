package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Umbrella: ImageVector
    get() {
        if (_umbrella != null) return _umbrella!!
        _umbrella = tablerFilledIcon(
            name = "Umbrella",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 3.000 C 16.971 3.000 21.000 7.029 21.000 12.000 C 21.000 12.507 20.620 12.934 20.117 12.993 L 20.000 13.000 L 13.000 13.000 L 13.000 18.000 C 13.001 18.529 13.413 18.966 13.941 18.997 C 14.470 19.028 14.931 18.642 14.993 18.117 L 15.000 18.000 C 15.000 17.448 15.448 17.000 16.000 17.000 C 16.552 17.000 17.000 17.448 17.000 18.000 C 17.002 19.624 15.711 20.954 14.088 21.002 C 12.465 21.049 11.099 19.797 11.005 18.176 L 11.000 18.000 L 11.000 13.000 L 4.000 13.000 C 3.493 13.000 3.066 12.620 3.007 12.117 L 3.000 12.000 C 3.000 7.029 7.029 3.000 12.000 3.000 Z"),
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
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
