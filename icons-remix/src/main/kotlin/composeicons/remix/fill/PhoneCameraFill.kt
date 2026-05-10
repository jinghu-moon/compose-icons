package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PhoneCameraFill: ImageVector
    get() {
        if (_phoneCameraFill != null) return _phoneCameraFill!!
        _phoneCameraFill = remixIcon(
            name = "PhoneCameraFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.803 4C14.292 4.883 14 5.907 14 7c0 3.314 2.686 6 6 6 1.093 0 2.118-.292 3-.803v6.802C23 19.552 22.56 20 21.997 20h-19.995C1.449 20 1 19.555 1 18.999v-13.998C1 4.448 1.439 4 2.002 4h12.8ZM20 11C17.791 11 16 9.209 16 7 16 4.791 17.791 3 20 3c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4ZM20 9c1.105 0 2-.895 2-2C22 5.895 21.105 5 20 5c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2ZM19 15v3h2v-3h-2Z"),
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
        return _phoneCameraFill!!
    }

private var _phoneCameraFill: ImageVector? = null
