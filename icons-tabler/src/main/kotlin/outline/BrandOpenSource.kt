package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandOpenSource: ImageVector
    get() {
        if (_brandOpenSource != null) return _brandOpenSource!!
        _brandOpenSource = tablerOutlineIcon(
            name = "BrandOpenSource",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 3.000 C 16.260 2.998 19.938 5.982 20.813 10.152 C 21.688 14.321 19.520 18.533 15.618 20.243 L 13.425 14.641 C 14.634 13.989 15.246 12.598 14.909 11.266 C 14.573 9.934 13.374 9.001 12.000 9.001 C 10.627 9.001 9.428 9.934 9.092 11.266 C 8.755 12.598 9.367 13.989 10.576 14.641 L 8.383 20.244 C 4.480 18.535 2.311 14.323 3.185 10.152 C 4.060 5.982 7.739 2.997 12.000 3.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _brandOpenSource!!
    }

private var _brandOpenSource: ImageVector? = null
