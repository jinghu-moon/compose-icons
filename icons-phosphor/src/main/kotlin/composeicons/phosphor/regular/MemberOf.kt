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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 136h-143.54c4.108 36.418 34.891 63.956 71.54 64h72c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-72C79.399 216 40 176.601 40 128 40 79.399 79.399 40 128 40h72c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-72C91.351 56.044 60.568 83.582 56.46 120h143.54c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8Z"),
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
