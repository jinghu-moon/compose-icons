package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GoogleChromeLogo: ImageVector
    get() {
        if (_googleChromeLogo != null) return _googleChromeLogo!!
        _googleChromeLogo = phosphorRegularIcon(
            name = "GoogleChromeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM128 40c29.756 .012 57.49 15.061 73.72 40h-73.72c-20.723 .023-39.1 13.322-45.6 33L59.32 73C76.007 52.132 101.281 39.988 128 40ZM160 128c0 17.673-14.327 32-32 32C110.327 160 96 145.673 96 128c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32ZM40 128c-.017-13.856 3.26-27.518 9.56-39.86L86.43 152c.06 .1 .13 .19 .19 .28 10.42 17.779 31.026 26.922 51.2 22.72l-23.1 40C71.773 208.384 40.055 171.454 40 128ZM132.69 215.87 169.57 152c.08-.14 .14-.28 .22-.42 10.146-17.892 7.731-40.265-6-55.58h46.21c10.268 26.309 7.285 55.947-8.019 79.682-15.304 23.735-41.07 38.683-69.271 40.188Z"),
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
        return _googleChromeLogo!!
    }

private var _googleChromeLogo: ImageVector? = null
