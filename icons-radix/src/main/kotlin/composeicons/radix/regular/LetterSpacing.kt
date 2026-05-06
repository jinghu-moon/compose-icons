package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.LetterSpacing: ImageVector
    get() {
        if (_letterSpacing != null) return _letterSpacing!!
        _letterSpacing = radixIcon(
            name = "LetterSpacing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.271 10.217c.156-.156 .41-.156 .566 0l2 2 .05 .062c.043 .065 .067 .142 .067 .222 0 .106-.042 .208-.117 .283l-2 2-.064 .051c-.155 .102-.366 .086-.503-.051-.137-.137-.153-.348-.051-.503l.051-.063 1.316-1.316h-12.066l1.316 1.316c.156 .156 .156 .41 0 .566-.156 .156-.41 .156-.566 0l-2-2C.196 12.708 .154 12.606 .154 12.5c0-.106 .042-.208 .117-.283l2-2 .063-.051c.155-.102 .366-.086 .503 .051 .136 .137 .153 .348 .051 .503l-.051 .064L1.521 12.1h12.066L12.271 10.783c-.156-.156-.156-.41 0-.566ZM13.389 1.227c.127-.194 .377-.28 .602-.192 .225 .088 .349 .322 .31 .551l-.027 .098L11.521 8.685c-.075 .191-.259 .317-.465 .317-.18-0-.344-.097-.433-.249l-.033-.068L7.838 1.683c-.101-.257 .027-.547 .283-.648 .257-.101 .547 .027 .648 .283l2.285 5.818L13.342 1.317l.047-.091ZM4.553 1c.2 0 .38 .119 .459 .303L8.011 8.3l.03 .097c.047 .228-.071 .464-.293 .56-.222 .095-.475 .017-.607-.174L7.091 8.693 6.116 6.417h-3.126L2.014 8.693l-.05 .089c-.133 .191-.385 .269-.607 .174C1.104 8.847 .986 8.553 1.094 8.3L4.093 1.303l.034-.065c.09-.146 .251-.237 .426-.237ZM3.353 5.567h2.398L4.552 2.769 3.353 5.567Z"),
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
        return _letterSpacing!!
    }

private var _letterSpacing: ImageVector? = null
