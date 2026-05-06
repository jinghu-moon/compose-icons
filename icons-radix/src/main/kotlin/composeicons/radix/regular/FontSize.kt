package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.FontSize: ImageVector
    get() {
        if (_fontSize != null) return _fontSize!!
        _fontSize = radixIcon(
            name = "FontSize",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.5 2.1c.106 0 .208 .042 .283 .117l2 2 .051 .063c.102 .155 .086 .366-.051 .503-.136 .136-.348 .153-.503 .051L4.217 4.784 2.9 3.467v8.066L4.217 10.217c.156-.156 .41-.156 .566 0 .156 .156 .156 .41 0 .566l-2 2c-.075 .075-.177 .117-.283 .117-.106 0-.208-.042-.283-.117l-2-2L.166 10.72c-.102-.155-.086-.366 .051-.503 .137-.137 .348-.153 .503-.051l.063 .051 1.316 1.316v-8.066L.783 4.784c-.156 .156-.41 .156-.566 0C.06 4.627 .06 4.373 .217 4.217l2-2 .062-.05c.065-.043 .142-.067 .222-.067ZM7.971 11.74c-.094 .259-.381 .394-.641 .301-.259-.094-.394-.38-.301-.64l.941 .339ZM10.5 2.75c.211 0 .399 .132 .471 .33l3 8.32c.093 .26-.041 .546-.301 .64-.26 .093-.547-.041-.641-.301L12.047 9.016h-3.094l-.982 2.724-.471-.17-.471-.169L10.029 3.08l.032-.071c.087-.158 .254-.259 .438-.259ZM9.259 8.166h2.482L10.5 4.725 9.259 8.166Z"),
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
        return _fontSize!!
    }

private var _fontSize: ImageVector? = null
