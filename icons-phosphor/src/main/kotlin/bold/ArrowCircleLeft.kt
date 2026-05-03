package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowCircleLeft: ImageVector
    get() {
        if (_arrowCircleLeft != null) return _arrowCircleLeft!!
        _arrowCircleLeft = phosphorBoldIcon(
            name = "ArrowCircleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 180.000 128.000 C 180.000 134.627 174.627 140.000 168.000 140.000 L 117.000 140.000 L 128.520 151.510 C 133.214 156.204 133.214 163.816 128.520 168.510 C 123.826 173.204 116.214 173.204 111.520 168.510 L 79.520 136.510 C 77.261 134.258 75.991 131.200 75.991 128.010 C 75.991 124.820 77.261 121.762 79.520 119.510 L 111.520 87.510 C 116.214 82.816 123.826 82.816 128.520 87.510 C 133.214 92.204 133.214 99.816 128.520 104.510 L 117.000 116.000 L 168.000 116.000 C 174.627 116.000 180.000 121.373 180.000 128.000 Z"),
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
        return _arrowCircleLeft!!
    }

private var _arrowCircleLeft: ImageVector? = null
