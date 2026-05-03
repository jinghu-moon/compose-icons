package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DropboxLogo: ImageVector
    get() {
        if (_dropboxLogo != null) return _dropboxLogo!!
        _dropboxLogo = phosphorThinIcon(
            name = "DropboxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 234.280 152.710 L 187.000 120.000 L 234.250 87.290 C 235.330 86.543 235.975 85.313 235.975 84.000 C 235.975 82.687 235.330 81.457 234.250 80.710 L 182.250 44.710 C 180.879 43.759 179.061 43.759 177.690 44.710 L 128.000 79.140 L 78.280 44.710 C 76.909 43.759 75.091 43.759 73.720 44.710 L 21.720 80.710 C 20.640 81.457 19.995 82.687 19.995 84.000 C 19.995 85.313 20.640 86.543 21.720 87.290 L 69.000 120.000 L 21.720 152.710 C 20.640 153.457 19.995 154.687 19.995 156.000 C 19.995 157.313 20.640 158.543 21.720 159.290 L 73.720 195.290 C 75.091 196.241 76.909 196.241 78.280 195.290 L 128.000 160.860 L 177.720 195.290 C 179.091 196.241 180.909 196.241 182.280 195.290 L 234.280 159.290 C 235.360 158.543 236.005 157.313 236.005 156.000 C 236.005 154.687 235.360 153.457 234.280 152.710 ZM 128.000 151.140 L 83.000 120.000 L 128.000 88.860 L 173.000 120.000 ZM 180.000 52.870 L 225.000 84.000 L 180.000 115.130 L 135.000 84.000 ZM 76.000 52.870 L 121.000 84.000 L 76.000 115.130 L 31.000 84.000 ZM 76.000 187.130 L 31.000 156.000 L 76.000 124.870 L 121.000 156.000 ZM 180.000 187.130 L 135.000 156.000 L 180.000 124.870 L 225.000 156.000 ZM 155.180 209.180 C 155.786 210.051 156.022 211.128 155.834 212.172 C 155.647 213.217 155.052 214.144 154.180 214.750 L 130.290 231.290 C 128.919 232.241 127.101 232.241 125.730 231.290 L 101.840 214.750 C 100.023 213.491 99.571 210.997 100.830 209.180 C 102.089 207.363 104.583 206.911 106.400 208.170 L 128.010 223.170 L 149.620 208.170 C 151.435 206.916 153.922 207.368 155.180 209.180 Z"),
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
        return _dropboxLogo!!
    }

private var _dropboxLogo: ImageVector? = null
