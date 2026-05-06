package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HeartStraight: ImageVector
    get() {
        if (_heartStraight != null) return _heartStraight!!
        _heartStraight = phosphorBoldIcon(
            name = "HeartStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M225.84 54.13C201.666 30.027 162.566 29.969 138.32 54L128 63.58 117.68 54C93.435 29.815 54.175 29.865 29.99 54.11 5.805 78.355 5.855 117.615 30.1 141.8l89.35 90.65c2.255 2.29 5.336 3.58 8.55 3.58 3.214 0 6.295-1.29 8.55-3.58l89.29-90.59c11.633-11.628 18.169-27.402 18.169-43.85 0-16.448-6.536-32.222-18.169-43.85ZM208.84 124.92 128 206.9 47.13 124.85C32.343 110.001 32.367 85.984 47.186 71.166 62.004 56.347 86.021 56.323 100.87 71.11c.1 .1 .2 .2 .31 .29l18.64 17.36c4.608 4.293 11.752 4.293 16.36 0L154.82 71.4c.11-.09 .21-.19 .31-.29 14.859-14.823 38.922-14.794 53.745 .065 14.823 14.859 14.794 38.922-.065 53.745Z"),
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
        return _heartStraight!!
    }

private var _heartStraight: ImageVector? = null
