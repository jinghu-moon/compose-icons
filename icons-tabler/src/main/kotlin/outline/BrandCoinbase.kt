package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCoinbase: ImageVector
    get() {
        if (_brandCoinbase != null) return _brandCoinbase!!
        _brandCoinbase = tablerOutlineIcon(
            name = "BrandCoinbase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.950 22.000 C 8.447 22.000 4.505 18.960 3.340 14.587 C 2.175 10.214 4.077 5.599 7.978 3.337 C 11.878 1.075 16.813 1.732 19.986 4.935 L 16.651 8.302 C 15.676 7.325 14.352 6.777 12.971 6.779 C 11.591 6.782 10.268 7.334 9.297 8.315 C 7.269 10.362 7.269 13.661 9.297 15.708 C 10.268 16.689 11.591 17.241 12.971 17.244 C 14.352 17.246 15.676 16.698 16.651 15.721 L 20.000 19.088 C 18.134 20.963 15.595 22.011 12.950 22.000"),
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
        return _brandCoinbase!!
    }

private var _brandCoinbase: ImageVector? = null
