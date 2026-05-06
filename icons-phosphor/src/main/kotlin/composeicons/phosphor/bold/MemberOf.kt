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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 140h-138.92c5.847 32.383 34.013 55.953 66.92 56h72c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-72C77.19 220 36 178.81 36 128 36 77.19 77.19 36 128 36h72c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-72C95.093 60.047 66.927 83.617 61.08 116h138.92c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12Z"),
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
        return _memberOf!!
    }

private var _memberOf: ImageVector? = null
