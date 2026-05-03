package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BoundingBox: ImageVector
    get() {
        if (_boundingBox != null) return _boundingBox!!
        _boundingBox = phosphorDuotoneIcon(
            name = "BoundingBox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 216.000 48.000 L 216.000 80.000 C 216.000 84.418 212.418 88.000 208.000 88.000 L 176.000 88.000 C 171.582 88.000 168.000 84.418 168.000 80.000 L 168.000 48.000 C 168.000 43.582 171.582 40.000 176.000 40.000 L 208.000 40.000 C 212.418 40.000 216.000 43.582 216.000 48.000 ZM 80.000 40.000 L 48.000 40.000 C 43.582 40.000 40.000 43.582 40.000 48.000 L 40.000 80.000 C 40.000 84.418 43.582 88.000 48.000 88.000 L 80.000 88.000 C 84.418 88.000 88.000 84.418 88.000 80.000 L 88.000 48.000 C 88.000 43.582 84.418 40.000 80.000 40.000 ZM 208.000 168.000 L 176.000 168.000 C 171.582 168.000 168.000 171.582 168.000 176.000 L 168.000 208.000 C 168.000 212.418 171.582 216.000 176.000 216.000 L 208.000 216.000 C 212.418 216.000 216.000 212.418 216.000 208.000 L 216.000 176.000 C 216.000 171.582 212.418 168.000 208.000 168.000 ZM 80.000 168.000 L 48.000 168.000 C 43.582 168.000 40.000 171.582 40.000 176.000 L 40.000 208.000 C 40.000 212.418 43.582 216.000 48.000 216.000 L 80.000 216.000 C 84.418 216.000 88.000 212.418 88.000 208.000 L 88.000 176.000 C 88.000 171.582 84.418 168.000 80.000 168.000 Z"),
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
        pathData = parseSvgPathData("M 208.000 96.000 C 216.837 96.000 224.000 88.837 224.000 80.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 L 176.000 32.000 C 167.163 32.000 160.000 39.163 160.000 48.000 L 160.000 56.000 L 96.000 56.000 L 96.000 48.000 C 96.000 39.163 88.837 32.000 80.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 80.000 C 32.000 88.837 39.163 96.000 48.000 96.000 L 56.000 96.000 L 56.000 160.000 L 48.000 160.000 C 39.163 160.000 32.000 167.163 32.000 176.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 80.000 224.000 C 88.837 224.000 96.000 216.837 96.000 208.000 L 96.000 200.000 L 160.000 200.000 L 160.000 208.000 C 160.000 216.837 167.163 224.000 176.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 176.000 C 224.000 167.163 216.837 160.000 208.000 160.000 L 200.000 160.000 L 200.000 96.000 ZM 176.000 48.000 L 208.000 48.000 L 208.000 80.000 L 176.000 80.000 ZM 48.000 48.000 L 80.000 48.000 L 80.000 63.900 C 79.987 63.966 79.987 64.034 80.000 64.100 L 80.000 80.000 L 48.000 80.000 ZM 80.000 208.000 L 48.000 208.000 L 48.000 176.000 L 80.000 176.000 L 80.000 191.900 C 79.987 191.966 79.987 192.034 80.000 192.100 L 80.000 208.000 ZM 208.000 208.000 L 176.000 208.000 L 176.000 176.000 L 208.000 176.000 ZM 184.000 160.000 L 176.000 160.000 C 167.163 160.000 160.000 167.163 160.000 176.000 L 160.000 184.000 L 96.000 184.000 L 96.000 176.000 C 96.000 167.163 88.837 160.000 80.000 160.000 L 72.000 160.000 L 72.000 96.000 L 80.000 96.000 C 88.837 96.000 96.000 88.837 96.000 80.000 L 96.000 72.000 L 160.000 72.000 L 160.000 80.000 C 160.000 88.837 167.163 96.000 176.000 96.000 L 184.000 96.000 Z"),
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
