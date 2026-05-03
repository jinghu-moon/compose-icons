package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MemberOf: ImageVector
    get() {
        if (_memberOf != null) return _memberOf!!
        _memberOf = phosphorThinIcon(
            name = "MemberOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 132.000 L 52.110 132.000 C 54.282 172.341 87.601 203.952 128.000 204.000 L 200.000 204.000 C 202.209 204.000 204.000 205.791 204.000 208.000 C 204.000 210.209 202.209 212.000 200.000 212.000 L 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 L 200.000 44.000 C 202.209 44.000 204.000 45.791 204.000 48.000 C 204.000 50.209 202.209 52.000 200.000 52.000 L 128.000 52.000 C 87.601 52.048 54.282 83.659 52.110 124.000 L 200.000 124.000 C 202.209 124.000 204.000 125.791 204.000 128.000 C 204.000 130.209 202.209 132.000 200.000 132.000 Z"),
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
