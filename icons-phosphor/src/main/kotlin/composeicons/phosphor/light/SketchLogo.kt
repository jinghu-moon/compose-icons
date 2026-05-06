package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SketchLogo: ImageVector
    get() {
        if (_sketchLogo != null) return _sketchLogo!!
        _sketchLogo = phosphorLightIcon(
            name = "SketchLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244.52 100.05l-56-64C187.38 34.746 185.732 33.999 184 34h-112c-1.724-.014-3.371 .715-4.52 2L11.48 100c-2.001 2.311-1.945 5.756 .13 8L123.61 228c1.135 1.218 2.725 1.91 4.39 1.91 1.665 0 3.255-.692 4.39-1.91l112-120c2.045-2.237 2.101-5.647 .13-7.95ZM75.94 110l34.6 86.49L29.81 110ZM167.14 110 128 207.84 88.86 110ZM92 98 128 50l36 48ZM180.06 110h46.13l-80.73 86.49ZM226.78 98h-47.78L140 46h41.28ZM74.72 46h41.28L77 98h-47.78Z"),
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
        return _sketchLogo!!
    }

private var _sketchLogo: ImageVector? = null
