package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGravatar: ImageVector
    get() {
        if (_brandGravatar != null) return _brandGravatar!!
        _brandGravatar = tablerOutlineIcon(
            name = "BrandGravatar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.64 5.632C2.602 8.667 2.13 13.425 4.514 16.997c2.384 3.572 6.959 4.962 10.927 3.319 3.968-1.642 6.223-5.859 5.386-10.07C19.99 6.034 16.294 3 12 3v7.714"),
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
        return _brandGravatar!!
    }

private var _brandGravatar: ImageVector? = null
