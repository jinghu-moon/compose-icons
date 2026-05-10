package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MaskHappy: ImageVector
    get() {
        if (_maskHappy != null) return _maskHappy!!
        _maskHappy = phosphorFillIcon(
            name = "MaskHappy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M217 34.8c-4.352-2.989-9.902-3.63-14.82-1.71C188.15 38.55 159.82 47.71 128 47.71 96.18 47.71 67.84 38.55 53.79 33.09 48.869 31.18 43.322 31.82 38.965 34.801 34.608 37.782 32.002 42.721 32 48v55.77c0 35.84 9.65 69.65 27.18 95.18 18.16 26.46 42.6 41 68.82 41 26.22 0 50.66-14.57 68.82-41C214.35 173.44 224 139.63 224 103.79v-55.79c-.01-5.286-2.629-10.227-7-13.2ZM78 133.33c-2.946 3.314-8.021 3.611-11.335 .665C63.351 131.049 63.054 125.974 66 122.66 71.75 116.28 82.18 112 92 112c9.82 0 20.25 4.28 26 10.66 2.946 3.314 2.649 8.389-.665 11.335-3.314 2.946-8.389 2.649-11.335-.665C103.32 130.33 97.15 128 92 128c-5.15 0-11.36 2.34-14 5.33ZM168.49 181.19c-10.051 11.926-24.853 18.809-40.45 18.809-15.597 0-30.399-6.883-40.45-18.809-2.065-2.138-2.774-5.244-1.842-8.066 .932-2.822 3.352-4.895 6.284-5.383 2.932-.488 5.892 .69 7.688 3.059 7.009 8.368 17.364 13.202 28.28 13.202 10.916 0 21.271-4.834 28.28-13.202 2.869-3.361 7.919-3.759 11.28-.89 3.361 2.869 3.759 7.919 .89 11.28ZM189.34 134c-1.582 1.416-3.661 2.145-5.781 2.026-2.119-.118-4.105-1.074-5.519-2.656-2.68-3-8.85-5.33-14-5.33-5.15 0-11.36 2.34-14 5.33-2.957 3.325-8.05 3.622-11.375 .665-3.325-2.957-3.622-8.05-.665-11.375C143.71 116.28 154.14 112 164 112c9.86 0 20.25 4.28 26 10.66 1.424 1.588 2.156 3.678 2.032 5.807-.124 2.129-1.093 4.121-2.692 5.533Z"),
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
