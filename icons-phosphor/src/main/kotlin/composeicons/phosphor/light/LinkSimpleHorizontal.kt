package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LinkSimpleHorizontal: ImageVector
    get() {
        if (_linkSimpleHorizontal != null) return _linkSimpleHorizontal!!
        _linkSimpleHorizontal = phosphorLightIcon(
            name = "LinkSimpleHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M80 122h96c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-96c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6ZM104 170h-40C40.804 170 22 151.196 22 128 22 104.804 40.804 86 64 86h40c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-40C34.177 74 10 98.177 10 128c0 29.823 24.177 54 54 54h40c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM192 74h-40c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h40c23.196 0 42 18.804 42 42 0 23.196-18.804 42-42 42h-40c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h40c29.823 0 54-24.177 54-54C246 98.177 221.823 74 192 74Z"),
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
        return _linkSimpleHorizontal!!
    }

private var _linkSimpleHorizontal: ImageVector? = null
