package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ArrowBottomRight: ImageVector
    get() {
        if (_arrowBottomRight != null) return _arrowBottomRight!!
        _arrowBottomRight = radixIcon(
            name = "ArrowBottomRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.5 12c.132 0 .26-.053 .354-.146 .094-.094 .146-.221 .146-.354v-5.5l-.01-.102c-.047-.227-.249-.398-.49-.398-.242 0-.444 .172-.49 .399L11 6v4.293L4.353 3.646c-.195-.195-.512-.195-.707 0-.195 .195-.195 .512 0 .707L10.293 11h-4.293c-.276 0-.5 .224-.5 .5 0 .276 .224 .5 .5 .5h5.5Z"),
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
        return _arrowBottomRight!!
    }

private var _arrowBottomRight: ImageVector? = null
