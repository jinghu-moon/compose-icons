package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ArrowUp: ImageVector
    get() {
        if (_arrowUp != null) return _arrowUp!!
        _arrowUp = radixIcon(
            name = "ArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.225 2.082c.194-.128 .458-.106 .629 .064l4 4 .064 .078c.128 .194 .106 .458-.064 .629-.171 .171-.435 .193-.629 .064l-.078-.064L8 3.707v8.793c0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5v-8.793L3.853 6.854c-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707l4-4 .078-.064Z"),
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
        return _arrowUp!!
    }

private var _arrowUp: ImageVector? = null
