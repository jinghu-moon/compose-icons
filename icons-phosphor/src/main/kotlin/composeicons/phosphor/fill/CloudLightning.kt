package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CloudLightning: ImageVector
    get() {
        if (_cloudLightning != null) return _cloudLightning!!
        _cloudLightning = phosphorFillIcon(
            name = "CloudLightning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M156 168h-23.47l-14.4 24h25.87c2.883-.001 5.544 1.55 6.965 4.059 1.42 2.509 1.38 5.589-.105 8.061l-24 40c-2.275 3.789-7.191 5.015-10.98 2.74-3.789-2.275-5.015-7.191-2.74-10.98L129.87 208h-25.87c-2.883 .001-5.544-1.55-6.965-4.059-1.42-2.509-1.38-5.589 .105-8.061L113.87 168h-37C48.12 168 24.2 145.07 24 116.36 23.867 93.158 39.096 72.665 61.35 66.1c1.369-.396 2.845-.034 3.876 .951 1.03 .985 1.459 2.443 1.124 3.829C65.071 76.301 64.285 81.827 64 87.39c-.272 4.404 3.015 8.223 7.41 8.61h.6c4.305-.046 7.838-3.421 8.08-7.72C82.121 46.84 117.011 14.686 158.479 16.04c41.468 1.354 74.186 35.715 73.51 77.199C231.312 134.724 197.49 167.999 156 168Z"),
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
        return _cloudLightning!!
    }

private var _cloudLightning: ImageVector? = null
