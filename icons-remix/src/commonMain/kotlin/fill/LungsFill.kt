package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LungsFill: ImageVector
    get() {
        if (_lungsFill != null) return _lungsFill!!
        _lungsFill = remixIcon(
            name = "LungsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.500 5.500 C 9.912 5.971 10.548 7.659 10.827 9.523 L 6.304 12.134 L 7.304 13.866 L 11.014 11.725 C 11.060 13.079 11.000 14.309 11.000 15.000 C 11.000 18.000 10.000 21.000 6.000 21.000 C 2.000 21.000 2.000 21.000 2.000 17.000 C 2.000 9.500 5.501 4.500 8.500 5.500 ZM 22.001 17.000 L 22.001 17.436 C 21.996 21.000 21.850 21.000 18.001 21.000 C 14.001 21.000 13.001 18.000 13.001 15.000 C 13.001 14.309 12.941 13.080 12.987 11.726 L 16.696 13.866 L 17.696 12.134 L 13.174 9.524 C 13.453 7.659 14.089 5.971 15.501 5.500 C 18.501 4.500 22.001 9.500 22.001 17.000 ZM 13.000 2.000 L 13.000 11.000 L 11.000 11.000 L 11.000 2.000 L 13.000 2.000 Z"),
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
        return _lungsFill!!
    }

private var _lungsFill: ImageVector? = null
