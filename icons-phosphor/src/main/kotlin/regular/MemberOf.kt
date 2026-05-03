package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MemberOf: ImageVector
    get() {
        if (_memberOf != null) return _memberOf!!
        _memberOf = phosphorRegularIcon(
            name = "MemberOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 136.000 L 56.460 136.000 C 60.568 172.418 91.351 199.956 128.000 200.000 L 200.000 200.000 C 204.418 200.000 208.000 203.582 208.000 208.000 C 208.000 212.418 204.418 216.000 200.000 216.000 L 128.000 216.000 C 79.399 216.000 40.000 176.601 40.000 128.000 C 40.000 79.399 79.399 40.000 128.000 40.000 L 200.000 40.000 C 204.418 40.000 208.000 43.582 208.000 48.000 C 208.000 52.418 204.418 56.000 200.000 56.000 L 128.000 56.000 C 91.351 56.044 60.568 83.582 56.460 120.000 L 200.000 120.000 C 204.418 120.000 208.000 123.582 208.000 128.000 C 208.000 132.418 204.418 136.000 200.000 136.000 Z"),
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
