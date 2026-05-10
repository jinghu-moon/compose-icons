package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MaskSad: ImageVector
    get() {
        if (_maskSad != null) return _maskSad!!
        _maskSad = phosphorFillIcon(
            name = "MaskSad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M217 34.8c-4.352-2.989-9.902-3.63-14.82-1.71C188.15 38.55 159.82 47.71 128 47.71 96.18 47.71 67.84 38.55 53.79 33.09 48.869 31.18 43.322 31.82 38.965 34.801 34.608 37.782 32.002 42.721 32 48v55.77c0 35.84 9.65 69.65 27.18 95.18 18.16 26.46 42.6 41 68.82 41 26.22 0 50.66-14.57 68.82-41C214.35 173.44 224 139.63 224 103.79v-55.79c-.01-5.286-2.629-10.227-7-13.2ZM66 125.33c-2.946-3.314-2.649-8.389 .665-11.335 3.314-2.946 8.389-2.649 11.335 .665 2.68 3 8.85 5.34 14 5.34 5.15 0 11.36-2.35 14-5.34 2.946-3.314 8.021-3.611 11.335-.665 3.314 2.946 3.611 8.021 .665 11.335C112.25 131.71 101.82 136 92 136c-9.82 0-20.25-4.29-26-10.67ZM158.62 188.43c-1.475 2.218-3.957 3.556-6.62 3.57-1.574 .002-3.113-.464-4.42-1.34C141.07 186.34 136 184 128 184c-8 0-13.07 2.34-19.57 6.66-3.675 2.353-8.558 1.327-10.975-2.307-2.417-3.633-1.476-8.533 2.115-11.013C108 171.73 116.06 168 128 168c11.94 0 20 3.73 28.43 9.34 3.678 2.447 4.676 7.412 2.23 11.09ZM189.92 125.33c-5.71 6.38-16.14 10.67-26 10.67-9.86 0-20.25-4.29-26-10.67-2.946-3.336-2.631-8.429 .705-11.375 3.336-2.946 8.429-2.631 11.375 .705 2.68 3 8.85 5.34 14 5.34 5.15 0 11.36-2.35 14-5.34 2.946-3.314 8.021-3.611 11.335-.665 3.314 2.946 3.611 8.021 .665 11.335Z"),
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
        return _maskSad!!
    }

private var _maskSad: ImageVector? = null
