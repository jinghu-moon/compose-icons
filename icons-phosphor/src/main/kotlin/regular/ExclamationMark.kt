package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ExclamationMark: ImageVector
    get() {
        if (_exclamationMark != null) return _exclamationMark!!
        _exclamationMark = phosphorRegularIcon(
            name = "ExclamationMark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 144.000 200.000 C 144.000 208.837 136.837 216.000 128.000 216.000 C 119.163 216.000 112.000 208.837 112.000 200.000 C 112.000 191.163 119.163 184.000 128.000 184.000 C 136.837 184.000 144.000 191.163 144.000 200.000 ZM 128.000 160.000 C 132.418 160.000 136.000 156.418 136.000 152.000 L 136.000 48.000 C 136.000 43.582 132.418 40.000 128.000 40.000 C 123.582 40.000 120.000 43.582 120.000 48.000 L 120.000 152.000 C 120.000 156.418 123.582 160.000 128.000 160.000 Z"),
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
        return _exclamationMark!!
    }

private var _exclamationMark: ImageVector? = null
