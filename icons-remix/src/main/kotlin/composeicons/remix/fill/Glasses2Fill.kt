package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Glasses2Fill: ImageVector
    get() {
        if (_glasses2Fill != null) return _glasses2Fill!!
        _glasses2Fill = remixIcon(
            name = "Glasses2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.031 10.976C3.07 9.495 3.158 8.309 3.356 7.321 3.687 5.663 4.31 4.662 5.555 3.832L4.446 2.168C2.691 3.338 1.813 4.837 1.394 6.929 1 8.901 1 11.484 1 14.88h0v.12c0 0 0 0 0 .001 0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5 0-.274-.022-.543-.065-.806C11.266 14.069 11.624 14 12 14c.376 0 .734 .069 1.065 .194C13.022 14.457 13 14.726 13 15c0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5v-.12c0-3.396 0-5.978-.394-7.951C22.187 4.837 21.31 3.338 19.555 2.168L18.446 3.832c1.245 .83 1.867 1.831 2.199 3.489 .197 .988 .285 2.174 .324 3.655C20.139 10.363 19.112 10 18 10c-1.778 0-3.338 .928-4.224 2.325C13.223 12.115 12.625 12 12 12c-.625 0-1.223 .115-1.776 .325C9.338 10.928 7.778 10 6 10c-1.112 0-2.139 .363-2.969 .976Z"),
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
        return _glasses2Fill!!
    }

private var _glasses2Fill: ImageVector? = null
