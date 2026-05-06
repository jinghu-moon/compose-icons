package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CoinsLine: ImageVector
    get() {
        if (_coinsLine != null) return _coinsLine!!
        _coinsLine = remixIcon(
            name = "CoinsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.005 2.003c4.418 0 8 3.582 8 8 0 3.245-1.932 6.038-4.708 7.293-1.255 2.776-4.048 4.707-7.292 4.707-4.418 0-8-3.582-8-8 0-3.244 1.931-6.037 4.706-7.293C7.967 3.934 10.76 2.003 14.005 2.003ZM10.005 8.003c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM11.005 9.003v1h2v2h-4c-.276 0-.5 .224-.5 .5 0 .245 .177 .45 .41 .492l.09 .008h2c1.381 0 2.5 1.119 2.5 2.5 0 1.381-1.119 2.5-2.5 2.5v1h-2v-1h-2v-2h4c.276 0 .5-.224 .5-.5 0-.245-.177-.45-.41-.492l-.09-.008h-2c-1.381 0-2.5-1.119-2.5-2.5 0-1.381 1.119-2.5 2.5-2.5v-1h2ZM14.005 4.003c-1.783 0-3.385 .778-4.484 2.013 .161-.009 .322-.013 .484-.013 4.418 0 8 3.582 8 8 0 .163-.005 .324-.014 .484 1.236-1.099 2.014-2.701 2.014-4.484 0-3.314-2.686-6-6-6Z"),
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
        return _coinsLine!!
    }

private var _coinsLine: ImageVector? = null
