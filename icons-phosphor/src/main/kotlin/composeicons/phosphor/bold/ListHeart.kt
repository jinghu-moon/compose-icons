package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ListHeart: ImageVector
    get() {
        if (_listHeart != null) return _listHeart!!
        _listHeart = phosphorBoldIcon(
            name = "ListHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M124 192c0 6.627-5.373 12-12 12h-72c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h72c6.627 0 12 5.373 12 12ZM40 76h176c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-176C33.373 52 28 57.373 28 64c0 6.627 5.373 12 12 12ZM40 140h56c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-56c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12ZM252 144c0 17-9.53 33.56-28.32 49.22-8.135 6.738-16.953 12.607-26.31 17.51-3.38 1.691-7.36 1.691-10.74 0-9.357-4.903-18.175-10.772-26.31-17.51C141.53 177.56 132 161 132 144c.009-14.193 8.356-27.055 21.313-32.845 12.958-5.79 28.108-3.426 38.687 6.035 10.578-9.462 25.729-11.825 38.687-6.035 12.958 5.79 21.304 18.653 21.313 32.845ZM228 144c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 17.23 22.85 34.43 36 42.29 13.14-7.85 36-25.06 36-42.29Z"),
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
        return _listHeart!!
    }

private var _listHeart: ImageVector? = null
