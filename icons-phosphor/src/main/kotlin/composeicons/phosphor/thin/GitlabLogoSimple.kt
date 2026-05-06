package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GitlabLogoSimple: ImageVector
    get() {
        if (_gitlabLogoSimple != null) return _gitlabLogoSimple!!
        _gitlabLogoSimple = phosphorThinIcon(
            name = "GitlabLogoSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M226.27 118.11 206.38 42c-.859-3.379-3.821-5.802-7.303-5.974-3.482-.172-6.669 1.947-7.857 5.224L172.57 92h-89.14L64.78 41.24C63.59 37.963 60.401 35.845 56.919 36.02c-3.482 .175-6.443 2.6-7.299 5.98L29.73 118.11c-5.585 21.303 2.544 43.845 20.44 56.68l73.27 51.76c2.733 1.932 6.387 1.932 9.12 0l73.27-51.76c17.896-12.835 26.025-35.377 20.44-56.68ZM201.22 168.25 128 220 54.78 168.25C39.601 157.347 32.717 138.214 37.47 120.14l19.84-76L76.89 97.38c.578 1.572 2.075 2.618 3.75 2.62h94.72c1.675-.002 3.172-1.048 3.75-2.62L198.68 44.16l19.85 76c4.744 18.068-2.139 37.19-17.31 48.09Z"),
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
