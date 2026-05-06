package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PhoneFill: ImageVector
    get() {
        if (_phoneFill != null) return _phoneFill!!
        _phoneFill = remixIcon(
            name = "PhoneFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 16.42v3.536c0 .525-.406 .961-.93 .998C19.633 20.985 19.276 21 19 21 10.163 21 3 13.837 3 5c0-.276 .015-.633 .046-1.07C3.083 3.406 3.519 3 4.044 3h3.536c.257 0 .472 .194 .497 .45 .023 .229 .045 .413 .065 .552 .202 1.413 .615 2.757 1.207 4.001 .095 .2 .033 .439-.147 .567L7.044 10.112c1.314 3.069 3.775 5.531 6.845 6.845l1.539-2.155c.13-.182 .372-.245 .574-.149 1.244 .591 2.588 1.003 4.001 1.205 .138 .02 .321 .041 .549 .064 .255 .026 .45 .241 .45 .498Z"),
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
        return _phoneFill!!
    }

private var _phoneFill: ImageVector? = null
