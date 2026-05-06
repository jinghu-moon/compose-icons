package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SteamLine: ImageVector
    get() {
        if (_steamLine != null) return _steamLine!!
        _steamLine = remixIcon(
            name = "SteamLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.001 4c2.761 0 5 2.239 5 5 0 2.761-2.239 5-5 5-.305 0-.603-.027-.892-.079l-2.651 1.988c.029 .193 .043 .39 .043 .591 0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4 0-.177 .012-.352 .034-.524L1.709 14.43l.749-1.854 3.827 1.545c.729-.984 1.898-1.621 3.216-1.621 .163 0 .323 .01 .481 .029L12.023 9.468C12.008 9.314 12.001 9.158 12.001 9c0-2.761 2.239-5 5-5ZM9.501 14.5c-.464 0-.892 .158-1.231 .424l1.606 .649c.512 .207 .759 .79 .553 1.302-.207 .512-.79 .76-1.302 .553L7.52 16.779c.136 .973 .971 1.721 1.981 1.721 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2ZM12.865 11.81l-.983 1.476c.284 .211 .539 .458 .758 .736l1.36-1.021c-.441-.331-.825-.734-1.136-1.19ZM17.001 6C15.344 6 14.001 7.343 14.001 9c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3ZM17.001 7c1.104 0 2 .895 2 2 0 1.105-.896 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2Z"),
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
        return _steamLine!!
    }

private var _steamLine: ImageVector? = null
