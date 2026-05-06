package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PersonSimpleHike: ImageVector
    get() {
        if (_personSimpleHike != null) return _personSimpleHike!!
        _personSimpleHike = phosphorThinIcon(
            name = "PersonSimpleHike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 76c15.464 0 28-12.536 28-28C180 32.536 167.464 20 152 20c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28ZM152 28c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20C140.954 68 132 59.046 132 48c0-11.046 8.954-20 20-20ZM196 144v88c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-84.08c-26.68-1.13-34.8-13.66-42.67-25.79-3.53-5.46-6.87-10.61-12-15-.66-.56-1.33-1.1-2-1.6l-16.83 38.76 39.83 28.45c1.051 .753 1.673 1.967 1.67 3.26v56c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-53.94L111.23 151.8 75.67 233.59c-.634 1.463-2.076 2.41-3.67 2.41-.547-.002-1.087-.115-1.59-.33-.976-.422-1.744-1.214-2.134-2.203-.39-.989-.371-2.092 .054-3.067L125.86 98.09c.434-1.021 1.272-1.817 2.315-2.196 1.043-.379 2.197-.308 3.185 .196 2.606 1.355 5.043 3.013 7.26 4.94 5.94 5.15 9.74 11 13.42 16.71C159.77 129.7 166.45 140 192 140c2.209 0 4 1.791 4 4ZM72 148c1.603 0 3.051-.956 3.68-2.43l24-56c.869-2.03-.071-4.379-2.1-5.25l-28-12c-.976-.42-2.079-.435-3.066-.041-.987 .394-1.776 1.164-2.194 2.141l-24 56c-.42 .977-.433 2.081-.037 3.068 .396 .987 1.169 1.776 2.147 2.192l28 12c.496 .213 1.03 .322 1.57 .32ZM49.25 129.9 70.1 81.25l20.65 8.85L69.9 138.75Z"),
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
        return _personSimpleHike!!
    }

private var _personSimpleHike: ImageVector? = null
