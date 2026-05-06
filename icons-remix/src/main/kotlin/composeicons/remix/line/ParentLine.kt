package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ParentLine: ImageVector
    get() {
        if (_parentLine != null) return _parentLine!!
        _parentLine = remixIcon(
            name = "ParentLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 9C8.381 9 9.5 7.881 9.5 6.5 9.5 5.119 8.381 4 7 4 5.619 4 4.5 5.119 4.5 6.5 4.5 7.881 5.619 9 7 9ZM7 11C4.515 11 2.5 8.985 2.5 6.5 2.5 4.015 4.515 2 7 2c2.485 0 4.5 2.015 4.5 4.5C11.5 8.985 9.485 11 7 11ZM17.5 13c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2ZM17.5 15c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4ZM20 21v-.5C20 19.119 18.881 18 17.5 18 16.119 18 15 19.119 15 20.5v.5h-2v-.5C13 18.015 15.015 16 17.5 16 19.985 16 22 18.015 22 20.5v.5h-2ZM10 21v-4C10 15.343 8.657 14 7 14 5.343 14 4 15.343 4 17v4h-2v-4C2 14.239 4.239 12 7 12c2.761 0 5 2.239 5 5v4h-2Z"),
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
        return _parentLine!!
    }

private var _parentLine: ImageVector? = null
