package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowArcRight: ImageVector
    get() {
        if (_arrowArcRight != null) return _arrowArcRight!!
        _arrowArcRight = phosphorDuotoneIcon(
            name = "ArrowArcRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 232.000 88.000 L 232.000 152.000 L 168.000 152.000 Z"),
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
                pathData = parseSvgPathData("M 235.060 80.610 C 232.071 79.370 228.629 80.053 226.340 82.340 L 199.860 108.830 C 169.762 80.062 125.408 72.016 87.124 88.381 C 48.839 104.745 24.004 142.365 24.000 184.000 C 24.000 188.418 27.582 192.000 32.000 192.000 C 36.418 192.000 40.000 188.418 40.000 184.000 C 40.014 148.844 60.951 117.070 93.250 103.187 C 125.549 89.305 163.012 95.978 188.530 120.160 L 162.340 146.340 C 160.049 148.628 159.364 152.071 160.603 155.062 C 161.842 158.053 164.762 160.003 168.000 160.000 L 232.000 160.000 C 236.418 160.000 240.000 156.418 240.000 152.000 L 240.000 88.000 C 239.999 84.764 238.050 81.848 235.060 80.610 ZM 224.000 144.000 L 187.310 144.000 L 224.000 107.310 Z"),
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
        return _arrowArcRight!!
    }

private var _arrowArcRight: ImageVector? = null
