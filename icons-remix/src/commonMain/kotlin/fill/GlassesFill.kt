package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GlassesFill: ImageVector
    get() {
        if (_glassesFill != null) return _glassesFill!!
        _glassesFill = remixIcon(
            name = "GlassesFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 1.000 12.000 C 1.000 9.239 3.239 7.000 6.000 7.000 C 7.214 7.000 8.327 7.433 9.192 8.151 C 9.914 7.440 10.905 7.000 12.000 7.000 C 13.095 7.000 14.086 7.440 14.808 8.151 C 15.673 7.433 16.786 7.000 18.000 7.000 C 20.761 7.000 23.000 9.239 23.000 12.000 C 23.000 14.761 20.761 17.000 18.000 17.000 C 15.239 17.000 13.000 14.761 13.000 12.000 C 13.000 11.184 13.196 10.411 13.545 9.729 C 13.177 9.283 12.621 9.000 12.000 9.000 C 11.379 9.000 10.823 9.283 10.455 9.729 C 10.804 10.411 11.000 11.184 11.000 12.000 C 11.000 14.761 8.761 17.000 6.000 17.000 C 3.239 17.000 1.000 14.761 1.000 12.000 Z"),
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
        return _glassesFill!!
    }

private var _glassesFill: ImageVector? = null
