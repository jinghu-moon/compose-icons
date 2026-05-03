package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.AlignCenterVerticalSimple: ImageVector
    get() {
        if (_alignCenterVerticalSimple != null) return _alignCenterVerticalSimple!!
        _alignCenterVerticalSimple = phosphorDuotoneIcon(
            name = "AlignCenterVerticalSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 168.000 48.000 L 168.000 208.000 C 168.000 212.418 164.418 216.000 160.000 216.000 L 96.000 216.000 C 91.582 216.000 88.000 212.418 88.000 208.000 L 88.000 48.000 C 88.000 43.582 91.582 40.000 96.000 40.000 L 160.000 40.000 C 164.418 40.000 168.000 43.582 168.000 48.000 Z"),
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
        pathData = parseSvgPathData("M 208.000 120.000 L 176.000 120.000 L 176.000 48.000 C 176.000 39.163 168.837 32.000 160.000 32.000 L 96.000 32.000 C 87.163 32.000 80.000 39.163 80.000 48.000 L 80.000 120.000 L 48.000 120.000 C 43.582 120.000 40.000 123.582 40.000 128.000 C 40.000 132.418 43.582 136.000 48.000 136.000 L 80.000 136.000 L 80.000 208.000 C 80.000 216.837 87.163 224.000 96.000 224.000 L 160.000 224.000 C 168.837 224.000 176.000 216.837 176.000 208.000 L 176.000 136.000 L 208.000 136.000 C 212.418 136.000 216.000 132.418 216.000 128.000 C 216.000 123.582 212.418 120.000 208.000 120.000 ZM 160.000 208.000 L 96.000 208.000 L 96.000 48.000 L 160.000 48.000 Z"),
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
        return _alignCenterVerticalSimple!!
    }

private var _alignCenterVerticalSimple: ImageVector? = null
