package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileMusicLine: ImageVector
    get() {
        if (_fileMusicLine != null) return _fileMusicLine!!
        _fileMusicLine = remixIcon(
            name = "FileMusicLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 8v2h-3v4.5C13 15.881 11.881 17 10.5 17 9.119 17 8 15.881 8 14.5 8 13.119 9.119 12 10.5 12c.171 0 .338 .017 .5 .05v-4.05h4v-4h-10v16h14v-12h-3ZM3 2.992C3 2.444 3.447 2 3.999 2h12.001l5 5L21 20.993c0 .556-.445 1.007-.993 1.007h-16.013C3.445 22 3 21.545 3 21.008v-18.016Z"),
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
        return _fileMusicLine!!
    }

private var _fileMusicLine: ImageVector? = null
