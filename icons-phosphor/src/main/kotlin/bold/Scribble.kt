package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Scribble: ImageVector
    get() {
        if (_scribble != null) return _scribble!!
        _scribble = phosphorBoldIcon(
            name = "Scribble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.500 192.490 C 206.509 194.478 205.391 197.176 205.391 199.990 C 205.391 202.804 206.509 205.502 208.500 207.490 C 213.194 212.184 213.194 219.796 208.500 224.490 C 203.806 229.184 196.194 229.184 191.500 224.490 C 184.995 217.996 181.340 209.182 181.340 199.990 C 181.340 190.798 184.995 181.984 191.500 175.490 L 200.870 166.120 C 204.557 161.908 204.346 155.560 200.388 151.602 C 196.430 147.644 190.082 147.433 185.870 151.120 L 119.110 217.870 C 105.579 231.401 83.641 231.401 70.110 217.870 C 56.579 204.339 56.579 182.401 70.110 168.870 L 168.870 70.120 C 172.557 65.908 172.346 59.560 168.388 55.602 C 164.430 51.644 158.082 51.433 153.870 55.120 L 87.110 121.860 C 73.579 135.391 51.641 135.391 38.110 121.860 C 24.579 108.329 24.579 86.391 38.110 72.860 L 79.510 31.510 C 84.204 26.816 91.816 26.816 96.510 31.510 C 101.204 36.204 101.204 43.816 96.510 48.510 L 55.100 89.860 C 51.413 94.072 51.624 100.420 55.582 104.378 C 59.540 108.336 65.888 108.547 70.100 104.860 L 136.860 38.110 C 150.391 24.579 172.329 24.579 185.860 38.110 C 199.391 51.641 199.391 73.579 185.860 87.110 L 87.110 185.860 C 83.423 190.072 83.634 196.420 87.592 200.378 C 91.550 204.336 97.898 204.547 102.110 200.860 L 168.860 134.110 C 182.391 120.579 204.329 120.579 217.860 134.110 C 231.391 147.641 231.391 169.579 217.860 183.110 Z"),
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
        return _scribble!!
    }

private var _scribble: ImageVector? = null
