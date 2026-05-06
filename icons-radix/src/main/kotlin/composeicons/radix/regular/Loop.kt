package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Loop: ImageVector
    get() {
        if (_loop != null) return _loop!!
        _loop = radixIcon(
            name = "Loop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M1.5 7c.276 0 .5 .224 .5 .5 0 1.933 1.567 3.5 3.5 3.5h7.293L11.646 9.854l-.064-.078c-.128-.194-.106-.458 .064-.629 .171-.171 .435-.193 .629-.064l.078 .064 2 2c.195 .195 .195 .512 0 .707l-2 2c-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707l1.146-1.146h-7.293C3.015 12 1 9.985 1 7.5c0-.276 .224-.5 .5-.5ZM2.725 1.082c.194-.128 .458-.106 .629 .064 .171 .171 .193 .435 .064 .629l-.064 .078L2.207 3h7.293C11.985 3 14 5.015 14 7.5c0 .276-.224 .5-.5 .5C13.224 8 13 7.776 13 7.5 13 5.567 11.433 4 9.5 4h-7.293L3.353 5.147l.064 .078c.128 .194 .106 .458-.064 .629-.171 .171-.435 .193-.629 .064L2.646 5.854 .646 3.854C.451 3.658 .451 3.342 .646 3.147L2.646 1.147l.078-.064Z"),
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
        return _loop!!
    }

private var _loop: ImageVector? = null
