package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.StackOverflowLogo: ImageVector
    get() {
        if (_stackOverflowLogo != null) return _stackOverflowLogo!!
        _stackOverflowLogo = phosphorFillIcon(
            name = "StackOverflowLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM134.86 46.86c1.501-1.502 3.537-2.346 5.66-2.346 2.123 0 4.159 .844 5.66 2.346l45.25 45.26c2.988 3.145 2.925 8.099-.143 11.167-3.068 3.068-8.022 3.131-11.167 .143L134.86 58.18c-1.502-1.501-2.346-3.537-2.346-5.66 0-2.123 .844-4.159 2.346-5.66ZM100.18 98.77c1.691-4.081 6.369-6.019 10.45-4.33l59.13 24.49c3.538 1.453 5.552 5.208 4.807 8.959-.745 3.752-4.042 6.451-7.867 6.441-1.051-.001-2.091-.212-3.06-.62L104.51 109.22c-4.081-1.691-6.019-6.369-4.33-10.45ZM96 152h64c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-64c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8ZM200 192c0 4.418-3.582 8-8 8h-128c-4.418 0-8-3.582-8-8v-48c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v40h112v-40c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _stackOverflowLogo!!
    }

private var _stackOverflowLogo: ImageVector? = null
