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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 244.460 108.000 L 210.840 70.630 C 208.186 67.683 204.406 66.001 200.440 66.000 L 134.000 66.000 L 134.000 32.000 C 134.000 28.686 131.314 26.000 128.000 26.000 C 124.686 26.000 122.000 28.686 122.000 32.000 L 122.000 66.000 L 40.000 66.000 C 32.268 66.000 26.000 72.268 26.000 80.000 L 26.000 144.000 C 26.000 151.732 32.268 158.000 40.000 158.000 L 122.000 158.000 L 122.000 224.000 C 122.000 227.314 124.686 230.000 128.000 230.000 C 131.314 230.000 134.000 227.314 134.000 224.000 L 134.000 158.000 L 200.440 158.000 C 204.406 157.999 208.186 156.317 210.840 153.370 L 244.460 116.000 C 246.497 113.722 246.497 110.278 244.460 108.000 ZM 201.920 145.350 C 201.542 145.769 201.004 146.009 200.440 146.010 L 40.000 146.010 C 38.895 146.010 38.000 145.115 38.000 144.010 L 38.000 80.000 C 38.000 78.895 38.895 78.000 40.000 78.000 L 200.440 78.000 C 201.004 78.001 201.542 78.241 201.920 78.660 L 231.920 112.000 Z"),
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
        return _signpost!!
    }

private var _signpost: ImageVector? = null
