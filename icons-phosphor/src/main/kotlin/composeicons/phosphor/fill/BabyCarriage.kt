package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BabyCarriage: ImageVector
    get() {
        if (_babyCarriage != null) return _babyCarriage!!
        _babyCarriage = phosphorFillIcon(
            name = "BabyCarriage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M215.58 54.55c-.387-.475-.83-.902-1.32-1.27C199.51 39.589 180.125 31.986 160 32h-8c-8.837 0-16 7.163-16 16v56h-80.8C51.373 85.388 35.001 72.023 16 72c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 13.255 0 24 10.745 24 24 .05 44.162 35.838 79.95 80 80h40c32.598 .023 61.945-19.751 74.166-49.972 12.22-30.221 4.866-64.835-18.586-87.478ZM208.67 70.55c8.099 9.463 13.248 21.092 14.81 33.45h-56.67ZM160 48c13.136-.012 25.953 4.043 36.69 11.61L152 95.35v-47.35ZM104 224c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM208 224c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16Z"),
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
        return _babyCarriage!!
    }

private var _babyCarriage: ImageVector? = null
