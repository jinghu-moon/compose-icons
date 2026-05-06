package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Star: ImageVector
    get() {
        if (_star != null) return _star!!
        _star = phosphorBoldIcon(
            name = "Star",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243 96C240.464 88.174 233.461 82.647 225.26 82L168.67 77.43 146.83 24.62C143.691 16.986 136.254 12.003 128 12.003c-8.254 0-15.691 4.983-18.83 12.617L87.35 77.44 30.76 82c-8.215 .678-15.22 6.221-17.768 14.06-2.548 7.839-.139 16.442 6.108 21.82l43.18 37.24L49.08 210.82c-1.969 8.032 1.113 16.458 7.801 21.323 6.688 4.865 15.653 5.204 22.689 .857L128 203.19 176.43 233c7.033 4.317 15.974 3.969 22.651-.881 6.676-4.85 9.771-13.246 7.839-21.269L193.72 155.15l43.18-37.24C243.186 112.518 245.596 103.865 243 96ZM172.53 141.7c-3.394 2.926-4.875 7.5-3.84 11.86L181.58 208 134.29 178.92c-3.857-2.374-8.723-2.374-12.58 0L74.42 208 87.31 153.6c1.035-4.36-.446-8.934-3.84-11.86L41.2 105.24l55.4-4.47c4.495-.361 8.408-3.212 10.13-7.38L128 41.89l21.27 51.5c1.722 4.168 5.635 7.019 10.13 7.38l55.4 4.47Z"),
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
        return _star!!
    }

private var _star: ImageVector? = null
