package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowUDownLeft: ImageVector
    get() {
        if (_arrowUDownLeft != null) return _arrowUDownLeft!!
        _arrowUDownLeft = phosphorBoldIcon(
            name = "ArrowUDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 112c-.039 37.539-30.461 67.961-68 68h-107l27.52 27.51c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0l-48-48c-2.259-2.252-3.529-5.31-3.529-8.5 0-3.19 1.27-6.248 3.529-8.5L71.52 111.51c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17L61 156h107c24.301 0 44-19.699 44-44C212 87.699 192.301 68 168 68h-88C73.373 68 68 62.627 68 56 68 49.373 73.373 44 80 44h88c37.539 .039 67.961 30.461 68 68Z"),
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
        return _arrowUDownLeft!!
    }

private var _arrowUDownLeft: ImageVector? = null
