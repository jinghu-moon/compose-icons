package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Signpost: ImageVector
    get() {
        if (_signpost != null) return _signpost!!
        _signpost = phosphorThinIcon(
            name = "Signpost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 243.000 109.320 L 209.360 72.000 C 207.085 69.467 203.845 68.014 200.440 68.000 L 132.000 68.000 L 132.000 32.000 C 132.000 29.791 130.209 28.000 128.000 28.000 C 125.791 28.000 124.000 29.791 124.000 32.000 L 124.000 68.000 L 40.000 68.000 C 33.373 68.000 28.000 73.373 28.000 80.000 L 28.000 144.000 C 28.000 150.627 33.373 156.000 40.000 156.000 L 124.000 156.000 L 124.000 224.000 C 124.000 226.209 125.791 228.000 128.000 228.000 C 130.209 228.000 132.000 226.209 132.000 224.000 L 132.000 156.000 L 200.440 156.000 C 203.845 155.986 207.085 154.533 209.360 152.000 L 243.000 114.680 C 244.374 113.158 244.374 110.842 243.000 109.320 ZM 203.440 146.680 C 202.674 147.528 201.583 148.009 200.440 148.000 L 40.000 148.000 C 37.791 148.000 36.000 146.209 36.000 144.000 L 36.000 80.000 C 36.000 77.791 37.791 76.000 40.000 76.000 L 200.440 76.000 C 201.583 75.991 202.674 76.472 203.440 77.320 L 234.620 112.000 Z"),
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
        return _signpost!!
    }

private var _signpost: ImageVector? = null
