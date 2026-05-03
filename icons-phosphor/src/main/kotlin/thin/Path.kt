package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Path: ImageVector
    get() {
        if (_path != null) return _path!!
        _path = phosphorThinIcon(
            name = "Path",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 172.000 C 186.082 172.001 174.278 182.225 172.290 196.000 L 72.000 196.000 C 52.118 196.000 36.000 179.882 36.000 160.000 C 36.000 140.118 52.118 124.000 72.000 124.000 L 168.000 124.000 C 187.882 124.000 204.000 107.882 204.000 88.000 C 204.000 68.118 187.882 52.000 168.000 52.000 L 72.000 52.000 C 69.791 52.000 68.000 53.791 68.000 56.000 C 68.000 58.209 69.791 60.000 72.000 60.000 L 168.000 60.000 C 183.464 60.000 196.000 72.536 196.000 88.000 C 196.000 103.464 183.464 116.000 168.000 116.000 L 72.000 116.000 C 47.699 116.000 28.000 135.699 28.000 160.000 C 28.000 184.301 47.699 204.000 72.000 204.000 L 172.290 204.000 C 174.425 218.791 187.799 229.299 202.675 227.872 C 217.552 226.446 228.686 213.588 227.971 198.661 C 227.256 183.733 214.944 171.999 200.000 172.000 ZM 200.000 220.000 C 188.954 220.000 180.000 211.046 180.000 200.000 C 180.000 188.954 188.954 180.000 200.000 180.000 C 211.046 180.000 220.000 188.954 220.000 200.000 C 220.000 211.046 211.046 220.000 200.000 220.000 Z"),
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
        return _path!!
    }

private var _path: ImageVector? = null
