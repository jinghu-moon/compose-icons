package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Towel: ImageVector
    get() {
        if (_towel != null) return _towel!!
        _towel = phosphorRegularIcon(
            name = "Towel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 24h-128C58.745 24 48 34.745 48 48v168c0 8.837 7.163 16 16 16h112c8.837 0 16-7.163 16-16v-168c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v104c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-104C224 34.745 213.255 24 200 24ZM72 40h105.37c-.911 2.569-1.374 5.275-1.37 8v136h-112v-136c0-4.418 3.582-8 8-8ZM64 216v-16h112v16Z"),
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
        return _towel!!
    }

private var _towel: ImageVector? = null
