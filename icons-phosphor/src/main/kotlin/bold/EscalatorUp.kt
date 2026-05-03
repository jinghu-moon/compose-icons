package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.EscalatorUp: ImageVector
    get() {
        if (_escalatorUp != null) return _escalatorUp!!
        _escalatorUp = phosphorBoldIcon(
            name = "EscalatorUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 36.000 L 168.000 36.000 C 164.650 35.999 161.452 37.399 159.180 39.860 L 66.750 140.000 L 32.000 140.000 C 20.954 140.000 12.000 148.954 12.000 160.000 L 12.000 200.000 C 12.000 211.046 20.954 220.000 32.000 220.000 L 88.000 220.000 C 91.350 220.001 94.548 218.601 96.820 216.140 L 189.250 116.000 L 224.000 116.000 C 235.046 116.000 244.000 107.046 244.000 96.000 L 244.000 56.000 C 244.000 44.954 235.046 36.000 224.000 36.000 ZM 220.000 92.000 L 184.000 92.000 C 180.650 91.999 177.452 93.399 175.180 95.860 L 82.750 196.000 L 36.000 196.000 L 36.000 164.000 L 72.000 164.000 C 75.350 164.001 78.548 162.601 80.820 160.140 L 173.250 60.000 L 220.000 60.000 ZM 232.490 167.510 C 237.184 172.204 237.184 179.816 232.490 184.510 C 227.796 189.204 220.184 189.204 215.490 184.510 L 212.000 181.000 L 212.000 208.000 C 212.000 214.627 206.627 220.000 200.000 220.000 C 193.373 220.000 188.000 214.627 188.000 208.000 L 188.000 181.000 L 184.490 184.520 C 179.796 189.214 172.184 189.214 167.490 184.520 C 162.796 179.826 162.796 172.214 167.490 167.520 L 191.490 143.520 C 193.742 141.261 196.800 139.991 199.990 139.991 C 203.180 139.991 206.238 141.261 208.490 143.520 Z"),
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
        return _escalatorUp!!
    }

private var _escalatorUp: ImageVector? = null
