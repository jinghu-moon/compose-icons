package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BookOpenUser: ImageVector
    get() {
        if (_bookOpenUser != null) return _bookOpenUser!!
        _bookOpenUser = phosphorFillIcon(
            name = "BookOpenUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 80v120c0 4.418-3.582 8-8 8h-72c-13.231-0-23.967 10.709-24 23.94 .066 3.347-1.986 6.372-5.12 7.55-2.465 .951-5.24 .624-7.416-.874C121.287 237.118 119.991 234.642 120 232c0-13.255-10.745-24-24-24h-72c-4.418 0-8-3.582-8-8v-120c0-4.418 3.582-8 8-8h64c17.673 0 32 14.327 32 32v63.73c-.058 4.283 3.202 7.883 7.47 8.25 2.212 .147 4.386-.631 6.003-2.147 1.617-1.517 2.532-3.636 2.527-5.853v-63.98c0-17.673 14.327-32 32-32h64c4.418 0 8 3.582 8 8ZM88.81 56h.19c13.962 .277 27.109 6.632 36 17.4 .76 .889 1.871 1.4 3.04 1.4 1.169 0 2.28-.512 3.04-1.4C139.953 62.652 153.066 56.3 167 56h.19c1.394-.004 2.686-.734 3.409-1.927 .723-1.192 .772-2.675 .131-3.913C162.521 34.119 146.02 24.027 128 24.027c-18.02 0-34.521 10.092-42.73 26.133-.641 1.238-.592 2.721 .131 3.913 .723 1.192 2.015 1.922 3.409 1.927Z"),
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
        return _bookOpenUser!!
    }

private var _bookOpenUser: ImageVector? = null
