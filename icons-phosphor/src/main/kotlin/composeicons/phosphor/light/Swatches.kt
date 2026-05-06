package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Swatches: ImageVector
    get() {
        if (_swatches != null) return _swatches!!
        _swatches = phosphorLightIcon(
            name = "Swatches",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M86 180c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM238 156.19v51.81c0 7.732-6.268 14-14 14h-148c-2.541 .002-5.077-.216-7.58-.65C45.689 217.198 30.581 195.464 34.61 172.71l25-143.13c.629-3.663 2.695-6.923 5.739-9.057 3.044-2.133 6.813-2.962 10.471-2.303l54.67 9.72c7.588 1.37 12.64 8.617 11.3 16.21l-12.67 72.44 71-25.75c7.236-2.614 15.226 1.102 17.89 8.32l19.09 52.22c.55 1.546 .854 3.169 .9 4.81ZM104.93 185.19 130 42.08c.196-1.075-.508-2.108-1.58-2.32L73.72 30h-.34c-.384 .002-.759 .124-1.07 .35-.436 .307-.731 .775-.82 1.3L46.49 174.78c-2.891 16.239 7.87 31.766 24.09 34.76 7.692 1.374 15.614-.387 22-4.89 6.547-4.568 10.989-11.57 12.33-19.44ZM113.18 198.36 224.71 158c.485-.177 .883-.536 1.11-1 .218-.458 .24-.986 .06-1.46L206.79 103.33c-.388-1.01-1.509-1.529-2.53-1.17l-77.53 28.09-10 57.07c-.664 3.834-1.859 7.556-3.55 11.06ZM226 170.27 116.35 210h107.65c1.105 0 2-.895 2-2Z"),
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
        return _swatches!!
    }

private var _swatches: ImageVector? = null
