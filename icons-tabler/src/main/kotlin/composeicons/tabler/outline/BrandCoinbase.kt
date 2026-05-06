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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.95 22C8.447 22 4.505 18.96 3.34 14.587 2.175 10.214 4.077 5.599 7.978 3.337 11.878 1.075 16.813 1.732 19.986 4.935L16.651 8.302C15.676 7.325 14.352 6.777 12.971 6.779c-1.38 .002-2.703 .555-3.674 1.536-2.028 2.047-2.028 5.346 0 7.393 .971 .981 2.294 1.533 3.674 1.536 1.38 .002 2.705-.546 3.68-1.523L20 19.088C18.134 20.963 15.595 22.011 12.95 22"),
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
        return _brandCoinbase!!
    }

private var _brandCoinbase: ImageVector? = null
