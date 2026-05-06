package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PhosphorLogo: ImageVector
    get() {
        if (_phosphorLogo != null) return _phosphorLogo!!
        _phosphorLogo = phosphorThinIcon(
            name = "PhosphorLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 36h-80c-2.209 0-4 1.791-4 4v128c.044 41.955 34.045 75.956 76 76 2.209 0 4-1.791 4-4v-68h4c37.555 0 68-30.445 68-68C220 66.445 189.555 36 152 36ZM76 55.27 137.16 164h-61.16ZM140 152.73 78.84 44h61.16ZM76.13 172h63.87v63.88C105.619 233.803 78.202 206.381 76.13 172ZM152 164h-4v-120h4c33.137 0 60 26.863 60 60 0 33.137-26.863 60-60 60Z"),
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
        return _phosphorLogo!!
    }

private var _phosphorLogo: ImageVector? = null
