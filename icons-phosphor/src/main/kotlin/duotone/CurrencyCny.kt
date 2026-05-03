package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CurrencyCny: ImageVector
    get() {
        if (_currencyCny != null) return _currencyCny!!
        _currencyCny = phosphorDuotoneIcon(
            name = "CurrencyCny",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 192.000 56.000 L 192.000 112.000 L 64.000 112.000 L 64.000 56.000 Z"),
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
        pathData = parseSvgPathData("M 56.000 56.000 C 56.000 51.582 59.582 48.000 64.000 48.000 L 192.000 48.000 C 196.418 48.000 200.000 51.582 200.000 56.000 C 200.000 60.418 196.418 64.000 192.000 64.000 L 64.000 64.000 C 59.582 64.000 56.000 60.418 56.000 56.000 ZM 216.000 160.000 C 211.582 160.000 208.000 163.582 208.000 168.000 L 208.000 184.000 L 176.000 184.000 C 167.163 184.000 160.000 176.837 160.000 168.000 L 160.000 120.000 L 208.000 120.000 C 212.418 120.000 216.000 116.418 216.000 112.000 C 216.000 107.582 212.418 104.000 208.000 104.000 L 48.000 104.000 C 43.582 104.000 40.000 107.582 40.000 112.000 C 40.000 116.418 43.582 120.000 48.000 120.000 L 96.000 120.000 L 96.000 128.000 C 95.967 158.914 70.914 183.967 40.000 184.000 C 35.582 184.000 32.000 187.582 32.000 192.000 C 32.000 196.418 35.582 200.000 40.000 200.000 C 79.746 199.956 111.956 167.746 112.000 128.000 L 112.000 120.000 L 144.000 120.000 L 144.000 168.000 C 144.000 185.673 158.327 200.000 176.000 200.000 L 216.000 200.000 C 220.418 200.000 224.000 196.418 224.000 192.000 L 224.000 168.000 C 224.000 163.582 220.418 160.000 216.000 160.000 Z"),
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
        return _currencyCny!!
    }

private var _currencyCny: ImageVector? = null
