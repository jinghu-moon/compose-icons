package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SkipBack: ImageVector
    get() {
        if (_skipBack != null) return _skipBack!!
        _skipBack = phosphorBoldIcon(
            name = "SkipBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 201.750 30.520 C 195.390 26.993 187.617 27.196 181.450 31.050 L 68.000 102.000 L 68.000 40.000 C 68.000 33.373 62.627 28.000 56.000 28.000 C 49.373 28.000 44.000 33.373 44.000 40.000 L 44.000 216.000 C 44.000 222.627 49.373 228.000 56.000 228.000 C 62.627 228.000 68.000 222.627 68.000 216.000 L 68.000 154.000 L 181.450 225.000 C 187.601 228.819 195.336 229.016 201.673 225.515 C 208.010 222.013 211.960 215.360 212.000 208.120 L 212.000 47.880 C 211.993 40.660 208.068 34.013 201.750 30.520 ZM 188.000 200.730 L 71.700 128.000 L 188.000 55.270 Z"),
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
        return _skipBack!!
    }

private var _skipBack: ImageVector? = null
