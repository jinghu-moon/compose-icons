package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Jar: ImageVector
    get() {
        if (_jar != null) return _jar!!
        _jar = phosphorDuotoneIcon(
            name = "Jar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 208.000 88.000 L 208.000 200.000 C 208.000 217.673 193.673 232.000 176.000 232.000 L 80.000 232.000 C 62.327 232.000 48.000 217.673 48.000 200.000 L 48.000 88.000 C 48.000 70.327 62.327 56.000 80.000 56.000 L 176.000 56.000 C 193.673 56.000 208.000 70.327 208.000 88.000 Z"),
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
        pathData = parseSvgPathData("M 184.000 48.810 L 184.000 32.000 C 184.000 23.163 176.837 16.000 168.000 16.000 L 88.000 16.000 C 79.163 16.000 72.000 23.163 72.000 32.000 L 72.000 48.810 C 53.388 52.629 40.020 69.000 40.000 88.000 L 40.000 200.000 C 40.000 222.091 57.909 240.000 80.000 240.000 L 176.000 240.000 C 198.091 240.000 216.000 222.091 216.000 200.000 L 216.000 88.000 C 215.980 69.000 202.612 52.629 184.000 48.810 ZM 168.000 48.000 L 152.000 48.000 L 152.000 32.000 L 168.000 32.000 ZM 120.000 48.000 L 120.000 32.000 L 136.000 32.000 L 136.000 48.000 ZM 104.000 32.000 L 104.000 48.000 L 88.000 48.000 L 88.000 32.000 ZM 200.000 200.000 C 200.000 213.255 189.255 224.000 176.000 224.000 L 80.000 224.000 C 66.745 224.000 56.000 213.255 56.000 200.000 L 56.000 88.000 C 56.000 74.745 66.745 64.000 80.000 64.000 L 176.000 64.000 C 189.255 64.000 200.000 74.745 200.000 88.000 Z"),
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
        return _jar!!
    }

private var _jar: ImageVector? = null
