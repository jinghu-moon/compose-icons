package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Engine: ImageVector
    get() {
        if (_engine != null) return _engine!!
        _engine = tablerFilledIcon(
            name = "Engine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 4.000 C 14.552 4.000 15.000 4.448 15.000 5.000 C 15.000 5.552 14.552 6.000 14.000 6.000 L 13.000 6.000 L 13.000 7.000 L 13.383 7.000 C 14.140 7.001 14.832 7.429 15.170 8.106 L 16.620 11.000 L 17.000 11.000 L 17.000 10.000 C 17.000 9.493 17.380 9.066 17.883 9.007 L 18.000 9.000 L 20.000 9.000 C 21.105 9.000 22.000 9.895 22.000 11.000 L 22.000 17.000 C 22.000 18.105 21.105 19.000 20.000 19.000 L 18.000 19.000 C 17.448 19.000 17.000 18.552 17.000 18.000 L 17.000 17.000 L 16.000 17.000 L 16.000 18.000 C 16.000 19.047 15.194 19.917 14.150 19.995 L 14.000 20.000 L 10.535 20.000 C 9.866 20.000 9.242 19.666 8.871 19.110 L 7.464 17.000 L 6.000 17.000 C 5.493 17.000 5.066 16.620 5.007 16.117 L 5.000 16.000 L 5.000 14.000 L 4.000 14.000 L 4.000 16.000 C 4.000 16.552 3.552 17.000 3.000 17.000 C 2.448 17.000 2.000 16.552 2.000 16.000 L 2.000 10.000 C 2.000 9.448 2.448 9.000 3.000 9.000 C 3.552 9.000 4.000 9.448 4.000 10.000 L 4.000 12.000 L 5.000 12.000 L 5.000 10.000 C 5.000 9.448 5.448 9.000 6.000 9.000 L 7.584 9.000 L 9.293 7.293 C 9.449 7.138 9.651 7.038 9.869 7.009 L 10.000 7.000 L 11.000 7.000 L 11.000 6.000 L 10.000 6.000 C 9.448 6.000 9.000 5.552 9.000 5.000 C 9.000 4.448 9.448 4.000 10.000 4.000 Z"),
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
        return _engine!!
    }

private var _engine: ImageVector? = null
