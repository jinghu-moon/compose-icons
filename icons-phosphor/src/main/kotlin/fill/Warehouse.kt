package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Warehouse: ImageVector
    get() {
        if (_warehouse != null) return _warehouse!!
        _warehouse = phosphorFillIcon(
            name = "Warehouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 184.000 L 232.000 184.000 L 232.000 57.900 L 241.670 55.820 C 244.527 55.284 246.869 53.241 247.786 50.482 C 248.704 47.724 248.053 44.685 246.086 42.544 C 244.119 40.404 241.146 39.499 238.320 40.180 L 14.320 88.180 C 10.324 89.042 7.620 92.779 8.052 96.845 C 8.484 100.910 11.912 103.996 16.000 104.000 C 16.568 103.999 17.134 103.939 17.690 103.820 L 24.000 102.470 L 24.000 184.000 L 16.000 184.000 C 11.582 184.000 8.000 187.582 8.000 192.000 C 8.000 196.418 11.582 200.000 16.000 200.000 L 240.000 200.000 C 244.418 200.000 248.000 196.418 248.000 192.000 C 248.000 187.582 244.418 184.000 240.000 184.000 ZM 184.000 184.000 L 72.000 184.000 L 72.000 168.000 L 184.000 168.000 ZM 184.000 152.000 L 72.000 152.000 L 72.000 136.000 L 184.000 136.000 Z"),
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
        return _warehouse!!
    }

private var _warehouse: ImageVector? = null
