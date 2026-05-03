package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TextAUnderline: ImageVector
    get() {
        if (_textAUnderline != null) return _textAUnderline!!
        _textAUnderline = phosphorDuotoneIcon(
            name = "TextAUnderline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 173.180 128.000 L 82.820 128.000 L 128.000 32.000 Z"),
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
        pathData = parseSvgPathData("M 60.590 175.240 C 62.510 176.145 64.711 176.250 66.709 175.532 C 68.706 174.813 70.336 173.331 71.240 171.410 L 87.900 136.000 L 168.100 136.000 L 184.760 171.410 C 186.643 175.409 191.411 177.123 195.410 175.240 C 199.409 173.357 201.123 168.589 199.240 164.590 L 135.240 28.590 C 133.921 25.784 131.100 23.993 128.000 23.993 C 124.900 23.993 122.079 25.784 120.760 28.590 L 56.760 164.590 C 55.855 166.510 55.750 168.711 56.468 170.709 C 57.187 172.706 58.669 174.336 60.590 175.240 ZM 128.000 50.790 L 160.570 120.000 L 95.430 120.000 ZM 224.000 216.000 C 224.000 220.418 220.418 224.000 216.000 224.000 L 40.000 224.000 C 35.582 224.000 32.000 220.418 32.000 216.000 C 32.000 211.582 35.582 208.000 40.000 208.000 L 216.000 208.000 C 220.418 208.000 224.000 211.582 224.000 216.000 Z"),
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
        return _textAUnderline!!
    }

private var _textAUnderline: ImageVector? = null
