package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FacebookFill: ImageVector
    get() {
        if (_facebookFill != null) return _facebookFill!!
        _facebookFill = remixIcon(
            name = "FacebookFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 13.5h2.5l1-4h-3.5v-2c0-1.029 0-2 2-2h1.5v-3.36C17.174 2.097 15.943 2 14.643 2 11.928 2 10 3.657 10 6.7v2.8h-3v4h3v8.5h4v-8.5Z"),
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
        return _facebookFill!!
    }

private var _facebookFill: ImageVector? = null
