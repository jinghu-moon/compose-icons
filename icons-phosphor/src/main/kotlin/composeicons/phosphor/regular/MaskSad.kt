package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MaskSad: ImageVector
    get() {
        if (_maskSad != null) return _maskSad!!
        _maskSad = phosphorRegularIcon(
            name = "MaskSad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M158.66 188.43c-2.447 3.678-7.412 4.676-11.09 2.23C141.07 186.34 136 184 128 184c-8 0-13.07 2.34-19.57 6.66-3.675 2.353-8.558 1.327-10.975-2.307-2.417-3.633-1.476-8.533 2.115-11.013C108 171.73 116.06 168 128 168c11.94 0 20 3.73 28.43 9.34 3.678 2.447 4.676 7.412 2.23 11.09ZM224 48v55.77c0 35.84-9.65 69.65-27.18 95.18-18.16 26.46-42.6 41-68.82 41-26.22 0-50.66-14.57-68.82-41C41.65 173.44 32 139.63 32 103.79v-55.79c.002-5.279 2.608-10.218 6.965-13.199 4.357-2.981 9.904-3.621 14.825-1.711C67.84 38.55 96.18 47.71 128 47.71c31.82 0 60.15-9.16 74.21-14.62 4.921-1.91 10.468-1.27 14.825 1.711 4.357 2.981 6.963 7.92 6.965 13.199ZM208 48h0c-15.1 5.89-45.57 15.73-80 15.73C93.57 63.73 63.1 53.87 48 48v55.79c0 32.64 8.66 63.23 24.37 86.13C87.46 211.9 107.21 224 128 224c20.79 0 40.54-12.1 55.63-34.08C199.34 167 208 136.43 208 103.79ZM189.34 114c-1.58-1.417-3.659-2.148-5.778-2.031-2.119 .116-4.106 1.07-5.522 2.651-2.68 3-8.85 5.34-14 5.34-5.15 0-11.36-2.35-14-5.34-2.957-3.325-8.05-3.622-11.375-.665-3.325 2.957-3.622 8.05-.665 11.375 5.71 6.38 16.14 10.67 26 10.67 9.86 0 20.25-4.29 26-10.67 1.421-1.587 2.151-3.675 2.027-5.802-.124-2.127-1.091-4.116-2.687-5.528ZM118 125.33c2.946-3.314 2.649-8.389-.665-11.335-3.314-2.946-8.389-2.649-11.335 .665-2.68 3-8.85 5.34-14 5.34-5.15 0-11.36-2.35-14-5.34-2.946-3.314-8.021-3.611-11.335-.665-3.314 2.946-3.611 8.021-.665 11.335C71.75 131.71 82.18 136 92 136c9.82 0 20.25-4.29 26-10.67Z"),
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
