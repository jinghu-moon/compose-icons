package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Tray: ImageVector
    get() {
        if (_tray != null) return _tray!!
        _tray = phosphorBoldIcon(
            name = "Tray",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 28h-160C36.954 28 28 36.954 28 48v160c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-160C228 36.954 219.046 28 208 28ZM204 52v92h-24.69c-5.307-.014-10.399 2.096-14.14 5.86L147 168h-38L90.83 149.86C87.089 146.096 81.997 143.986 76.69 144h-24.69v-92ZM52 204v-36h23l18.14 18.14c3.748 3.772 8.853 5.882 14.17 5.86h41.38c5.307 .014 10.399-2.096 14.14-5.86L181 168h23v36Z"),
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
        return _tray!!
    }

private var _tray: ImageVector? = null
