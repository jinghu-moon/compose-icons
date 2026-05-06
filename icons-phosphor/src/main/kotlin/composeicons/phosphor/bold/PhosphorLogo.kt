package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PhosphorLogo: ImageVector
    get() {
        if (_phosphorLogo != null) return _phosphorLogo!!
        _phosphorLogo = phosphorBoldIcon(
            name = "PhosphorLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 104C227.956 62.045 193.955 28.044 152 28h-80C65.373 28 60 33.373 60 40v128c.05 46.371 37.629 83.95 84 84 6.627 0 12-5.373 12-12v-60.11c40.341-2.172 71.952-35.491 72-75.89ZM84 85.81 123.48 156h-39.48ZM132 122.19 92.52 52h39.48ZM85.22 180h46.78v46.79C108.463 221.933 90.072 203.538 85.22 180ZM156 155.83v-103.66c27.001 2.189 47.799 24.74 47.799 51.83 0 27.09-20.798 49.641-47.799 51.83Z"),
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
        return _phosphorLogo!!
    }

private var _phosphorLogo: ImageVector? = null
