package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SignIn: ImageVector
    get() {
        if (_signIn != null) return _signIn!!
        _signIn = phosphorDuotoneIcon(
            name = "SignIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 200.000 40.000 L 200.000 216.000 L 40.000 216.000 C 31.163 216.000 24.000 208.837 24.000 200.000 L 24.000 56.000 C 24.000 47.163 31.163 40.000 40.000 40.000 Z"),
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
        pathData = parseSvgPathData("M 141.660 133.660 L 101.660 173.660 C 98.534 176.786 93.466 176.786 90.340 173.660 C 87.214 170.534 87.214 165.466 90.340 162.340 L 116.690 136.000 L 24.000 136.000 C 19.582 136.000 16.000 132.418 16.000 128.000 C 16.000 123.582 19.582 120.000 24.000 120.000 L 116.690 120.000 L 90.340 93.660 C 87.214 90.534 87.214 85.466 90.340 82.340 C 93.466 79.214 98.534 79.214 101.660 82.340 L 141.660 122.340 C 143.162 123.841 144.006 125.877 144.006 128.000 C 144.006 130.123 143.162 132.159 141.660 133.660 ZM 200.000 32.000 L 136.000 32.000 C 131.582 32.000 128.000 35.582 128.000 40.000 C 128.000 44.418 131.582 48.000 136.000 48.000 L 192.000 48.000 L 192.000 208.000 L 136.000 208.000 C 131.582 208.000 128.000 211.582 128.000 216.000 C 128.000 220.418 131.582 224.000 136.000 224.000 L 200.000 224.000 C 204.418 224.000 208.000 220.418 208.000 216.000 L 208.000 40.000 C 208.000 35.582 204.418 32.000 200.000 32.000 Z"),
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
        return _signIn!!
    }

private var _signIn: ImageVector? = null
