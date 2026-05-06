package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Reset: ImageVector
    get() {
        if (_reset != null) return _reset!!
        _reset = radixIcon(
            name = "Reset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.225 2.082c.194-.128 .458-.106 .629 .064 .171 .171 .193 .435 .064 .629l-.064 .078L3.707 4h5.293c2.485 0 4.5 2.015 4.5 4.5 0 2.485-2.015 4.5-4.5 4.5h-4c-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5h4c1.933 0 3.5-1.567 3.5-3.5C12.5 6.567 10.933 5 9 5h-5.293L4.853 6.147l.064 .078c.128 .194 .106 .458-.064 .629-.171 .171-.435 .193-.629 .064L4.146 6.854l-2-2c-.195-.195-.195-.512 0-.707l2-2 .078-.064Z"),
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
        return _reset!!
    }

private var _reset: ImageVector? = null
