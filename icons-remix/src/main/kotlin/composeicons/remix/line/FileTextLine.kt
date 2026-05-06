package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileTextLine: ImageVector
    get() {
        if (_fileTextLine != null) return _fileTextLine!!
        _fileTextLine = remixIcon(
            name = "FileTextLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 8v12.993c0 .557-.445 1.007-.993 1.007h-16.013C3.445 22 3 21.556 3 21.008v-18.016C3 2.455 3.449 2 4.002 2h10.995L21 8ZM19 9h-5v-5h-9v16h14v-11ZM8 7h3v2h-3v-2ZM8 11h8v2h-8v-2ZM8 15h8v2h-8v-2Z"),
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
        return _fileTextLine!!
    }

private var _fileTextLine: ImageVector? = null
