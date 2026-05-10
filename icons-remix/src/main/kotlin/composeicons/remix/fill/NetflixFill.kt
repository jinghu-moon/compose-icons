package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.NetflixFill: ImageVector
    get() {
        if (_netflixFill != null) return _netflixFill!!
        _netflixFill = remixIcon(
            name = "NetflixFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.292 3.814l2.018 5.707 .396 1.116 .007-4.811 .009-4.817h4.271l.007 10.862c.003 5.981-.004 10.89-.016 10.899-.012 .009-.209 0-.436-.027-.989-.118-2.29-.236-3.34-.281-.347-.016-.634-.035-.637-.038-.003-.004-.272-.762-.776-2.184l0-.004c-.492-1.388-1.212-3.424-2.144-6.061l-.34-.953-.007 4.585c-.006 4.365-.01 4.61-.057 4.61-.163 0-1.57 .091-2.04 .136-.309 .027-.926 .091-1.37 .145-.446 .051-.816 .085-.823 .078C6.007 22.769 6.001 17.867 6.001 11.883v-10.881h.005L6.006 1h4.288l.028 .081c.007 .015 .065 .176 .157 .436l.641 1.778 .172 .496-.001 .023Z"),
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
        return _netflixFill!!
    }

private var _netflixFill: ImageVector? = null
