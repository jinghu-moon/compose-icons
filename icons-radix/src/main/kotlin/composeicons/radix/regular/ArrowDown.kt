package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ArrowDown: ImageVector
    get() {
        if (_arrowDown != null) return _arrowDown!!
        _arrowDown = radixIcon(
            name = "ArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.5 2c.276 0 .5 .224 .5 .5v8.793L11.147 8.146c.195-.195 .512-.195 .707 0 .195 .195 .195 .512 0 .707L7.854 12.854C7.76 12.947 7.633 13 7.5 13c-.133 0-.26-.053-.354-.146l-4-4L3.082 8.775c-.128-.194-.106-.458 .064-.629 .171-.171 .435-.193 .629-.064l.078 .064 3.146 3.147v-8.793C7 2.224 7.224 2 7.5 2Z"),
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
        return _arrowDown!!
    }

private var _arrowDown: ImageVector? = null
