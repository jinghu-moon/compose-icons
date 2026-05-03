package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SoundcloudLogo: ImageVector
    get() {
        if (_soundcloudLogo != null) return _soundcloudLogo!!
        _soundcloudLogo = phosphorThinIcon(
            name = "SoundcloudLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.000 120.000 L 20.000 168.000 C 20.000 170.209 18.209 172.000 16.000 172.000 C 13.791 172.000 12.000 170.209 12.000 168.000 L 12.000 120.000 C 12.000 117.791 13.791 116.000 16.000 116.000 C 18.209 116.000 20.000 117.791 20.000 120.000 ZM 48.000 92.000 C 45.791 92.000 44.000 93.791 44.000 96.000 L 44.000 192.000 C 44.000 194.209 45.791 196.000 48.000 196.000 C 50.209 196.000 52.000 194.209 52.000 192.000 L 52.000 96.000 C 52.000 93.791 50.209 92.000 48.000 92.000 ZM 80.000 84.000 C 77.791 84.000 76.000 85.791 76.000 88.000 L 76.000 192.000 C 76.000 194.209 77.791 196.000 80.000 196.000 C 82.209 196.000 84.000 194.209 84.000 192.000 L 84.000 88.000 C 84.000 85.791 82.209 84.000 80.000 84.000 ZM 112.000 52.000 C 109.791 52.000 108.000 53.791 108.000 56.000 L 108.000 192.000 C 108.000 194.209 109.791 196.000 112.000 196.000 C 114.209 196.000 116.000 194.209 116.000 192.000 L 116.000 56.000 C 116.000 53.791 114.209 52.000 112.000 52.000 ZM 219.270 109.460 C 214.013 71.923 181.903 43.998 144.000 44.000 C 141.791 44.000 140.000 45.791 140.000 48.000 C 140.000 50.209 141.791 52.000 144.000 52.000 C 178.943 51.879 208.246 78.354 211.660 113.130 C 211.835 114.889 213.145 116.324 214.880 116.660 C 233.091 120.196 245.633 136.991 243.852 155.456 C 242.071 173.921 226.551 188.009 208.000 188.000 L 144.000 188.000 C 141.791 188.000 140.000 189.791 140.000 192.000 C 140.000 194.209 141.791 196.000 144.000 196.000 L 208.000 196.000 C 230.115 196.015 248.805 179.612 251.661 157.682 C 254.517 135.752 240.651 115.110 219.270 109.460 Z"),
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
        return _soundcloudLogo!!
    }

private var _soundcloudLogo: ImageVector? = null
