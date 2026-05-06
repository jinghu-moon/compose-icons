package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Code: ImageVector
    get() {
        if (_code != null) return _code!!
        _code = radixIcon(
            name = "Code",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.036 2.314c.103-.256 .393-.381 .649-.278 .256 .103 .381 .393 .278 .649L5.964 12.685c-.103 .256-.393 .381-.649 .278-.256-.103-.381-.393-.278-.649L9.036 2.314ZM11.146 5.146c.171-.171 .435-.193 .629-.064l.078 .064 2 2 .064 .078c.128 .194 .106 .458-.064 .629l-2 2c-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707L12.793 7.5 11.146 5.853l-.064-.078c-.128-.194-.106-.458 .064-.629ZM3.146 5.146c.195-.195 .512-.195 .707 0 .195 .195 .195 .512 0 .707L2.207 7.5 3.853 9.146l.064 .078c.128 .194 .106 .458-.064 .629-.171 .171-.435 .193-.629 .064L3.146 9.853l-2-2c-.195-.195-.195-.512 0-.707l2-2Z"),
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
        return _code!!
    }

private var _code: ImageVector? = null
