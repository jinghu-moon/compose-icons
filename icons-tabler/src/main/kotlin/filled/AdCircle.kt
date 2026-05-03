package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AdCircle: ImageVector
    get() {
        if (_adCircle != null) return _adCircle!!
        _adCircle = tablerFilledIcon(
            name = "AdCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.570 22.000 2.152 17.673 2.004 12.280 L 2.000 12.000 L 2.004 11.720 C 2.152 6.327 6.570 2.000 12.000 2.000 ZM 8.500 8.000 C 7.183 8.000 6.091 9.022 6.005 10.336 L 6.000 10.500 L 6.000 15.000 L 6.007 15.117 C 6.067 15.620 6.493 15.999 7.000 15.999 C 7.507 15.999 7.933 15.620 7.993 15.117 L 8.000 15.000 L 8.000 14.000 L 9.000 14.000 L 9.000 15.000 L 9.007 15.117 C 9.067 15.620 9.493 15.999 10.000 15.999 C 10.507 15.999 10.933 15.620 10.993 15.117 L 11.000 15.000 L 11.000 10.500 L 10.995 10.336 C 10.909 9.022 9.817 8.000 8.500 8.000 ZM 15.000 8.000 L 14.000 8.000 C 13.448 8.000 13.000 8.448 13.000 9.000 L 13.000 15.000 C 13.000 15.552 13.448 16.000 14.000 16.000 L 15.000 16.000 C 16.657 16.000 18.000 14.657 18.000 13.000 L 18.000 11.000 C 18.000 9.343 16.657 8.000 15.000 8.000 ZM 15.000 10.000 C 15.552 10.000 16.000 10.448 16.000 11.000 L 16.000 13.000 C 16.000 13.507 15.620 13.934 15.117 13.993 L 15.000 14.000 L 15.000 10.000 ZM 8.500 10.000 C 8.741 10.000 8.949 10.172 8.992 10.410 L 9.000 10.500 L 9.000 12.000 L 8.000 12.000 L 8.000 10.500 L 8.008 10.410 C 8.051 10.172 8.259 10.000 8.500 10.000 Z"),
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
        return _adCircle!!
    }

private var _adCircle: ImageVector? = null
