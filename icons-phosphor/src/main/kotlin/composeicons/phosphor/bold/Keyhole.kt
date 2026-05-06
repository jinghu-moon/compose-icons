package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Keyhole: ImageVector
    get() {
        if (_keyhole != null) return _keyhole!!
        _keyhole = phosphorBoldIcon(
            name = "Keyhole",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM128 212C81.608 212 44 174.392 44 128 44 81.608 81.608 44 128 44c46.392 0 84 37.608 84 84-.05 46.371-37.629 83.95-84 84ZM128 68C110.868 67.996 95.291 77.936 88.078 93.475c-7.213 15.54-4.75 33.853 6.312 46.935l-9.86 32.06c-1.12 3.64-.446 7.596 1.816 10.659 2.263 3.064 5.845 4.871 9.654 4.871h64c3.809 0 7.391-1.807 9.654-4.871 2.263-3.064 2.937-7.019 1.816-10.659l-9.86-32.06c11.062-13.082 13.524-31.395 6.312-46.935C160.709 77.936 145.132 67.996 128 68ZM136.53 140.51 143.75 164h-31.5l7.22-23.49c1.438-4.71-.148-9.821-4-12.89-6.629-5.308-9.184-14.223-6.371-22.236 2.813-8.013 10.379-13.376 18.871-13.376 8.492 0 16.059 5.363 18.871 13.376 2.813 8.013 .258 16.929-6.371 22.236-3.83 3.084-5.392 8.192-3.94 12.89Z"),
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
        return _keyhole!!
    }

private var _keyhole: ImageVector? = null
