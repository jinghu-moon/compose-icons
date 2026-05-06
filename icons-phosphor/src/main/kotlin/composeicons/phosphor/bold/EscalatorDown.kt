package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.EscalatorDown: ImageVector
    get() {
        if (_escalatorDown != null) return _escalatorDown!!
        _escalatorDown = phosphorBoldIcon(
            name = "EscalatorDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M167.51 88.49c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L188 75v-27c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v27l3.51-3.52c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17l-24 24c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529ZM244 160v40c0 11.046-8.954 20-20 20h-56c-3.35 .001-6.548-1.399-8.82-3.86L66.75 116h-34.75C20.954 116 12 107.046 12 96v-40C12 44.954 20.954 36 32 36h56c3.35-.001 6.548 1.399 8.82 3.86L189.25 140h34.75c11.046 0 20 8.954 20 20ZM220 164h-36c-3.35 .001-6.548-1.399-8.82-3.86L82.75 60h-46.75v32h36c3.35-.001 6.548 1.399 8.82 3.86L173.25 196h46.75Z"),
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
        return _escalatorDown!!
    }

private var _escalatorDown: ImageVector? = null
