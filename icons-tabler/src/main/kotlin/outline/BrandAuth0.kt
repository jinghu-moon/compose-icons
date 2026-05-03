package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAuth0: ImageVector
    get() {
        if (_brandAuth0 != null) return _brandAuth0!!
        _brandAuth0 = tablerOutlineIcon(
            name = "BrandAuth0",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 14.500 L 6.500 18.000 L 8.500 12.000 L 4.000 8.000 L 10.000 8.000 L 12.000 3.000 L 14.000 8.000 L 20.000 8.000 L 15.500 12.000 L 17.500 18.000 L 12.000 14.500"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 20.507 8.872 L 18.497 3.000 L 5.503 3.000 L 3.494 8.872 C 2.252 12.465 3.359 15.966 6.743 18.279 L 12.000 22.000 L 17.257 18.279 C 20.642 15.966 21.747 12.465 20.507 8.872"),
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
        return _brandAuth0!!
    }

private var _brandAuth0: ImageVector? = null
