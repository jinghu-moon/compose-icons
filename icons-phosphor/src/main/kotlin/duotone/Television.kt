package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Television: ImageVector
    get() {
        if (_television != null) return _television!!
        _television = phosphorDuotoneIcon(
            name = "Television",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 152.000 72.000 L 152.000 208.000 L 40.000 208.000 C 35.582 208.000 32.000 204.418 32.000 200.000 L 32.000 80.000 C 32.000 75.582 35.582 72.000 40.000 72.000 Z"),
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
        pathData = parseSvgPathData("M 216.000 64.000 L 147.310 64.000 L 181.660 29.660 C 184.786 26.534 184.786 21.466 181.660 18.340 C 178.534 15.214 173.466 15.214 170.340 18.340 L 128.000 60.690 L 85.660 18.340 C 82.534 15.214 77.466 15.214 74.340 18.340 C 71.214 21.466 71.214 26.534 74.340 29.660 L 108.690 64.000 L 40.000 64.000 C 31.163 64.000 24.000 71.163 24.000 80.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 80.000 C 232.000 71.163 224.837 64.000 216.000 64.000 ZM 40.000 80.000 L 144.000 80.000 L 144.000 200.000 L 40.000 200.000 ZM 216.000 200.000 L 160.000 200.000 L 160.000 80.000 L 216.000 80.000 L 216.000 200.000 ZM 200.000 116.000 C 200.000 122.627 194.627 128.000 188.000 128.000 C 181.373 128.000 176.000 122.627 176.000 116.000 C 176.000 109.373 181.373 104.000 188.000 104.000 C 194.627 104.000 200.000 109.373 200.000 116.000 ZM 200.000 164.000 C 200.000 170.627 194.627 176.000 188.000 176.000 C 181.373 176.000 176.000 170.627 176.000 164.000 C 176.000 157.373 181.373 152.000 188.000 152.000 C 194.627 152.000 200.000 157.373 200.000 164.000 Z"),
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
        return _television!!
    }

private var _television: ImageVector? = null
