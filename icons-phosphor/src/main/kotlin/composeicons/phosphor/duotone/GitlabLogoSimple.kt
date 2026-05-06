package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GitlabLogoSimple: ImageVector
    get() {
        if (_gitlabLogoSimple != null) return _gitlabLogoSimple!!
        _gitlabLogoSimple = phosphorDuotoneIcon(
            name = "GitlabLogoSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M203.52 171.52l-73.26 51.76c-1.354 .959-3.166 .959-4.52 0L52.48 171.52C35.91 159.673 28.397 138.811 33.61 119.12L53.5 43c.425-1.67 1.889-2.869 3.61-2.956 1.721-.087 3.299 .957 3.89 2.576L80.65 96h94.7L195 42.62c.576-1.645 2.167-2.714 3.907-2.626 1.74 .088 3.215 1.311 3.623 3.006l19.89 76.12c5.206 19.697-2.319 40.561-18.9 52.4Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M230.15 117.1 210.25 41c-1.3-5.073-5.754-8.708-10.986-8.962-5.231-.255-10.018 2.929-11.804 7.852L169.78 88h-83.56L68.54 39.87C66.749 34.948 61.96 31.767 56.728 32.026 51.497 32.286 47.045 35.925 45.75 41L25.85 117.1c-6.017 22.928 2.734 47.191 22 61l73.27 51.76c4.118 2.908 9.622 2.908 13.74 0l73.27-51.76c19.274-13.804 28.033-38.068 22.02-61ZM198.91 165 128 215.09 57.09 165C43.266 155.06 37.002 137.625 41.34 121.16L58 57.5 73.13 98.76c1.157 3.148 4.156 5.24 7.51 5.24h94.72c3.354 0 6.353-2.092 7.51-5.24L198 57.5l16.63 63.65c4.349 16.462-1.903 33.901-15.72 43.85Z"),
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
        return _gitlabLogoSimple!!
    }

private var _gitlabLogoSimple: ImageVector? = null
