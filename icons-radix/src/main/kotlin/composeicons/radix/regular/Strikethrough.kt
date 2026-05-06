package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Strikethrough: ImageVector
    get() {
        if (_strikethrough != null) return _strikethrough!!
        _strikethrough = radixIcon(
            name = "Strikethrough",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.5 2.75c.276 0 .5 .224 .5 .5v3.85h1.5l.081 .009c.182 .038 .319 .199 .319 .392 0 .193-.137 .354-.319 .392l-.081 .009h-1.5v.649c0 1.933-1.567 3.5-3.5 3.5C5.567 12.05 4 10.483 4 8.55v-.649h-1.5c-.221 0-.4-.179-.4-.4 0-.221 .179-.4 .4-.4h1.5v-3.85c0-.276 .224-.5 .5-.5 .276 0 .5 .224 .5 .5v3.85h5v-3.85c0-.276 .224-.5 .5-.5ZM5 7.9v.649c0 1.381 1.119 2.5 2.5 2.5 1.381-0 2.5-1.119 2.5-2.5v-.649h-5Z"),
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
        return _strikethrough!!
    }

private var _strikethrough: ImageVector? = null
