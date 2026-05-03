package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PaintRoller: ImageVector
    get() {
        if (_paintRoller != null) return _paintRoller!!
        _paintRoller = phosphorRegularIcon(
            name = "PaintRoller",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 88.000 L 216.000 88.000 L 216.000 64.000 C 216.000 55.163 208.837 48.000 200.000 48.000 L 48.000 48.000 C 39.163 48.000 32.000 55.163 32.000 64.000 L 32.000 88.000 L 16.000 88.000 C 11.582 88.000 8.000 91.582 8.000 96.000 C 8.000 100.418 11.582 104.000 16.000 104.000 L 32.000 104.000 L 32.000 128.000 C 32.000 136.837 39.163 144.000 48.000 144.000 L 200.000 144.000 C 208.837 144.000 216.000 136.837 216.000 128.000 L 216.000 104.000 L 232.000 104.000 L 232.000 154.000 L 131.600 182.650 C 124.759 184.631 120.038 190.878 120.000 198.000 L 120.000 232.000 C 120.000 236.418 123.582 240.000 128.000 240.000 C 132.418 240.000 136.000 236.418 136.000 232.000 L 136.000 198.000 L 236.400 169.320 C 243.230 167.342 247.949 161.111 248.000 154.000 L 248.000 104.000 C 248.000 95.163 240.837 88.000 232.000 88.000 ZM 200.000 128.000 L 48.000 128.000 L 48.000 64.000 L 200.000 64.000 L 200.000 128.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _paintRoller!!
    }

private var _paintRoller: ImageVector? = null
