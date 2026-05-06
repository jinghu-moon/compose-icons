package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pencil: ImageVector
    get() {
        if (_pencil != null) return _pencil!!
        _pencil = phosphorBoldIcon(
            name = "Pencil",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230.14 70.54 185.46 25.85c-3.751-3.752-8.839-5.861-14.145-5.861-5.306 0-10.394 2.108-14.145 5.861L33.86 149.17c-3.765 3.74-5.875 8.833-5.86 14.14v44.69c0 11.046 8.954 20 20 20h44.69c5.307 .014 10.399-2.096 14.14-5.86L230.14 98.82c7.808-7.81 7.808-20.47 0-28.28ZM93 180l71-71 11 11-71 71ZM76 163 65 152 136 81l11 11ZM52 173l15.51 15.51h0L83 204h-31ZM192 103 153 64 171.34 45.66l39 39Z"),
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
        return _pencil!!
    }

private var _pencil: ImageVector? = null
