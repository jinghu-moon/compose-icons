package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HeartStraight: ImageVector
    get() {
        if (_heartStraight != null) return _heartStraight!!
        _heartStraight = phosphorDuotoneIcon(
            name = "HeartStraight",
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
                pathData = parseSvgPathData("M223 57C200.373 34.43 163.762 34.385 141.08 56.9L128 69.05 114.91 56.86C92.228 34.241 55.504 34.293 32.885 56.975 10.266 79.657 10.318 116.381 33 139l89.35 90.66c1.504 1.527 3.557 2.387 5.7 2.387 2.143 0 4.196-.86 5.7-2.387L223 139c22.634-22.648 22.634-59.352 0-82ZM211.65 127.76 128 212.6 44.3 127.68C27.897 111.277 27.897 84.683 44.3 68.28c16.403-16.403 42.997-16.403 59.4 0l.2 .2 18.65 17.35c3.071 2.858 7.829 2.858 10.9 0L152.1 68.48l.2-.2c16.414-16.392 43.008-16.374 59.4 .04 16.392 16.414 16.374 43.008-.04 59.4Z"),
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
