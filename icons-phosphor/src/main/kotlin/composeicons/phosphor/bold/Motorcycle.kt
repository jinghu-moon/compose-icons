package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Motorcycle: ImageVector
    get() {
        if (_motorcycle != null) return _motorcycle!!
        _motorcycle = phosphorBoldIcon(
            name = "Motorcycle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 112c-.57 0-1.13 0-1.69 0l-3.5-11.8c1.71-.15 3.44-.24 5.19-.24 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-12.37L187.51 48.55C185.985 43.469 181.305 39.993 176 40h-32c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h23l3.56 12h-18.56c-19.44 0-35.32 4.62-45.92 13.37-3.558 2.852-8.425 3.441-12.56 1.52C80.39 84.89 36.33 65.89 31.87 64L26.6 61.76C26.6 61.76 22.4 60 20 60 14.278 59.999 9.351 64.038 8.23 69.65c-1.121 5.611 1.876 11.233 7.16 13.43 1.72 .73 43.67 18.5 68.2 29.66 4.712 2.135 9.827 3.236 15 3.23 8.302 .028 16.355-2.832 22.78-8.09 5.74-4.73 15.58-7.48 27.89-7.84-13.18 12.889-21.754 29.756-24.4 48h-30.38C88.437 124.636 65.935 109.377 41.956 112.423 17.977 115.468 .004 135.869 .004 160.04c0 24.171 17.973 44.572 41.952 47.617 23.979 3.046 46.481-12.214 52.524-35.617h41.52c6.627 0 12-5.373 12-12 .007-22.166 12.235-42.522 31.8-52.94l3.5 11.8c-20.558 12.402-28.79 38.086-19.272 60.128 9.518 22.042 33.858 33.661 56.982 27.202 23.124-6.46 37.918-29.011 34.635-52.795C252.36 129.652 232.009 111.952 208 112ZM48 172h20.77c-5.431 9.407-16.504 13.994-26.996 11.182C31.281 180.371 23.985 170.863 23.985 160c0-10.863 7.296-20.371 17.788-23.182 10.492-2.811 21.565 1.775 26.996 11.182h-20.77c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12ZM208 184c-9.583-.011-18.24-5.722-22.023-14.526-3.783-8.804-1.965-19.015 4.623-25.974l5.89 19.91c1.511 5.097 6.194 8.592 11.51 8.59 1.154-.002 2.302-.167 3.41-.49 3.053-.903 5.622-2.983 7.142-5.782 1.519-2.798 1.864-6.086 .958-9.138l-5.91-19.92c11.813 2.851 19.63 14.082 18.203 26.15C230.375 174.888 220.152 183.984 208 184Z"),
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
        return _motorcycle!!
    }

private var _motorcycle: ImageVector? = null
