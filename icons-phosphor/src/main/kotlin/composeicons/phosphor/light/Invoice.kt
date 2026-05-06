package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Invoice: ImageVector
    get() {
        if (_invoice != null) return _invoice!!
        _invoice = phosphorLightIcon(
            name = "Invoice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M28 126c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h28c5.523 0 10-4.477 10-10C66 98.477 61.523 94 56 94h-16C27.85 94 18 84.15 18 72 18 59.85 27.85 50 40 50h2v-2c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v2h10c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-24C34.477 62 30 66.477 30 72c0 5.523 4.477 10 10 10h16c12.15 0 22 9.85 22 22 0 12.15-9.85 22-22 22h-2v2c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-2ZM230 56v136c0 7.732-6.268 14-14 14h-176c-7.732 0-14-6.268-14-14v-40c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v40c0 1.105 .895 2 2 2h122v-36h-82c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h82v-36h-58c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h114v-36h-122c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h128c3.314 0 6 2.686 6 6ZM174 146h44v-36h-44ZM218 192v-34h-44v36h42c1.105 0 2-.895 2-2Z"),
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
        return _invoice!!
    }

private var _invoice: ImageVector? = null
