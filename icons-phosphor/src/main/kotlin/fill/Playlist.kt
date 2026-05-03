package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Playlist: ImageVector
    get() {
        if (_playlist != null) return _playlist!!
        _playlist = phosphorFillIcon(
            name = "Playlist",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 64.000 72.000 L 192.000 72.000 C 196.418 72.000 200.000 75.582 200.000 80.000 C 200.000 84.418 196.418 88.000 192.000 88.000 L 64.000 88.000 C 59.582 88.000 56.000 84.418 56.000 80.000 C 56.000 75.582 59.582 72.000 64.000 72.000 ZM 64.000 120.000 L 136.000 120.000 C 140.418 120.000 144.000 123.582 144.000 128.000 C 144.000 132.418 140.418 136.000 136.000 136.000 L 64.000 136.000 C 59.582 136.000 56.000 132.418 56.000 128.000 C 56.000 123.582 59.582 120.000 64.000 120.000 ZM 104.000 184.000 L 64.000 184.000 C 59.582 184.000 56.000 180.418 56.000 176.000 C 56.000 171.582 59.582 168.000 64.000 168.000 L 104.000 168.000 C 108.418 168.000 112.000 171.582 112.000 176.000 C 112.000 180.418 108.418 184.000 104.000 184.000 ZM 207.590 130.530 C 206.919 132.543 205.476 134.207 203.578 135.156 C 201.680 136.105 199.483 136.261 197.470 135.590 L 184.000 131.100 L 184.000 176.000 C 184.003 186.455 177.238 195.709 167.275 198.878 C 157.312 202.047 146.444 198.402 140.406 189.867 C 134.369 181.331 134.551 169.870 140.858 161.531 C 147.164 153.192 158.143 149.895 168.000 153.380 L 168.000 120.000 C 168.000 117.428 169.236 115.013 171.322 113.510 C 173.408 112.006 176.090 111.597 178.530 112.410 L 202.530 120.410 C 204.543 121.081 206.207 122.524 207.156 124.422 C 208.105 126.320 208.261 128.517 207.590 130.530 Z"),
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
        return _playlist!!
    }

private var _playlist: ImageVector? = null
