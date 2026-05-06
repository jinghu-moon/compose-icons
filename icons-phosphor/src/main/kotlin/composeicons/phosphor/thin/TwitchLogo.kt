package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TwitchLogo: ImageVector
    get() {
        if (_twitchLogo != null) return _twitchLogo!!
        _twitchLogo = phosphorThinIcon(
            name = "TwitchLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 36h-160C41.373 36 36 41.373 36 48v144c0 6.627 5.373 12 12 12h20v36c0 1.55 .897 2.961 2.3 3.62 .531 .253 1.112 .383 1.7 .38 .936-.001 1.842-.33 2.56-.93L121.45 204h43.65c2.809-.003 5.529-.986 7.69-2.78l42.89-35.75c2.745-2.274 4.33-5.656 4.32-9.22v-108.25c0-6.627-5.373-12-12-12ZM212 156.25c.002 1.19-.526 2.319-1.44 3.08l-42.9 35.74c-.718 .6-1.624 .929-2.56 .93h-45.1c-.936 .001-1.842 .33-2.56 .93L76 231.46v-31.46c0-2.209-1.791-4-4-4h-24c-2.209 0-4-1.791-4-4v-144c0-2.209 1.791-4 4-4h160c2.209 0 4 1.791 4 4ZM172 88v48c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-48c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM124 88v48c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-48c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4Z"),
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
        return _twitchLogo!!
    }

private var _twitchLogo: ImageVector? = null
