package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SupersetOf: ImageVector
    get() {
        if (_supersetOf != null) return _supersetOf!!
        _supersetOf = phosphorRegularIcon(
            name = "SupersetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 200.000 C 216.000 204.418 212.418 208.000 208.000 208.000 L 56.000 208.000 C 51.582 208.000 48.000 204.418 48.000 200.000 C 48.000 195.582 51.582 192.000 56.000 192.000 L 208.000 192.000 C 212.418 192.000 216.000 195.582 216.000 200.000 ZM 152.000 152.000 L 56.000 152.000 C 51.582 152.000 48.000 155.582 48.000 160.000 C 48.000 164.418 51.582 168.000 56.000 168.000 L 152.000 168.000 C 187.346 168.000 216.000 139.346 216.000 104.000 C 216.000 68.654 187.346 40.000 152.000 40.000 L 56.000 40.000 C 51.582 40.000 48.000 43.582 48.000 48.000 C 48.000 52.418 51.582 56.000 56.000 56.000 L 152.000 56.000 C 178.510 56.000 200.000 77.490 200.000 104.000 C 200.000 130.510 178.510 152.000 152.000 152.000 Z"),
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
        return _supersetOf!!
    }

private var _supersetOf: ImageVector? = null
