package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GlassesLine: ImageVector
    get() {
        if (_glassesLine != null) return _glassesLine!!
        _glassesLine = remixIcon(
            name = "GlassesLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.000 9.000 C 4.343 9.000 3.000 10.343 3.000 12.000 C 3.000 13.657 4.343 15.000 6.000 15.000 C 7.657 15.000 9.000 13.657 9.000 12.000 C 9.000 11.363 8.802 10.775 8.465 10.290 C 7.922 9.508 7.020 9.000 6.000 9.000 ZM 1.000 12.000 C 1.000 9.239 3.239 7.000 6.000 7.000 C 7.214 7.000 8.327 7.433 9.192 8.151 C 9.914 7.440 10.905 7.000 12.000 7.000 C 13.095 7.000 14.086 7.440 14.808 8.151 C 15.673 7.433 16.786 7.000 18.000 7.000 C 20.761 7.000 23.000 9.239 23.000 12.000 C 23.000 14.761 20.761 17.000 18.000 17.000 C 15.239 17.000 13.000 14.761 13.000 12.000 C 13.000 11.184 13.196 10.411 13.545 9.729 C 13.177 9.283 12.621 9.000 12.000 9.000 C 11.379 9.000 10.823 9.283 10.455 9.729 C 10.804 10.411 11.000 11.184 11.000 12.000 C 11.000 14.761 8.761 17.000 6.000 17.000 C 3.239 17.000 1.000 14.761 1.000 12.000 ZM 18.000 9.000 C 16.980 9.000 16.078 9.508 15.535 10.290 C 15.198 10.775 15.000 11.363 15.000 12.000 C 15.000 13.657 16.343 15.000 18.000 15.000 C 19.657 15.000 21.000 13.657 21.000 12.000 C 21.000 10.343 19.657 9.000 18.000 9.000 Z"),
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
        return _glassesLine!!
    }

private var _glassesLine: ImageVector? = null
