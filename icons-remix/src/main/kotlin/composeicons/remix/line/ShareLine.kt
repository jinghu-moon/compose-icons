package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShareLine: ImageVector
    get() {
        if (_shareLine != null) return _shareLine!!
        _shareLine = remixIcon(
            name = "ShareLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.12 17.023 8.921 14.732C8.191 15.512 7.153 16 6 16 3.791 16 2 14.209 2 12 2 9.791 3.791 8 6 8c1.153 0 2.191 .487 2.921 1.267L13.12 6.977C13.042 6.664 13 6.337 13 6 13 3.791 14.791 2 17 2c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4C15.847 10 14.809 9.513 14.079 8.732L9.88 11.023c.079 .313 .12 .64 .12 .977 0 .337-.042 .664-.12 .977l4.199 2.29C14.809 14.488 15.847 14 17 14c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4 0-.337 .042-.664 .12-.977ZM6 14c1.105 0 2-.895 2-2C8 10.895 7.105 10 6 10c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2ZM17 8c1.105 0 2-.895 2-2C19 4.895 18.105 4 17 4c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2ZM17 20c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2Z"),
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
        return _shareLine!!
    }

private var _shareLine: ImageVector? = null
