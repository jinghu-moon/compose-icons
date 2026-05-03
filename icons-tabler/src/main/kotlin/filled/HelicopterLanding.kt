package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HelicopterLanding: ImageVector
    get() {
        if (_helicopterLanding != null) return _helicopterLanding!!
        _helicopterLanding = tablerFilledIcon(
            name = "HelicopterLanding",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 2.000 C 20.657 2.000 22.000 3.343 22.000 5.000 L 22.000 19.000 C 22.000 20.657 20.657 22.000 19.000 22.000 L 5.000 22.000 C 3.343 22.000 2.000 20.657 2.000 19.000 L 2.000 5.000 C 2.000 3.343 3.343 2.000 5.000 2.000 ZM 15.000 7.000 C 14.448 7.000 14.000 7.448 14.000 8.000 L 14.000 11.000 L 10.000 11.000 L 10.000 8.000 C 10.000 7.493 9.620 7.066 9.117 7.007 L 9.000 7.000 C 8.448 7.000 8.000 7.448 8.000 8.000 L 8.000 16.000 C 8.000 16.552 8.448 17.000 9.000 17.000 C 9.552 17.000 10.000 16.552 10.000 16.000 L 10.000 13.000 L 14.000 13.000 L 14.000 16.000 C 14.000 16.507 14.380 16.934 14.883 16.993 L 15.000 17.000 C 15.552 17.000 16.000 16.552 16.000 16.000 L 16.000 8.000 C 16.000 7.448 15.552 7.000 15.000 7.000"),
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
        return _helicopterLanding!!
    }

private var _helicopterLanding: ImageVector? = null
