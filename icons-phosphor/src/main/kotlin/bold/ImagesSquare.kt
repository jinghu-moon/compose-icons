package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ImagesSquare: ImageVector
    get() {
        if (_imagesSquare != null) return _imagesSquare!!
        _imagesSquare = phosphorBoldIcon(
            name = "ImagesSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 28.000 L 88.000 28.000 C 76.954 28.000 68.000 36.954 68.000 48.000 L 68.000 60.000 L 48.000 60.000 C 36.954 60.000 28.000 68.954 28.000 80.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 176.000 228.000 C 187.046 228.000 196.000 219.046 196.000 208.000 L 196.000 188.000 L 208.000 188.000 C 219.046 188.000 228.000 179.046 228.000 168.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 92.000 52.000 L 204.000 52.000 L 204.000 111.720 L 194.140 101.860 C 186.330 94.052 173.670 94.052 165.860 101.860 L 103.720 164.000 L 92.000 164.000 ZM 172.000 204.000 L 52.000 204.000 L 52.000 84.000 L 68.000 84.000 L 68.000 168.000 C 68.000 179.046 76.954 188.000 88.000 188.000 L 172.000 188.000 ZM 137.660 164.000 L 180.000 121.660 L 204.000 145.660 L 204.000 164.000 ZM 108.000 88.000 C 108.000 76.954 116.954 68.000 128.000 68.000 C 139.046 68.000 148.000 76.954 148.000 88.000 C 148.000 99.046 139.046 108.000 128.000 108.000 C 116.954 108.000 108.000 99.046 108.000 88.000 Z"),
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
        return _imagesSquare!!
    }

private var _imagesSquare: ImageVector? = null
