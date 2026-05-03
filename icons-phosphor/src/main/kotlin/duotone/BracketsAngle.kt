package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BracketsAngle: ImageVector
    get() {
        if (_bracketsAngle != null) return _bracketsAngle!!
        _bracketsAngle = phosphorDuotoneIcon(
            name = "BracketsAngle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 232.000 128.000 L 176.000 216.000 L 80.000 216.000 L 24.000 128.000 L 80.000 40.000 L 176.000 40.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 86.750 44.300 L 33.480 128.000 L 86.750 211.700 C 87.890 213.491 88.272 215.662 87.810 217.735 C 87.349 219.808 86.083 221.612 84.290 222.750 C 83.010 223.570 81.520 224.004 80.000 224.000 C 77.260 224.003 74.709 222.603 73.240 220.290 L 17.240 132.290 C 15.572 129.669 15.572 126.321 17.240 123.700 L 73.240 35.700 C 75.612 31.972 80.557 30.873 84.285 33.245 C 88.013 35.617 89.112 40.562 86.740 44.290 ZM 238.750 123.710 L 182.750 35.710 C 180.378 31.982 175.433 30.883 171.705 33.255 C 167.977 35.627 166.878 40.572 169.250 44.300 L 222.520 128.000 L 169.250 211.700 C 168.110 213.491 167.728 215.662 168.190 217.735 C 168.651 219.808 169.917 221.612 171.710 222.750 C 172.990 223.570 174.480 224.004 176.000 224.000 C 178.740 224.003 181.291 222.603 182.760 220.290 L 238.760 132.290 C 240.420 129.670 240.416 126.326 238.750 123.710 Z"),
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
        return _bracketsAngle!!
    }

private var _bracketsAngle: ImageVector? = null
