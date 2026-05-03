package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Egg: ImageVector
    get() {
        if (_egg != null) return _egg!!
        _egg = phosphorBoldIcon(
            name = "Egg",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 190.000 57.340 C 171.060 29.000 147.880 12.000 128.000 12.000 C 108.120 12.000 84.940 29.000 66.000 57.340 C 46.940 86.000 36.000 120.460 36.000 152.000 C 36.000 202.810 77.190 244.000 128.000 244.000 C 178.810 244.000 220.000 202.810 220.000 152.000 C 220.000 120.460 209.060 86.000 190.000 57.340 ZM 128.000 220.000 C 90.461 219.961 60.039 189.539 60.000 152.000 C 60.000 90.880 106.190 36.000 128.000 36.000 C 149.810 36.000 196.000 90.880 196.000 152.000 C 195.961 189.539 165.539 219.961 128.000 220.000 Z"),
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
