package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PushPin: ImageVector
    get() {
        if (_pushPin != null) return _pushPin!!
        _pushPin = phosphorRegularIcon(
            name = "PushPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.32 81.37 174.63 20.69c-3.001-3.001-7.071-4.688-11.315-4.688-4.244 0-8.314 1.686-11.315 4.688L98.37 74.49C87.71 71.15 63.37 67.12 37.97 87.63c-3.541 2.847-5.704 7.065-5.95 11.602-.246 4.537 1.448 8.964 4.66 12.178L85 159.71 42.34 202.34c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0L96.29 171l48.29 48.29c2.998 3.011 7.071 4.705 11.32 4.71 .38 0 .75 0 1.13 0 4.615-.32 8.863-2.63 11.64-6.33 19.64-26.1 17.75-47.32 13.19-60L235.33 104c3-3.002 4.684-7.073 4.683-11.317-.002-4.244-1.69-8.314-4.693-11.313ZM224 92.69h0l-57.27 57.46c-2.425 2.434-3.025 6.146-1.49 9.22 9.46 18.93-1.8 38.59-9.34 48.62L48 100.08C60.08 90.34 71.64 87.77 80.48 87.77c5.609-.077 11.172 1.024 16.33 3.23 3.086 1.545 6.815 .936 9.25-1.51L163.32 32 224 92.68Z"),
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
        return _pushPin!!
    }

private var _pushPin: ImageVector? = null
