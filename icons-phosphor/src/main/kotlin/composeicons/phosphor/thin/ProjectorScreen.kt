package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ProjectorScreen: ImageVector
    get() {
        if (_projectorScreen != null) return _projectorScreen!!
        _projectorScreen = phosphorThinIcon(
            name = "ProjectorScreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 76c6.627 0 12-5.373 12-12v-16c0-6.627-5.373-12-12-12h-176C33.373 36 28 41.373 28 48v16c0 6.627 5.373 12 12 12h4v104h-12c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h92v24.4c-10.06 2.053-16.931 11.391-15.899 21.606 1.032 10.215 9.631 17.99 19.899 17.99 10.267 0 18.867-7.775 19.899-17.99C148.931 223.791 142.06 214.453 132 212.4v-24.4h92c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-12v-104ZM140 232c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM36 64v-16c0-2.209 1.791-4 4-4h176c2.209 0 4 1.791 4 4v16c0 2.209-1.791 4-4 4h-176c-2.209 0-4-1.791-4-4ZM204 180h-152v-104h152Z"),
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
        return _projectorScreen!!
    }

private var _projectorScreen: ImageVector? = null
