package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Tote: ImageVector
    get() {
        if (_tote != null) return _tote!!
        _tote = phosphorBoldIcon(
            name = "Tote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 239.000 66.750 C 235.190 62.466 229.733 60.010 224.000 60.000 L 179.830 60.000 C 177.641 32.999 155.090 12.201 128.000 12.201 C 100.910 12.201 78.359 32.999 76.170 60.000 L 32.080 60.000 C 26.353 59.978 20.890 62.412 17.078 66.685 C 13.265 70.959 11.467 76.662 12.140 82.350 L 26.390 202.350 C 27.610 212.433 36.174 220.013 46.330 220.000 L 209.670 220.000 C 219.826 220.013 228.390 212.433 229.610 202.350 L 243.860 82.350 C 244.535 76.695 242.767 71.021 239.000 66.750 ZM 128.000 36.000 C 141.918 36.001 153.722 46.225 155.710 60.000 L 100.290 60.000 C 102.278 46.225 114.082 36.001 128.000 36.000 ZM 206.190 196.000 L 49.810 196.000 L 36.500 84.000 L 76.000 84.000 L 76.000 104.000 C 76.000 110.627 81.373 116.000 88.000 116.000 C 94.627 116.000 100.000 110.627 100.000 104.000 L 100.000 84.000 L 156.000 84.000 L 156.000 104.000 C 156.000 110.627 161.373 116.000 168.000 116.000 C 174.627 116.000 180.000 110.627 180.000 104.000 L 180.000 84.000 L 219.500 84.000 Z"),
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
        return _tote!!
    }

private var _tote: ImageVector? = null
