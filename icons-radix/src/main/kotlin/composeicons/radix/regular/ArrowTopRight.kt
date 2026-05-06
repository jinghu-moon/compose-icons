package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ArrowTopRight: ImageVector
    get() {
        if (_arrowTopRight != null) return _arrowTopRight!!
        _arrowTopRight = radixIcon(
            name = "ArrowTopRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.5 3c.132 0 .26 .053 .354 .146 .094 .094 .146 .221 .146 .354v5.5l-.01 .102c-.047 .227-.249 .398-.49 .398-.242-0-.444-.172-.49-.399L11 9v-4.293L4.353 11.354c-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707L10.293 4h-4.293C5.724 4 5.5 3.776 5.5 3.5 5.5 3.224 5.724 3 6 3h5.5Z"),
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
        return _arrowTopRight!!
    }

private var _arrowTopRight: ImageVector? = null
