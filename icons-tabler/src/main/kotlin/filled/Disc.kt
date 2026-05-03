package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Disc: ImageVector
    get() {
        if (_disc != null) return _disc!!
        _disc = tablerFilledIcon(
            name = "Disc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 3.340 C 21.203 5.766 23.057 10.860 21.397 15.421 C 19.737 19.981 15.043 22.691 10.263 21.848 C 5.484 21.006 2.000 16.853 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340M 17.000 11.000 C 16.448 11.000 16.000 11.448 16.000 12.000 C 16.000 14.209 14.209 16.000 12.000 16.000 C 11.448 16.000 11.000 16.448 11.000 17.000 C 11.000 17.552 11.448 18.000 12.000 18.000 C 15.314 18.000 18.000 15.314 18.000 12.000 C 18.000 11.448 17.552 11.000 17.000 11.000M 12.000 10.000 C 10.953 10.000 10.083 10.806 10.005 11.850 L 10.000 12.000 C 10.000 13.105 10.895 14.000 12.000 14.000 C 13.105 14.000 14.000 13.105 14.000 12.000 C 14.000 10.895 13.105 10.000 12.000 10.000M 12.000 6.000 C 8.686 6.000 6.000 8.686 6.000 12.000 C 6.000 12.552 6.448 13.000 7.000 13.000 C 7.552 13.000 8.000 12.552 8.000 12.000 C 8.000 9.791 9.791 8.000 12.000 8.000 C 12.552 8.000 13.000 7.552 13.000 7.000 C 13.000 6.448 12.552 6.000 12.000 6.000"),
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
        return _disc!!
    }

private var _disc: ImageVector? = null
