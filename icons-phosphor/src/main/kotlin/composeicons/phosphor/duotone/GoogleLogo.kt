package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GoogleLogo: ImageVector
    get() {
        if (_googleLogo != null) return _googleLogo!!
        _googleLogo = phosphorDuotoneIcon(
            name = "GoogleLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 128c0 48.601-39.399 88-88 88C79.399 216 40 176.601 40 128 40 79.399 79.399 40 128 40c48.601 0 88 39.399 88 88Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M224 128c.002 46.664-33.551 86.571-79.522 94.58C98.506 230.59 53.434 204.382 37.655 160.467 21.876 116.551 39.961 67.65 80.517 44.57 121.074 21.49 172.353 30.916 202.05 66.91c1.945 2.188 2.539 5.264 1.549 8.019-.99 2.755-3.406 4.75-6.298 5.2-2.893 .45-5.8-.715-7.581-3.039C165.458 47.672 123.806 39.467 90.2 57.485 56.593 75.504 40.376 114.737 51.45 151.225c11.075 36.488 46.363 60.088 84.315 56.388 37.952-3.7 68.017-33.673 71.835-71.613h-79.6c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h88c4.418 0 8 3.582 8 8Z"),
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
        return _googleLogo!!
    }

private var _googleLogo: ImageVector? = null
