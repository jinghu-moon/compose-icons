package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Guitar: ImageVector
    get() {
        if (_guitar != null) return _guitar!!
        _guitar = phosphorLightIcon(
            name = "Guitar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248.24 47.76l-40-40c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333L203.52 20 140.9 82.62C118.54 70.42 93.29 71 78.17 86.16c-3.914 3.892-6.978 8.554-9 13.69-1.614 3.706-5.258 6.115-9.3 6.15-14.06 .48-26.27 5.5-35.3 14.53C13 132.18 8 149 10.72 167.79 13.32 186 22.78 204 37.37 218.63 51.96 233.26 70 242.68 88.21 245.28c3.272 .473 6.574 .714 9.88 .72 14.79 0 27.81-5 37.35-14.57 9-9 14.05-21.23 14.53-35.3 .02-4.067 2.446-7.737 6.18-9.35 5.132-2.007 9.793-5.054 13.69-8.95 15.12-15.12 15.74-40.37 3.54-62.73L236 52.48l3.76 3.76c2.364 2.203 6.048 2.138 8.333-.147 2.285-2.285 2.35-5.969 .147-8.333ZM161.36 169.35c-2.743 2.732-6.022 4.867-9.63 6.27-8.166 3.374-13.557 11.266-13.73 20.1-.37 11-4.18 20.39-11 27.22-8.89 8.89-22 12.61-37 10.46C74.35 231.17 58.71 222.91 45.94 210.15 33.17 197.39 24.94 181.74 22.69 166.09c-2.15-15 1.57-28.16 10.46-37.05 6.83-6.84 16.25-10.65 27.22-11h0c8.842-.176 16.737-5.581 20.1-13.76 1.406-3.604 3.541-6.879 6.27-9.62C92.52 88.77 100.57 86 109.44 86c7.834 .131 15.541 2.007 22.56 5.49l-22.6 22.63c-15.837 1.374-27.854 14.863-27.395 30.753 .458 15.89 13.232 28.664 29.122 29.123 15.89 .458 29.379-11.558 30.753-27.395L164.52 124c8.11 16.82 7.48 34.68-3.16 45.35ZM151 105c2.596 2.596 4.993 5.384 7.17 8.34L139.5 132C136.459 125.073 130.927 119.541 124 116.5L142.62 97.88c2.97 2.157 5.772 4.537 8.38 7.12ZM112 126c9.941 0 18 8.059 18 18h0c0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18ZM159.44 96.56c-2.598-2.59-5.364-5.005-8.28-7.23L176 64.48 191.52 80l-24.84 24.83c-2.228-2.914-4.643-5.68-7.23-8.28ZM199.99 71.56 184.49 56 212 28.48 227.52 44ZM92.25 195.75c1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723l-32-32c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147Z"),
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
        return _guitar!!
    }

private var _guitar: ImageVector? = null
