package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowCircleUp: ImageVector
    get() {
        if (_arrowCircleUp != null) return _arrowCircleUp!!
        _arrowCircleUp = phosphorBoldIcon(
            name = "ArrowCircleUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 168.490 111.510 C 173.184 116.204 173.184 123.816 168.490 128.510 C 163.796 133.204 156.184 133.204 151.490 128.510 L 140.000 117.000 L 140.000 168.000 C 140.000 174.627 134.627 180.000 128.000 180.000 C 121.373 180.000 116.000 174.627 116.000 168.000 L 116.000 117.000 L 104.490 128.520 C 99.796 133.214 92.184 133.214 87.490 128.520 C 82.796 123.826 82.796 116.214 87.490 111.520 L 119.490 79.520 C 121.742 77.261 124.800 75.991 127.990 75.991 C 131.180 75.991 134.238 77.261 136.490 79.520 Z"),
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
        return _arrowCircleUp!!
    }

private var _arrowCircleUp: ImageVector? = null
