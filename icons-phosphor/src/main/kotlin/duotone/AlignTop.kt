package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.AlignTop: ImageVector
    get() {
        if (_alignTop != null) return _alignTop!!
        _alignTop = phosphorDuotoneIcon(
            name = "AlignTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 200.000 80.000 L 200.000 176.000 C 200.000 180.418 196.418 184.000 192.000 184.000 L 152.000 184.000 C 147.582 184.000 144.000 180.418 144.000 176.000 L 144.000 80.000 C 144.000 75.582 147.582 72.000 152.000 72.000 L 192.000 72.000 C 196.418 72.000 200.000 75.582 200.000 80.000 ZM 104.000 72.000 L 64.000 72.000 C 59.582 72.000 56.000 75.582 56.000 80.000 L 56.000 216.000 C 56.000 220.418 59.582 224.000 64.000 224.000 L 104.000 224.000 C 108.418 224.000 112.000 220.418 112.000 216.000 L 112.000 80.000 C 112.000 75.582 108.418 72.000 104.000 72.000 Z"),
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
        pathData = parseSvgPathData("M 224.000 40.000 C 224.000 44.418 220.418 48.000 216.000 48.000 L 40.000 48.000 C 35.582 48.000 32.000 44.418 32.000 40.000 C 32.000 35.582 35.582 32.000 40.000 32.000 L 216.000 32.000 C 220.418 32.000 224.000 35.582 224.000 40.000 ZM 208.000 80.000 L 208.000 176.000 C 208.000 184.837 200.837 192.000 192.000 192.000 L 152.000 192.000 C 143.163 192.000 136.000 184.837 136.000 176.000 L 136.000 80.000 C 136.000 71.163 143.163 64.000 152.000 64.000 L 192.000 64.000 C 200.837 64.000 208.000 71.163 208.000 80.000 ZM 192.000 80.000 L 152.000 80.000 L 152.000 176.000 L 192.000 176.000 ZM 120.000 80.000 L 120.000 216.000 C 120.000 224.837 112.837 232.000 104.000 232.000 L 64.000 232.000 C 55.163 232.000 48.000 224.837 48.000 216.000 L 48.000 80.000 C 48.000 71.163 55.163 64.000 64.000 64.000 L 104.000 64.000 C 112.837 64.000 120.000 71.163 120.000 80.000 ZM 104.000 80.000 L 64.000 80.000 L 64.000 216.000 L 104.000 216.000 Z"),
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
        return _alignTop!!
    }

private var _alignTop: ImageVector? = null
