package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ScissorsCutLine: ImageVector
    get() {
        if (_scissorsCutLine != null) return _scissorsCutLine!!
        _scissorsCutLine = remixIcon(
            name = "ScissorsCutLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10 5.997c0 .733-.197 1.419-.541 2.01L12 10.583 18.728 3.855c.781-.781 2.047-.781 2.828 0L9.446 15.965c.352 .596 .554 1.29 .554 2.032 0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4 .742 0 1.436 .202 2.032 .554l2.554-2.554L8.032 9.443C7.436 9.795 6.742 9.997 6 9.997 3.791 9.997 2 8.206 2 5.997 2 3.788 3.791 1.997 6 1.997c2.209 0 4 1.791 4 4ZM8 5.997C8 4.892 7.105 3.997 6 3.997c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2ZM21.556 20.139c-.781 .781-2.047 .781-2.828 0L13.411 14.822l1.414-1.414 6.731 6.731ZM16 10.997h2v2h-2v-2ZM20 10.997h2v2h-2v-2ZM6 10.997h2v2h-2v-2ZM2 10.997h2v2h-2v-2ZM6 19.997c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2Z"),
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
        return _scissorsCutLine!!
    }

private var _scissorsCutLine: ImageVector? = null
