package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.File4Fill: ImageVector
    get() {
        if (_file4Fill != null) return _file4Fill!!
        _file4Fill = remixIcon(
            name = "File4Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 15h-7v7h-10.002C3.447 22 3 21.545 3 21.008v-18.016C3 2.444 3.445 2 3.993 2h16.013c.549 0 .993 .449 .993 1.007v11.993ZM21 17l-5 4.997v-4.997h5Z"),
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
        return _file4Fill!!
    }

private var _file4Fill: ImageVector? = null
