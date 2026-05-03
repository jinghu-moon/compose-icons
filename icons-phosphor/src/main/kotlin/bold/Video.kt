package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Video: ImageVector
    get() {
        if (_video != null) return _video!!
        _video = phosphorBoldIcon(
            name = "Video",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 36.000 L 40.000 36.000 C 28.954 36.000 20.000 44.954 20.000 56.000 L 20.000 160.000 C 20.000 171.046 28.954 180.000 40.000 180.000 L 216.000 180.000 C 227.046 180.000 236.000 171.046 236.000 160.000 L 236.000 56.000 C 236.000 44.954 227.046 36.000 216.000 36.000 ZM 212.000 156.000 L 44.000 156.000 L 44.000 60.000 L 212.000 60.000 ZM 236.000 208.000 C 236.000 214.627 230.627 220.000 224.000 220.000 L 32.000 220.000 C 25.373 220.000 20.000 214.627 20.000 208.000 C 20.000 201.373 25.373 196.000 32.000 196.000 L 224.000 196.000 C 230.627 196.000 236.000 201.373 236.000 208.000 ZM 104.000 128.000 L 104.000 88.000 C 103.999 83.637 106.365 79.617 110.181 77.501 C 113.997 75.386 118.660 75.508 122.360 77.820 L 154.360 97.820 C 157.872 100.012 160.006 103.860 160.006 108.000 C 160.006 112.140 157.872 115.988 154.360 118.180 L 122.360 138.180 C 118.660 140.492 113.997 140.614 110.181 138.499 C 106.365 136.383 103.999 132.363 104.000 128.000 Z"),
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
        return _video!!
    }

private var _video: ImageVector? = null
