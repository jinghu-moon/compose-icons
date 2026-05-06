package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CopilotLine: ImageVector
    get() {
        if (_copilotLine != null) return _copilotLine!!
        _copilotLine = remixIcon(
            name = "CopilotLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.401 7.8C5.401 5.712 6.578 4.8 8.572 4.8c1.196-0 2.129 .264 2.129 1.6 0 1.814-.574 3.75-2.7 3.75-1.228 0-1.798-.176-2.089-.424C5.664 9.515 5.401 9.057 5.401 7.8ZM8.572 2.8C5.497 2.8 3.401 4.626 3.401 7.8c0 .999 .137 1.889 .53 2.605l-.182 .365c-.497 .284-1.007 .664-1.425 1.107-1.061 1.125-.972 2.388-.972 3.823 0 2.267 2.512 3.621 4.315 4.373 2.133 .89 4.677 1.427 6.335 1.427 1.658 0 4.202-.537 6.335-1.427 1.803-.752 4.315-2.106 4.315-4.373 0-1.435 .089-2.698-.972-3.823-.418-.444-.928-.823-1.425-1.107l-.182-.365c.392-.715 .53-1.606 .53-2.605 0-3.174-2.097-5-5.171-5-1.241-0-2.619 .259-3.429 1.283C11.19 3.059 9.813 2.8 8.572 2.8ZM8.001 12.15c1.692 0 3.224-.815 4-2.334 .776 1.519 2.308 2.334 4 2.334 .895 0 1.77-.074 2.517-.38 .512 .596 1.171 .911 1.705 1.478 .639 .678 .428 1.584 .428 2.451 0 1.272-2.166 2.144-3.085 2.527-1.942 .81-4.223 1.273-5.565 1.273-1.342 0-3.623-.463-5.565-1.273C5.516 17.844 3.35 16.972 3.35 15.7c0-.867-.211-1.774 .428-2.451 .561-.595 1.341-.75 1.705-1.478 .748 .306 1.622 .38 2.517 .38ZM13.301 6.4c0-1.336 .933-1.6 2.129-1.6 1.994 0 3.171 .912 3.171 3 0 1.257-.263 1.716-.511 1.926-.291 .248-.861 .424-2.089 .424-2.126 0-2.7-1.936-2.7-3.75ZM8.663 14.484c0-.553 .448-1.001 1.001-1.001 .553 0 1.001 .448 1.001 1.001v1.997c0 .553-.448 1.001-1.001 1.001-.553 0-1.001-.448-1.001-1.001v-1.997ZM15.338 14.484c0-.553-.448-1.001-1.001-1.001-.553 0-1.001 .449-1.001 1.001v1.997c0 .553 .448 1.001 1.001 1.001 .553 0 1.001-.448 1.001-1.001v-1.997Z"),
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
        return _copilotLine!!
    }

private var _copilotLine: ImageVector? = null
