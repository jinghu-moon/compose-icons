package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Virus: ImageVector
    get() {
        if (_virus != null) return _virus!!
        _virus = phosphorThinIcon(
            name = "Virus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M132 108C132 94.745 121.255 84 108 84 94.745 84 84 94.745 84 108c0 13.255 10.745 24 24 24 13.255 0 24-10.745 24-24ZM108 124c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM188 128c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM140 176c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM240 124h-20.09c-.926-21.616-9.47-42.208-24.12-58.13l15-15c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0l-15 15C174.208 45.56 153.616 37.016 132 36.09v-20.09c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v20.09c-21.616 .926-42.208 9.47-58.13 24.12l-15-15c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66l15 15C45.56 81.792 37.016 102.384 36.09 124h-20.09c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h20.09c.926 21.616 9.47 42.208 24.12 58.13l-15 15c-1.563 1.563-1.563 4.097 0 5.66 1.563 1.563 4.097 1.563 5.66 0l15-15c15.922 14.65 36.514 23.194 58.13 24.12v20.09c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20.09c21.616-.926 42.208-9.47 58.13-24.12l15 15c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66l-15-15C210.44 174.208 218.984 153.616 219.91 132h20.09c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM128 212C81.608 212 44 174.392 44 128 44 81.608 81.608 44 128 44c46.392 0 84 37.608 84 84-.05 46.371-37.629 83.95-84 84Z"),
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
        return _virus!!
    }

private var _virus: ImageVector? = null
