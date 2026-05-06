package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TestTube: ImageVector
    get() {
        if (_testTube != null) return _testTube!!
        _testTube = phosphorLightIcon(
            name = "TestTube",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236.24 87.76l-60-60c-2.343-2.34-6.137-2.34-8.48 0L38.53 157C27.311 167.716 22.775 183.666 26.675 198.682c3.901 15.016 15.627 26.742 30.643 30.643 15.016 3.901 30.967-.636 41.682-11.855L211.24 105.24l22.66-7.55c1.97-.66 3.459-2.291 3.935-4.313 .477-2.022-.127-4.147-1.595-5.617ZM90.53 209C78.51 221.02 59.02 221.02 47 209 34.98 196.98 34.98 177.49 47 165.47L76.13 136.35c8.84-3.14 22.84-4.56 41.08 5 12.28 6.41 23.13 8.66 32.27 8.71ZM206.1 94.31c-.882 .295-1.683 .792-2.34 1.45l-39.9 39.89c-8.84 3.14-22.84 4.56-41.08-5C110.5 124.27 99.65 122 90.51 122L172 40.49l48.89 48.89Z"),
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
        return _testTube!!
    }

private var _testTube: ImageVector? = null
