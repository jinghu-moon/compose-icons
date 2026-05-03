package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BoundingBox: ImageVector
    get() {
        if (_boundingBox != null) return _boundingBox!!
        _boundingBox = phosphorFillIcon(
            name = "BoundingBox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 96.000 C 216.837 96.000 224.000 88.837 224.000 80.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 L 176.000 32.000 C 167.163 32.000 160.000 39.163 160.000 48.000 L 160.000 56.000 L 96.000 56.000 L 96.000 48.000 C 96.000 39.163 88.837 32.000 80.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 80.000 C 32.000 88.837 39.163 96.000 48.000 96.000 L 56.000 96.000 L 56.000 160.000 L 48.000 160.000 C 39.163 160.000 32.000 167.163 32.000 176.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 80.000 224.000 C 88.837 224.000 96.000 216.837 96.000 208.000 L 96.000 200.000 L 160.000 200.000 L 160.000 208.000 C 160.000 216.837 167.163 224.000 176.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 176.000 C 224.000 167.163 216.837 160.000 208.000 160.000 L 200.000 160.000 L 200.000 96.000 ZM 184.000 160.000 L 176.000 160.000 C 167.163 160.000 160.000 167.163 160.000 176.000 L 160.000 184.000 L 96.000 184.000 L 96.000 176.000 C 96.000 167.163 88.837 160.000 80.000 160.000 L 72.000 160.000 L 72.000 96.000 L 80.000 96.000 C 88.837 96.000 96.000 88.837 96.000 80.000 L 96.000 72.000 L 160.000 72.000 L 160.000 80.000 C 160.000 88.837 167.163 96.000 176.000 96.000 L 184.000 96.000 Z"),
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
        return _boundingBox!!
    }

private var _boundingBox: ImageVector? = null
