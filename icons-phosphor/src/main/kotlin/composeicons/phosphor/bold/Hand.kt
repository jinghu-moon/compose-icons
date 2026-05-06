package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Hand: ImageVector
    get() {
        if (_hand != null) return _hand!!
        _hand = phosphorBoldIcon(
            name = "Hand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188 44c-2.698-.005-5.386 .331-8 1v-1C180.014 29.082 169.719 16.133 155.182 12.785 140.644 9.437 125.722 16.579 119.21 30 109.38 26.323 98.371 27.701 89.75 33.686 81.129 39.672 75.991 49.505 76 60v50.83C65.207 98.518 46.862 96.338 33.485 105.779 20.108 115.22 16.015 133.236 24 147.53 55.82 214.6 75.35 244 128 244c50.787-.055 91.945-41.213 92-92v-76C220 58.327 205.673 44 188 44ZM196 152c-.044 37.537-30.463 67.956-68 68C92.17 220 78.29 206 45.52 136.86c-.14-.29-.29-.58-.45-.86-2.069-3.811-.726-8.576 3.029-10.745 3.755-2.169 8.554-.951 10.821 2.745l.21 .35 18.68 30c2.831 4.552 8.338 6.674 13.491 5.199 5.154-1.475 8.704-6.189 8.699-11.549v-92c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v60c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-76c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v76c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-44c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _hand!!
    }

private var _hand: ImageVector? = null
