package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Octagon: ImageVector
    get() {
        if (_octagon != null) return _octagon!!
        _octagon = phosphorFillIcon(
            name = "Octagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 227.310 80.230 L 175.770 28.690 C 172.760 25.699 168.693 24.013 164.450 24.000 L 91.550 24.000 C 87.307 24.013 83.240 25.699 80.230 28.690 L 28.690 80.230 C 25.699 83.240 24.013 87.307 24.000 91.550 L 24.000 164.450 C 24.013 168.693 25.699 172.760 28.690 175.770 L 80.230 227.310 C 83.240 230.301 87.307 231.987 91.550 232.000 L 164.450 232.000 C 168.693 231.987 172.760 230.301 175.770 227.310 L 227.310 175.770 C 230.301 172.760 231.987 168.693 232.000 164.450 L 232.000 91.550 C 231.987 87.307 230.301 83.240 227.310 80.230 Z"),
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
