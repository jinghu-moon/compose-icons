package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Signpost: ImageVector
    get() {
        if (_signpost != null) return _signpost!!
        _signpost = phosphorBoldIcon(
            name = "Signpost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 248.920 104.000 L 215.300 66.620 C 211.508 62.408 206.108 60.001 200.440 60.000 L 140.000 60.000 L 140.000 32.000 C 140.000 25.373 134.627 20.000 128.000 20.000 C 121.373 20.000 116.000 25.373 116.000 32.000 L 116.000 60.000 L 40.000 60.000 C 28.954 60.000 20.000 68.954 20.000 80.000 L 20.000 144.000 C 20.000 155.046 28.954 164.000 40.000 164.000 L 116.000 164.000 L 116.000 224.000 C 116.000 230.627 121.373 236.000 128.000 236.000 C 134.627 236.000 140.000 230.627 140.000 224.000 L 140.000 164.000 L 200.440 164.000 C 206.108 163.999 211.508 161.592 215.300 157.380 L 248.920 120.000 C 252.994 115.445 252.994 108.555 248.920 104.000 ZM 198.660 140.000 L 44.000 140.000 L 44.000 84.000 L 198.660 84.000 L 223.860 112.000 Z"),
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
        return _signpost!!
    }

private var _signpost: ImageVector? = null
