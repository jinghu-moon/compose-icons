package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Pentagon: ImageVector
    get() {
        if (_pentagon != null) return _pentagon!!
        _pentagon = phosphorThinIcon(
            name = "Pentagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M223.14 90.74 135.19 22.4l-.09-.07c-4.223-3.096-9.967-3.096-14.19 0l-.09 .07L32.87 90.74C28.753 93.789 27.026 99.115 28.57 104l32 107.7c1.606 4.954 6.223 8.306 11.43 8.3h112c5.241-.005 9.872-3.409 11.44-8.41l32-107.53c1.573-4.903-.158-10.262-4.3-13.32ZM219.78 101.74l-32 107.54c-.548 1.622-2.068 2.716-3.78 2.72h-112c-1.708 .005-3.231-1.076-3.79-2.69l-32-107.7c-.528-1.639 .052-3.431 1.44-4.45l.09-.07L125.68 28.76c1.391-.993 3.259-.993 4.65 0l87.94 68.33 .09 .07c1.415 1.036 1.991 2.872 1.42 4.53Z"),
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
        return _pentagon!!
    }

private var _pentagon: ImageVector? = null
