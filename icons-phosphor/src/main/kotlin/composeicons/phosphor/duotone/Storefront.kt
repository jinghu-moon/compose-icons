package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Storefront: ImageVector
    get() {
        if (_storefront != null) return _storefront!!
        _storefront = phosphorDuotoneIcon(
            name = "Storefront",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 96v16c0 17.673-14.327 32-32 32-17.673 0-32-14.327-32-32v-16h-64v16c0 17.673-14.327 32-32 32C46.327 144 32 129.673 32 112v-16L46.34 45.8C47.319 42.378 50.441 40.014 54 40h148c3.57 .001 6.708 2.367 7.69 5.8Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M231.69 93.81 217.35 43.6C215.369 36.759 209.122 32.038 202 32h-148c-7.122 .038-13.369 4.759-15.35 11.6L24.31 93.81c-.205 .712-.309 1.449-.31 2.19v16c0 12.59 5.928 24.446 16 32v72c0 4.418 3.582 8 8 8h160c4.418 0 8-3.582 8-8v-72c10.072-7.554 16-19.41 16-32v-16c-.001-.741-.105-1.478-.31-2.19ZM54 48h148l11.42 40h-170.81ZM152 104v8c0 13.255-10.745 24-24 24-13.255 0-24-10.745-24-24v-8ZM51.06 132.2C44.173 127.791 40.004 120.178 40 112v-8h48v8c-.003 8.394-4.391 16.176-11.571 20.523-7.181 4.347-16.11 4.626-23.549 .737-.557-.433-1.169-.79-1.82-1.06ZM200 208h-144v-56.8c2.634 .531 5.313 .799 8 .8 12.59 0 24.446-5.928 32-16 7.554 10.072 19.41 16 32 16 12.59 0 24.446-5.928 32-16 7.554 10.072 19.41 16 32 16 2.687-.001 5.366-.269 8-.8ZM216 112c-.007 8.18-4.179 15.793-11.07 20.2-.643 .271-1.248 .624-1.8 1.05-7.438 3.893-16.369 3.617-23.552-.728C172.395 128.177 168.005 120.395 168 112v-8h48Z"),
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
