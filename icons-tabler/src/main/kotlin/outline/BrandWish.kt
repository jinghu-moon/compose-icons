package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandWish: ImageVector
    get() {
        if (_brandWish != null) return _brandWish!!
        _brandWish = tablerOutlineIcon(
            name = "BrandWish",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.000 6.000 L 7.981 8.392 L 7.342 14.429 C 7.162 15.322 7.402 16.248 7.992 16.943 C 8.583 17.640 9.460 18.029 10.373 18.000 C 12.422 17.939 14.147 16.448 14.505 14.430 C 14.325 15.323 14.565 16.249 15.155 16.944 C 15.746 17.640 16.622 18.029 17.535 18.000 C 19.584 17.939 21.309 16.448 21.667 14.430 L 22.000 9.797"),
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
        pathData = parseSvgPathData("M 14.504 14.429 L 14.838 11.429"),
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
        return _brandWish!!
    }

private var _brandWish: ImageVector? = null
