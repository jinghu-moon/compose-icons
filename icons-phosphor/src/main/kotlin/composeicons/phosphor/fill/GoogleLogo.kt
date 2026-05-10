package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GoogleLogo: ImageVector
    get() {
        if (_googleLogo != null) return _googleLogo!!
        _googleLogo = phosphorFillIcon(
            name = "GoogleLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C232 70.562 185.438 24 128 24ZM128 208C92.344 207.996 60.994 184.396 51.13 150.131 41.267 115.867 55.27 79.21 85.466 60.249c30.197-18.961 69.297-15.649 95.874 8.121 3.208 2.965 3.445 7.956 .531 11.211-2.914 3.255-7.9 3.571-11.201 .709C148.721 60.658 116.209 58.537 91.896 75.15 67.582 91.764 57.743 122.824 68.056 150.407c10.313 27.583 38.116 44.568 67.365 41.154 29.249-3.414 52.394-26.345 56.078-55.561h-63.5c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h72c4.418 0 8 3.582 8 8-.05 44.162-35.838 79.95-80 80Z"),
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
        return _googleLogo!!
    }

private var _googleLogo: ImageVector? = null
