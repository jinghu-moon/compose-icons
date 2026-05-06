package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AirplaneTilt: ImageVector
    get() {
        if (_airplaneTilt != null) return _airplaneTilt!!
        _airplaneTilt = phosphorRegularIcon(
            name = "AirplaneTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M185.33 114.21 214.47 86.79l.17-.17c12.498-12.498 12.498-32.762 0-45.26-12.498-12.498-32.762-12.498-45.26 0 0 .06-.11 .11-.17 .17L141.79 70.67 58.79 40.47c-2.921-1.062-6.192-.337-8.39 1.86l-24 24c-1.693 1.695-2.538 4.059-2.302 6.444 .236 2.384 1.529 4.537 3.522 5.866l63.89 42.59L76.69 136h-20.69c-2.119 .001-4.151 .843-5.65 2.34l-24 24c-1.901 1.897-2.724 4.62-2.191 7.252 .533 2.632 2.351 4.821 4.841 5.828l36.82 14.73 14.7 36.75 .06 .16c1.033 2.501 3.261 4.31 5.92 4.809 2.66 .498 5.391-.381 7.26-2.339l23.87-23.88c1.508-1.494 2.361-3.527 2.37-5.65v-20.69l14.76-14.76 42.59 63.89c1.329 1.993 3.482 3.286 5.866 3.522 2.384 .236 4.749-.608 6.444-2.302l24-24c2.197-2.198 2.922-5.469 1.86-8.39ZM185.26 211.44 142.67 147.56c-1.322-2.009-3.478-3.316-5.87-3.56-.27 0-.53 0-.79 0-2.124 .001-4.16 .846-5.66 2.35l-24 24c-1.501 1.497-2.346 3.53-2.35 5.65v20.69L90.93 209.76 79.43 181c-.813-2.018-2.412-3.617-4.43-4.43L46.26 165.07 59.32 152h20.68c2.122 .002 4.158-.84 5.66-2.34l24-24c1.697-1.695 2.544-4.062 2.308-6.449-.236-2.387-1.531-4.542-3.528-5.871L44.56 70.74 58.06 57.25l83.22 30.26c2.997 1.101 6.361 .315 8.56-2L180.78 52.6c6.275-6.091 16.278-6.016 22.461 .169 6.183 6.185 6.253 16.189 .159 22.461l-32.87 30.93c-2.315 2.199-3.101 5.563-2 8.56l30.26 83.22Z"),
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
        return _airplaneTilt!!
    }

private var _airplaneTilt: ImageVector? = null
