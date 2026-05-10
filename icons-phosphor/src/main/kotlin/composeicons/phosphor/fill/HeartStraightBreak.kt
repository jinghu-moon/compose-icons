package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HeartStraightBreak: ImageVector
    get() {
        if (_heartStraightBreak != null) return _heartStraightBreak!!
        _heartStraightBreak = phosphorFillIcon(
            name = "HeartStraightBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M113.29 55.31C90.18 33.119 53.456 33.865 31.265 56.975 9.074 80.085 9.82 116.809 32.93 139l89.37 90.66c1.504 1.527 3.557 2.387 5.7 2.387 2.143 0 4.196-.86 5.7-2.387L223 139c22.671-22.644 22.694-59.379 .05-82.05C200.406 34.279 163.671 34.256 141 56.9h0l-24.4 23L143 106.32c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66l-20.69 20.69c-3.129 3.123-8.197 3.119-11.32-.01-3.123-3.129-3.119-8.197 .01-11.32l15-15L99.5 85.42C97.961 83.882 97.114 81.784 97.156 79.608c.042-2.175 .967-4.24 2.564-5.718L113.27 61.11c.795-.755 1.245-1.804 1.245-2.9 0-1.096-.45-2.145-1.245-2.9Z"),
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
        return _heartStraightBreak!!
    }

private var _heartStraightBreak: ImageVector? = null
