package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HandbagSimple: ImageVector
    get() {
        if (_handbagSimple != null) return _handbagSimple!!
        _handbagSimple = phosphorThinIcon(
            name = "HandbagSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.92 198.59l-14.26-120c-.718-6.071-5.886-10.632-12-10.59h-37.66v-4C172 39.699 152.301 20 128 20 103.699 20 84 39.699 84 64v4h-37.67c-6.114-.042-11.282 4.519-12 10.59l-14.26 120c-.398 3.392 .667 6.792 2.93 9.35 2.306 2.591 5.612 4.069 9.08 4.06h191.84c3.461 .004 6.759-1.474 9.06-4.06 2.266-2.556 3.336-5.957 2.94-9.35ZM92 64C92 44.118 108.118 28 128 28c19.882 0 36 16.118 36 36v4h-72ZM227 202.63c-.781 .879-1.904 1.379-3.08 1.37h-191.84c-1.176 .009-2.299-.491-3.08-1.37-.767-.836-1.132-1.964-1-3.09L42.25 79.54c.235-2.028 1.959-3.554 4-3.54h163.42c2.06-.039 3.813 1.493 4.05 3.54l14.25 120c.14 1.122-.214 2.249-.97 3.09Z"),
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
        return _handbagSimple!!
    }

private var _handbagSimple: ImageVector? = null
