package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.File3Fill: ImageVector
    get() {
        if (_file3Fill != null) return _file3Fill!!
        _file3Fill = remixIcon(
            name = "File3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 9v11.993c0 .559-.445 1.007-.993 1.007h-16.013C3.445 22 3 21.556 3 21.008v-18.016C3 2.455 3.447 2 3.998 2h10.002v6c0 .552 .448 1 1 1h6ZM21 7h-5v-4.997L21 7Z"),
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
        return _file3Fill!!
    }

private var _file3Fill: ImageVector? = null
