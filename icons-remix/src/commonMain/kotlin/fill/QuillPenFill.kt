package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.QuillPenFill: ImageVector
    get() {
        if (_quillPenFill != null) return _quillPenFill!!
        _quillPenFill = remixIcon(
            name = "QuillPenFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 1.997 C 6.000 1.997 4.000 15.997 3.000 21.997 C 3.667 21.997 4.333 21.997 4.998 21.997 C 5.664 18.664 7.331 16.830 10.000 16.497 C 14.000 15.997 17.000 12.497 18.000 9.497 L 16.500 8.497 C 16.833 8.163 17.167 7.830 17.500 7.497 C 18.500 6.497 19.504 4.997 21.000 1.997 Z"),
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
        return _quillPenFill!!
    }

private var _quillPenFill: ImageVector? = null
