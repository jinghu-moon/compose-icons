package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HourglassHigh: ImageVector
    get() {
        if (_hourglassHigh != null) return _hourglassHigh!!
        _hourglassHigh = phosphorDuotoneIcon(
            name = "HourglassHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 64v11.64c-.008 2.5-1.184 4.853-3.18 6.36L128 128 67.2 82.4C65.186 80.889 64 78.518 64 76v-12Z"),
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
                pathData = parseSvgPathData("M184 24h-112C63.163 24 56 31.163 56 40v36c.011 5.034 2.38 9.771 6.4 12.8L114.67 128 62.4 167.2C58.38 170.229 56.011 174.966 56 180v36c0 8.837 7.163 16 16 16h112c8.837 0 16-7.163 16-16v-35.64c-.012-5.014-2.359-9.735-6.35-12.77L141.27 128 193.65 88.41c3.991-3.035 6.338-7.757 6.35-12.77v-35.64c0-8.837-7.163-16-16-16ZM184 40v16h-112v-16ZM184 216h-112v-36l56-42 56 42.35ZM128 118 72 76v-4h112v3.64Z"),
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
        return _hourglassHigh!!
    }

private var _hourglassHigh: ImageVector? = null
