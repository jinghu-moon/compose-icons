package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PaintRoller: ImageVector
    get() {
        if (_paintRoller != null) return _paintRoller!!
        _paintRoller = phosphorDuotoneIcon(
            name = "PaintRoller",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 208.000 64.000 L 208.000 128.000 C 208.000 132.418 204.418 136.000 200.000 136.000 L 48.000 136.000 C 43.582 136.000 40.000 132.418 40.000 128.000 L 40.000 64.000 C 40.000 59.582 43.582 56.000 48.000 56.000 L 200.000 56.000 C 204.418 56.000 208.000 59.582 208.000 64.000 Z"),
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
        pathData = parseSvgPathData("M 232.000 88.000 L 216.000 88.000 L 216.000 64.000 C 216.000 55.163 208.837 48.000 200.000 48.000 L 48.000 48.000 C 39.163 48.000 32.000 55.163 32.000 64.000 L 32.000 88.000 L 16.000 88.000 C 11.582 88.000 8.000 91.582 8.000 96.000 C 8.000 100.418 11.582 104.000 16.000 104.000 L 32.000 104.000 L 32.000 128.000 C 32.000 136.837 39.163 144.000 48.000 144.000 L 200.000 144.000 C 208.837 144.000 216.000 136.837 216.000 128.000 L 216.000 104.000 L 232.000 104.000 L 232.000 154.000 L 131.600 182.650 C 124.759 184.631 120.038 190.878 120.000 198.000 L 120.000 232.000 C 120.000 236.418 123.582 240.000 128.000 240.000 C 132.418 240.000 136.000 236.418 136.000 232.000 L 136.000 198.000 L 236.400 169.320 C 243.230 167.342 247.949 161.111 248.000 154.000 L 248.000 104.000 C 248.000 95.163 240.837 88.000 232.000 88.000 ZM 200.000 128.000 L 48.000 128.000 L 48.000 64.000 L 200.000 64.000 L 200.000 128.000 Z"),
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
        return _paintRoller!!
    }

private var _paintRoller: ImageVector? = null
