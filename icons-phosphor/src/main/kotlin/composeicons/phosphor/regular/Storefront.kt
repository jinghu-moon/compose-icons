package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Storefront: ImageVector
    get() {
        if (_storefront != null) return _storefront!!
        _storefront = phosphorRegularIcon(
            name = "Storefront",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 96c.004-.744-.097-1.484-.3-2.2L217.35 43.6C215.369 36.759 209.122 32.038 202 32h-148c-7.122 .038-13.369 4.759-15.35 11.6L24.31 93.8c-.207 .715-.311 1.456-.31 2.2h0v16c0 12.59 5.928 24.446 16 32v72c0 4.418 3.582 8 8 8h160c4.418 0 8-3.582 8-8v-72c10.072-7.554 16-19.41 16-32v-16ZM54 48h148l11.42 40h-170.81ZM104 104h48v8c0 13.255-10.745 24-24 24-13.255 0-24-10.745-24-24ZM88 104v8c-.003 8.394-4.391 16.176-11.571 20.523-7.181 4.347-16.11 4.626-23.549 .737-.557-.433-1.169-.79-1.82-1.06C44.173 127.791 40.004 120.178 40 112v-8ZM200 208h-144v-56.8c2.634 .531 5.313 .799 8 .8 12.59 0 24.446-5.928 32-16 7.554 10.072 19.41 16 32 16 12.59 0 24.446-5.928 32-16 7.554 10.072 19.41 16 32 16 2.687-.001 5.366-.269 8-.8ZM204.93 132.2c-.643 .271-1.248 .624-1.8 1.05-7.438 3.893-16.369 3.617-23.552-.728C172.395 128.177 168.005 120.395 168 112v-8h48v8c-.007 8.18-4.179 15.793-11.07 20.2Z"),
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
