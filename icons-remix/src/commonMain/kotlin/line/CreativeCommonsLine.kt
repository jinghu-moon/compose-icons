package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CreativeCommonsLine: ImageVector
    get() {
        if (_creativeCommonsLine != null) return _creativeCommonsLine!!
        _creativeCommonsLine = remixIcon(
            name = "CreativeCommonsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 8.000 C 10.104 8.000 11.105 8.448 11.829 9.173 L 10.415 10.587 C 10.053 10.224 9.553 10.000 9.000 10.000 C 7.895 10.000 7.000 10.895 7.000 12.000 C 7.000 13.105 7.895 14.000 9.000 14.000 C 9.552 14.000 10.052 13.776 10.414 13.414 L 11.828 14.828 C 11.104 15.552 10.104 16.000 9.000 16.000 C 6.792 16.000 5.000 14.208 5.000 12.000 C 5.000 9.792 6.792 8.000 9.000 8.000 ZM 18.829 9.173 C 18.105 8.448 17.104 8.000 16.000 8.000 C 13.792 8.000 12.000 9.792 12.000 12.000 C 12.000 14.208 13.792 16.000 16.000 16.000 C 17.104 16.000 18.104 15.552 18.828 14.828 L 17.414 13.414 C 17.052 13.776 16.552 14.000 16.000 14.000 C 14.895 14.000 14.000 13.105 14.000 12.000 C 14.000 10.895 14.895 10.000 16.000 10.000 C 16.553 10.000 17.053 10.224 17.415 10.587 L 18.829 9.173 ZM 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 ZM 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 16.418 20.000 20.000 16.418 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 Z"),
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
        return _creativeCommonsLine!!
    }

private var _creativeCommonsLine: ImageVector? = null
