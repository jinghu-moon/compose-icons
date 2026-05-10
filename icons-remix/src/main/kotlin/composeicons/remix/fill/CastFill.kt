package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CastFill: ImageVector
    get() {
        if (_castFill != null) return _castFill!!
        _castFill = remixIcon(
            name = "CastFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 3h18c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-6c0-.68-.052-1.348-.153-2h5.153v-14h-16v3.153C3.348 8.052 2.68 8 2 8v-4C2 3.448 2.448 3 3 3ZM13 21h-2C11 16.029 6.971 12 2 12v-2c6.075 0 11 4.925 11 11ZM9 21h-2C7 18.239 4.761 16 2 16v-2c3.866 0 7 3.134 7 7ZM5 21h-3v-3c1.657 0 3 1.343 3 3ZM14.373 17C13.093 13.038 9.962 9.907 6 8.627v-1.627h12v10h-3.627Z"),
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
        return _castFill!!
    }

private var _castFill: ImageVector? = null
