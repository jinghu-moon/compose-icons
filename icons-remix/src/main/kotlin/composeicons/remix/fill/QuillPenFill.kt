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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 1.997C6 1.997 4 15.997 3 21.997c.667 0 1.333 0 1.998 0C5.664 18.664 7.331 16.83 10 16.497c4-.5 7-4 8-7l-1.5-1c.333-.333 .667-.667 1-1 1-1 2.004-2.5 3.5-5.5Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _quillPenFill!!
    }

private var _quillPenFill: ImageVector? = null
