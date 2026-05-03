package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Explicit: ImageVector
    get() {
        if (_explicit != null) return _explicit!!
        _explicit = tablerFilledIcon(
            name = "Explicit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 3.000 C 20.105 3.000 21.000 3.895 21.000 5.000 L 21.000 19.000 C 21.000 20.105 20.105 21.000 19.000 21.000 L 5.000 21.000 C 3.895 21.000 3.000 20.105 3.000 19.000 L 3.000 5.000 C 3.000 3.895 3.895 3.000 5.000 3.000 ZM 14.000 7.000 L 10.000 7.000 C 9.448 7.000 9.000 7.448 9.000 8.000 L 9.000 16.000 C 9.000 16.552 9.448 17.000 10.000 17.000 L 14.000 17.000 C 14.552 17.000 15.000 16.552 15.000 16.000 L 14.993 15.883 C 14.934 15.380 14.507 15.000 14.000 15.000 L 11.000 15.000 L 11.000 13.000 L 14.000 13.000 C 14.552 13.000 15.000 12.552 15.000 12.000 C 15.000 11.448 14.552 11.000 14.000 11.000 L 11.000 11.000 L 11.000 9.000 L 14.000 9.000 C 14.552 9.000 15.000 8.552 15.000 8.000 C 15.000 7.448 14.552 7.000 14.000 7.000"),
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
        return _explicit!!
    }

private var _explicit: ImageVector? = null
