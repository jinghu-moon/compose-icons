package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.LinkBreak1: ImageVector
    get() {
        if (_linkBreak1 != null) return _linkBreak1!!
        _linkBreak1 = radixIcon(
            name = "LinkBreak1",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.646 1.646c.195-.195 .512-.195 .707 0 .195 .195 .195 .512 0 .707L2.353 13.353c-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707L12.646 1.646ZM12.42 4.347c.77 .4 1.342 1.116 1.522 1.983l.035 .232c.025 .246 .023 .538 .023 .938 0 .399 .002 .692-.023 .938l-.035 .232c-.225 1.087-1.065 1.938-2.142 2.226l-.219 .05c-.3 .057-.649 .055-1.206 .055h-.875c-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5h.875c.603 0 .835-.002 1.019-.037l.148-.034c.729-.195 1.275-.764 1.42-1.462l.021-.141c.016-.159 .017-.39 .017-.826 0-.437-.001-.667-.017-.826l-.021-.141C12.825 5.874 12.33 5.328 11.66 5.106l.76-.76ZM5.5 4c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-.875c-.453 0-.696 .001-.867 .017l-.151 .021C2.853 5.181 2.269 5.716 2.072 6.395l-.034 .138c-.035 .169-.038 .384-.038 .967 0 .582 .003 .798 .038 .967l.034 .138c.173 .596 .644 1.082 1.266 1.289l-.759 .759C1.873 10.285 1.334 9.654 1.111 8.884L1.058 8.67C.997 8.375 1 8.033 1 7.5 1 6.967 .997 6.625 1.058 6.33l.053-.214C1.417 5.062 2.312 4.266 3.419 4.055l.236-.032c.251-.023 .552-.022 .97-.022h.875Z"),
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
        return _linkBreak1!!
    }

private var _linkBreak1: ImageVector? = null
