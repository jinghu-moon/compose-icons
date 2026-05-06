package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BookOpen: ImageVector
    get() {
        if (_bookOpen != null) return _bookOpen!!
        _bookOpen = phosphorFillIcon(
            name = "BookOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 56v144c0 4.418-3.582 8-8 8h-72c-13.231-0-23.967 10.709-24 23.94 .066 3.347-1.986 6.372-5.12 7.55-2.465 .951-5.24 .624-7.416-.874C121.287 237.118 119.991 234.642 120 232c0-13.255-10.745-24-24-24h-72c-4.418 0-8-3.582-8-8v-144c0-4.418 3.582-8 8-8h64c17.673 0 32 14.327 32 32v87.73c-.058 4.283 3.202 7.883 7.47 8.25 2.212 .147 4.386-.631 6.003-2.147 1.617-1.517 2.532-3.636 2.527-5.853v-87.98c0-17.673 14.327-32 32-32h64c4.418 0 8 3.582 8 8Z"),
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
        return _bookOpen!!
    }

private var _bookOpen: ImageVector? = null
