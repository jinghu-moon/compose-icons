package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GlobeStand: ImageVector
    get() {
        if (_globeStand != null) return _globeStand!!
        _globeStand = phosphorDuotoneIcon(
            name = "GlobeStand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 104c0 39.764-32.236 72-72 72C96.235 176 64 143.764 64 104 64 64.235 96.235 32 136 32c39.764 0 72 32.235 72 72Z"),
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
                pathData = parseSvgPathData("M136 184c44.183 0 80-35.817 80-80C216 59.817 180.183 24 136 24 91.817 24 56 59.817 56 104c.05 44.162 35.838 79.95 80 80ZM136 40c35.346 0 64 28.654 64 64 0 35.346-28.654 64-64 64C100.654 168 72 139.346 72 104c.039-35.33 28.67-63.961 64-64ZM213.77 173.5c1.472 1.531 2.275 3.584 2.232 5.708-.043 2.123-.929 4.143-2.462 5.612C194.715 202.977 170.092 213.918 144 215.72v16.28h24c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-64c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h24v-16.29C84.685 212.608 47.068 184.746 31.473 144.217 15.878 103.688 25.117 57.797 55.18 26.46c1.967-2.114 4.921-3.004 7.729-2.328 2.808 .676 5.033 2.813 5.822 5.59 .79 2.778 .021 5.765-2.011 7.817C30.442 75.224 31.01 135.015 67.997 172.003c36.988 36.988 96.779 37.556 134.463 1.277 3.184-3.062 8.247-2.963 11.31 .22Z"),
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
        return _globeStand!!
    }

private var _globeStand: ImageVector? = null
