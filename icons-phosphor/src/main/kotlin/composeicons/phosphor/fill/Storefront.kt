package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Storefront: ImageVector
    get() {
        if (_storefront != null) return _storefront!!
        _storefront = phosphorFillIcon(
            name = "Storefront",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M231.69 93.81 217.35 43.6C215.369 36.759 209.122 32.038 202 32h-148c-7.122 .038-13.369 4.759-15.35 11.6L24.31 93.81c-.205 .712-.309 1.449-.31 2.19v16c0 12.59 5.928 24.446 16 32v72c0 4.418 3.582 8 8 8h160c4.418 0 8-3.582 8-8v-72c10.072-7.554 16-19.41 16-32v-16c-.001-.741-.105-1.478-.31-2.19ZM88 112c-.003 8.394-4.391 16.176-11.571 20.523-7.181 4.347-16.11 4.626-23.549 .737-.557-.433-1.169-.79-1.82-1.06C44.173 127.791 40.004 120.178 40 112v-8h48ZM152 112c0 13.255-10.745 24-24 24-13.255 0-24-10.745-24-24v-8h48ZM216 112c-.007 8.18-4.179 15.793-11.07 20.2-.643 .271-1.248 .624-1.8 1.05-7.438 3.893-16.369 3.617-23.552-.728C172.395 128.177 168.005 120.395 168 112v-8h48Z"),
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
        return _storefront!!
    }

private var _storefront: ImageVector? = null
