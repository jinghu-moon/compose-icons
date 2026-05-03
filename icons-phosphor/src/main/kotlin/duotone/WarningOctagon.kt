package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.WarningOctagon: ImageVector
    get() {
        if (_warningOctagon != null) return _warningOctagon!!
        _warningOctagon = phosphorDuotoneIcon(
            name = "WarningOctagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 91.550 L 224.000 164.450 C 224.002 166.572 223.160 168.608 221.660 170.110 L 170.110 221.660 C 168.608 223.160 166.572 224.002 164.450 224.000 L 91.550 224.000 C 89.428 224.002 87.392 223.160 85.890 221.660 L 34.340 170.110 C 32.840 168.608 31.998 166.572 32.000 164.450 L 32.000 91.550 C 31.998 89.428 32.840 87.392 34.340 85.890 L 85.890 34.340 C 87.392 32.840 89.428 31.998 91.550 32.000 L 164.450 32.000 C 166.572 31.998 168.608 32.840 170.110 34.340 L 221.660 85.890 C 223.160 87.392 224.002 89.428 224.000 91.550 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 120.000 136.000 L 120.000 80.000 C 120.000 75.582 123.582 72.000 128.000 72.000 C 132.418 72.000 136.000 75.582 136.000 80.000 L 136.000 136.000 C 136.000 140.418 132.418 144.000 128.000 144.000 C 123.582 144.000 120.000 140.418 120.000 136.000 ZM 232.000 91.550 L 232.000 164.450 C 232.014 168.696 230.324 172.770 227.310 175.760 L 175.760 227.310 C 172.770 230.324 168.696 232.014 164.450 232.000 L 91.550 232.000 C 87.304 232.014 83.230 230.324 80.240 227.310 L 28.690 175.760 C 25.676 172.770 23.986 168.696 24.000 164.450 L 24.000 91.550 C 23.986 87.304 25.676 83.230 28.690 80.240 L 80.240 28.690 C 83.230 25.676 87.304 23.986 91.550 24.000 L 164.450 24.000 C 168.696 23.986 172.770 25.676 175.760 28.690 L 227.310 80.240 C 230.324 83.230 232.014 87.304 232.000 91.550 ZM 216.000 91.550 L 164.450 40.000 L 91.550 40.000 L 40.000 91.550 L 40.000 164.450 L 91.550 216.000 L 164.450 216.000 L 216.000 164.450 ZM 128.000 160.000 C 121.373 160.000 116.000 165.373 116.000 172.000 C 116.000 178.627 121.373 184.000 128.000 184.000 C 134.627 184.000 140.000 178.627 140.000 172.000 C 140.000 165.373 134.627 160.000 128.000 160.000 Z"),
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
        return _warningOctagon!!
    }

private var _warningOctagon: ImageVector? = null
