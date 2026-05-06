package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.FontStyle: ImageVector
    get() {
        if (_fontStyle != null) return _fontStyle!!
        _fontStyle = radixIcon(
            name = "FontStyle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.243 2.688c1.674 0 2.731 .648 3.195 1.623 .133 .278 .138 .603-.21 .881-.348 .278-.705 .156-.995-.153C6.472 4.226 5.995 4.05 5.256 4.05 4.14 4.05 3.547 4.636 3.547 5.279c0 .586 .417 .952 1.4 1.255l.731 .228c1.551 .473 2.296 1.198 2.296 2.409-0 1.602-1.281 2.92-3.513 2.92-1.595 0-3.062-.978-3.424-2.11-.103-.322 .078-.603 .362-.731 .284-.128 .694-.115 .87 .205 .583 1.06 1.375 1.274 2.216 1.274 1.041 0 1.811-.467 1.811-1.274C6.297 8.805 5.911 8.464 4.871 8.143L4.159 7.922C2.645 7.449 1.888 6.692 1.888 5.456 1.888 3.798 3.276 2.688 5.243 2.688ZM12.613 5.047c1.242 0 2.049 .587 2.364 1.588 .066 .211-.018 .345-.229 .414-.208 .068-.43 .051-.51-.152C13.936 6.123 13.352 5.763 12.599 5.763c-.953 0-1.586 .489-1.586 1.153 0 .534 .333 .835 1.233 1.128l.588 .188c1.227 .397 1.717 .906 1.717 1.785 0 1.179-1.071 2.026-2.559 2.026-1.349 0-2.337-.763-2.573-1.708-.054-.217-.008-.307 .28-.374 .288-.067 .372-.063 .472 .175 .284 .674 .982 1.191 1.86 1.191 .959-0 1.651-.547 1.651-1.264 0-.528-.288-.775-1.247-1.088l-.587-.195C10.661 8.396 10.165 7.861 10.165 6.988c0-1.121 .999-1.941 2.448-1.941Z"),
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
        return _fontStyle!!
    }

private var _fontStyle: ImageVector? = null
