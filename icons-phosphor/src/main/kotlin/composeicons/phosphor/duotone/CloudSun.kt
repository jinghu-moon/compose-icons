package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CloudSun: ImageVector
    get() {
        if (_cloudSun != null) return _cloudSun!!
        _cloudSun = phosphorDuotoneIcon(
            name = "CloudSun",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M139.84 84.41h0c-20.457 7.766-35.947 24.874-41.65 46v-.11c-12.928-4.392-27.161-2.545-38.54 5h0C47.385 121.039 44.581 100.928 52.476 83.855 60.371 66.782 77.511 55.894 96.32 56.003c18.81 .109 35.822 11.194 43.52 28.357Z"),
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
                pathData = parseSvgPathData("M164 72c-6.845-.004-13.66 .914-20.26 2.73-2.605-4.251-5.77-8.132-9.41-11.54l9.51-13.57c2.535-3.62 1.655-8.61-1.965-11.145-3.62-2.535-8.61-1.655-11.145 1.965L121.22 54C113.4 50.051 104.761 47.996 96 48c-.58 0-1.16 0-1.74 0L91.37 31.71c-.413-2.89-2.368-5.326-5.1-6.355-2.732-1.029-5.808-.488-8.025 1.411-2.217 1.899-3.223 4.856-2.625 7.713l2.88 16.34C69.628 53.755 61.629 58.859 55.23 65.67L41.61 56.14c-2.341-1.681-5.405-1.973-8.021-.764-2.616 1.208-4.38 3.73-4.618 6.602-.238 2.872 1.087 5.65 3.469 7.272L46 78.77C42.037 86.589 39.981 95.234 40 104c0 .57 0 1.15 0 1.72l-16.29 2.88c-4.087 .716-6.949 4.439-6.59 8.573 .359 4.134 3.82 7.307 7.97 7.307 .466-.001 .931-.041 1.39-.12l16.32-2.88c1.434 4.366 3.402 8.537 5.86 12.42C33.001 148.445 27.836 171.091 35.64 190.988 43.444 210.884 62.627 223.98 84 224h80c41.974 0 76-34.026 76-76C240 106.026 205.974 72 164 72ZM56 104C56.01 86.619 67.243 71.233 83.796 65.93c16.553-5.303 34.636 .69 44.744 14.83-16.319 8.588-28.974 22.798-35.62 40-10.517-1.815-21.337-.36-31 4.17C58.051 118.634 56.002 111.39 56 104ZM164 208h-80C70.582 207.975 58.291 200.49 52.111 188.579c-6.18-11.911-5.222-26.27 2.484-37.254 7.706-10.985 20.882-16.772 34.185-15.015-.37 2.37-.63 4.79-.77 7.23-.254 4.418 3.122 8.206 7.54 8.46 4.418 .254 8.206-3.122 8.46-7.54 .224-3.99 .854-7.947 1.88-11.81 0-.16 .09-.32 .12-.48 8.168-30.015 37.902-48.827 68.523-43.353 30.621 5.475 51.995 33.424 49.257 64.41C221.051 184.213 195.107 207.981 164 208Z"),
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
        return _cloudSun!!
    }

private var _cloudSun: ImageVector? = null
