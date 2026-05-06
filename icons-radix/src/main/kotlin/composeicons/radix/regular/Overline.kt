package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Overline: ImageVector
    get() {
        if (_overline != null) return _overline!!
        _overline = radixIcon(
            name = "Overline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.5 3.75c.276 0 .5 .224 .5 .5v5.3c-0 1.933-1.567 3.5-3.5 3.5C5.567 13.05 4.001 11.483 4 9.55v-5.3c0-.276 .224-.5 .5-.5 .276 0 .5 .224 .5 .5v5.3c0 1.381 1.119 2.5 2.5 2.5 1.38-0 2.5-1.12 2.5-2.5v-5.3c0-.276 .224-.5 .5-.5ZM11.581 1.109c.182 .038 .319 .199 .319 .392-0 .193-.138 .354-.319 .392l-.081 .009h-8c-.221 0-.4-.18-.4-.4 0-.221 .179-.4 .4-.4h8l.081 .009Z"),
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
        return _overline!!
    }

private var _overline: ImageVector? = null
