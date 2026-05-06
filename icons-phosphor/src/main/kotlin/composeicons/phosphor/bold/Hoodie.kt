package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Hoodie: ImageVector
    get() {
        if (_hoodie != null) return _hoodie!!
        _hoodie = phosphorBoldIcon(
            name = "Hoodie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244.64 118.31 190.37 36.91C186.662 31.345 180.417 28.001 173.73 28h-91.46c-6.687 .001-12.932 3.345-16.64 8.91L11.36 118.31c-3.208 4.814-4.174 10.78-2.65 16.36l21.43 78.59c2.372 8.7 10.272 14.737 19.29 14.74h26.57c11.046 0 20-8.954 20-20v-12h64v12c0 11.046 8.954 20 20 20h26.57c9.018-.003 16.918-6.04 19.29-14.74l21.43-78.59c1.524-5.58 .558-11.546-2.65-16.36ZM84 172v-101.36l12 7.5v57.86c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-42.85l1.64 1c3.891 2.432 8.829 2.432 12.72 0l1.64-1v34.85c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-49.86l12-7.5v101.36ZM128 69.85 99.46 52h57.08ZM52.49 204 32.34 130.11 60 88.62v87.38c.004 7.949 4.715 15.141 12 18.32v9.68ZM203.49 204h-19.49v-9.68c7.285-3.179 11.996-10.371 12-18.32v-87.38l27.66 41.49Z"),
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
        return _hoodie!!
    }

private var _hoodie: ImageVector? = null
