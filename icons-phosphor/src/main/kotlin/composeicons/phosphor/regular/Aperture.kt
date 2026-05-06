package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Aperture: ImageVector
    get() {
        if (_aperture != null) return _aperture!!
        _aperture = phosphorRegularIcon(
            name = "Aperture",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M201.54 54.46C160.925 13.845 95.075 13.845 54.46 54.46c-40.615 40.615-40.615 106.465 0 147.08 40.615 40.615 106.465 40.615 147.08 0 40.615-40.615 40.615-106.465 0-147.08ZM190.23 65.78c4.102 4.12 7.787 8.635 11 13.48L167.55 119 139.63 40.78c19.169 2.504 36.965 11.297 50.6 25ZM155.59 133l-18.16 21.37-27.59-5L100.41 123l18.16-21.37 27.59 5ZM65.77 65.78C80.879 50.589 101.044 41.482 122.43 40.19l17.51 49L58.3 74.32c2.304-3.004 4.799-5.857 7.47-8.54ZM46.65 161.54C37.047 138.089 37.968 111.645 49.18 88.92l51.21 9.35ZM65.77 190.22c-4.102-4.12-7.787-8.635-11-13.48L88.45 137l27.92 78.18C97.206 212.687 79.411 203.909 65.77 190.22ZM190.23 190.22c-15.109 15.191-35.274 24.298-56.66 25.59l-17.51-49 81.64 14.91c-2.305 2.991-4.8 5.83-7.47 8.5ZM155.61 157.73 209.35 94.46c9.603 23.451 8.682 49.895-2.53 72.62Z"),
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
        return _aperture!!
    }

private var _aperture: ImageVector? = null
