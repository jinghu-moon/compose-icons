package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Directions: ImageVector
    get() {
        if (_directions != null) return _directions!!
        _directions = tablerFilledIcon(
            name = "Directions",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 22.000 C 9.448 22.000 9.000 21.552 9.000 21.000 C 9.000 20.448 9.448 20.000 10.000 20.000 L 11.000 20.000 L 11.000 17.999 L 6.000 18.000 C 5.735 18.000 5.480 17.895 5.293 17.707 L 3.293 15.707 C 2.903 15.316 2.903 14.684 3.293 14.293 L 5.293 12.293 C 5.480 12.105 5.735 12.000 6.000 12.000 L 11.000 11.999 L 11.000 10.000 L 8.000 10.000 C 7.448 10.000 7.000 9.552 7.000 9.000 L 7.000 5.000 C 7.000 4.448 7.448 4.000 8.000 4.000 L 11.000 4.000 L 11.000 3.000 C 11.000 2.448 11.448 2.000 12.000 2.000 C 12.552 2.000 13.000 2.448 13.000 3.000 L 13.000 4.000 L 19.000 4.000 C 19.265 4.000 19.520 4.105 19.707 4.293 L 21.707 6.293 C 22.097 6.683 22.097 7.317 21.707 7.707 L 19.707 9.707 C 19.520 9.895 19.265 10.000 19.000 10.000 L 13.000 10.000 L 13.000 11.999 L 14.000 12.000 C 14.552 12.000 15.000 12.448 15.000 13.000 L 15.000 17.000 C 15.000 17.552 14.552 18.000 14.000 18.000 L 13.000 17.999 L 13.000 20.000 L 14.000 20.000 C 14.552 20.000 15.000 20.448 15.000 21.000 C 15.000 21.552 14.552 22.000 14.000 22.000 Z"),
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
        return _directions!!
    }

private var _directions: ImageVector? = null
