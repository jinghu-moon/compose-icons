package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CellSignalSlash: ImageVector
    get() {
        if (_cellSignalSlash != null) return _cellSignalSlash!!
        _cellSignalSlash = phosphorFillIcon(
            name = "CellSignalSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.38 221.92c-3.27 2.971-8.329 2.729-11.3-.54l-5.51-6.06c-1.483 .445-3.022 .674-4.57 .68h-160c-6.752 .001-12.777-4.236-15.06-10.59-2.028-5.978-.445-12.589 4.07-17l79.13-79.12L42.26 45.62c-3.011-3.218-2.95-8.238 .14-11.38 1.556-1.504 3.655-2.314 5.818-2.244 2.163 .07 4.206 1.013 5.662 2.614l160 176c1.435 1.565 2.188 3.637 2.095 5.759-.094 2.121-1.027 4.119-2.595 5.551ZM201 172.66c1.106 1.254 2.875 1.688 4.435 1.088 1.561-.6 2.584-2.107 2.565-3.778v-129.97c.005-6.475-3.893-12.315-9.875-14.794-5.982-2.479-12.868-1.107-17.445 3.474L125.47 83.88c-1.51 1.51-1.567 3.94-.13 5.52Z"),
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
        return _cellSignalSlash!!
    }

private var _cellSignalSlash: ImageVector? = null
