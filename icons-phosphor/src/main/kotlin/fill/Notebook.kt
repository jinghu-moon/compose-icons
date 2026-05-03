package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Notebook: ImageVector
    get() {
        if (_notebook != null) return _notebook!!
        _notebook = phosphorFillIcon(
            name = "Notebook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 80.000 208.000 L 48.000 208.000 L 48.000 48.000 L 80.000 48.000 ZM 176.000 152.000 L 112.000 152.000 C 107.582 152.000 104.000 148.418 104.000 144.000 C 104.000 139.582 107.582 136.000 112.000 136.000 L 176.000 136.000 C 180.418 136.000 184.000 139.582 184.000 144.000 C 184.000 148.418 180.418 152.000 176.000 152.000 ZM 176.000 120.000 L 112.000 120.000 C 107.582 120.000 104.000 116.418 104.000 112.000 C 104.000 107.582 107.582 104.000 112.000 104.000 L 176.000 104.000 C 180.418 104.000 184.000 107.582 184.000 112.000 C 184.000 116.418 180.418 120.000 176.000 120.000 Z"),
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
        return _notebook!!
    }

private var _notebook: ImageVector? = null
