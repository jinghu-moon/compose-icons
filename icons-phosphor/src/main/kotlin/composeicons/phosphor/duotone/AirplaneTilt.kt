package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.AirplaneTilt: ImageVector
    get() {
        if (_airplaneTilt != null) return _airplaneTilt!!
        _airplaneTilt = phosphorDuotoneIcon(
            name = "AirplaneTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M209 81l-33 31 32 88-24 24L136 152l-24 24v24L88 224 72 184 32 168 56 144h24l24-24L32 72 56 48l88 32L175 47c9.389-9.389 24.611-9.389 34 0 9.389 9.389 9.389 24.611 0 34Z"),
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
                pathData = parseSvgPathData("M185.33 114.21 214.47 86.78l.17-.16c12.498-12.498 12.498-32.762 0-45.26-12.498-12.498-32.762-12.498-45.26 0l-.16 .17L141.79 70.67 58.79 40.47c-2.921-1.062-6.192-.337-8.39 1.86l-24 24c-1.693 1.695-2.538 4.059-2.302 6.444 .236 2.384 1.529 4.537 3.522 5.866l63.89 42.59L76.69 136h-20.69c-2.119 .001-4.151 .843-5.65 2.34l-24 24c-1.901 1.897-2.724 4.62-2.191 7.252 .533 2.632 2.351 4.821 4.841 5.828l36.82 14.73 14.7 36.75 .06 .16c1.033 2.501 3.261 4.31 5.92 4.809 2.66 .498 5.391-.381 7.26-2.339l23.87-23.88c1.508-1.494 2.361-3.527 2.37-5.65v-20.69l14.76-14.76 42.59 63.89c1.329 1.993 3.482 3.286 5.866 3.522 2.384 .236 4.749-.608 6.444-2.302l24-24c2.197-2.198 2.922-5.469 1.86-8.39ZM185.26 211.44 142.67 147.55c-1.324-2.005-3.48-3.308-5.87-3.55-.263-.015-.527-.015-.79 0-2.122-.002-4.158 .84-5.66 2.34l-24 24c-1.504 1.5-2.349 3.536-2.35 5.66v20.69L90.93 209.76 79.43 181c-.813-2.018-2.412-3.617-4.43-4.43L46.26 165.07 59.32 152h20.68c2.122 .002 4.158-.84 5.66-2.34l24-24c1.697-1.695 2.544-4.062 2.308-6.449-.236-2.387-1.531-4.542-3.528-5.871L44.56 70.74 58.06 57.25l83.22 30.26c2.997 1.101 6.361 .315 8.56-2L180.78 52.63c6.312-5.781 16.056-5.571 22.113 .478 6.057 6.049 6.28 15.793 .507 22.112l-32.87 30.94c-2.315 2.199-3.101 5.563-2 8.56l30.26 83.22Z"),
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
