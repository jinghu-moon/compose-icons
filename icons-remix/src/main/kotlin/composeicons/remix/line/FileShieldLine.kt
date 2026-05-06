package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileShieldLine: ImageVector
    get() {
        if (_fileShieldLine != null) return _fileShieldLine!!
        _fileShieldLine = remixIcon(
            name = "FileShieldLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 8v-4h-9v16h14v-11h-3v4.62c0 .845-.446 1.633-1.188 2.102L12 17.498 9.187 15.722C8.446 15.253 8 14.464 8 13.62v-5.62h6ZM21 8v12.993c0 .557-.445 1.007-.993 1.007h-16.013C3.445 22 3 21.556 3 21.008v-18.016C3 2.455 3.449 2 4.002 2h10.995L21 8ZM10 13.62c0 .15 .087 .305 .255 .411L12 15.132l1.745-1.102c.168-.106 .255-.261 .255-.411v-3.62h-4v3.62Z"),
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
        return _fileShieldLine!!
    }

private var _fileShieldLine: ImageVector? = null
