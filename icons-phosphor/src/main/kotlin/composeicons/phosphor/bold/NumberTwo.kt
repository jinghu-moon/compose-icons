package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberTwo: ImageVector
    get() {
        if (_numberTwo != null) return _numberTwo!!
        _numberTwo = phosphorBoldIcon(
            name = "NumberTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 208c0 6.627-5.373 12-12 12h-80c-4.545 0-8.7-2.568-10.733-6.633-2.033-4.065-1.594-8.93 1.133-12.567l71.95-95.92c6.527-8.611 7.517-20.21 2.543-29.802C147.92 65.485 137.87 59.61 127.071 59.983c-10.799 .372-20.42 6.925-24.721 16.837-2.656 6.075-9.735 8.846-15.81 6.19C80.465 80.354 77.694 73.275 80.35 67.2c1.629-3.723 3.686-7.243 6.13-10.49C103.764 33.774 136.369 29.191 159.305 46.475c22.936 17.284 27.519 49.889 10.235 72.825L112 196h56c6.627 0 12 5.373 12 12Z"),
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
        return _numberTwo!!
    }

private var _numberTwo: ImageVector? = null
