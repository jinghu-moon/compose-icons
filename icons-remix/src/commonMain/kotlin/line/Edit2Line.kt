package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Edit2Line: ImageVector
    get() {
        if (_edit2Line != null) return _edit2Line!!
        _edit2Line = remixIcon(
            name = "Edit2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.000 18.890 L 6.414 18.890 L 15.728 9.576 L 14.314 8.162 L 5.000 17.476 L 5.000 18.890 ZM 21.000 20.890 L 3.000 20.890 L 3.000 16.647 L 16.435 3.212 C 16.826 2.822 17.459 2.822 17.849 3.212 L 20.678 6.041 C 21.068 6.431 21.068 7.064 20.678 7.455 L 9.243 18.890 L 21.000 18.890 L 21.000 20.890 ZM 15.728 6.748 L 17.142 8.162 L 18.556 6.748 L 17.142 5.334 L 15.728 6.748 Z"),
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
        return _edit2Line!!
    }

private var _edit2Line: ImageVector? = null
