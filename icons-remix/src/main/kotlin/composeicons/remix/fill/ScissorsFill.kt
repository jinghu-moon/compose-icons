package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ScissorsFill: ImageVector
    get() {
        if (_scissorsFill != null) return _scissorsFill!!
        _scissorsFill = remixIcon(
            name = "ScissorsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.683 7.559 12 9.875 18.374 3.501c.781-.781 2.047-.781 2.828 0l.707 .707L9.683 16.435c.204 .48 .317 1.008 .317 1.562 0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4 .554 0 1.082 .113 1.562 .316L9.879 11.997 7.562 9.68C7.082 9.884 6.554 9.997 6 9.997 3.791 9.997 2 8.206 2 5.997 2 3.788 3.791 1.997 6 1.997c2.209 0 4 1.791 4 4 0 .554-.113 1.082-.317 1.562ZM6 7.997c1.105 0 2-.895 2-2C8 4.892 7.105 3.997 6 3.997c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2ZM6 19.997c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2ZM15.535 13.41l6.375 6.375-.707 .707c-.781 .781-2.047 .781-2.828 0L13.413 15.531l2.121-2.121Z"),
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
        return _scissorsFill!!
    }

private var _scissorsFill: ImageVector? = null
