package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AlignLeft: ImageVector
    get() {
        if (_alignLeft != null) return _alignLeft!!
        _alignLeft = phosphorFillIcon(
            name = "AlignLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 152.000 L 232.000 192.000 C 232.000 200.837 224.837 208.000 216.000 208.000 L 80.000 208.000 C 71.163 208.000 64.000 200.837 64.000 192.000 L 64.000 152.000 C 64.000 143.163 71.163 136.000 80.000 136.000 L 216.000 136.000 C 224.837 136.000 232.000 143.163 232.000 152.000 ZM 40.000 32.000 C 35.582 32.000 32.000 35.582 32.000 40.000 L 32.000 216.000 C 32.000 220.418 35.582 224.000 40.000 224.000 C 44.418 224.000 48.000 220.418 48.000 216.000 L 48.000 40.000 C 48.000 35.582 44.418 32.000 40.000 32.000 ZM 80.000 120.000 L 176.000 120.000 C 184.837 120.000 192.000 112.837 192.000 104.000 L 192.000 64.000 C 192.000 55.163 184.837 48.000 176.000 48.000 L 80.000 48.000 C 71.163 48.000 64.000 55.163 64.000 64.000 L 64.000 104.000 C 64.000 112.837 71.163 120.000 80.000 120.000 Z"),
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
        return _alignLeft!!
    }

private var _alignLeft: ImageVector? = null
