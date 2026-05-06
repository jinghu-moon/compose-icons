package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HeartStraightBreak: ImageVector
    get() {
        if (_heartStraightBreak != null) return _heartStraightBreak!!
        _heartStraightBreak = phosphorBoldIcon(
            name = "HeartStraightBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M225.84 54.16C201.659 29.979 162.465 29.944 138.24 54.08L128 63.94 117.76 54.08C93.505 30.093 54.429 30.205 30.312 54.332 6.196 78.459 6.101 117.536 30.1 141.78l89.35 90.64c2.255 2.29 5.336 3.58 8.55 3.58 3.214 0 6.295-1.29 8.55-3.58l89.29-90.58c24.212-24.212 24.212-63.468 0-87.68ZM208.84 124.93l-80.81 82L47.16 124.93C37.527 115.337 33.753 101.329 37.262 88.195 40.772 75.061 51.031 64.802 64.165 61.292c13.134-3.51 27.142 .265 36.735 9.898l.16 .16 9.67 9.31-7 6.76c-2.322 2.234-3.648 5.307-3.68 8.529-.032 3.222 1.233 6.321 3.51 8.601L127 128l-7.52 7.51c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0l16-16c2.259-2.252 3.529-5.31 3.529-8.5 0-3.19-1.27-6.248-3.529-8.5L129.13 96.16 155 71.29l.16-.16c9.605-9.617 23.615-13.372 36.742-9.847 13.127 3.525 23.372 13.792 26.867 26.927 3.496 13.135-.29 27.136-9.929 36.72Z"),
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
