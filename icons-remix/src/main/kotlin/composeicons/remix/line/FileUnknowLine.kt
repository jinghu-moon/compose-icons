package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileUnknowLine: ImageVector
    get() {
        if (_fileUnknowLine != null) return _fileUnknowLine!!
        _fileUnknowLine = remixIcon(
            name = "FileUnknowLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 15h2v2h-2v-2ZM13 13.355v.645h-2v-1.5c0-.552 .448-1 1-1 .828 0 1.5-.672 1.5-1.5C13.5 9.172 12.828 8.5 12 8.5c-.728 0-1.334 .518-1.471 1.206L8.567 9.313C8.886 7.709 10.302 6.5 12 6.5c1.933 0 3.5 1.567 3.5 3.5 0 1.585-1.054 2.925-2.5 3.355ZM15 4h-10v16h14v-12h-4v-4ZM3 2.992C3 2.444 3.447 2 3.999 2h12.001l5 5L21 20.993c0 .556-.445 1.007-.993 1.007h-16.013C3.445 22 3 21.545 3 21.008v-18.016Z"),
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
        return _fileUnknowLine!!
    }

private var _fileUnknowLine: ImageVector? = null
