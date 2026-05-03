package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Export: ImageVector
    get() {
        if (_export != null) return _export!!
        _export = phosphorBoldIcon(
            name = "Export",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.000 112.000 L 220.000 208.000 C 220.000 219.046 211.046 228.000 200.000 228.000 L 56.000 228.000 C 44.954 228.000 36.000 219.046 36.000 208.000 L 36.000 112.000 C 36.000 100.954 44.954 92.000 56.000 92.000 L 76.000 92.000 C 82.627 92.000 88.000 97.373 88.000 104.000 C 88.000 110.627 82.627 116.000 76.000 116.000 L 60.000 116.000 L 60.000 204.000 L 196.000 204.000 L 196.000 116.000 L 180.000 116.000 C 173.373 116.000 168.000 110.627 168.000 104.000 C 168.000 97.373 173.373 92.000 180.000 92.000 L 200.000 92.000 C 211.046 92.000 220.000 100.954 220.000 112.000 ZM 96.490 72.490 L 116.000 53.000 L 116.000 136.000 C 116.000 142.627 121.373 148.000 128.000 148.000 C 134.627 148.000 140.000 142.627 140.000 136.000 L 140.000 53.000 L 159.510 72.520 C 164.204 77.214 171.816 77.214 176.510 72.520 C 181.204 67.826 181.204 60.214 176.510 55.520 L 136.510 15.520 C 134.258 13.261 131.200 11.991 128.010 11.991 C 124.820 11.991 121.762 13.261 119.510 15.520 L 79.510 55.520 C 74.816 60.214 74.816 67.826 79.510 72.520 C 84.204 77.214 91.816 77.214 96.510 72.520 Z"),
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
        return _export!!
    }

private var _export: ImageVector? = null
