package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Suitcase2Line: ImageVector
    get() {
        if (_suitcase2Line != null) return _suitcase2Line!!
        _suitcase2Line = remixIcon(
            name = "Suitcase2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 23h-2v-1h-8v1h-2v-1h-1C3.895 22 3 21.105 3 20v-13C3 5.895 3.895 5 5 5h3v-2C8 2.448 8.448 2 9 2h6c.552 0 1 .448 1 1v2h3c1.105 0 2 .895 2 2v13c0 1.105-.895 2-2 2h-1v1ZM19 7h-14v13h14v-13ZM10 9v9h-2v-9h2ZM16 9v9h-2v-9h2ZM14 4h-4v1h4v-1Z"),
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
        return _suitcase2Line!!
    }

private var _suitcase2Line: ImageVector? = null
