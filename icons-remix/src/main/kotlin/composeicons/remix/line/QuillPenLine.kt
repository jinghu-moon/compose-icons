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
                pathData = parseSvgPathData("M6.939 14.033c-.232 .623-.429 1.2-.605 1.783 .959-.697 2.101-1.139 3.418-1.303 2.513-.314 4.746-1.974 5.876-4.058L14.172 8.999 15.585 7.584c.334-.334 .667-.668 1.001-1.002 .429-.429 .914-1.224 1.427-2.368C12.42 5.082 8.995 8.506 6.939 14.033ZM17 8.997l1 .999c-1 3-4 6-8 6.5-2.669 .334-4.336 2.167-5.002 5.5h-1.998C4 15.997 6 1.997 21 1.997c-.999 2.997-1.998 4.996-2.997 5.997-.337 .336-.67 .67-1.003 1.003Z"),
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
