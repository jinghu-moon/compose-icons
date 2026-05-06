package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Cylinder: ImageVector
    get() {
        if (_cylinder != null) return _cylinder!!
        _cylinder = phosphorThinIcon(
            name = "Cylinder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C89.87 20 60 37.57 60 60v136c0 22.43 29.87 40 68 40 38.13 0 68-17.57 68-40v-136C196 37.57 166.13 20 128 20ZM128 28c32.52 0 60 14.65 60 32 0 17.35-27.48 32-60 32C95.48 92 68 77.35 68 60 68 42.65 95.48 28 128 28ZM188 196c0 17.35-27.48 32-60 32C95.48 228 68 213.35 68 196v-116.89C79.35 91.65 101.71 100 128 100c26.29 0 48.65-8.35 60-20.89Z"),
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
        return _cylinder!!
    }

private var _cylinder: ImageVector? = null
