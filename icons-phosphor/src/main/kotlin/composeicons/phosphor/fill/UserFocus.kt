package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserFocus: ImageVector
    get() {
        if (_userFocus != null) return _userFocus!!
        _userFocus = phosphorFillIcon(
            name = "UserFocus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 40v36c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-28h-28c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h36c4.418 0 8 3.582 8 8ZM216 172c-4.418 0-8 3.582-8 8v28h-28c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h36c4.418 0 8-3.582 8-8v-36c0-4.418-3.582-8-8-8ZM76 208h-28v-28c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v36c0 4.418 3.582 8 8 8h36c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM40 84c4.418 0 8-3.582 8-8v-28h28c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-36c-4.418 0-8 3.582-8 8v36c0 4.418 3.582 8 8 8ZM101 141.51c-10.867 4.714-20.313 12.188-27.4 21.68-1.824 2.424-2.12 5.672-.764 8.385 1.356 2.714 4.13 4.427 7.164 4.425h96c3.034 .003 5.808-1.711 7.164-4.425 1.356-2.714 1.06-5.961-.764-8.385C175.313 153.698 165.867 146.224 155 141.51c12.193-11.132 16.293-28.611 10.323-44.004C159.354 82.113 144.54 71.97 128.03 71.97c-16.51 0-31.324 10.144-37.293 25.536-5.97 15.393-1.869 32.872 10.323 44.004Z"),
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
        return _userFocus!!
    }

private var _userFocus: ImageVector? = null
