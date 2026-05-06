package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Pepper: ImageVector
    get() {
        if (_pepper != null) return _pepper!!
        _pepper = phosphorDuotoneIcon(
            name = "Pepper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M214.83 92.58 192 104 160 88l-32 16L105.17 92.58C110.567 66.596 133.461 47.967 160 47.967c26.539 0 49.433 18.628 54.83 44.613Z"),
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
                pathData = parseSvgPathData("M167.27 40.42C163.616 21.613 147.158 8.026 128 8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 10.427 0 19.661 6.733 22.85 16.66C119.384 45.24 96.036 72.202 96 104c0 46.75-25.75 78-76.53 93-7.153 2.085-11.92 8.831-11.497 16.269 .423 7.438 5.924 13.6 13.267 14.861 15.03 2.598 30.257 3.893 45.51 3.87 40.78 0 86.16-9.15 117.53-35.46C210.64 174.44 224 143.3 224 104h0C223.965 71.481 199.575 44.145 167.27 40.42ZM160 56c20.474 .027 38.683 13.019 45.37 32.37L192 95 163.58 80.83c-2.253-1.128-4.907-1.128-7.16 0L128 95 114.63 88.32C121.336 68.991 139.54 56.023 160 56ZM174 184.3c-18 15.07-43.6 25.26-74.12 29.47C74.659 217.1 49.081 216.628 24 212.37h0 0c57.23-16.87 87.63-54 88-107.42l12.44 6.22c2.253 1.128 4.907 1.128 7.16 0L160 96.93l28.42 14.21c2.253 1.128 4.907 1.128 7.16 0l12.41-6.2c-.21 33.9-11.64 60.6-33.99 79.35Z"),
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
        return _pepper!!
    }

private var _pepper: ImageVector? = null
