package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowCounterClockwise: ImageVector
    get() {
        if (_arrowCounterClockwise != null) return _arrowCounterClockwise!!
        _arrowCounterClockwise = phosphorThinIcon(
            name = "ArrowCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.000 128.000 C 220.005 178.334 179.559 219.327 129.230 220.000 L 128.000 220.000 C 104.515 220.048 81.911 211.061 64.870 194.900 C 63.263 193.381 63.191 190.847 64.710 189.240 C 66.229 187.633 68.763 187.561 70.370 189.080 C 103.889 220.687 156.613 219.398 188.547 186.189 C 220.480 152.980 219.706 100.246 186.810 67.989 C 153.915 35.733 101.177 35.992 68.600 68.570 L 68.470 68.690 L 34.300 100.000 L 72.000 100.000 C 74.209 100.000 76.000 101.791 76.000 104.000 C 76.000 106.209 74.209 108.000 72.000 108.000 L 24.000 108.000 C 21.791 108.000 20.000 106.209 20.000 104.000 L 20.000 56.000 C 20.000 53.791 21.791 52.000 24.000 52.000 C 26.209 52.000 28.000 53.791 28.000 56.000 L 28.000 94.890 L 63.000 62.890 C 89.324 36.609 128.884 28.766 163.243 43.016 C 197.603 57.265 220.001 90.803 220.000 128.000 Z"),
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
        return _arrowCounterClockwise!!
    }

private var _arrowCounterClockwise: ImageVector? = null
