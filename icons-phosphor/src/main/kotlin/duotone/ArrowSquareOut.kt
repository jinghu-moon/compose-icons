package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowSquareOut: ImageVector
    get() {
        if (_arrowSquareOut != null) return _arrowSquareOut!!
        _arrowSquareOut = phosphorDuotoneIcon(
            name = "ArrowSquareOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 184.000 80.000 L 184.000 208.000 C 184.000 212.418 180.418 216.000 176.000 216.000 L 48.000 216.000 C 43.582 216.000 40.000 212.418 40.000 208.000 L 40.000 80.000 C 40.000 75.582 43.582 72.000 48.000 72.000 L 176.000 72.000 C 180.418 72.000 184.000 75.582 184.000 80.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 224.000 104.000 C 224.000 108.418 220.418 112.000 216.000 112.000 C 211.582 112.000 208.000 108.418 208.000 104.000 L 208.000 59.320 L 141.670 125.660 C 138.544 128.786 133.476 128.786 130.350 125.660 C 127.224 122.534 127.224 117.466 130.350 114.340 L 196.680 48.000 L 152.000 48.000 C 147.582 48.000 144.000 44.418 144.000 40.000 C 144.000 35.582 147.582 32.000 152.000 32.000 L 216.000 32.000 C 220.418 32.000 224.000 35.582 224.000 40.000 ZM 184.000 128.000 C 179.582 128.000 176.000 131.582 176.000 136.000 L 176.000 208.000 L 48.000 208.000 L 48.000 80.000 L 120.000 80.000 C 124.418 80.000 128.000 76.418 128.000 72.000 C 128.000 67.582 124.418 64.000 120.000 64.000 L 48.000 64.000 C 39.163 64.000 32.000 71.163 32.000 80.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 176.000 224.000 C 184.837 224.000 192.000 216.837 192.000 208.000 L 192.000 136.000 C 192.000 131.582 188.418 128.000 184.000 128.000 Z"),
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
        return _arrowSquareOut!!
    }

private var _arrowSquareOut: ImageVector? = null
