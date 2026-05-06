package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Leaf: ImageVector
    get() {
        if (_leaf != null) return _leaf!!
        _leaf = phosphorLightIcon(
            name = "Leaf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221.45 40.19c-.177-3.038-2.602-5.463-5.64-5.64C140.43 30.11 80.14 52.71 54.53 95c-17.44 28.79-16.76 62.8 1.79 96.2L35.76 211.76c-1.605 1.496-2.266 3.748-1.723 5.874 .543 2.126 2.203 3.786 4.329 4.329 2.126 .543 4.379-.118 5.874-1.723L64.8 199.68c17.27 9.59 34.7 14.41 51.49 14.41 15.783 .007 31.26-4.362 44.71-12.62 42.29-25.61 64.88-85.9 60.45-161.28ZM154.79 191.19c-24.08 14.58-52.64 14.37-81.13-.39l90.59-90.59c2.203-2.364 2.138-6.048-.147-8.333-2.285-2.285-5.969-2.35-8.333-.147L65.18 182.34c-14.76-28.49-15-57-.39-81.13C87.47 63.78 141.42 43.41 209.79 46.26c2.8 68.32-17.57 122.28-55 144.95Z"),
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
        return _leaf!!
    }

private var _leaf: ImageVector? = null
