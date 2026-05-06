package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LastfmLogo: ImageVector
    get() {
        if (_lastfmLogo != null) return _lastfmLogo!!
        _lastfmLogo = phosphorFillIcon(
            name = "LastfmLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40h-176C31.163 40 24 47.163 24 56v144c0 8.837 7.163 16 16 16h176c8.837 0 16-7.163 16-16v-144c0-8.837-7.163-16-16-16ZM184 184h-11.39c-15.682-.021-29.911-9.183-36.42-23.45l-23-50.48C109.303 101.518 100.784 96.019 91.39 96h-11.39C66.745 96 56 106.745 56 120v24c0 13.255 10.745 24 24 24h8c7.292 .013 14.192-3.3 18.74-9 1.752-2.333 4.636-3.526 7.525-3.115 2.889 .412 5.324 2.363 6.355 5.092 1.031 2.729 .495 5.804-1.4 8.023-7.574 9.5-19.07 15.023-31.22 15h-8C57.909 184 40 166.091 40 144v-24C40 97.909 57.909 80 80 80h11.39c15.681 .021 29.911 9.183 36.42 23.45l22.95 50.48c3.894 8.569 12.438 14.07 21.85 14.07h11.39c8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16h-8c-15.464 0-28-12.536-28-28 0-15.464 12.536-28 28-28h12c11.046 0 20 8.954 20 20 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-2.209-1.791-4-4-4h-12c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h8c17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32Z"),
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
