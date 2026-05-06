package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Crop: ImageVector
    get() {
        if (_crop != null) return _crop!!
        _crop = radixIcon(
            name = "Crop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M-0 3.5C0 3.224 .224 3 .5 3h2.5v-2.5c0-.276 .224-.5 .5-.5C3.776-0 4 .224 4 .5v2.5h7.5c.276 0 .5 .224 .5 .5v7.5h2.5l.101 .01c.228 .047 .399 .248 .399 .49 0 .242-.171 .444-.399 .49L14.5 12h-2.5v2.5c0 .276-.224 .5-.5 .5C11.224 15 11 14.776 11 14.5v-2.5h-7.5C3.224 12 3 11.776 3 11.5v-7.5h-2.5C.224 4-0 3.776-0 3.5ZM11 11v-7h-7v7h7Z"),
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
        return _crop!!
    }

private var _crop: ImageVector? = null
