package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceVisionPro: ImageVector
    get() {
        if (_deviceVisionPro != null) return _deviceVisionPro!!
        _deviceVisionPro = tablerFilledIcon(
            name = "DeviceVisionPro",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 6q1.74 0 3.342 .106 1.619 .107 2.973 .448 1.388 .345 2.436 1.05c.714 .481 1.288 1.142 1.665 1.916 .397 .801 .584 1.769 .584 2.91 0 1.156-.222 2.208-.673 3.14-.45 .934-1.073 1.685-1.868 2.236-.801 .556-1.755 .849-2.73 .839q-.932 .001-1.703-.263c-.48-.164-.941-.38-1.374-.644-.377-.233-.746-.478-1.107-.736-.287-.209-.588-.398-.901-.567-.197-.109-.418-.169-.643-.174-.209 0-.426 .057-.658 .18q-.42 .226-.893 .564c-.36 .256-.729 .501-1.105 .733-.43 .264-.888 .479-1.366 .642-.544 .18-1.115 .27-1.688 .264-.982 .015-1.943-.278-2.75-.838C2.747 17.256 2.123 16.504 1.673 15.572Q.998 14.165 1 12.432C.995 11.297 1.182 10.327 1.577 9.532 1.955 8.754 2.532 8.089 3.25 7.606 3.949 7.136 4.761 6.79 5.692 6.557c.974-.236 1.967-.386 2.968-.447Q10.259 6 12 6"),
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
        return _deviceVisionPro!!
    }

private var _deviceVisionPro: ImageVector? = null
