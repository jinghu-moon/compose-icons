package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pen: ImageVector
    get() {
        if (_pen != null) return _pen!!
        _pen = phosphorBoldIcon(
            name = "Pen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230.15 70.54 185.46 25.86c-7.81-7.808-20.47-7.808-28.28 0L33.86 149.17c-3.764 3.741-5.874 8.833-5.86 14.14v44.69c0 11.046 8.954 20 20 20h44.69c5.307 .015 10.4-2.095 14.14-5.86l79.46-79.45 4.16 13.89-34.93 34.93c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0l40-40c3.121-3.125 4.273-7.711 3-11.94l-9.94-33.13L230.17 98.85c3.756-3.754 5.865-8.849 5.861-14.159-.004-5.311-2.119-10.402-5.881-14.151ZM65 152 136 81l39 39-71 71ZM52 173l31 31h-31ZM192 103 153 64 171.34 45.66l39 39Z"),
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
        return _pen!!
    }

private var _pen: ImageVector? = null
