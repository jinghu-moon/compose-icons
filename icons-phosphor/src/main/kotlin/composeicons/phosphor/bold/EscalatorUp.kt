package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.EscalatorUp: ImageVector
    get() {
        if (_escalatorUp != null) return _escalatorUp!!
        _escalatorUp = phosphorBoldIcon(
            name = "EscalatorUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 36h-56c-3.35-.001-6.548 1.399-8.82 3.86L66.75 140h-34.75c-11.046 0-20 8.954-20 20v40c0 11.046 8.954 20 20 20h56c3.35 .001 6.548-1.399 8.82-3.86L189.25 116h34.75c11.046 0 20-8.954 20-20v-40C244 44.954 235.046 36 224 36ZM220 92h-36c-3.35-.001-6.548 1.399-8.82 3.86L82.75 196h-46.75v-32h36c3.35 .001 6.548-1.399 8.82-3.86L173.25 60h46.75ZM232.49 167.51c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0L212 181v27c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-27l-3.51 3.52c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17l24-24c2.252-2.259 5.31-3.529 8.5-3.529 3.19 0 6.248 1.27 8.5 3.529Z"),
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
        return _escalatorUp!!
    }

private var _escalatorUp: ImageVector? = null
