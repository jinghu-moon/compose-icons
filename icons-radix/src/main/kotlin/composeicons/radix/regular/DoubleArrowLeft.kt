package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.DoubleArrowLeft: ImageVector
    get() {
        if (_doubleArrowLeft != null) return _doubleArrowLeft!!
        _doubleArrowLeft = radixIcon(
            name = "DoubleArrowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.225 3.082c.194-.128 .458-.106 .629 .064 .171 .171 .193 .435 .064 .629l-.064 .078L3.207 7.5l3.646 3.646 .064 .078c.128 .194 .106 .458-.064 .629-.171 .171-.435 .193-.629 .064l-.078-.064-4-4c-.195-.195-.195-.512 0-.707l4-4 .078-.064ZM12.225 3.082c.194-.128 .458-.106 .629 .064 .171 .171 .193 .435 .064 .629l-.064 .078L9.207 7.5l3.647 3.646 .064 .078c.128 .194 .106 .458-.064 .629-.171 .171-.435 .193-.629 .064l-.078-.064L8.146 7.854c-.195-.195-.195-.512 0-.707l4-4 .078-.064Z"),
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
        return _doubleArrowLeft!!
    }

private var _doubleArrowLeft: ImageVector? = null
