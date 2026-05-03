package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AlignTopSimple: ImageVector
    get() {
        if (_alignTopSimple != null) return _alignTopSimple!!
        _alignTopSimple = phosphorFillIcon(
            name = "AlignTopSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 C 208.000 36.418 204.418 40.000 200.000 40.000 L 56.000 40.000 C 51.582 40.000 48.000 36.418 48.000 32.000 C 48.000 27.582 51.582 24.000 56.000 24.000 L 200.000 24.000 C 204.418 24.000 208.000 27.582 208.000 32.000 ZM 160.000 56.000 L 96.000 56.000 C 87.163 56.000 80.000 63.163 80.000 72.000 L 80.000 224.000 C 80.000 232.837 87.163 240.000 96.000 240.000 L 160.000 240.000 C 168.837 240.000 176.000 232.837 176.000 224.000 L 176.000 72.000 C 176.000 63.163 168.837 56.000 160.000 56.000 Z"),
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
        return _alignTopSimple!!
    }

private var _alignTopSimple: ImageVector? = null
