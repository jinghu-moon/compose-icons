package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DeleteBackLine: ImageVector
    get() {
        if (_deleteBackLine != null) return _deleteBackLine!!
        _deleteBackLine = remixIcon(
            name = "DeleteBackLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.535 3.000 L 20.999 3.000 C 21.552 3.000 21.999 3.448 21.999 4.000 L 21.999 20.000 C 21.999 20.552 21.552 21.000 20.999 21.000 L 6.535 21.000 C 6.200 21.000 5.888 20.833 5.702 20.555 L 0.369 12.555 C 0.145 12.219 0.145 11.781 0.369 11.445 L 5.702 3.445 C 5.888 3.167 6.200 3.000 6.535 3.000 ZM 7.070 5.000 L 2.403 12.000 L 7.070 19.000 L 19.999 19.000 L 19.999 5.000 L 7.070 5.000 ZM 15.999 11.000 L 15.999 13.000 L 8.999 13.000 L 8.999 11.000 L 15.999 11.000 Z"),
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
        return _deleteBackLine!!
    }

private var _deleteBackLine: ImageVector? = null
