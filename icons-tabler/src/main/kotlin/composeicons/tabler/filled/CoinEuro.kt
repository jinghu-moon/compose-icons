package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CoinEuro: ImageVector
    get() {
        if (_coinEuro != null) return _coinEuro!!
        _coinEuro = tablerFilledIcon(
            name = "CoinEuro",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.203 2.426 6.057 7.52 4.397 12.081-1.66 4.56-6.354 7.271-11.134 6.428C5.484 21.006 2 16.853 2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34ZM12 6C9.948 6 8.232 7.449 7.451 9.5h-.451c-.529 .001-.966 .413-.997 .941-.031 .528 .355 .989 .88 1.052l.134 .007c-.023 .333-.023 .667 0 1h-.017c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h.452C8.232 16.553 9.948 18 12 18c1.141 0 2.217-.457 3.084-1.27 .403-.378 .424-1.011 .046-1.414-.378-.403-1.011-.424-1.414-.046C13.207 15.748 12.614 16 12 16c-.922 0-1.776-.578-2.335-1.499L11 14.5c.552 0 1-.448 1-1 0-.552-.448-1-1-1h-1.977c-.031-.333-.031-.667 0-1h1.977c.552 0 1-.448 1-1 0-.552-.448-1-1-1h-1.336C10.224 8.579 11.078 8 12 8c.615 0 1.208 .252 1.717 .73 .403 .378 1.036 .357 1.414-.046 .378-.403 .357-1.036-.046-1.414C14.218 6.458 13.142 6 12 6Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _coinEuro!!
    }

private var _coinEuro: ImageVector? = null
