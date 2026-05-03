package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowCircleUpRight: ImageVector
    get() {
        if (_arrowCircleUpRight != null) return _arrowCircleUpRight!!
        _arrowCircleUpRight = phosphorBoldIcon(
            name = "ArrowCircleUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 172.000 96.000 L 172.000 144.000 C 172.000 150.627 166.627 156.000 160.000 156.000 C 153.373 156.000 148.000 150.627 148.000 144.000 L 148.000 125.000 L 104.490 168.520 C 99.796 173.214 92.184 173.214 87.490 168.520 C 82.796 163.826 82.796 156.214 87.490 151.520 L 131.000 108.000 L 112.000 108.000 C 105.373 108.000 100.000 102.627 100.000 96.000 C 100.000 89.373 105.373 84.000 112.000 84.000 L 160.000 84.000 C 166.627 84.000 172.000 89.373 172.000 96.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _arrowCircleUpRight!!
    }

private var _arrowCircleUpRight: ImageVector? = null
