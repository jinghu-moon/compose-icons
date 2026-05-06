package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FishSimple: ImageVector
    get() {
        if (_fishSimple != null) return _fishSimple!!
        _fishSimple = phosphorBoldIcon(
            name = "FishSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 76c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM236 76.66c.32 31.85-7.55 59.77-22.74 80.76-15.66 21.65-38.89 36.21-69 43.29-19.2 4.52-41.39 6-66.36 4.38q2.27 15.49 6 32.34c.996 4.217-.36 8.643-3.545 11.58-3.186 2.937-7.707 3.928-11.829 2.594-4.122-1.334-7.205-4.787-8.065-9.034Q55.88 221.72 53.38 202.66q-19-2.5-39.87-7.07C7.133 194.084 3.142 187.741 4.546 181.341c1.404-6.401 7.682-10.492 14.104-9.191q16.83 3.67 32.31 6c-1.58-25-.13-47.12 4.38-66.3 7.08-30.14 21.64-53.36 43.27-69 21-15.21 48.92-23.1 80.78-22.77 21.79 .21 42 4.42 45.8 6.64 1.748 1.029 3.207 2.484 4.24 4.23 2.14 3.69 6.35 23.92 6.57 45.71ZM177.54 159.94C137.865 149.129 106.871 118.135 96.06 78.46c-9.21 12.16-15.56 27.57-18.93 46-3 16.39-3.66 35.25-2 56.39 21.16 1.65 40 1 56.42-2 18.45-3.36 33.82-9.71 45.98-18.91ZM209 47C193.1 44 149.7 38.55 116.74 59.44c5.238 41.718 38.093 74.577 79.81 79.82C217.43 106.32 212 62.92 209 47Z"),
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
        return _fishSimple!!
    }

private var _fishSimple: ImageVector? = null
