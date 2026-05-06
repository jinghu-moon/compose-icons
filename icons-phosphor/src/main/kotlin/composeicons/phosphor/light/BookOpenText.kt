package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BookOpenText: ImageVector
    get() {
        if (_bookOpenText != null) return _bookOpenText!!
        _bookOpenText = phosphorLightIcon(
            name = "BookOpenText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 50h-72c-12.962 .01-25.025 6.625-32 17.55C121.025 56.625 108.962 50.01 96 50h-72c-3.314 0-6 2.686-6 6v144c0 3.314 2.686 6 6 6h72c14.359 0 26 11.641 26 26 0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6 0-14.359 11.641-26 26-26h72c3.314 0 6-2.686 6-6v-144c0-3.314-2.686-6-6-6ZM96 194h-66v-132h66c14.359 0 26 11.641 26 26v116.31C114.967 197.681 105.665 193.992 96 194ZM226 194h-66c-9.666-.004-18.968 3.688-26 10.32v-116.32c0-14.359 11.641-26 26-26h66ZM160 90h40c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-40c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6ZM206 128c0 3.314-2.686 6-6 6h-40c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h40c3.314 0 6 2.686 6 6ZM206 160c0 3.314-2.686 6-6 6h-40c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h40c3.314 0 6 2.686 6 6Z"),
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
        return _bookOpenText!!
    }

private var _bookOpenText: ImageVector? = null
