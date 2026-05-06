package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Loader3Line: ImageVector
    get() {
        if (_loader3Line != null) return _loader3Line!!
        _loader3Line = remixIcon(
            name = "Loader3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.055 13h2.016c.485 3.392 3.403 6 6.929 6 3.526 0 6.444-2.608 6.929-6h2.016c-.497 4.5-4.312 8-8.945 8C7.367 21 3.552 17.5 3.055 13ZM3.055 11C3.552 6.5 7.367 3 12 3c4.632 0 8.448 3.5 8.945 8h-2.016C18.444 7.608 15.526 5 12 5 8.473 5 5.556 7.608 5.071 11h-2.016Z"),
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
        return _loader3Line!!
    }

private var _loader3Line: ImageVector? = null
