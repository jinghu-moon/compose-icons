package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChartPolar: ImageVector
    get() {
        if (_chartPolar != null) return _chartPolar!!
        _chartPolar = phosphorBoldIcon(
            name = "ChartPolar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 211.130 116.000 L 194.920 116.000 C 189.854 88.033 167.967 66.146 140.000 61.080 L 140.000 44.870 C 176.827 50.249 205.751 79.173 211.130 116.000 ZM 116.000 116.000 L 85.680 116.000 C 89.867 101.332 101.332 89.867 116.000 85.680 ZM 116.000 140.000 L 116.000 170.320 C 101.332 166.133 89.867 154.668 85.680 140.000 ZM 140.000 140.000 L 170.320 140.000 C 166.133 154.668 154.668 166.133 140.000 170.320 ZM 140.000 116.000 L 140.000 85.680 C 154.668 89.867 166.133 101.332 170.320 116.000 ZM 116.000 44.870 L 116.000 61.080 C 88.033 66.146 66.146 88.033 61.080 116.000 L 44.870 116.000 C 50.249 79.173 79.173 50.249 116.000 44.870 ZM 44.870 140.000 L 61.080 140.000 C 66.146 167.967 88.033 189.854 116.000 194.920 L 116.000 211.130 C 79.173 205.751 50.249 176.827 44.870 140.000 ZM 140.000 211.130 L 140.000 194.920 C 167.967 189.854 189.854 167.967 194.920 140.000 L 211.130 140.000 C 205.751 176.827 176.827 205.751 140.000 211.130 Z"),
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
        return _chartPolar!!
    }

private var _chartPolar: ImageVector? = null
