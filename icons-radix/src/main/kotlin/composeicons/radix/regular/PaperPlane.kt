package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) return _paperPlane!!
        _paperPlane = radixIcon(
            name = "PaperPlane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M.628 1.166c.145-.161 .377-.211 .575-.123L14.703 7.043c.181 .08 .297 .259 .297 .457 0 .198-.116 .377-.297 .457L1.203 13.957c-.198 .088-.43 .038-.575-.123C.483 13.672 .459 13.435 .568 13.248L3.921 7.5 .568 1.752C.459 1.565 .483 1.328 .628 1.166ZM4.845 7.1h4.155l.081 .009c.182 .037 .319 .198 .319 .392 0 .193-.137 .354-.319 .392l-.081 .009h-4.155L2.212 12.413 13.269 7.5 2.212 2.586 4.845 7.1Z"),
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
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
