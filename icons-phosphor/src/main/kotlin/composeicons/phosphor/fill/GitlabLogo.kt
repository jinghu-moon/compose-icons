package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GitlabLogo: ImageVector
    get() {
        if (_gitlabLogo != null) return _gitlabLogo!!
        _gitlabLogo = phosphorFillIcon(
            name = "GitlabLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230.15 117.1 210.25 41c-1.3-5.073-5.754-8.708-10.986-8.962-5.231-.255-10.018 2.929-11.804 7.852L169.78 88h-83.56L68.54 39.87C66.749 34.948 61.96 31.767 56.728 32.026 51.497 32.286 47.045 35.925 45.75 41L25.85 117.1c-6.017 22.928 2.734 47.191 22 61l73.27 51.76c4.118 2.908 9.622 2.908 13.74 0l73.27-51.76c19.274-13.804 28.033-38.068 22.02-61ZM40.68 124.1 114.13 176 93.41 190.65 57.09 165C44.151 155.707 37.755 139.769 40.68 124.11ZM128 215.1 107.27 200.45 128 185.8l20.73 14.64ZM198.91 165l-36.32 25.66L141.87 176l73.45-51.9c2.929 15.663-3.467 31.606-16.41 40.9Z"),
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
        return _gitlabLogo!!
    }

private var _gitlabLogo: ImageVector? = null
