package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FirstAidKitLine: ImageVector
    get() {
        if (_firstAidKitLine != null) return _firstAidKitLine!!
        _firstAidKitLine = remixIcon(
            name = "FirstAidKitLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 1c.552 0 1 .448 1 1v3h4c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-14C2 5.448 2.448 5 3 5h4v-3C7 1.448 7.448 1 8 1h8ZM20 7h-16v12h16v-12ZM13 9v3h3v2h-3.001L13 17h-2l-.001-3h-2.999v-2h3v-3h2ZM15 3h-6v2h6v-2Z"),
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
        return _firstAidKitLine!!
    }

private var _firstAidKitLine: ImageVector? = null
