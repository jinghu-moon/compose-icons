package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Scissors2Fill: ImageVector
    get() {
        if (_scissors2Fill != null) return _scissors2Fill!!
        _scissors2Fill = remixIcon(
            name = "Scissors2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 14.118 9.683 16.434c.204 .48 .317 1.008 .317 1.562 0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4C2 15.788 3.791 13.997 6 13.997c.554 0 1.082 .113 1.562 .316L9.879 11.997 4.211 6.329c-.781-.781-.781-2.047 0-2.828l.707-.707L12 9.875 19.081 2.794l.707 .707c.781 .781 .781 2.047 0 2.828l-5.667 5.667 2.317 2.316c.48-.204 1.008-.316 1.562-.316 2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4 0-.554 .113-1.082 .316-1.562L12 14.118ZM6 19.997c1.105 0 2-.895 2-2C8 16.892 7.105 15.997 6 15.997c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2ZM18 19.997c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2Z"),
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
        return _scissors2Fill!!
    }

private var _scissors2Fill: ImageVector? = null
