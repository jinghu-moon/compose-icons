package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Loader4Line: ImageVector
    get() {
        if (_loader4Line != null) return _loader4Line!!
        _loader4Line = remixIcon(
            name = "Loader4Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.364 5.636 L 16.950 7.050 C 15.683 5.784 13.933 5.000 12.000 5.000 C 8.134 5.000 5.000 8.134 5.000 12.000 C 5.000 15.866 8.134 19.000 12.000 19.000 C 15.866 19.000 19.000 15.866 19.000 12.000 L 21.000 12.000 C 21.000 16.971 16.971 21.000 12.000 21.000 C 7.029 21.000 3.000 16.971 3.000 12.000 C 3.000 7.029 7.029 3.000 12.000 3.000 C 14.485 3.000 16.735 4.007 18.364 5.636 Z"),
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
        return _loader4Line!!
    }

private var _loader4Line: ImageVector? = null
