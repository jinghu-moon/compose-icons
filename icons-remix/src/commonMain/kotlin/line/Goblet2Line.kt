package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Goblet2Line: ImageVector
    get() {
        if (_goblet2Line != null) return _goblet2Line!!
        _goblet2Line = remixIcon(
            name = "Goblet2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.133 2.000 L 5.011 9.859 C 4.708 11.973 5.532 13.789 6.891 15.047 C 7.996 16.069 9.459 16.732 11.000 16.934 L 11.000 20.000 L 6.000 20.000 L 6.000 22.000 L 18.000 22.000 L 18.000 20.000 L 13.000 20.000 L 13.000 16.934 C 14.542 16.732 16.005 16.069 17.110 15.047 C 18.469 13.789 19.292 11.973 18.990 9.859 L 17.868 2.000 L 6.133 2.000 ZM 6.990 10.141 L 7.868 4.000 L 16.133 4.000 L 17.010 10.141 C 17.208 11.527 16.689 12.711 15.751 13.578 C 14.797 14.462 13.418 15.000 12.000 15.000 C 10.583 15.000 9.204 14.462 8.249 13.578 C 7.312 12.711 6.792 11.527 6.990 10.141 Z"),
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
        return _goblet2Line!!
    }

private var _goblet2Line: ImageVector? = null
