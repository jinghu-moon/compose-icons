package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AlignRight: ImageVector
    get() {
        if (_alignRight != null) return _alignRight!!
        _alignRight = phosphorRegularIcon(
            name = "AlignRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 40.000 L 224.000 216.000 C 224.000 220.418 220.418 224.000 216.000 224.000 C 211.582 224.000 208.000 220.418 208.000 216.000 L 208.000 40.000 C 208.000 35.582 211.582 32.000 216.000 32.000 C 220.418 32.000 224.000 35.582 224.000 40.000 ZM 192.000 64.000 L 192.000 104.000 C 192.000 112.837 184.837 120.000 176.000 120.000 L 80.000 120.000 C 71.163 120.000 64.000 112.837 64.000 104.000 L 64.000 64.000 C 64.000 55.163 71.163 48.000 80.000 48.000 L 176.000 48.000 C 184.837 48.000 192.000 55.163 192.000 64.000 ZM 176.000 64.000 L 80.000 64.000 L 80.000 104.000 L 176.000 104.000 ZM 192.000 152.000 L 192.000 192.000 C 192.000 200.837 184.837 208.000 176.000 208.000 L 40.000 208.000 C 31.163 208.000 24.000 200.837 24.000 192.000 L 24.000 152.000 C 24.000 143.163 31.163 136.000 40.000 136.000 L 176.000 136.000 C 184.837 136.000 192.000 143.163 192.000 152.000 ZM 176.000 152.000 L 40.000 152.000 L 40.000 192.000 L 176.000 192.000 Z"),
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
        return _alignRight!!
    }

private var _alignRight: ImageVector? = null
