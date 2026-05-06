package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LinkSimpleHorizontalBreak: ImageVector
    get() {
        if (_linkSimpleHorizontalBreak != null) return _linkSimpleHorizontalBreak!!
        _linkSimpleHorizontalBreak = phosphorLightIcon(
            name = "LinkSimpleHorizontalBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 128c0 23.196 18.804 42 42 42h40c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-40C34.177 182 10 157.823 10 128 10 98.177 34.177 74 64 74h40c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-40C40.804 86 22 104.804 22 128ZM192 74h-40c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h40c23.196 0 42 18.804 42 42 0 23.196-18.804 42-42 42h-40c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h40c29.823 0 54-24.177 54-54C246 98.177 221.823 74 192 74Z"),
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
        return _linkSimpleHorizontalBreak!!
    }

private var _linkSimpleHorizontalBreak: ImageVector? = null
