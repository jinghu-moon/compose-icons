package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ClockCountdown: ImageVector
    get() {
        if (_clockCountdown != null) return _clockCountdown!!
        _clockCountdown = phosphorBoldIcon(
            name = "ClockCountdown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 137c-4.913 57.106-53.531 100.457-110.825 98.818C67.882 234.179 21.821 188.118 20.182 130.825 18.543 73.531 61.894 24.913 119 20c6.627-.552 12.448 4.373 13 11 .552 6.627-4.373 12.448-11 13C76.568 47.81 42.83 85.633 44.102 130.211c1.272 44.577 37.11 80.416 81.687 81.687C170.367 213.17 208.19 179.432 212 135c.552-6.627 6.373-11.552 13-11 6.627 .552 11.552 6.373 11 13ZM116 76v52c0 6.627 5.373 12 12 12h52c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-40v-40c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12ZM208 96c8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16ZM176 64c8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16Z"),
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
        return _clockCountdown!!
    }

private var _clockCountdown: ImageVector? = null
