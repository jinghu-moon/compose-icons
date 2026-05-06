package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.LastfmLogo: ImageVector
    get() {
        if (_lastfmLogo != null) return _lastfmLogo!!
        _lastfmLogo = phosphorRegularIcon(
            name = "LastfmLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 160c0 22.091-17.909 40-40 40h-17.43c-21.743-.053-41.507-12.639-50.75-32.32L109.68 103.08C103.077 89.023 88.96 80.035 73.43 80h-9.43C41.909 80 24 97.909 24 120v24c0 22.091 17.909 40 40 40h8c12.728 .005 24.249-7.535 29.34-19.2 1.101-2.683 3.569-4.559 6.448-4.905 2.88-.345 5.72 .895 7.425 3.241 1.704 2.346 2.006 5.432 .787 8.063C108.365 188.695 91.089 200.003 72 200h-8C33.086 199.967 8.033 174.914 8 144v-24C8.033 89.086 33.086 64.033 64 64h9.43c21.743 .053 41.507 12.639 50.75 32.32l30.14 64.6c6.603 14.057 20.72 23.045 36.25 23.08h17.43c13.255 0 24-10.745 24-24 0-13.255-10.745-24-24-24h-20c-19.882 0-36-16.118-36-36 0-19.882 16.118-36 36-36h20c17.673 0 32 14.327 32 32 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-8.837-7.163-16-16-16h-20c-11.046 0-20 8.954-20 20 0 11.046 8.954 20 20 20h20c22.091 0 40 17.909 40 40Z"),
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
