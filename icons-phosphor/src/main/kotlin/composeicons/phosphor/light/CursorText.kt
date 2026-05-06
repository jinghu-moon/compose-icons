package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CursorText: ImageVector
    get() {
        if (_cursorText != null) return _cursorText!!
        _cursorText = phosphorLightIcon(
            name = "CursorText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M182 208c0 3.314-2.686 6-6 6h-16c-12.962-.01-25.025-6.625-32-17.55C121.025 207.375 108.962 213.99 96 214h-16c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h16c14.359 0 26-11.641 26-26v-42h-18c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h18v-42C122 65.641 110.359 54 96 54h-16c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h16c12.962 .01 25.025 6.625 32 17.55C134.975 48.625 147.038 42.01 160 42h16c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-16c-14.359 0-26 11.641-26 26v42h18c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-18v42c0 14.359 11.641 26 26 26h16c3.314 0 6 2.686 6 6Z"),
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
        return _cursorText!!
    }

private var _cursorText: ImageVector? = null
