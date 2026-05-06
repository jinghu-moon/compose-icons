package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FlowerFill: ImageVector
    get() {
        if (_flowerFill != null) return _flowerFill!!
        _flowerFill = remixIcon(
            name = "FlowerFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.455 2.309l-.455-.233-.455 .233C10.395 2.896 9.353 3.664 8.456 4.574c1.318 .686 2.514 1.576 3.545 2.628C13.031 6.15 14.226 5.26 15.544 4.574 14.647 3.664 13.604 2.897 12.455 2.309ZM10.699 8.734C8.989 6.935 6.726 5.665 4.181 5.198L3 4.981v8.019c0 3.805 2.361 7.058 5.697 8.375C8.245 19.998 8 18.528 8 17 8 13.908 9.002 11.051 10.699 8.734ZM21 4.981l-1.181 .217C14.233 6.224 10 11.117 10 17c0 1.536 .289 3.007 .817 4.36l.24 .616c.314 .01 .629 .025 .943 .025 4.971 0 9-4.029 9-9v-8.019Z"),
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
        return _flowerFill!!
    }

private var _flowerFill: ImageVector? = null
