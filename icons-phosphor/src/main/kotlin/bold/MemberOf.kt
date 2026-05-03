package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MemberOf: ImageVector
    get() {
        if (_memberOf != null) return _memberOf!!
        _memberOf = phosphorBoldIcon(
            name = "MemberOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 140.000 L 61.080 140.000 C 66.927 172.383 95.093 195.953 128.000 196.000 L 200.000 196.000 C 206.627 196.000 212.000 201.373 212.000 208.000 C 212.000 214.627 206.627 220.000 200.000 220.000 L 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 L 200.000 36.000 C 206.627 36.000 212.000 41.373 212.000 48.000 C 212.000 54.627 206.627 60.000 200.000 60.000 L 128.000 60.000 C 95.093 60.047 66.927 83.617 61.080 116.000 L 200.000 116.000 C 206.627 116.000 212.000 121.373 212.000 128.000 C 212.000 134.627 206.627 140.000 200.000 140.000 Z"),
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
        return _memberOf!!
    }

private var _memberOf: ImageVector? = null
