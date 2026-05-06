package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Magnet: ImageVector
    get() {
        if (_magnet != null) return _magnet!!
        _magnet = phosphorLightIcon(
            name = "Magnet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M205.56 51.65C189.503 35.269 167.538 26.027 144.6 26h-.33C121.431 25.937 99.518 35.019 83.42 51.22L22 113.39c-5.412 5.477-5.385 14.296 .06 19.74l28.66 28.66c2.619 2.636 6.184 4.112 9.9 4.1h.08c3.745-.007 7.329-1.525 9.94-4.21L131.51 99.28c6.951-6.919 18.147-7.043 25.25-.28 3.409 3.314 5.335 7.865 5.34 12.62 .035 5.023-1.921 9.855-5.44 13.44L94.37 185.31c-2.692 2.611-4.224 6.193-4.252 9.944-.028 3.75 1.449 7.355 4.102 10.006l28.67 28.66c5.44 5.403 14.206 5.447 19.7 .1l61.8-60.49c33.68-33.67 34.21-88.35 1.17-121.88ZM62.08 153.29c-.374 .382-.886 .598-1.42 .6-.529-.012-1.034-.219-1.42-.58L30.57 124.65c-.775-.78-.775-2.04 0-2.82L55.79 96.28l31.34 31.34ZM134.19 225.44c-.78 .775-2.04 .775-2.82 0L102.71 196.78c-.381-.378-.593-.893-.59-1.43 .005-.531 .221-1.038 .6-1.41L128.51 169l31.34 31.33ZM196 165l-27.52 26.94L137.19 160.65l27.9-27 .07-.08c5.825-5.857 9.066-13.8 9-22.06-.014-7.978-3.261-15.609-9-21.15C153.324 79.091 134.667 79.295 123.08 90.82L95.51 119 64.22 87.74 91.94 59.68C105.784 45.749 124.63 37.942 144.27 38h.28c19.738 .021 38.64 7.978 52.45 22.08C225.44 88.92 224.94 136 196 165Z"),
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
        return _magnet!!
    }

private var _magnet: ImageVector? = null
