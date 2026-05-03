package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.EscalatorDown: ImageVector
    get() {
        if (_escalatorDown != null) return _escalatorDown!!
        _escalatorDown = phosphorBoldIcon(
            name = "EscalatorDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 167.510 88.490 C 162.816 83.796 162.816 76.184 167.510 71.490 C 172.204 66.796 179.816 66.796 184.510 71.490 L 188.000 75.000 L 188.000 48.000 C 188.000 41.373 193.373 36.000 200.000 36.000 C 206.627 36.000 212.000 41.373 212.000 48.000 L 212.000 75.000 L 215.510 71.480 C 220.204 66.786 227.816 66.786 232.510 71.480 C 237.204 76.174 237.204 83.786 232.510 88.480 L 208.510 112.480 C 206.258 114.739 203.200 116.009 200.010 116.009 C 196.820 116.009 193.762 114.739 191.510 112.480 ZM 244.000 160.000 L 244.000 200.000 C 244.000 211.046 235.046 220.000 224.000 220.000 L 168.000 220.000 C 164.650 220.001 161.452 218.601 159.180 216.140 L 66.750 116.000 L 32.000 116.000 C 20.954 116.000 12.000 107.046 12.000 96.000 L 12.000 56.000 C 12.000 44.954 20.954 36.000 32.000 36.000 L 88.000 36.000 C 91.350 35.999 94.548 37.399 96.820 39.860 L 189.250 140.000 L 224.000 140.000 C 235.046 140.000 244.000 148.954 244.000 160.000 ZM 220.000 164.000 L 184.000 164.000 C 180.650 164.001 177.452 162.601 175.180 160.140 L 82.750 60.000 L 36.000 60.000 L 36.000 92.000 L 72.000 92.000 C 75.350 91.999 78.548 93.399 80.820 95.860 L 173.250 196.000 L 220.000 196.000 Z"),
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
        return _escalatorDown!!
    }

private var _escalatorDown: ImageVector? = null
