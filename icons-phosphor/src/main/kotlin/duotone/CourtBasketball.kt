package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CourtBasketball: ImageVector
    get() {
        if (_courtBasketball != null) return _courtBasketball!!
        _courtBasketball = phosphorDuotoneIcon(
            name = "CourtBasketball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 232.000 88.000 L 232.000 168.000 L 216.000 168.000 C 193.909 168.000 176.000 150.091 176.000 128.000 C 176.000 105.909 193.909 88.000 216.000 88.000 ZM 40.000 88.000 L 24.000 88.000 L 24.000 168.000 L 40.000 168.000 C 62.091 168.000 80.000 150.091 80.000 128.000 C 80.000 105.909 62.091 88.000 40.000 88.000 Z"),
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
        pathData = parseSvgPathData("M 224.000 48.000 L 32.000 48.000 C 23.163 48.000 16.000 55.163 16.000 64.000 L 16.000 192.000 C 16.000 200.837 23.163 208.000 32.000 208.000 L 224.000 208.000 C 232.837 208.000 240.000 200.837 240.000 192.000 L 240.000 64.000 C 240.000 55.163 232.837 48.000 224.000 48.000 ZM 224.000 160.000 L 216.000 160.000 C 198.327 160.000 184.000 145.673 184.000 128.000 C 184.000 110.327 198.327 96.000 216.000 96.000 L 224.000 96.000 ZM 32.000 96.000 L 40.000 96.000 C 57.673 96.000 72.000 110.327 72.000 128.000 C 72.000 145.673 57.673 160.000 40.000 160.000 L 32.000 160.000 ZM 32.000 176.000 L 40.000 176.000 C 66.510 176.000 88.000 154.510 88.000 128.000 C 88.000 101.490 66.510 80.000 40.000 80.000 L 32.000 80.000 L 32.000 64.000 L 120.000 64.000 L 120.000 192.000 L 32.000 192.000 ZM 224.000 192.000 L 136.000 192.000 L 136.000 64.000 L 224.000 64.000 L 224.000 80.000 L 216.000 80.000 C 189.490 80.000 168.000 101.490 168.000 128.000 C 168.000 154.510 189.490 176.000 216.000 176.000 L 224.000 176.000 L 224.000 192.000 Z"),
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
        return _courtBasketball!!
    }

private var _courtBasketball: ImageVector? = null
