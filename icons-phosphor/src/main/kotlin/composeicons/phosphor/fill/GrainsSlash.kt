package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GrainsSlash: ImageVector
    get() {
        if (_grainsSlash != null) return _grainsSlash!!
        _grainsSlash = phosphorFillIcon(
            name = "GrainsSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 64v80c.007 10.406-1.838 20.731-5.45 30.49-.494 1.3-1.628 2.251-2.995 2.51-1.367 .259-2.77-.211-3.705-1.24L162.52 130.3c-.813-.901-1.172-2.122-.978-3.32 .194-1.198 .922-2.242 1.978-2.84 11.139-6.576 23.599-10.596 36.48-11.77v-39.92c-20.158 2.292-38.427 12.945-50.35 29.36-1.34 1.861-3.415 3.056-5.697 3.284-2.282 .228-4.552-.535-6.233-2.094-2.956-2.85-3.337-7.452-.89-10.75 6.751-9.256 15.243-17.106 25-23.11C152.62 49.8 135.45 37.74 128 33.2c-8.783 5.398-16.677 12.125-23.4 19.94-1.48 1.757-3.643 2.793-5.939 2.845-2.296 .052-4.504-.886-6.061-2.575C89.869 50.337 89.843 45.713 92.54 42.61c8.951-10.467 19.751-19.199 31.86-25.76 2.253-1.128 4.907-1.128 7.16 0 1.32 .66 30.27 15.43 44.59 45.15 10.118-3.944 20.88-5.979 31.74-6 2.141-.029 4.204 .8 5.728 2.304 1.524 1.503 2.382 3.555 2.382 5.696ZM213.92 210.62c1.963 2.109 2.641 5.11 1.774 7.858-.867 2.748-3.144 4.817-5.961 5.418-2.818 .601-5.741-.36-7.653-2.515L189.18 207.19C172.922 222.982 151.185 231.872 128.52 232 79.83 232.28 40 191.51 40 142.83v-78.83c-0-2.137 .855-4.186 2.375-5.689C43.895 56.808 45.953 55.976 48.09 56c1.25 0 2.48 0 3.72 .09L42.08 45.38C40.117 43.271 39.439 40.27 40.306 37.522c.867-2.748 3.144-4.817 5.961-5.418 2.818-.601 5.741 .36 7.653 2.515ZM136.32 149.05 69.18 75.19C64.883 73.86 60.47 72.939 56 72.44v39.94c31.392 2.905 58.844 22.35 72 51 2.318-5.027 5.103-9.825 8.32-14.33Z"),
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
        return _grainsSlash!!
    }

private var _grainsSlash: ImageVector? = null
