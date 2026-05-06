package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TwitterLogo: ImageVector
    get() {
        if (_twitterLogo != null) return _twitterLogo!!
        _twitterLogo = phosphorThinIcon(
            name = "TwitterLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243.7 70.47C243.08 68.974 241.62 67.998 240 68h-32.8C199.593 53.376 184.534 44.144 168.05 44c-11.567-.166-22.708 4.362-30.88 12.55C128.717 64.827 123.968 76.169 124 88v11.16C80.35 89.77 44 53.56 43.61 53.16c-1.094-1.104-2.727-1.474-4.19-.95-1.466 .527-2.492 1.858-2.63 3.41-4.2 46.62 9.27 77.71 21.31 95.59 6.545 9.923 14.748 18.647 24.25 25.79C66.67 197.49 38.89 208.13 38.6 208.24c-1.155 .425-2.051 1.358-2.428 2.529-.377 1.172-.193 2.452 .498 3.471 .27 .4 2.79 4 9.54 7.36C54.73 225.84 66.1 228 80 228c69.09 0 126.73-53.56 131.89-122.23L242.83 74.83c1.145-1.143 1.489-2.864 .87-4.36ZM205.17 101.17c-.688 .69-1.1 1.607-1.16 2.58C199.85 168.94 145.38 220 80 220c-17.85 0-27.63-3.89-32.5-6.87 10.37-4.82 31.45-16.34 43.83-34.91 .608-.919 .811-2.047 .56-3.12-.243-1.078-.93-2.004-1.89-2.55-.13-.08-13.39-8-25.52-26.15C54 130.71 42.39 104.11 44.19 64.65c13.17 11.62 45.48 37 83.15 43.3 1.17 .196 2.366-.138 3.266-.91 .9-.772 1.411-1.904 1.394-3.09v-15.95c-.016-9.689 3.873-18.975 10.79-25.76C149.468 55.566 158.559 51.873 168 52c14.2 .18 27.49 8.86 33.06 21.61 .631 1.435 2.042 2.37 3.61 2.39h25.67Z"),
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
        return _twitterLogo!!
    }

private var _twitterLogo: ImageVector? = null
