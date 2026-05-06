package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Camera: ImageVector
    get() {
        if (_camera != null) return _camera!!
        _camera = phosphorThinIcon(
            name = "Camera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 60h-29.87L163.32 37.78C162.579 36.67 161.334 36.002 160 36h-64c-1.334 .002-2.579 .67-3.32 1.78L77.85 60h-29.85C36.954 60 28 68.954 28 80v112c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-112C228 68.954 219.046 60 208 60ZM220 192c0 6.627-5.373 12-12 12h-160c-6.627 0-12-5.373-12-12v-112C36 73.373 41.373 68 48 68h32c1.338 .001 2.588-.667 3.33-1.78L98.13 44h59.72l14.82 22.22c.742 1.113 1.992 1.781 3.33 1.78h32c6.627 0 12 5.373 12 12ZM128 92c-22.091 0-40 17.909-40 40 0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40C168 109.909 150.091 92 128 92ZM128 164C110.327 164 96 149.673 96 132c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32Z"),
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
        return _camera!!
    }

private var _camera: ImageVector? = null
