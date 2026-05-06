package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ArrowTopLeft: ImageVector
    get() {
        if (_arrowTopLeft != null) return _arrowTopLeft!!
        _arrowTopLeft = radixIcon(
            name = "ArrowTopLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.5 3c-.132 0-.26 .053-.354 .146-.093 .094-.146 .221-.146 .354v5.5l.01 .102c.047 .227 .249 .398 .49 .398 .242-0 .444-.172 .49-.399L4 9v-4.293l6.647 6.646c.195 .195 .512 .195 .707 0 .195-.195 .195-.512 0-.707L4.707 4h4.293c.276-0 .5-.224 .5-.5C9.5 3.224 9.276 3 9 3h-5.5Z"),
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
        return _arrowTopLeft!!
    }

private var _arrowTopLeft: ImageVector? = null
