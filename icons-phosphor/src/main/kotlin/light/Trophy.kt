package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Trophy: ImageVector
    get() {
        if (_trophy != null) return _trophy!!
        _trophy = phosphorLightIcon(
            name = "Trophy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 66.000 L 206.000 66.000 L 206.000 48.000 C 206.000 44.686 203.314 42.000 200.000 42.000 L 56.000 42.000 C 52.686 42.000 50.000 44.686 50.000 48.000 L 50.000 66.000 L 24.000 66.000 C 16.268 66.000 10.000 72.268 10.000 80.000 L 10.000 96.000 C 10.000 116.987 27.013 134.000 48.000 134.000 L 53.140 134.000 C 62.287 165.081 89.696 187.272 122.000 189.750 L 122.000 218.000 L 96.000 218.000 C 92.686 218.000 90.000 220.686 90.000 224.000 C 90.000 227.314 92.686 230.000 96.000 230.000 L 160.000 230.000 C 163.314 230.000 166.000 227.314 166.000 224.000 C 166.000 220.686 163.314 218.000 160.000 218.000 L 134.000 218.000 L 134.000 189.750 C 166.440 187.230 193.430 164.450 202.620 134.000 L 208.000 134.000 C 228.987 134.000 246.000 116.987 246.000 96.000 L 246.000 80.000 C 246.000 72.268 239.732 66.000 232.000 66.000 ZM 48.000 122.000 C 33.641 122.000 22.000 110.359 22.000 96.000 L 22.000 80.000 C 22.000 78.895 22.895 78.000 24.000 78.000 L 50.000 78.000 L 50.000 112.000 C 50.010 115.344 50.227 118.683 50.650 122.000 ZM 194.000 111.100 C 194.000 147.720 164.620 177.730 128.500 178.000 C 110.909 178.133 93.993 171.239 81.507 158.847 C 69.022 146.455 61.999 129.591 62.000 112.000 L 62.000 54.000 L 194.000 54.000 ZM 234.000 96.000 C 234.000 110.359 222.359 122.000 208.000 122.000 L 205.230 122.000 C 205.740 118.389 205.997 114.747 206.000 111.100 L 206.000 78.000 L 232.000 78.000 C 233.105 78.000 234.000 78.895 234.000 80.000 Z"),
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
        return _trophy!!
    }

private var _trophy: ImageVector? = null
