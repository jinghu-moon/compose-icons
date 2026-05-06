package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.XLogo: ImageVector
    get() {
        if (_xLogo != null) return _xLogo!!
        _xLogo = phosphorFillIcon(
            name = "XLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M215 219.85c-1.403 2.555-4.085 4.145-7 4.15h-48c-2.736-.001-5.283-1.4-6.75-3.71L112.76 156.66 53.92 221.38c-2.985 3.207-7.994 3.416-11.236 .469-3.242-2.946-3.511-7.952-.604-11.229l61.77-68L41.25 44.3c-1.57-2.464-1.673-5.588-.267-8.149C42.388 33.59 45.078 31.999 48 32h48c2.736 .001 5.283 1.4 6.75 3.71l40.49 63.63L202.08 34.62c2.985-3.207 7.994-3.416 11.236-.469 3.242 2.946 3.511 7.952 .604 11.229l-61.77 67.95 62.6 98.38c1.561 2.465 1.657 5.584 .25 8.14Z"),
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
        return _xLogo!!
    }

private var _xLogo: ImageVector? = null
