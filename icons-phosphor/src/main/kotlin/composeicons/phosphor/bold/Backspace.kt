package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Backspace: ImageVector
    get() {
        if (_backspace != null) return _backspace!!
        _backspace = phosphorBoldIcon(
            name = "Backspace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 36h-147.47c-7.021 .018-13.523 3.699-17.15 9.71L5.71 121.83c-2.277 3.798-2.277 8.542 0 12.34l45.67 76.12c3.627 6.011 10.129 9.692 17.15 9.71h147.47c11.046 0 20-8.954 20-20v-144C236 44.954 227.046 36 216 36ZM212 196h-141.2L30 128 70.8 60h141.2ZM103.51 143.51 119 128 103.48 112.49c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L136 111 151.51 95.48c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17L153 128l15.52 15.51c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0L136 145l-15.51 15.52c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17Z"),
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
        return _backspace!!
    }

private var _backspace: ImageVector? = null
