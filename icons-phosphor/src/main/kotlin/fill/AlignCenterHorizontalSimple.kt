package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AlignCenterHorizontalSimple: ImageVector
    get() {
        if (_alignCenterHorizontalSimple != null) return _alignCenterHorizontalSimple!!
        _alignCenterHorizontalSimple = phosphorFillIcon(
            name = "AlignCenterHorizontalSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 96.000 L 224.000 160.000 C 224.000 168.837 216.837 176.000 208.000 176.000 L 136.000 176.000 L 136.000 208.000 C 136.000 212.418 132.418 216.000 128.000 216.000 C 123.582 216.000 120.000 212.418 120.000 208.000 L 120.000 176.000 L 48.000 176.000 C 39.163 176.000 32.000 168.837 32.000 160.000 L 32.000 96.000 C 32.000 87.163 39.163 80.000 48.000 80.000 L 120.000 80.000 L 120.000 48.000 C 120.000 43.582 123.582 40.000 128.000 40.000 C 132.418 40.000 136.000 43.582 136.000 48.000 L 136.000 80.000 L 208.000 80.000 C 216.837 80.000 224.000 87.163 224.000 96.000 Z"),
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
        return _alignCenterHorizontalSimple!!
    }

private var _alignCenterHorizontalSimple: ImageVector? = null
