package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ImagesSquare: ImageVector
    get() {
        if (_imagesSquare != null) return _imagesSquare!!
        _imagesSquare = phosphorFillIcon(
            name = "ImagesSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 80.000 32.000 C 71.163 32.000 64.000 39.163 64.000 48.000 L 64.000 64.000 L 48.000 64.000 C 39.163 64.000 32.000 71.163 32.000 80.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 176.000 224.000 C 184.837 224.000 192.000 216.837 192.000 208.000 L 192.000 192.000 L 208.000 192.000 C 216.837 192.000 224.000 184.837 224.000 176.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 80.000 48.000 L 208.000 48.000 L 208.000 117.380 L 191.300 100.680 C 185.052 94.437 174.928 94.437 168.680 100.680 L 93.370 176.000 L 80.000 176.000 ZM 176.000 208.000 L 48.000 208.000 L 48.000 80.000 L 64.000 80.000 L 64.000 176.000 C 64.000 184.837 71.163 192.000 80.000 192.000 L 176.000 192.000 ZM 104.000 88.000 C 104.000 79.163 111.163 72.000 120.000 72.000 C 128.837 72.000 136.000 79.163 136.000 88.000 C 136.000 96.837 128.837 104.000 120.000 104.000 C 111.163 104.000 104.000 96.837 104.000 88.000 Z"),
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
        return _imagesSquare!!
    }

private var _imagesSquare: ImageVector? = null
