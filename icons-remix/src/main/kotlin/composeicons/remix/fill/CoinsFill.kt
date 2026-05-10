package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CoinsFill: ImageVector
    get() {
        if (_coinsFill != null) return _coinsFill!!
        _coinsFill = remixIcon(
            name = "CoinsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.005 2.003c4.418 0 8 3.582 8 8 0 3.245-1.932 6.038-4.708 7.293-1.255 2.776-4.048 4.707-7.292 4.707-4.418 0-8-3.582-8-8 0-3.244 1.931-6.037 4.706-7.293C7.967 3.934 10.76 2.003 14.005 2.003ZM11.005 9.003h-2v1c-1.381 0-2.5 1.119-2.5 2.5 0 1.326 1.032 2.41 2.336 2.495l.164 .005h2l.09 .008c.233 .042 .41 .246 .41 .492 0 .245-.177 .45-.41 .492l-.09 .008h-4v2h2v1h2v-1c1.381 0 2.5-1.119 2.5-2.5 0-1.325-1.032-2.41-2.336-2.495l-.164-.005h-2l-.09-.008c-.233-.042-.41-.247-.41-.492 0-.245 .177-.45 .41-.492l.09-.008h4v-2h-2v-1ZM14.005 4.003c-1.783 0-3.385 .778-4.484 2.013 .161-.009 .322-.013 .484-.013 4.418 0 8 3.582 8 8 0 .163-.005 .324-.014 .484 1.236-1.099 2.014-2.701 2.014-4.484 0-3.314-2.686-6-6-6Z"),
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
        return _coinsFill!!
    }

private var _coinsFill: ImageVector? = null
