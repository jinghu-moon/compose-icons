package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShuffleSimple: ImageVector
    get() {
        if (_shuffleSimple != null) return _shuffleSimple!!
        _shuffleSimple = phosphorBoldIcon(
            name = "ShuffleSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.000 48.000 L 220.000 88.000 C 220.000 94.627 214.627 100.000 208.000 100.000 C 201.373 100.000 196.000 94.627 196.000 88.000 L 196.000 77.000 L 164.770 108.200 C 160.076 112.894 152.464 112.894 147.770 108.200 C 143.076 103.506 143.076 95.894 147.770 91.200 L 179.000 60.000 L 168.000 60.000 C 161.373 60.000 156.000 54.627 156.000 48.000 C 156.000 41.373 161.373 36.000 168.000 36.000 L 208.000 36.000 C 214.627 36.000 220.000 41.373 220.000 48.000 ZM 208.000 156.000 C 201.373 156.000 196.000 161.373 196.000 168.000 L 196.000 179.000 L 56.490 39.510 C 51.796 34.816 44.184 34.816 39.490 39.510 C 34.796 44.204 34.796 51.816 39.490 56.510 L 179.000 196.000 L 168.000 196.000 C 161.373 196.000 156.000 201.373 156.000 208.000 C 156.000 214.627 161.373 220.000 168.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 168.000 C 220.000 161.373 214.627 156.000 208.000 156.000 ZM 91.230 147.800 L 39.510 199.510 C 34.816 204.204 34.816 211.816 39.510 216.510 C 44.204 221.204 51.816 221.204 56.510 216.510 L 108.220 164.790 C 112.914 160.096 112.914 152.484 108.220 147.790 C 103.526 143.096 95.914 143.096 91.220 147.790 Z"),
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
        return _shuffleSimple!!
    }

private var _shuffleSimple: ImageVector? = null
