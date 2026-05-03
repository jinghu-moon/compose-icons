package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DatabaseLine: ImageVector
    get() {
        if (_databaseLine != null) return _databaseLine!!
        _databaseLine = remixIcon(
            name = "DatabaseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.000 19.000 L 11.000 9.000 L 4.000 9.000 L 4.000 19.000 L 11.000 19.000 ZM 11.000 7.000 L 11.000 4.000 C 11.000 3.448 11.448 3.000 12.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 8.000 C 2.000 7.448 2.448 7.000 3.000 7.000 L 11.000 7.000 ZM 13.000 5.000 L 13.000 19.000 L 20.000 19.000 L 20.000 5.000 L 13.000 5.000 ZM 5.000 16.000 L 10.000 16.000 L 10.000 18.000 L 5.000 18.000 L 5.000 16.000 ZM 14.000 16.000 L 19.000 16.000 L 19.000 18.000 L 14.000 18.000 L 14.000 16.000 ZM 14.000 13.000 L 19.000 13.000 L 19.000 15.000 L 14.000 15.000 L 14.000 13.000 ZM 14.000 10.000 L 19.000 10.000 L 19.000 12.000 L 14.000 12.000 L 14.000 10.000 ZM 5.000 13.000 L 10.000 13.000 L 10.000 15.000 L 5.000 15.000 L 5.000 13.000 Z"),
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
        return _databaseLine!!
    }

private var _databaseLine: ImageVector? = null
