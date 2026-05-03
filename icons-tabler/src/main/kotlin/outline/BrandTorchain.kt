package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTorchain: ImageVector
    get() {
        if (_brandTorchain != null) return _brandTorchain!!
        _brandTorchain = tablerOutlineIcon(
            name = "BrandTorchain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.588 15.537 L 12.035 12.000 L 4.293 20.180 C 3.502 21.030 4.446 22.360 5.531 21.910 L 15.147 17.814 C 15.575 17.632 15.885 17.249 15.973 16.793 C 16.061 16.336 15.916 15.865 15.587 15.537"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 8.412 8.464 L 11.965 12.000 L 19.707 3.820 C 20.498 2.970 19.554 1.640 18.469 2.090 L 8.853 6.188 C 8.425 6.370 8.115 6.753 8.027 7.209 C 7.939 7.666 8.084 8.137 8.413 8.465 L 8.412 8.464"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _brandTorchain!!
    }

private var _brandTorchain: ImageVector? = null
