package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowSquareOut: ImageVector
    get() {
        if (_arrowSquareOut != null) return _arrowSquareOut!!
        _arrowSquareOut = phosphorBoldIcon(
            name = "ArrowSquareOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 104.000 C 228.000 110.627 222.627 116.000 216.000 116.000 C 209.373 116.000 204.000 110.627 204.000 104.000 L 204.000 69.000 L 144.490 128.510 C 139.796 133.204 132.184 133.204 127.490 128.510 C 122.796 123.816 122.796 116.204 127.490 111.510 L 187.000 52.000 L 152.000 52.000 C 145.373 52.000 140.000 46.627 140.000 40.000 C 140.000 33.373 145.373 28.000 152.000 28.000 L 216.000 28.000 C 222.627 28.000 228.000 33.373 228.000 40.000 ZM 184.000 128.000 C 177.373 128.000 172.000 133.373 172.000 140.000 L 172.000 204.000 L 52.000 204.000 L 52.000 84.000 L 116.000 84.000 C 122.627 84.000 128.000 78.627 128.000 72.000 C 128.000 65.373 122.627 60.000 116.000 60.000 L 48.000 60.000 C 36.954 60.000 28.000 68.954 28.000 80.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 176.000 228.000 C 187.046 228.000 196.000 219.046 196.000 208.000 L 196.000 140.000 C 196.000 133.373 190.627 128.000 184.000 128.000 Z"),
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
        return _arrowSquareOut!!
    }

private var _arrowSquareOut: ImageVector? = null
