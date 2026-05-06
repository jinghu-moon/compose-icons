package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BoxArrowDown: ImageVector
    get() {
        if (_boxArrowDown != null) return _boxArrowDown!!
        _boxArrowDown = phosphorBoldIcon(
            name = "BoxArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M226.73 66.63l-16-32C208.697 30.567 204.543 28.001 200 28h-144c-4.543 .001-8.697 2.567-10.73 6.63l-16 32C28.435 68.297 28 70.136 28 72v136c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-136c-0-1.864-.435-3.703-1.27-5.37ZM192.58 52l6 12h-141.16l6-12ZM52 204v-116h152v116ZM168.49 139.51c2.259 2.252 3.529 5.31 3.529 8.5 0 3.19-1.27 6.248-3.529 8.5l-32 32c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529l-32-32c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L116 151v-39c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v39l11.51-11.52c2.255-2.249 5.311-3.51 8.496-3.504 3.185 .006 6.237 1.277 8.484 3.534Z"),
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
        return _boxArrowDown!!
    }

private var _boxArrowDown: ImageVector? = null
