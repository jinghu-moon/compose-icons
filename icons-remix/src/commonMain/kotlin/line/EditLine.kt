package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.EditLine: ImageVector
    get() {
        if (_editLine != null) return _editLine!!
        _editLine = remixIcon(
            name = "EditLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.414 15.890 L 16.556 5.748 L 15.142 4.334 L 5.000 14.476 L 5.000 15.890 L 6.414 15.890 ZM 7.243 17.890 L 3.000 17.890 L 3.000 13.647 L 14.435 2.212 C 14.826 1.822 15.459 1.822 15.849 2.212 L 18.678 5.041 C 19.068 5.431 19.068 6.064 18.678 6.455 L 7.243 17.890 ZM 3.000 19.890 L 21.000 19.890 L 21.000 21.890 L 3.000 21.890 L 3.000 19.890 Z"),
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
        return _editLine!!
    }

private var _editLine: ImageVector? = null
