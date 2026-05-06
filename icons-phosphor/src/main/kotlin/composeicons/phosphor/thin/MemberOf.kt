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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 132h-147.89c2.172 40.341 35.491 71.952 75.89 72h72c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-72C81.608 212 44 174.392 44 128 44 81.608 81.608 44 128 44h72c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-72C87.601 52.048 54.282 83.659 52.11 124h147.89c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4Z"),
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
