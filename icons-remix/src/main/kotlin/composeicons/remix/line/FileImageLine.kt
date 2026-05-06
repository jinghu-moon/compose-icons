package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileImageLine: ImageVector
    get() {
        if (_fileImageLine != null) return _fileImageLine!!
        _fileImageLine = remixIcon(
            name = "FileImageLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 8v-4h-10v16h14v-12h-4ZM3 2.992C3 2.444 3.447 2 3.999 2h12.001l5 5L21 20.993c0 .556-.445 1.007-.993 1.007h-16.013C3.445 22 3 21.545 3 21.008v-18.016ZM11 9.5C11 10.328 10.328 11 9.5 11 8.672 11 8 10.328 8 9.5 8 8.672 8.672 8 9.5 8 10.328 8 11 8.672 11 9.5ZM17.5 17l-4-7L8 17h9.5Z"),
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
        return _fileImageLine!!
    }

private var _fileImageLine: ImageVector? = null
