package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MemberOf: ImageVector
    get() {
        if (_memberOf != null) return _memberOf!!
        _memberOf = phosphorLightIcon(
            name = "MemberOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 134h-145.74c3.166 38.389 35.221 67.948 73.74 68h72c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-72C80.504 214 42 175.496 42 128 42 80.504 80.504 42 128 42h72c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-72C89.481 54.052 57.426 83.611 54.26 122h145.74c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6Z"),
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
