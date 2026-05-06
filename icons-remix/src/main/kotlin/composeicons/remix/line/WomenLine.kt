package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.WomenLine: ImageVector
    get() {
        if (_womenLine != null) return _womenLine!!
        _womenLine = remixIcon(
            name = "WomenLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 15.934C7.331 15.445 4.5 12.303 4.5 8.5 4.5 4.358 7.858 1 12 1c4.142 0 7.5 3.358 7.5 7.5 0 3.803-2.831 6.945-6.5 7.434v2.066h5v2h-5v4h-2v-4h-5v-2h5v-2.066ZM12 14c3.038 0 5.5-2.462 5.5-5.5C17.5 5.462 15.038 3 12 3 8.962 3 6.5 5.462 6.5 8.5 6.5 11.538 8.962 14 12 14Z"),
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
        return _womenLine!!
    }

private var _womenLine: ImageVector? = null
