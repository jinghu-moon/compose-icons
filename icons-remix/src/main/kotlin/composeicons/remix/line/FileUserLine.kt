package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileUserLine: ImageVector
    get() {
        if (_fileUserLine != null) return _fileUserLine!!
        _fileUserLine = remixIcon(
            name = "FileUserLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 4h-10v16h14v-12h-4v-4ZM3 2.992C3 2.444 3.447 2 3.999 2h12.001l5 5L21 20.993c0 .556-.445 1.007-.993 1.007h-16.013C3.445 22 3 21.545 3 21.008v-18.016ZM12 11.5C10.619 11.5 9.5 10.381 9.5 9 9.5 7.619 10.619 6.5 12 6.5c1.381 0 2.5 1.119 2.5 2.5 0 1.381-1.119 2.5-2.5 2.5ZM7.527 17C7.776 14.75 9.684 13 12 13c2.316 0 4.224 1.75 4.472 4h-8.945Z"),
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
        return _fileUserLine!!
    }

private var _fileUserLine: ImageVector? = null
