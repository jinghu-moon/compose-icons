package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MaskHappy: ImageVector
    get() {
        if (_maskHappy != null) return _maskHappy!!
        _maskHappy = phosphorDuotoneIcon(
            name = "MaskHappy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 48v55.77C216 174.6 176.6 232 128 232 79.4 232 40 174.6 40 103.79v-55.79c-.003-2.641 1.297-5.113 3.475-6.607 2.178-1.494 4.953-1.817 7.415-.863C66 46.41 95.11 55.71 128 55.71c32.89 0 62-9.3 77.11-15.16 2.459-.953 5.23-.632 7.407 .857 2.177 1.489 3.48 3.956 3.483 6.593Z"),
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
                pathData = parseSvgPathData("M217 34.8c-4.352-2.989-9.902-3.63-14.82-1.71C188.15 38.55 159.82 47.71 128 47.71 96.18 47.71 67.84 38.55 53.79 33.09 48.869 31.18 43.322 31.82 38.965 34.801 34.608 37.782 32.002 42.721 32 48v55.77c0 35.84 9.65 69.65 27.18 95.18 18.16 26.46 42.6 41 68.82 41 26.22 0 50.66-14.57 68.82-41C214.35 173.44 224 139.63 224 103.79v-55.79c-.01-5.286-2.629-10.227-7-13.2ZM208 103.8c0 32.64-8.66 63.23-24.37 86.13C168.54 211.9 148.79 224 128 224 107.21 224 87.46 211.9 72.37 189.92 56.66 167 48 136.43 48 103.79v-55.79c15.11 5.87 45.58 15.71 80 15.71 34.42 0 64.9-9.84 80-15.71v55.81ZM190 122.67c2.944 3.314 2.644 8.386-.67 11.33-3.314 2.944-8.386 2.644-11.33-.67-2.68-3-8.85-5.33-14-5.33-5.15 0-11.36 2.34-14 5.33-2.946 3.314-8.021 3.611-11.335 .665-3.314-2.946-3.611-8.021-.665-11.335C143.71 116.28 154.14 112 164 112c9.86 0 20.25 4.28 26 10.66ZM92 128c-5.19 0-11.36 2.34-14 5.33-2.946 3.314-8.021 3.611-11.335 .665C63.351 131.049 63.054 125.974 66 122.66 71.75 116.28 82.18 112 92 112c9.82 0 20.25 4.28 26 10.66 2.946 3.314 2.649 8.389-.665 11.335-3.314 2.946-8.389 2.649-11.335-.665C103.36 130.34 97.19 128 92 128ZM168.45 173.19C158.399 185.116 143.597 191.999 128 191.999c-15.597 0-30.399-6.883-40.45-18.809-2.869-3.361-2.471-8.411 .89-11.28 3.361-2.869 8.411-2.471 11.28 .89 7.009 8.368 17.364 13.202 28.28 13.202 10.916 0 21.271-4.834 28.28-13.202 2.869-3.361 7.919-3.759 11.28-.89 3.361 2.869 3.759 7.919 .89 11.28Z"),
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
        return _maskHappy!!
    }

private var _maskHappy: ImageVector? = null
