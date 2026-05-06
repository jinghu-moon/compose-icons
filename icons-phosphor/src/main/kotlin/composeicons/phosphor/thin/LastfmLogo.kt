package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LastfmLogo: ImageVector
    get() {
        if (_lastfmLogo != null) return _lastfmLogo!!
        _lastfmLogo = phosphorThinIcon(
            name = "LastfmLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 160c0 19.882-16.118 36-36 36h-17.43c-20.187-.046-38.537-11.729-47.12-30L113.3 101.4C106.04 85.935 90.514 76.044 73.43 76h-9.43C39.711 76.028 20.028 95.711 20 120v24c.028 24.289 19.711 43.972 44 44h8c14.316 .002 27.273-8.479 33-21.6 .551-1.341 1.784-2.28 3.224-2.452 1.44-.173 2.86 .447 3.712 1.621 .852 1.173 1.003 2.716 .393 4.032C105.331 185.636 89.497 196.001 72 196h-8C35.295 195.967 12.033 172.705 12 144v-24C12.033 91.295 35.295 68.033 64 68h9.43c20.187 .046 38.537 11.729 47.12 30l30.15 64.6c7.26 15.465 22.786 25.356 39.87 25.4h17.43c15.464 0 28-12.536 28-28 0-15.464-12.536-28-28-28h-20c-17.673 0-32-14.327-32-32 0-17.673 14.327-32 32-32h20c15.464 0 28 12.536 28 28 0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4C228 84.954 219.046 76 208 76h-20c-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24h20c19.882 0 36 16.118 36 36Z"),
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
        return _lastfmLogo!!
    }

private var _lastfmLogo: ImageVector? = null
