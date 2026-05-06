package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowUUpLeft: ImageVector
    get() {
        if (_arrowUUpLeft != null) return _arrowUUpLeft!!
        _arrowUUpLeft = phosphorBoldIcon(
            name = "ArrowUUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 144c-.039 37.539-30.461 67.961-68 68h-88c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h88c24.301 0 44-19.699 44-44 0-24.301-19.699-44-44-44h-107l27.52 27.51c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0L23.52 96.51C21.261 94.258 19.991 91.2 19.991 88.01c0-3.19 1.27-6.248 3.529-8.5L71.52 31.51c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17L61 76h107c37.537 .044 67.956 30.463 68 68Z"),
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
        return _arrowUUpLeft!!
    }

private var _arrowUUpLeft: ImageVector? = null
