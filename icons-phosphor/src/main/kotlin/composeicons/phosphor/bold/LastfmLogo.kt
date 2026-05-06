package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LastfmLogo: ImageVector
    get() {
        if (_lastfmLogo != null) return _lastfmLogo!!
        _lastfmLogo = phosphorBoldIcon(
            name = "LastfmLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M252 160c-.028 24.289-19.711 43.972-44 44h-17.43c-23.297-.05-44.474-13.538-54.37-34.63L106.05 104.78C100.112 92.127 87.407 84.034 73.43 84h-9.43C44.118 84 28 100.118 28 120v24c0 19.882 16.118 36 36 36h8c11.14 .007 21.224-6.59 25.68-16.8 2.651-6.075 9.725-8.851 15.8-6.2 6.075 2.651 8.851 9.725 6.2 15.8C111.406 191.757 92.684 204.008 72 204h-8C30.879 203.961 4.039 177.121 4 144v-24C4.039 86.879 30.879 60.039 64 60h9.43c23.297 .05 44.474 13.538 54.37 34.63L158 159.22c5.931 12.637 18.611 20.727 32.57 20.78h17.43c11.046 0 20-8.954 20-20 0-11.046-8.954-20-20-20h-20c-22.091 0-40-17.909-40-40 0-22.091 17.909-40 40-40h20c19.882 0 36 16.118 36 36 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627-5.373-12-12-12h-20c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16h20c24.289 .028 43.972 19.711 44 44Z"),
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
