package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MicrosoftTeamsLogo: ImageVector
    get() {
        if (_microsoftTeamsLogo != null) return _microsoftTeamsLogo!!
        _microsoftTeamsLogo = phosphorBoldIcon(
            name = "MicrosoftTeamsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M116 104c0 6.627-5.373 12-12 12h-4v36c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-36h-4c-6.627 0-12-5.373-12-12C60 97.373 65.373 92 72 92h32c6.627 0 12 5.373 12 12ZM240 92.74v59.26c.024 23.54-18.484 42.93-42 44-10.664 23.634-33.84 39.147-59.754 39.996C112.331 236.846 88.189 222.885 76 200h-40C24.954 200 16 191.046 16 180v-104C16 64.954 24.954 56 36 56h56c.012-19.351 12.665-36.423 31.176-42.063 18.511-5.64 38.534 1.476 49.334 17.533 13.146-6.272 28.776-4.005 39.598 5.744 10.822 9.749 14.703 25.059 9.832 38.786h1.32c9.241 .011 16.729 7.499 16.74 16.74ZM180 55.09c0 .3 0 .6 0 .91 .007 6.949-1.628 13.802-4.77 20h12.77c5.36 .017 10.081-3.522 11.567-8.672 1.487-5.149-.622-10.66-5.166-13.502C189.857 50.984 183.98 51.5 180 55.09ZM116 56h24c5.676 .003 11.081 2.425 14.86 6.66 .75-2.14 1.136-4.392 1.14-6.66C156 44.954 147.046 36 136 36c-11.046 0-20 8.954-20 20ZM40 176h96v-96h-96ZM180 168v-68h-20v80c0 11.046-8.954 20-20 20h-34.14c12.779 12.015 31.472 15.293 47.576 8.342C169.54 201.391 179.978 185.54 180 168ZM216 100h-12v68c0 .79 0 1.57-.06 2.35C211.259 167.184 215.997 159.974 216 152Z"),
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
        return _microsoftTeamsLogo!!
    }

private var _microsoftTeamsLogo: ImageVector? = null
