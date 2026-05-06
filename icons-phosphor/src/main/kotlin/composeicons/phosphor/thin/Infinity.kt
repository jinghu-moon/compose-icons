package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Infinity: ImageVector
    get() {
        if (_infinity != null) return _infinity!!
        _infinity = phosphorThinIcon(
            name = "Infinity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 128c0 21.032-12.669 39.994-32.1 48.043-19.431 8.049-41.798 3.6-56.67-11.273l-.17-.18L95 96.8C77.792 79.688 49.977 79.74 32.833 96.916c-17.144 17.176-17.144 44.991 0 62.167 17.144 17.176 44.959 17.228 62.167 .116l8.6-9.72c1.464-1.657 3.993-1.814 5.65-.35 1.657 1.464 1.814 3.993 .35 5.65l-8.68 9.81-.17 .18c-20.307 20.307-53.232 20.307-73.539-.001C6.904 144.462 6.904 111.538 27.211 91.231 47.518 70.923 80.443 70.923 100.75 91.23l.17 .18 60 67.79c17.208 17.112 45.023 17.06 62.167-.116 17.144-17.176 17.144-44.991 0-62.167C205.943 79.74 178.128 79.688 160.92 96.8l-8.6 9.72c-1.464 1.657-3.993 1.814-5.65 .35-1.657-1.464-1.814-3.993-.35-5.65L155 91.41l.17-.18C170.036 76.315 192.431 71.838 211.888 79.893 231.346 87.947 244.025 106.941 244 128Z"),
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
        return _infinity!!
    }

private var _infinity: ImageVector? = null
