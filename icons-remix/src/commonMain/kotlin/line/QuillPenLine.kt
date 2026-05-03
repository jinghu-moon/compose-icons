package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.QuillPenLine: ImageVector
    get() {
        if (_quillPenLine != null) return _quillPenLine!!
        _quillPenLine = remixIcon(
            name = "QuillPenLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.939 14.033 C 6.707 14.656 6.510 15.233 6.334 15.816 C 7.293 15.119 8.435 14.677 9.752 14.512 C 12.265 14.198 14.498 12.538 15.628 10.454 L 14.172 8.999 L 15.585 7.584 C 15.918 7.250 16.252 6.916 16.586 6.582 C 17.015 6.153 17.500 5.358 18.013 4.215 C 12.420 5.082 8.995 8.506 6.939 14.033 ZM 17.000 8.997 L 18.000 9.997 C 17.000 12.997 14.000 15.997 10.000 16.497 C 7.331 16.830 5.664 18.664 4.998 21.997 L 3.000 21.997 C 4.000 15.997 6.000 1.997 21.000 1.997 C 20.001 4.994 19.002 6.993 18.003 7.994 C 17.666 8.330 17.333 8.664 17.000 8.997 Z"),
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
        return _quillPenLine!!
    }

private var _quillPenLine: ImageVector? = null
