package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Vignette: ImageVector
    get() {
        if (_vignette != null) return _vignette!!
        _vignette = phosphorBoldIcon(
            name = "Vignette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 36h-176C28.954 36 20 44.954 20 56v144c0 11.046 8.954 20 20 20h176c11.046 0 20-8.954 20-20v-144C236 44.954 227.046 36 216 36ZM212 196h-168v-136h168ZM81.43 166.05C94 175.05 110.56 180 128 180c17.44 0 34-4.95 46.57-13.95C188.19 156.32 196 142.45 196 128c0-14.45-7.81-28.32-21.43-38C162 81 145.44 76 128 76 110.56 76 94 81 81.43 90 67.81 99.68 60 113.55 60 128c0 14.45 7.81 28.32 21.43 38.05ZM128 100c23.85 0 44 12.82 44 28 0 15.18-20.15 28-44 28C104.15 156 84 143.18 84 128c0-15.18 20.15-28 44-28Z"),
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
        return _vignette!!
    }

private var _vignette: ImageVector? = null
