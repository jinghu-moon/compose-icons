package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HairDryer: ImageVector
    get() {
        if (_hairDryer != null) return _hairDryer!!
        _hairDryer = phosphorRegularIcon(
            name = "HairDryer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 88C200 70.327 185.673 56 168 56c-17.673 0-32 14.327-32 32 0 17.673 14.327 32 32 32 17.673 0 32-14.327 32-32ZM168 104c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM177.42 206.62 209 137.07c20.626-17.271 28.25-45.596 19.08-70.887C218.909 40.892 194.902 24.037 168 24c-.442 .002-.884 .039-1.32 .11L29.37 47C21.656 48.286 16.001 54.959 16 62.78v50.44c.001 7.821 5.656 14.494 13.37 15.78L128 145.44v54.56c0 8.837 7.163 16 16 16 0 22.091 17.909 40 40 40h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16c-13.255 0-24-10.745-24-24h2.85c6.276 .001 11.973-3.666 14.57-9.38ZM32 62.78 168.64 40c26.51 0 48 21.49 48 48 0 26.51-21.49 48-48 48L32 113.23ZM166.68 151.89c.436 .071 .878 .108 1.32 .11 6.03-.002 12.03-.857 17.82-2.54l-23 50.54h-18.82v-51.89Z"),
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
        return _hairDryer!!
    }

private var _hairDryer: ImageVector? = null
