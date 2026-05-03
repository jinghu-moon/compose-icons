package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.KeyLine: ImageVector
    get() {
        if (_keyLine != null) return _keyLine!!
        _keyLine = remixIcon(
            name = "KeyLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.917 13.000 C 12.441 15.838 9.973 18.000 7.000 18.000 C 3.686 18.000 1.000 15.314 1.000 12.000 C 1.000 8.686 3.686 6.000 7.000 6.000 C 9.973 6.000 12.441 8.162 12.917 11.000 L 23.000 11.000 L 23.000 13.000 L 21.000 13.000 L 21.000 17.000 L 19.000 17.000 L 19.000 13.000 L 17.000 13.000 L 17.000 17.000 L 15.000 17.000 L 15.000 13.000 L 12.917 13.000 ZM 7.000 16.000 C 9.209 16.000 11.000 14.209 11.000 12.000 C 11.000 9.791 9.209 8.000 7.000 8.000 C 4.791 8.000 3.000 9.791 3.000 12.000 C 3.000 14.209 4.791 16.000 7.000 16.000 Z"),
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
        return _keyLine!!
    }

private var _keyLine: ImageVector? = null
