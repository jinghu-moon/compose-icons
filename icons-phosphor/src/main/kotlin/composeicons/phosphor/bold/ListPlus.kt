package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ListPlus: ImageVector
    get() {
        if (_listPlus != null) return _listPlus!!
        _listPlus = phosphorBoldIcon(
            name = "ListPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M28 64C28 57.373 33.373 52 40 52h176c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-176C33.373 76 28 70.627 28 64ZM40 140h176c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-176c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12ZM144 180h-104c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h104c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM232 180h-12v-12c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v12h-12c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h12v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-12h12c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _listPlus!!
    }

private var _listPlus: ImageVector? = null
