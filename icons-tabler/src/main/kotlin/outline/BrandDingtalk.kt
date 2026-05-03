package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDingtalk: ImageVector
    get() {
        if (_brandDingtalk != null) return _brandDingtalk!!
        _brandDingtalk = tablerOutlineIcon(
            name = "BrandDingtalk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 12.000 C 21.000 16.971 16.971 21.000 12.000 21.000 C 7.029 21.000 3.000 16.971 3.000 12.000 C 3.000 7.029 7.029 3.000 12.000 3.000 C 16.971 3.000 21.000 7.029 21.000 12.000"),
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
        pathData = parseSvgPathData("M 8.000 7.500 L 15.020 10.132 C 15.276 10.228 15.481 10.425 15.588 10.676 C 15.695 10.927 15.695 11.211 15.587 11.462 L 14.500 14.000 L 16.000 14.000 L 11.000 18.000 L 12.000 14.000 C 8.900 14.030 8.886 10.861 8.000 7.500"),
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
        return _brandDingtalk!!
    }

private var _brandDingtalk: ImageVector? = null
