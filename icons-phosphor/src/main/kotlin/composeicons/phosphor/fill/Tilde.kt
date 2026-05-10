package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Tilde: ImageVector
    get() {
        if (_tilde != null) return _tilde!!
        _tilde = phosphorFillIcon(
            name = "Tilde",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM198 131.66c-13.19 15-25.34 20.29-36.37 20.29-14.94 0-27.81-9.61-38.43-17.54C104 120.07 91.31 110.6 70 134.89c-1.834 2.32-4.799 3.439-7.709 2.909-2.91-.53-5.29-2.623-6.188-5.441-.898-2.818-.169-5.902 1.898-8.018 31.05-35.41 56.34-16.53 74.8-2.75 19.2 14.34 31.89 23.81 53.2-.48 1.834-2.32 4.799-3.439 7.709-2.909 2.91 .53 5.29 2.623 6.188 5.441 .898 2.818 .169 5.902-1.898 8.018Z"),
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
        return _tilde!!
    }

private var _tilde: ImageVector? = null
