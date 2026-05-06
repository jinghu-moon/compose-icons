package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Link1: ImageVector
    get() {
        if (_link1 != null) return _link1!!
        _link1 = radixIcon(
            name = "Link1",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.5 4c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-.875c-.453 0-.696 .001-.867 .017l-.151 .02C2.853 5.181 2.269 5.716 2.072 6.396l-.034 .138c-.035 .169-.038 .384-.038 .967 0 .582 .003 .798 .038 .967l.034 .138c.197 .68 .781 1.215 1.534 1.358l.151 .021c.171 .015 .414 .017 .867 .017h.875c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-.875c-.418 0-.719 .001-.97-.022l-.236-.032C2.312 10.734 1.417 9.938 1.111 8.884L1.058 8.67C.997 8.375 1 8.033 1 7.5 1 6.967 .997 6.625 1.058 6.33l.053-.214C1.417 5.062 2.312 4.266 3.419 4.055l.236-.032c.251-.023 .552-.022 .97-.022h.875ZM10.375 4c.558 0 .907-.002 1.206 .055l.219 .05c1.077 .288 1.916 1.138 2.142 2.226l.035 .232c.025 .246 .023 .538 .023 .938 0 .399 .002 .692-.023 .938l-.035 .232c-.225 1.087-1.065 1.938-2.142 2.226l-.219 .05c-.3 .057-.649 .055-1.206 .055h-.875c-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5h.875c.603 0 .835-.002 1.019-.037l.148-.034c.729-.195 1.275-.764 1.42-1.462l.021-.141c.016-.159 .017-.389 .017-.826 0-.437-.001-.667-.017-.826l-.021-.141C12.817 5.835 12.271 5.266 11.542 5.071l-.148-.034c-.183-.035-.415-.037-1.019-.037h-.875C9.224 5 9 4.776 9 4.5c0-.276 .224-.5 .5-.5h.875ZM10.001 7c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-5c-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5h5Z"),
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
        return _link1!!
    }

private var _link1: ImageVector? = null
