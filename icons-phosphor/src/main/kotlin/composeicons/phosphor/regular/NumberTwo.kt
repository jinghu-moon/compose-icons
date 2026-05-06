package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NumberTwo: ImageVector
    get() {
        if (_numberTwo != null) return _numberTwo!!
        _numberTwo = phosphorRegularIcon(
            name = "NumberTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 208c0 4.418-3.582 8-8 8h-80c-3.03 0-5.8-1.712-7.155-4.422-1.355-2.71-1.063-5.954 .755-8.378l71.94-95.92c6.986-9.122 8.545-21.289 4.085-31.877C153.165 64.814 143.371 57.429 131.964 56.054c-11.407-1.375-22.676 3.471-29.524 12.696-1.505 2.001-2.773 4.168-3.78 6.46-1.77 4.048-6.487 5.895-10.535 4.125C84.077 77.565 82.23 72.848 84 68.8 91.402 51.855 107.88 40.669 126.36 40.043c18.48-.626 35.677 9.419 44.21 25.824 8.532 16.405 6.883 36.252-4.24 51.023L104 200h64c4.418 0 8 3.582 8 8Z"),
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
        return _numberTwo!!
    }

private var _numberTwo: ImageVector? = null
