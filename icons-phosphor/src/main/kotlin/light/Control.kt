package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Control: ImageVector
    get() {
        if (_control != null) return _control!!
        _control = phosphorLightIcon(
            name = "Control",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 204.240 124.240 C 201.897 126.580 198.103 126.580 195.760 124.240 L 128.000 56.490 L 60.240 124.240 C 57.876 126.443 54.192 126.378 51.907 124.093 C 49.622 121.808 49.557 118.124 51.760 115.760 L 123.760 43.760 C 126.103 41.420 129.897 41.420 132.240 43.760 L 204.240 115.760 C 206.580 118.103 206.580 121.897 204.240 124.240 Z"),
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
        return _control!!
    }

private var _control: ImageVector? = null
