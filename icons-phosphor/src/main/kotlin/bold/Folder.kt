package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Folder: ImageVector
    get() {
        if (_folder != null) return _folder!!
        _folder = phosphorBoldIcon(
            name = "Folder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 68.000 L 133.390 68.000 L 107.390 38.710 C 103.582 34.428 98.120 31.984 92.390 32.000 L 40.000 32.000 C 28.954 32.000 20.000 40.954 20.000 52.000 L 20.000 200.620 C 20.017 211.316 28.684 219.983 39.380 220.000 L 216.890 220.000 C 227.440 219.989 235.989 211.440 236.000 200.890 L 236.000 88.000 C 236.000 76.954 227.046 68.000 216.000 68.000 ZM 44.000 56.000 L 90.610 56.000 L 101.280 68.000 L 44.000 68.000 ZM 212.000 196.000 L 44.000 196.000 L 44.000 92.000 L 212.000 92.000 Z"),
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
        return _folder!!
    }

private var _folder: ImageVector? = null
