package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowLineDownRight: ImageVector
    get() {
        if (_arrowLineDownRight != null) return _arrowLineDownRight!!
        _arrowLineDownRight = phosphorRegularIcon(
            name = "ArrowLineDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 40.000 C 224.000 44.418 220.418 48.000 216.000 48.000 L 40.000 48.000 C 35.582 48.000 32.000 44.418 32.000 40.000 C 32.000 35.582 35.582 32.000 40.000 32.000 L 216.000 32.000 C 220.418 32.000 224.000 35.582 224.000 40.000 ZM 192.000 96.000 C 187.582 96.000 184.000 99.582 184.000 104.000 L 184.000 180.690 L 85.660 82.340 C 82.534 79.214 77.466 79.214 74.340 82.340 C 71.214 85.466 71.214 90.534 74.340 93.660 L 172.690 192.000 L 96.000 192.000 C 91.582 192.000 88.000 195.582 88.000 200.000 C 88.000 204.418 91.582 208.000 96.000 208.000 L 192.000 208.000 C 196.418 208.000 200.000 204.418 200.000 200.000 L 200.000 104.000 C 200.000 99.582 196.418 96.000 192.000 96.000 Z"),
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
        return _arrowLineDownRight!!
    }

private var _arrowLineDownRight: ImageVector? = null
