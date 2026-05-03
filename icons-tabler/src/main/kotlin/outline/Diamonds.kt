package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Diamonds: ImageVector
    get() {
        if (_diamonds != null) return _diamonds!!
        _diamonds = tablerOutlineIcon(
            name = "Diamonds",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.831 20.413 L 5.456 13.503 C 4.848 12.720 4.848 11.280 5.456 10.503 L 10.831 3.592 C 11.106 3.222 11.539 3.005 12.000 3.005 C 12.461 3.005 12.894 3.222 13.169 3.592 L 18.544 10.502 C 19.152 11.285 19.152 12.725 18.544 13.502 L 13.169 20.413 C 12.894 20.783 12.461 21.000 12.000 21.000 C 11.539 21.000 11.106 20.783 10.831 20.413"),
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
        return _diamonds!!
    }

private var _diamonds: ImageVector? = null
