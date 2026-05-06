package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ListChecks: ImageVector
    get() {
        if (_listChecks != null) return _listChecks!!
        _listChecks = phosphorRegularIcon(
            name = "ListChecks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 128c0 4.418-3.582 8-8 8h-88c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h88c4.418 0 8 3.582 8 8ZM128 72h88c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-88c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM216 184h-88c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h88c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM82.34 42.34 56 68.69 45.66 58.34c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32l16 16c1.501 1.502 3.537 2.346 5.66 2.346 2.123 0 4.159-.844 5.66-2.346L93.66 53.66c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0ZM82.34 106.34 56 132.69 45.66 122.34c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32l16 16c1.501 1.502 3.537 2.346 5.66 2.346 2.123 0 4.159-.844 5.66-2.346l32-32c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0ZM82.34 170.34 56 196.69 45.66 186.34c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32l16 16c1.501 1.502 3.537 2.346 5.66 2.346 2.123 0 4.159-.844 5.66-2.346l32-32c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0Z"),
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
        return _listChecks!!
    }

private var _listChecks: ImageVector? = null
