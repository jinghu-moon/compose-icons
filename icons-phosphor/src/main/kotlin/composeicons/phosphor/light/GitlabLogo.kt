package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GitlabLogo: ImageVector
    get() {
        if (_gitlabLogo != null) return _gitlabLogo!!
        _gitlabLogo = phosphorLightIcon(
            name = "GitlabLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228.21 117.61 208.32 41.49c-1.065-4.246-4.783-7.295-9.155-7.509-4.372-.214-8.37 2.458-9.845 6.579L171.17 90h-86.34L66.66 40.56C65.185 36.438 61.188 33.767 56.815 33.981c-4.372 .214-8.09 3.263-9.155 7.509L27.79 117.61c-5.788 22.104 2.646 45.489 21.21 58.81l73.27 51.77c3.431 2.414 8.009 2.414 11.44 0L207 176.42c18.564-13.321 26.998-36.706 21.21-58.81ZM57.65 50.82 75 98.07c.869 2.364 3.122 3.934 5.64 3.93h94.72c2.518 .004 4.771-1.566 5.64-3.93L198.36 50.82l15 57.52L128 168.66 42.62 108.34ZM39.38 120.74 117.6 176 93.41 193.1 55.94 166.62C41.465 156.222 34.883 137.986 39.38 120.74ZM128 217.53 103.81 200.44 128 183.35l24.19 17.09ZM200.06 166.62l-37.47 26.48L138.4 176l78.22-55.26c4.497 17.246-2.085 35.482-16.56 45.88Z"),
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
