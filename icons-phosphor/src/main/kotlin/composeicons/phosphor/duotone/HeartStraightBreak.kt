package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HeartStraightBreak: ImageVector
    get() {
        if (_heartStraightBreak != null) return _heartStraightBreak!!
        _heartStraightBreak = phosphorDuotoneIcon(
            name = "HeartStraightBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M217.36 133.36 128 224 38.64 133.36C19.111 113.831 19.111 82.169 38.64 62.64c19.529-19.529 51.191-19.529 70.72 0L128 80 146.64 62.64c19.529-19.529 51.191-19.529 70.72 0 19.529 19.529 19.529 51.191 0 70.72Z"),
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
                pathData = parseSvgPathData("M223 57C200.346 34.404 163.687 34.377 141 56.94L128 69.47 115 56.91C92.343 34.266 55.619 34.278 32.975 56.935 10.331 79.592 10.343 116.316 33 138.96l89.37 90.66c1.504 1.527 3.557 2.387 5.7 2.387 2.143 0 4.196-.86 5.7-2.387L223 139c22.585-22.668 22.585-59.332 0-82ZM211.64 127.76 128 212.6 44.29 127.68C27.887 111.274 27.889 84.678 44.295 68.275c16.406-16.403 43.002-16.401 59.405 .005l.1 .1 12.67 12.19-10 9.65c-1.548 1.49-2.431 3.539-2.452 5.687-.021 2.148 .823 4.214 2.342 5.733L132.69 128l-10.35 10.35c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0l16-16c3.122-3.124 3.122-8.186 0-11.31L123.42 96.09 152.2 68.38l.11-.1c16.414-16.395 43.01-16.379 59.405 .035 16.395 16.414 16.379 43.01-.035 59.405Z"),
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
