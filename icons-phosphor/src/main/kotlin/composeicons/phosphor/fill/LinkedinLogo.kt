package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LinkedinLogo: ImageVector
    get() {
        if (_linkedinLogo != null) return _linkedinLogo!!
        _linkedinLogo = phosphorFillIcon(
            name = "LinkedinLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 24h-176C31.163 24 24 31.163 24 40v176c0 8.837 7.163 16 16 16h176c8.837 0 16-7.163 16-16v-176c0-8.837-7.163-16-16-16ZM96 176c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-64c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM88 96C81.373 96 76 90.627 76 84 76 77.373 81.373 72 88 72c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM184 176c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-36c0-11.046-8.954-20-20-20-11.046 0-20 8.954-20 20v36c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-64c.021-4.056 3.073-7.455 7.104-7.909 4.031-.454 7.763 2.18 8.686 6.129 11.028-7.481 25.288-8.258 37.064-2.019 11.776 6.239 19.142 18.473 19.146 31.799Z"),
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
        return _linkedinLogo!!
    }

private var _linkedinLogo: ImageVector? = null
