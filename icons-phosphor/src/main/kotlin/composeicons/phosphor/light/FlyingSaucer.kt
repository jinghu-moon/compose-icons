package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FlyingSaucer: ImageVector
    get() {
        if (_flyingSaucer != null) return _flyingSaucer!!
        _flyingSaucer = phosphorLightIcon(
            name = "FlyingSaucer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M181.69 214.1c.728 2.046 .294 4.326-1.135 5.961-1.429 1.635-3.631 2.37-5.756 1.922-2.125-.448-3.842-2.01-4.489-4.083l-8-24c-.728-2.046-.294-4.326 1.135-5.961 1.429-1.635 3.631-2.37 5.756-1.922 2.125 .448 3.842 2.01 4.489 4.083ZM128 186c-3.314 0-6 2.686-6 6v32c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-32c0-3.314-2.686-6-6-6ZM89.9 186.31c-3.142-1.049-6.54 .648-7.59 3.79l-8 24c-.728 2.046-.294 4.326 1.135 5.961 1.429 1.635 3.631 2.37 5.756 1.922 2.125-.448 3.842-2.01 4.489-4.083l8-24c1.049-3.142-.648-6.54-3.79-7.59ZM246 112c0 15.37-12.94 29.39-36.44 39.46C187.67 160.84 158.71 166 128 166 97.29 166 68.33 160.84 46.44 151.46 22.94 141.39 10 127.37 10 112 10 90.84 35.06 72.35 75.59 63.43 86.874 45.199 106.794 34.111 128.235 34.13c21.441 .018 41.343 11.14 52.595 29.39C221.1 72.48 246 90.93 246 112ZM78 96.84v3c-.012 4.631 3.178 8.655 7.69 9.7 13.892 3.063 28.084 4.559 42.31 4.46 14.221 .111 28.409-1.371 42.3-4.42 4.512-1.045 7.702-5.069 7.69-9.7v-3.88c0-27.614-22.386-50-50-50h-.67C100.13 46.36 78 69.16 78 96.84ZM234 112C234 98.67 215.62 85.39 187.2 77.48c1.862 5.997 2.806 12.241 2.8 18.52v3.92c.017 10.214-7.041 19.079-17 21.35-14.776 3.257-29.87 4.844-45 4.73-15.13 .115-30.225-1.472-45-4.73C73.041 118.999 65.983 110.134 66 99.92h0v-3.07c.001-6.605 1.04-13.168 3.08-19.45C40.49 85.3 22 98.62 22 112c0 10.12 10.63 20.48 29.17 28.43C71.59 149.18 98.88 154 128 154c29.12 0 56.41-4.82 76.83-13.57C223.37 132.48 234 122.12 234 112Z"),
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
        return _flyingSaucer!!
    }

private var _flyingSaucer: ImageVector? = null
