package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SmileyWink: ImageVector
    get() {
        if (_smileyWink != null) return _smileyWink!!
        _smileyWink = phosphorBoldIcon(
            name = "SmileyWink",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 76.000 108.000 C 76.000 99.163 83.163 92.000 92.000 92.000 C 100.837 92.000 108.000 99.163 108.000 108.000 C 108.000 116.837 100.837 124.000 92.000 124.000 C 83.163 124.000 76.000 116.837 76.000 108.000 ZM 188.000 108.000 C 188.000 114.627 182.627 120.000 176.000 120.000 L 152.000 120.000 C 145.373 120.000 140.000 114.627 140.000 108.000 C 140.000 101.373 145.373 96.000 152.000 96.000 L 176.000 96.000 C 182.627 96.000 188.000 101.373 188.000 108.000 ZM 178.390 158.000 C 167.390 177.060 149.000 188.000 128.000 188.000 C 107.000 188.000 88.640 177.070 77.610 158.000 C 74.442 152.276 76.443 145.069 82.108 141.798 C 87.774 138.526 95.016 140.395 98.390 146.000 C 102.280 152.730 111.300 164.000 128.000 164.000 C 144.700 164.000 153.720 152.720 157.610 146.000 C 159.711 142.203 163.698 139.837 168.038 139.811 C 172.377 139.785 176.392 142.103 178.539 145.875 C 180.685 149.646 180.628 154.282 178.390 158.000 Z"),
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
        return _smileyWink!!
    }

private var _smileyWink: ImageVector? = null
