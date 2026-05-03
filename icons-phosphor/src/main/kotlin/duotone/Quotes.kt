package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Quotes: ImageVector
    get() {
        if (_quotes != null) return _quotes!!
        _quotes = phosphorDuotoneIcon(
            name = "Quotes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 108.000 72.000 L 108.000 144.000 L 40.000 144.000 C 35.582 144.000 32.000 140.418 32.000 136.000 L 32.000 72.000 C 32.000 67.582 35.582 64.000 40.000 64.000 L 100.000 64.000 C 104.418 64.000 108.000 67.582 108.000 72.000 ZM 216.000 64.000 L 156.000 64.000 C 151.582 64.000 148.000 67.582 148.000 72.000 L 148.000 136.000 C 148.000 140.418 151.582 144.000 156.000 144.000 L 224.000 144.000 L 224.000 72.000 C 224.000 67.582 220.418 64.000 216.000 64.000 Z"),
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
        pathData = parseSvgPathData("M 100.000 56.000 L 40.000 56.000 C 31.163 56.000 24.000 63.163 24.000 72.000 L 24.000 136.000 C 24.000 144.837 31.163 152.000 40.000 152.000 L 100.000 152.000 L 100.000 160.000 C 100.000 177.673 85.673 192.000 68.000 192.000 C 63.582 192.000 60.000 195.582 60.000 200.000 C 60.000 204.418 63.582 208.000 68.000 208.000 C 94.498 207.972 115.972 186.498 116.000 160.000 L 116.000 72.000 C 116.000 63.163 108.837 56.000 100.000 56.000 ZM 100.000 136.000 L 40.000 136.000 L 40.000 72.000 L 100.000 72.000 ZM 216.000 56.000 L 156.000 56.000 C 147.163 56.000 140.000 63.163 140.000 72.000 L 140.000 136.000 C 140.000 144.837 147.163 152.000 156.000 152.000 L 216.000 152.000 L 216.000 160.000 C 216.000 177.673 201.673 192.000 184.000 192.000 C 179.582 192.000 176.000 195.582 176.000 200.000 C 176.000 204.418 179.582 208.000 184.000 208.000 C 210.498 207.972 231.972 186.498 232.000 160.000 L 232.000 72.000 C 232.000 63.163 224.837 56.000 216.000 56.000 ZM 216.000 136.000 L 156.000 136.000 L 156.000 72.000 L 216.000 72.000 Z"),
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
        return _quotes!!
    }

private var _quotes: ImageVector? = null
