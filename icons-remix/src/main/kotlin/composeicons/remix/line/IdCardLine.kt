package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.IdCardLine: ImageVector
    get() {
        if (_idCardLine != null) return _idCardLine!!
        _idCardLine = remixIcon(
            name = "IdCardLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 6h18v12h-18v-12ZM2 4C1.448 4 1 4.448 1 5v14c0 .552 .448 1 1 1h20c.552 0 1-.448 1-1v-14C23 4.448 22.552 4 22 4h-20ZM13 8h6v2h-6v-2ZM18 12h-5v2h5v-2ZM10.5 10c0 1.381-1.119 2.5-2.5 2.5C6.619 12.5 5.5 11.381 5.5 10 5.5 8.619 6.619 7.5 8 7.5c1.381 0 2.5 1.119 2.5 2.5ZM8 13.5C6.067 13.5 4.5 15.067 4.5 17h7C11.5 15.067 9.933 13.5 8 13.5Z"),
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
        return _idCardLine!!
    }

private var _idCardLine: ImageVector? = null
