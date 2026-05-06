package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Spade: ImageVector
    get() {
        if (_spade != null) return _spade!!
        _spade = phosphorBoldIcon(
            name = "Spade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M133.37 13.27c-3.38-1.691-7.36-1.691-10.74 0C118.44 15.36 20 65.4 20 136c-.002 17.576 7.702 34.269 21.078 45.671 13.376 11.402 31.079 16.365 48.432 13.579l-5.28 26.4c-.704 3.525 .21 7.181 2.489 9.96 2.28 2.78 5.686 4.391 9.281 4.39h64c3.595 .001 7.001-1.61 9.281-4.39 2.28-2.78 3.193-6.435 2.489-9.96l-5.28-26.4c17.354 2.786 35.056-2.178 48.432-13.579C228.298 170.269 236.002 153.576 236 136 236 65.4 137.56 15.36 133.37 13.27ZM176 172c-6.751 .009-13.368-1.887-19.09-5.47-4.06-2.545-9.245-2.43-13.189 .292-3.944 2.722-5.89 7.529-4.951 12.228L145.36 212h-34.72l6.59-32.95c.939-4.699-1.007-9.506-4.951-12.228-3.944-2.722-9.129-2.837-13.189-.292-11.098 6.942-25.09 7.312-36.54 .966C51.1 161.151 43.997 149.091 44 136 44 107.71 67.57 82.05 87.34 65.51 100.03 55.017 113.638 45.686 128 37.63c14.363 8.053 27.971 17.384 40.66 27.88C188.43 82.05 212 107.71 212 136c0 19.882-16.118 36-36 36Z"),
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
        return _spade!!
    }

private var _spade: ImageVector? = null
