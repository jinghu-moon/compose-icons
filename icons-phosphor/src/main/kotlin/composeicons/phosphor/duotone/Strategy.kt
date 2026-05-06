package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Strategy: ImageVector
    get() {
        if (_strategy != null) return _strategy!!
        _strategy = phosphorDuotoneIcon(
            name = "Strategy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M104 188c0 15.464-12.536 28-28 28C60.536 216 48 203.464 48 188c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M76 152c-19.882 0-36 16.118-36 36 0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36C112 168.118 95.882 152 76 152ZM76 208C64.954 208 56 199.046 56 188c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM42.34 106.34 56.69 92 42.34 77.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0L68 80.69 82.34 66.34c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32L79.31 92l14.35 14.34c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0L68 103.31 53.66 117.66c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32ZM229.66 202.34c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0L204 199.31l-14.34 14.35c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L192.69 188 178.34 173.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0L204 176.69l14.34-14.35c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32L215.31 188ZM184.47 112.83c-6.18 22.33-25.32 41.63-46.53 46.93-.635 .158-1.286 .238-1.94 .24-4.037-.007-7.435-3.021-7.926-7.028-.491-4.007 2.08-7.751 5.996-8.732 15.63-3.91 30.35-18.91 35-35.68 3.19-11.5 3.22-29-14.71-46.9L152 59.31v20.69c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-40c0-4.418 3.582-8 8-8h40c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-20.69l2.35 2.34c18.24 18.25 24.92 40.44 18.81 62.49Z"),
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
        return _strategy!!
    }

private var _strategy: ImageVector? = null
