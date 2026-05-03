package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AlignBottomSimple: ImageVector
    get() {
        if (_alignBottomSimple != null) return _alignBottomSimple!!
        _alignBottomSimple = phosphorRegularIcon(
            name = "AlignBottomSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 232.000 C 208.000 236.418 204.418 240.000 200.000 240.000 L 56.000 240.000 C 51.582 240.000 48.000 236.418 48.000 232.000 C 48.000 227.582 51.582 224.000 56.000 224.000 L 200.000 224.000 C 204.418 224.000 208.000 227.582 208.000 232.000 ZM 80.000 192.000 L 80.000 40.000 C 80.000 31.163 87.163 24.000 96.000 24.000 L 160.000 24.000 C 168.837 24.000 176.000 31.163 176.000 40.000 L 176.000 192.000 C 176.000 200.837 168.837 208.000 160.000 208.000 L 96.000 208.000 C 87.163 208.000 80.000 200.837 80.000 192.000 ZM 96.000 192.000 L 160.000 192.000 L 160.000 40.000 L 96.000 40.000 Z"),
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
        return _alignBottomSimple!!
    }

private var _alignBottomSimple: ImageVector? = null
