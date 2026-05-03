package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandLinkedin: ImageVector
    get() {
        if (_brandLinkedin != null) return _brandLinkedin!!
        _brandLinkedin = tablerFilledIcon(
            name = "BrandLinkedin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 2.000 C 19.761 2.000 22.000 4.239 22.000 7.000 L 22.000 17.000 C 22.000 19.761 19.761 22.000 17.000 22.000 L 7.000 22.000 C 4.239 22.000 2.000 19.761 2.000 17.000 L 2.000 7.000 C 2.000 4.239 4.239 2.000 7.000 2.000 ZM 8.000 10.000 C 7.448 10.000 7.000 10.448 7.000 11.000 L 7.000 16.000 C 7.000 16.552 7.448 17.000 8.000 17.000 C 8.552 17.000 9.000 16.552 9.000 16.000 L 9.000 11.000 C 9.000 10.448 8.552 10.000 8.000 10.000M 14.000 10.000 C 13.599 10.000 13.202 10.080 12.832 10.236 L 12.707 10.293 C 12.421 10.007 11.991 9.922 11.617 10.076 C 11.244 10.231 11.000 10.596 11.000 11.000 L 11.000 16.000 C 11.000 16.552 11.448 17.000 12.000 17.000 C 12.552 17.000 13.000 16.552 13.000 16.000 L 13.000 13.000 C 13.000 12.448 13.448 12.000 14.000 12.000 C 14.552 12.000 15.000 12.448 15.000 13.000 L 15.000 16.000 C 15.000 16.552 15.448 17.000 16.000 17.000 C 16.552 17.000 17.000 16.552 17.000 16.000 L 17.000 13.000 C 17.000 11.343 15.657 10.000 14.000 10.000M 8.000 7.000 C 7.493 7.000 7.066 7.380 7.007 7.883 L 7.000 8.010 C 7.001 8.539 7.413 8.976 7.941 9.007 C 8.470 9.038 8.931 8.652 8.993 8.127 L 9.000 8.000 C 9.000 7.448 8.552 7.000 8.000 7.000"),
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
        return _brandLinkedin!!
    }

private var _brandLinkedin: ImageVector? = null
