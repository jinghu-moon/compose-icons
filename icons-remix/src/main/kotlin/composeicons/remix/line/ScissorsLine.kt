package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ScissorsLine: ImageVector
    get() {
        if (_scissorsLine != null) return _scissorsLine!!
        _scissorsLine = remixIcon(
            name = "ScissorsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.446 8.029 12 10.583 18.728 3.855c.781-.781 2.047-.781 2.828 0L9.446 15.965c.352 .596 .554 1.29 .554 2.032 0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4 .742 0 1.436 .202 2.032 .554l2.554-2.554L8.032 9.443C7.436 9.795 6.742 9.997 6 9.997 3.791 9.997 2 8.206 2 5.997 2 3.788 3.791 1.997 6 1.997c2.209 0 4 1.791 4 4 0 .742-.202 1.436-.554 2.032ZM14.825 13.408l6.731 6.731c-.781 .781-2.047 .781-2.828 0L13.411 14.822l1.414-1.414ZM7.414 16.583C7.052 16.221 6.552 15.997 6 15.997c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-.552-.224-1.052-.586-1.414ZM7.414 7.411C7.776 7.049 8 6.549 8 5.997 8 4.892 7.105 3.997 6 3.997c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 .552 0 1.052-.224 1.414-.586Z"),
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
        return _scissorsLine!!
    }

private var _scissorsLine: ImageVector? = null
