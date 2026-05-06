package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberSquareFive: ImageVector
    get() {
        if (_numberSquareFive != null) return _numberSquareFive!!
        _numberSquareFive = phosphorLightIcon(
            name = "NumberSquareFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 34h-160C40.268 34 34 40.268 34 48v160c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-160c0-7.732-6.268-14-14-14ZM210 208c0 1.105-.895 2-2 2h-160c-1.105 0-2-.895-2-2v-160c0-1.105 .895-2 2-2h160c1.105 0 2 .895 2 2ZM117.08 86l-5 30c3.832-1.334 7.862-2.01 11.92-2 18.778 0 34 15.222 34 34 0 18.778-15.222 34-34 34-9.089 .154-17.852-3.382-24.29-9.8-2.32-2.369-2.279-6.17 .09-8.49 2.369-2.32 6.17-2.279 8.49 .09 4.181 4.108 9.85 6.345 15.71 6.2 12.15 0 22-9.85 22-22 0-12.15-9.85-22-22-22-5.86-.145-11.529 2.092-15.71 6.2-1.834 1.881-4.678 2.35-7.019 1.158C98.93 132.166 97.637 129.589 98.08 127l8-48c.488-2.888 2.991-5.002 5.92-5h40c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6Z"),
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
        return _numberSquareFive!!
    }

private var _numberSquareFive: ImageVector? = null
