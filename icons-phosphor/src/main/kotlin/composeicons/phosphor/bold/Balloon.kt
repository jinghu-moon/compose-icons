package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Balloon: ImageVector
    get() {
        if (_balloon != null) return _balloon!!
        _balloon = phosphorBoldIcon(
            name = "Balloon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 12C77.213 12.055 36.055 53.213 36 104c0 24.53 9.55 50.13 26.19 70.22 10 12 21.56 21.07 34.05 26.76L85 227.27c-1.588 3.703-1.212 7.956 1.002 11.323 2.214 3.367 5.969 5.398 9.998 5.407h64c4.029-.01 7.785-2.041 9.998-5.407 2.214-3.367 2.59-7.62 1.002-11.323L159.76 201c12.49-5.69 24.08-14.73 34.05-26.76C210.45 154.13 220 128.53 220 104 219.945 53.213 178.787 12.055 128 12ZM141.8 220h-27.6l5.35-12.49c5.614 .653 11.286 .653 16.9 0ZM175.33 158.91C161.93 175.09 145.12 184 128 184c-17.12 0-33.93-8.91-47.33-25.09C67.73 143.29 60 122.76 60 104 60 66.445 90.445 36 128 36c37.555 0 68 30.445 68 68 0 18.76-7.73 39.29-20.67 54.91ZM168.99 111.91q-.6 .06-1.2 .06c-6.162-.006-11.319-4.678-11.93-10.81C154.738 90.012 147.079 80.607 136.39 77.25c-6.321-1.994-9.829-8.734-7.835-15.055 1.994-6.321 8.734-9.829 15.055-7.835 19.854 6.232 34.072 23.713 36.13 44.42 .324 3.17-.626 6.339-2.641 8.807-2.015 2.469-4.929 4.035-8.099 4.353Z"),
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
        return _balloon!!
    }

private var _balloon: ImageVector? = null
