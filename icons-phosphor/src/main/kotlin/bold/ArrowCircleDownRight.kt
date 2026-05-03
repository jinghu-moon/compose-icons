package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowCircleDownRight: ImageVector
    get() {
        if (_arrowCircleDownRight != null) return _arrowCircleDownRight!!
        _arrowCircleDownRight = phosphorBoldIcon(
            name = "ArrowCircleDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 172.000 112.000 L 172.000 160.000 C 172.000 166.627 166.627 172.000 160.000 172.000 L 112.000 172.000 C 105.373 172.000 100.000 166.627 100.000 160.000 C 100.000 153.373 105.373 148.000 112.000 148.000 L 131.000 148.000 L 87.510 104.490 C 82.816 99.796 82.816 92.184 87.510 87.490 C 92.204 82.796 99.816 82.796 104.510 87.490 L 148.000 131.000 L 148.000 112.000 C 148.000 105.373 153.373 100.000 160.000 100.000 C 166.627 100.000 172.000 105.373 172.000 112.000 Z"),
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
        return _arrowCircleDownRight!!
    }

private var _arrowCircleDownRight: ImageVector? = null
