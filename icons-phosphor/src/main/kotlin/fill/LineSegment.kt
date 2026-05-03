package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LineSegment: ImageVector
    get() {
        if (_lineSegment != null) return _lineSegment!!
        _lineSegment = phosphorFillIcon(
            name = "LineSegment",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 211.810 83.790 C 203.053 92.547 189.583 94.512 178.690 88.620 L 88.620 178.690 C 95.478 191.373 91.583 207.190 79.621 215.239 C 67.659 223.288 51.540 220.937 42.375 209.806 C 33.210 198.676 33.995 182.406 44.190 172.210 L 44.190 172.210 C 52.947 163.453 66.417 161.488 77.310 167.380 L 167.380 77.310 C 160.522 64.627 164.417 48.810 176.379 40.761 C 188.341 32.712 204.460 35.063 213.625 46.194 C 222.790 57.324 222.005 73.594 211.810 83.790 Z"),
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
        return _lineSegment!!
    }

private var _lineSegment: ImageVector? = null
