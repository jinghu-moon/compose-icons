package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandKbin: ImageVector
    get() {
        if (_brandKbin != null) return _brandKbin!!
        _brandKbin = tablerOutlineIcon(
            name = "BrandKbin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.586 9.506 L 8.156 9.506 C 7.722 8.574 7.456 8.000 6.560 8.000 L 4.156 8.019 C 3.494 8.019 2.803 8.611 3.053 9.506 L 5.269 18.942 C 5.755 20.685 6.080 21.000 6.414 21.000 L 7.054 21.000"),
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
        pathData = parseSvgPathData("M 14.275 3.000 L 19.920 3.000 C 20.760 3.000 21.160 3.714 20.940 4.287 L 16.253 19.396 C 15.833 20.529 15.094 20.999 13.899 20.999 L 6.414 20.999 C 6.804 20.999 7.174 20.381 7.710 18.938 L 12.167 4.448 C 12.493 3.618 12.927 3.000 14.275 3.000"),
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
        return _brandKbin!!
    }

private var _brandKbin: ImageVector? = null
