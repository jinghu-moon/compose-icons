package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Signpost: ImageVector
    get() {
        if (_signpost != null) return _signpost!!
        _signpost = phosphorLightIcon(
            name = "Signpost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244.46 108 210.84 70.63C208.186 67.683 204.406 66.001 200.44 66h-66.44v-34c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v34h-82C32.268 66 26 72.268 26 80v64c0 7.732 6.268 14 14 14h82v66c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-66h66.44c3.966-.001 7.746-1.683 10.4-4.63L244.46 116c2.037-2.278 2.037-5.722 0-8ZM201.92 145.35c-.378 .419-.916 .659-1.48 .66h-160.44c-1.105 0-2-.895-2-2v-64.01c0-1.105 .895-2 2-2h160.44c.564 .001 1.102 .241 1.48 .66l30 33.34Z"),
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
        return _signpost!!
    }

private var _signpost: ImageVector? = null
