package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Compass: ImageVector
    get() {
        if (_compass != null) return _compass!!
        _compass = phosphorThinIcon(
            name = "Compass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM128 220C77.19 220 36 178.81 36 128 36 77.19 77.19 36 128 36c50.81 0 92 41.19 92 92-.055 50.787-41.213 91.945-92 92ZM174.21 76.42l-64 32c-.771 .392-1.398 1.019-1.79 1.79l-32 64c-.621 1.24-.554 2.714 .175 3.894 .729 1.18 2.018 1.897 3.405 1.896 .621-.001 1.233-.145 1.79-.42l64-32c.771-.392 1.398-1.019 1.79-1.79l32-64c.774-1.541 .474-3.405-.746-4.624-1.219-1.219-3.083-1.52-4.624-.746ZM141 141 88.92 167 115 115 167.08 89Z"),
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
        return _compass!!
    }

private var _compass: ImageVector? = null
