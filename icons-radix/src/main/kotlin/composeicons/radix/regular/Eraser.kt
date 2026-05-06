package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Eraser: ImageVector
    get() {
        if (_eraser != null) return _eraser!!
        _eraser = radixIcon(
            name = "Eraser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.36 .729c.195-.195 .512-.195 .707 0l5.203 5.203 .064 .078c.128 .194 .106 .458-.064 .629L7.347 13.563c-.586 .586-1.535 .586-2.121 0L1.436 9.774C.887 9.225 .853 8.356 1.334 7.767l.103-.114L8.36 .729ZM2.143 8.36c-.195 .195-.195 .512 0 .707l3.789 3.789c.195 .195 .512 .195 .707 0L7.894 11.601 3.398 7.105 2.143 8.36ZM4.105 6.398l4.496 4.496L13.21 6.286 8.714 1.79 4.105 6.398Z"),
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
        return _eraser!!
    }

private var _eraser: ImageVector? = null
