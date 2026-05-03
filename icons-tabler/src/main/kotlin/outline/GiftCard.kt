package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GiftCard: ImageVector
    get() {
        if (_giftCard != null) return _giftCard!!
        _giftCard = tablerOutlineIcon(
            name = "GiftCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 8.000 C 3.000 6.343 4.343 5.000 6.000 5.000 L 18.000 5.000 C 19.657 5.000 21.000 6.343 21.000 8.000 L 21.000 16.000 C 21.000 17.657 19.657 19.000 18.000 19.000 L 6.000 19.000 C 4.343 19.000 3.000 17.657 3.000 16.000 L 3.000 8.000"),
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
                pathData = parseSvgPathData("M 7.000 16.000 L 10.000 13.000 L 13.000 16.000"),
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
                pathData = parseSvgPathData("M 8.000 13.000 C 7.211 13.000 6.000 12.328 6.000 11.500 C 6.000 10.672 6.711 10.000 7.500 10.000 C 8.628 9.980 9.577 11.170 10.000 13.000 C 10.423 11.170 11.372 9.980 12.500 10.000 C 13.289 10.000 14.000 10.672 14.000 11.500 C 14.000 12.328 12.789 13.000 12.000 13.000 L 8.000 13.000"),
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
        return _giftCard!!
    }

private var _giftCard: ImageVector? = null
