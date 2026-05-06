package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Egg: ImageVector
    get() {
        if (_egg != null) return _egg!!
        _egg = phosphorDuotoneIcon(
            name = "Egg",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 152c0 44.183-35.817 80-80 80C83.817 232 48 196.183 48 152 48 88 96 24 128 24c32 0 80 64 80 128Z"),
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
                pathData = parseSvgPathData("M186.66 59.56C168.47 32.29 146.54 16 128 16 109.46 16 87.53 32.29 69.34 59.56 50.7 87.54 40 121.23 40 152c0 48.601 39.399 88 88 88 48.601 0 88-39.399 88-88C216 121.23 205.3 87.54 186.66 59.56ZM128 224C88.254 223.956 56.044 191.746 56 152 56 124.31 65.72 93.85 82.66 68.44 97.19 46.64 115.41 32 128 32c12.59 0 30.81 14.64 45.34 36.44C190.28 93.85 200 124.31 200 152c-.044 39.746-32.254 71.956-72 72Z"),
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
        return _egg!!
    }

private var _egg: ImageVector? = null
