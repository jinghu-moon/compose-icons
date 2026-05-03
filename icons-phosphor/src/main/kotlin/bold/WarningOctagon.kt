package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WarningOctagon: ImageVector
    get() {
        if (_warningOctagon != null) return _warningOctagon!!
        _warningOctagon = phosphorBoldIcon(
            name = "WarningOctagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 116.000 132.000 L 116.000 80.000 C 116.000 73.373 121.373 68.000 128.000 68.000 C 134.627 68.000 140.000 73.373 140.000 80.000 L 140.000 132.000 C 140.000 138.627 134.627 144.000 128.000 144.000 C 121.373 144.000 116.000 138.627 116.000 132.000 ZM 236.000 91.550 L 236.000 164.450 C 236.014 169.757 233.904 174.849 230.140 178.590 L 178.590 230.140 C 174.850 233.905 169.757 236.015 164.450 236.000 L 91.550 236.000 C 86.243 236.015 81.150 233.905 77.410 230.140 L 25.860 178.590 C 22.096 174.849 19.986 169.757 20.000 164.450 L 20.000 91.550 C 19.986 86.243 22.096 81.151 25.860 77.410 L 77.410 25.860 C 81.150 22.095 86.243 19.985 91.550 20.000 L 164.450 20.000 C 169.757 19.985 174.850 22.095 178.590 25.860 L 230.140 77.410 C 233.904 81.151 236.014 86.243 236.000 91.550 ZM 212.000 93.210 L 162.790 44.000 L 93.210 44.000 L 44.000 93.210 L 44.000 162.790 L 93.210 212.000 L 162.790 212.000 L 212.000 162.790 ZM 128.000 156.000 C 119.163 156.000 112.000 163.163 112.000 172.000 C 112.000 180.837 119.163 188.000 128.000 188.000 C 136.837 188.000 144.000 180.837 144.000 172.000 C 144.000 163.163 136.837 156.000 128.000 156.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _warningOctagon!!
    }

private var _warningOctagon: ImageVector? = null
