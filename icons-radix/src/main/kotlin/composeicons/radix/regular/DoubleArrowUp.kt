package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.DoubleArrowUp: ImageVector
    get() {
        if (_doubleArrowUp != null) return _doubleArrowUp!!
        _doubleArrowUp = radixIcon(
            name = "DoubleArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.147 8.146c.195-.195 .512-.195 .707 0l4 4 .064 .078c.128 .194 .106 .458-.064 .629-.171 .171-.435 .193-.629 .064l-.078-.064L7.5 9.207 3.854 12.854l-.078 .064c-.194 .128-.458 .106-.629-.064-.171-.171-.193-.435-.064-.629l.064-.078 4-4ZM7.147 2.146c.195-.195 .512-.195 .707 0l4 4 .064 .078c.128 .194 .106 .458-.064 .629-.171 .171-.435 .193-.629 .064l-.078-.064L7.5 3.207 3.854 6.853l-.078 .064c-.194 .128-.458 .106-.629-.064C2.976 6.683 2.954 6.419 3.082 6.225l.064-.078 4-4Z"),
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
        return _doubleArrowUp!!
    }

private var _doubleArrowUp: ImageVector? = null
