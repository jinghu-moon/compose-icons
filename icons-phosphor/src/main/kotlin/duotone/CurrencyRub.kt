package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CurrencyRub: ImageVector
    get() {
        if (_currencyRub != null) return _currencyRub!!
        _currencyRub = phosphorDuotoneIcon(
            name = "CurrencyRub",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 200.000 92.000 C 200.000 120.719 176.719 144.000 148.000 144.000 L 88.000 144.000 L 88.000 40.000 L 148.000 40.000 C 176.719 40.000 200.000 63.281 200.000 92.000 Z"),
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
        pathData = parseSvgPathData("M 148.000 152.000 C 181.137 152.000 208.000 125.137 208.000 92.000 C 208.000 58.863 181.137 32.000 148.000 32.000 L 88.000 32.000 C 83.582 32.000 80.000 35.582 80.000 40.000 L 80.000 136.000 L 56.000 136.000 C 51.582 136.000 48.000 139.582 48.000 144.000 C 48.000 148.418 51.582 152.000 56.000 152.000 L 80.000 152.000 L 80.000 168.000 L 56.000 168.000 C 51.582 168.000 48.000 171.582 48.000 176.000 C 48.000 180.418 51.582 184.000 56.000 184.000 L 80.000 184.000 L 80.000 216.000 C 80.000 220.418 83.582 224.000 88.000 224.000 C 92.418 224.000 96.000 220.418 96.000 216.000 L 96.000 184.000 L 144.000 184.000 C 148.418 184.000 152.000 180.418 152.000 176.000 C 152.000 171.582 148.418 168.000 144.000 168.000 L 96.000 168.000 L 96.000 152.000 ZM 96.000 48.000 L 148.000 48.000 C 172.301 48.000 192.000 67.699 192.000 92.000 C 192.000 116.301 172.301 136.000 148.000 136.000 L 96.000 136.000 Z"),
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
        return _currencyRub!!
    }

private var _currencyRub: ImageVector? = null
