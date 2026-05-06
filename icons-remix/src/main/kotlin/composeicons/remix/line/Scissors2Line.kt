package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Scissors2Line: ImageVector
    get() {
        if (_scissors2Line != null) return _scissors2Line!!
        _scissors2Line = remixIcon(
            name = "Scissors2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 13.411 9.446 15.965c.352 .596 .554 1.29 .554 2.032 0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4C2 15.787 3.791 13.997 6 13.997c.742 0 1.436 .202 2.032 .554l2.554-2.554L4.565 5.976c-.781-.781-.781-2.047 0-2.828L12 10.582 19.435 3.147c.781 .781 .781 2.047 0 2.828l-6.021 6.021 2.554 2.554c.595-.352 1.29-.554 2.032-.554 2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4 0-.742 .202-1.436 .554-2.032L12 13.411ZM6 19.997c1.105 0 2-.895 2-2C8 16.892 7.105 15.997 6 15.997c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2ZM18 19.997c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2Z"),
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
        return _scissors2Line!!
    }

private var _scissors2Line: ImageVector? = null
