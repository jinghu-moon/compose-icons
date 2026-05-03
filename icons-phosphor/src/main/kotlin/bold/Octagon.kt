package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Octagon: ImageVector
    get() {
        if (_octagon != null) return _octagon!!
        _octagon = phosphorBoldIcon(
            name = "Octagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 230.140 77.410 L 178.590 25.860 C 174.850 22.095 169.757 19.985 164.450 20.000 L 91.550 20.000 C 86.243 19.985 81.150 22.095 77.410 25.860 L 25.860 77.410 C 22.095 81.150 19.985 86.243 20.000 91.550 L 20.000 164.450 C 19.985 169.757 22.095 174.850 25.860 178.590 L 77.410 230.140 C 81.150 233.905 86.243 236.015 91.550 236.000 L 164.450 236.000 C 169.757 236.015 174.850 233.905 178.590 230.140 L 230.140 178.590 C 233.905 174.850 236.015 169.757 236.000 164.450 L 236.000 91.550 C 236.015 86.243 233.905 81.150 230.140 77.410 ZM 212.000 162.790 L 162.790 212.000 L 93.210 212.000 L 44.000 162.790 L 44.000 93.210 L 93.210 44.000 L 162.790 44.000 L 212.000 93.210 Z"),
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
        return _octagon!!
    }

private var _octagon: ImageVector? = null
