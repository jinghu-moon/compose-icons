package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.IdCardFill: ImageVector
    get() {
        if (_idCardFill != null) return _idCardFill!!
        _idCardFill = remixIcon(
            name = "IdCardFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M1 5C1 4.448 1.448 4 2 4h20c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-20C1.448 20 1 19.552 1 19v-14ZM13 8v2h6v-2h-6ZM18 12h-5v2h5v-2ZM10.5 10C10.5 8.619 9.381 7.5 8 7.5 6.619 7.5 5.5 8.619 5.5 10c0 1.381 1.119 2.5 2.5 2.5 1.381 0 2.5-1.119 2.5-2.5ZM8 13.5C6.067 13.5 4.5 15.067 4.5 17h7C11.5 15.067 9.933 13.5 8 13.5Z"),
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
        return _idCardFill!!
    }

private var _idCardFill: ImageVector? = null
