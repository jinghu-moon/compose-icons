package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberSquareFive: ImageVector
    get() {
        if (_numberSquareFive != null) return _numberSquareFive!!
        _numberSquareFive = phosphorFillIcon(
            name = "NumberSquareFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM124 112c19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36-9.625 .158-18.902-3.595-25.71-10.4-2.081-2.024-2.903-5.017-2.146-7.82 .757-2.803 2.972-4.976 5.79-5.678 2.817-.702 5.794 .178 7.777 2.298 3.812 3.719 8.966 5.738 14.29 5.6 11.046 0 20-8.954 20-20 0-11.046-8.954-20-20-20-5.324-.138-10.478 1.881-14.29 5.6-2.446 2.492-6.225 3.109-9.337 1.526-3.112-1.583-4.837-5.002-4.263-8.446l8-48c.645-3.855 3.981-6.68 7.89-6.68h40c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-33.22l-4.19 25.14c3.078-.763 6.239-1.146 9.41-1.14Z"),
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
        return _numberSquareFive!!
    }

private var _numberSquareFive: ImageVector? = null
