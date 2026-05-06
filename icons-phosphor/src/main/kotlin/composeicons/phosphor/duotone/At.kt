package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.At: ImageVector
    get() {
        if (_at != null) return _at!!
        _at = phosphorDuotoneIcon(
            name = "At",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 128c0 53.019-42.981 96-96 96C74.981 224 32 181.019 32 128 32 74.981 74.981 32 128 32c53.019 0 96 42.981 96 96Z"),
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
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 21.51 0 44.1-6.48 60.43-17.33 3.681-2.447 4.682-7.414 2.235-11.095-2.447-3.681-7.414-4.682-11.095-2.235C166 210.38 146.21 216 128 216 79.399 216 40 176.601 40 128 40 79.399 79.399 40 128 40c48.601 0 88 39.399 88 88 0 26.45-10.88 32-20 32-9.12 0-20-5.55-20-32v-40c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v4.26C145.308 79.088 124.052 76.248 106.418 85.103 88.784 93.958 78.365 112.702 80.155 132.353c1.79 19.651 15.424 36.204 34.367 41.727 18.944 5.523 39.337-1.11 51.407-16.72 6 12 16.35 18.64 30.07 18.64 22.54 0 36-17.94 36-48C231.939 70.588 185.412 24.061 128 24ZM128 160C110.327 160 96 145.673 96 128c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32Z"),
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
        return _at!!
    }

private var _at: ImageVector? = null
