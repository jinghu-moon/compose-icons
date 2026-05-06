package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TrayArrowUp: ImageVector
    get() {
        if (_trayArrowUp != null) return _trayArrowUp!!
        _trayArrowUp = phosphorBoldIcon(
            name = "TrayArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 28h-160C36.954 28 28 36.954 28 48v160c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-160C228 36.954 219.046 28 208 28ZM204 52v92h-24.69c-5.307-.014-10.399 2.096-14.14 5.86L147 168h-38L90.83 149.86C87.089 146.096 81.997 143.986 76.69 144h-24.69v-92ZM52 204v-36h23l18.14 18.14c3.748 3.772 8.853 5.882 14.17 5.86h41.38c5.307 .014 10.399-2.096 14.14-5.86L181 168h23v36ZM87.51 116.49c-2.259-2.252-3.529-5.31-3.529-8.5 0-3.19 1.27-6.248 3.529-8.5l32-32c2.252-2.259 5.31-3.529 8.5-3.529 3.19 0 6.248 1.27 8.5 3.529l32 32c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0L140 105v35c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-35l-11.51 11.52c-2.255 2.249-5.311 3.51-8.496 3.504-3.185-.006-6.237-1.277-8.484-3.534Z"),
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
        return _trayArrowUp!!
    }

private var _trayArrowUp: ImageVector? = null
