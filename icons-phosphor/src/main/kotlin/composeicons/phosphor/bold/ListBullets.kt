package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ListBullets: ImageVector
    get() {
        if (_listBullets != null) return _listBullets!!
        _listBullets = phosphorBoldIcon(
            name = "ListBullets",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M76 64C76 57.373 81.373 52 88 52h128c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-128C81.373 76 76 70.627 76 64ZM216 116h-128c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h128c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM216 180h-128c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h128c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM44 112c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16ZM44 48C35.163 48 28 55.163 28 64c0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16C60 55.163 52.837 48 44 48ZM44 176c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16Z"),
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
        return _listBullets!!
    }

private var _listBullets: ImageVector? = null
