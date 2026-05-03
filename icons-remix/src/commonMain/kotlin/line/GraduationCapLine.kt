package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GraduationCapLine: ImageVector
    get() {
        if (_graduationCapLine != null) return _graduationCapLine!!
        _graduationCapLine = remixIcon(
            name = "GraduationCapLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 11.333 L 0.000 9.000 L 12.000 2.000 L 24.000 9.000 L 24.000 17.500 L 22.000 17.500 L 22.000 10.167 L 20.000 11.333 L 20.000 18.011 L 19.777 18.286 C 17.946 20.550 15.142 22.000 12.000 22.000 C 8.858 22.000 6.054 20.550 4.223 18.286 L 4.000 18.011 L 4.000 11.333 ZM 6.000 12.500 L 6.000 17.292 C 7.467 18.954 9.611 20.000 12.000 20.000 C 14.389 20.000 16.533 18.954 18.000 17.292 L 18.000 12.500 L 12.000 16.000 L 6.000 12.500 ZM 3.969 9.000 L 12.000 13.685 L 20.031 9.000 L 12.000 4.315 L 3.969 9.000 Z"),
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
        return _graduationCapLine!!
    }

private var _graduationCapLine: ImageVector? = null
