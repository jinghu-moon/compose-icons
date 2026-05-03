package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowSquareDown: ImageVector
    get() {
        if (_arrowSquareDown != null) return _arrowSquareDown!!
        _arrowSquareDown = phosphorBoldIcon(
            name = "ArrowSquareDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 204.000 204.000 L 52.000 204.000 L 52.000 52.000 L 204.000 52.000 ZM 87.510 144.490 C 82.816 139.796 82.816 132.184 87.510 127.490 C 92.204 122.796 99.816 122.796 104.510 127.490 L 116.000 139.000 L 116.000 88.000 C 116.000 81.373 121.373 76.000 128.000 76.000 C 134.627 76.000 140.000 81.373 140.000 88.000 L 140.000 139.000 L 151.510 127.480 C 156.204 122.786 163.816 122.786 168.510 127.480 C 173.204 132.174 173.204 139.786 168.510 144.480 L 136.510 176.480 C 134.258 178.739 131.200 180.009 128.010 180.009 C 124.820 180.009 121.762 178.739 119.510 176.480 Z"),
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
        return _arrowSquareDown!!
    }

private var _arrowSquareDown: ImageVector? = null
