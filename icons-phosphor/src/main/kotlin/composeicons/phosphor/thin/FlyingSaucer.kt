package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FlyingSaucer: ImageVector
    get() {
        if (_flyingSaucer != null) return _flyingSaucer!!
        _flyingSaucer = phosphorThinIcon(
            name = "FlyingSaucer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M179.79 214.73c.336 1.007 .258 2.105-.217 3.054-.474 .949-1.307 1.671-2.313 2.006-.406 .138-.831 .209-1.26 .21-1.719-.001-3.244-1.1-3.79-2.73l-8-24c-.518-1.371-.245-2.915 .712-4.025 .956-1.11 2.443-1.608 3.875-1.299 1.432 .31 2.58 1.378 2.993 2.783ZM128 188c-2.209 0-4 1.791-4 4v32c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-32c0-2.209-1.791-4-4-4ZM89.26 188.2c-2.093-.692-4.351 .439-5.05 2.53l-8 24c-.518 1.371-.245 2.915 .712 4.025 .956 1.11 2.443 1.608 3.875 1.299 1.432-.31 2.58-1.378 2.993-2.783l8-24c.339-1.008 .262-2.109-.213-3.06-.475-.951-1.309-1.674-2.317-2.01ZM244 112c0 29.16-50.95 52-116 52C62.95 164 12 141.16 12 112 12 91.69 36.8 73.84 76.84 65.2 86.219 49.396 102.36 38.798 120.59 36.473c18.23-2.325 36.514 3.883 49.56 16.827 3.631 3.589 6.795 7.621 9.42 12C219.36 74 244 91.77 244 112ZM76 96.83v3c-.019 5.563 3.818 10.397 9.24 11.64 14.039 3.106 28.382 4.626 42.76 4.53 14.373 .112 28.713-1.391 42.75-4.48 5.426-1.239 9.268-6.074 9.25-11.64v-3.88c.001-13.912-5.572-27.244-15.474-37.016C154.625 49.212 141.22 43.815 127.31 44 99 44.37 76 68.07 76 96.83ZM236 112C236 97 215.87 82.63 184.06 74.57c2.612 6.842 3.948 14.106 3.94 21.43v3.91c.018 9.285-6.397 17.345-15.45 19.41C157.923 122.546 142.979 124.116 128 124c-14.975 .115-29.916-1.455-44.54-4.68C74.401 117.262 67.98 109.199 68 99.91h0v-3.06c-.001-7.654 1.441-15.24 4.25-22.36C40.25 82.54 20 96.88 20 112c0 23.85 49.46 44 108 44 58.54 0 108-20.15 108-44Z"),
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
