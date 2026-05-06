package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LinkedinLogo: ImageVector
    get() {
        if (_linkedinLogo != null) return _linkedinLogo!!
        _linkedinLogo = phosphorThinIcon(
            name = "LinkedinLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 28h-176C33.373 28 28 33.373 28 40v176c0 6.627 5.373 12 12 12h176c6.627 0 12-5.373 12-12v-176c0-6.627-5.373-12-12-12ZM220 216c0 2.209-1.791 4-4 4h-176c-2.209 0-4-1.791-4-4v-176c0-2.209 1.791-4 4-4h176c2.209 0 4 1.791 4 4ZM92 112v64c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-64c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM180 140v36c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-36c0-13.255-10.745-24-24-24-13.255 0-24 10.745-24 24v36c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-64c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v6.87c8.798-9.977 22.851-13.47 35.297-8.774 12.446 4.696 20.688 16.602 20.703 29.904ZM96 84c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _linkedinLogo!!
    }

private var _linkedinLogo: ImageVector? = null
