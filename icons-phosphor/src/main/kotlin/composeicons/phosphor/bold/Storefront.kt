package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Storefront: ImageVector
    get() {
        if (_storefront != null) return _storefront!!
        _storefront = phosphorBoldIcon(
            name = "Storefront",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 96c.007-1.115-.141-2.226-.44-3.3L221.2 42.51C218.728 33.949 210.911 28.041 202 28h-148c-8.911 .041-16.728 5.949-19.2 14.51L20.46 92.7C20.154 93.773 19.999 94.884 20 96h0v16c-.002 13.129 5.867 25.572 16 33.92v70.08c0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12v-70.08c10.133-8.348 16.002-20.791 16-33.92v-16ZM57.05 52h141.95l9.14 32h-160.23ZM148.05 108v4c0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20v-4ZM53 128.71C47.38 125.009 43.998 118.729 44 112v-4h40v4c0 11.046-8.954 20-20 20-3.156 .001-6.266-.753-9.07-2.2-.607-.424-1.253-.789-1.93-1.09ZM196 204h-136v-48.19c1.32 .12 2.65 .19 4 .19 12.122 .004 23.706-5.01 32-13.85 8.296 8.838 19.878 13.851 32 13.851 12.122 0 23.704-5.013 32-13.851 8.294 8.84 19.878 13.854 32 13.85 1.35 0 2.68-.07 4-.19ZM212 112c.002 6.729-3.38 13.009-9 16.71-.659 .304-1.289 .669-1.88 1.09-6.2 3.177-13.607 2.898-19.551-.735C175.625 125.431 172 118.967 172 112v-4h40Z"),
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
