package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BehanceLogo: ImageVector
    get() {
        if (_behanceLogo != null) return _behanceLogo!!
        _behanceLogo = phosphorFillIcon(
            name = "BehanceLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 92.000 120.000 L 64.000 120.000 L 64.000 96.000 L 92.000 96.000 C 98.627 96.000 104.000 101.373 104.000 108.000 C 104.000 114.627 98.627 120.000 92.000 120.000 ZM 96.000 136.000 L 64.000 136.000 L 64.000 168.000 L 96.000 168.000 C 104.837 168.000 112.000 160.837 112.000 152.000 C 112.000 143.163 104.837 136.000 96.000 136.000 ZM 176.000 120.000 C 165.832 120.003 156.769 126.413 153.380 136.000 L 198.620 136.000 C 195.231 126.413 186.168 120.003 176.000 120.000 ZM 240.000 56.000 L 240.000 200.000 C 240.000 208.837 232.837 216.000 224.000 216.000 L 32.000 216.000 C 23.163 216.000 16.000 208.837 16.000 200.000 L 16.000 56.000 C 16.000 47.163 23.163 40.000 32.000 40.000 L 224.000 40.000 C 232.837 40.000 240.000 47.163 240.000 56.000 ZM 144.000 88.000 C 144.000 92.418 147.582 96.000 152.000 96.000 L 200.000 96.000 C 204.418 96.000 208.000 92.418 208.000 88.000 C 208.000 83.582 204.418 80.000 200.000 80.000 L 152.000 80.000 C 147.582 80.000 144.000 83.582 144.000 88.000 ZM 128.000 152.000 C 127.995 141.357 122.699 131.413 113.870 125.470 C 120.581 117.064 121.884 105.557 117.222 95.864 C 112.559 86.170 102.756 80.004 92.000 80.000 L 56.000 80.000 C 51.582 80.000 48.000 83.582 48.000 88.000 L 48.000 176.000 C 48.000 180.418 51.582 184.000 56.000 184.000 L 96.000 184.000 C 113.673 184.000 128.000 169.673 128.000 152.000 ZM 216.000 144.000 C 215.999 125.152 202.841 108.862 184.415 104.897 C 165.989 100.932 147.295 110.368 139.541 127.547 C 131.788 144.726 137.079 164.987 152.242 176.182 C 167.405 187.377 188.325 186.468 202.460 174.000 C 205.774 171.076 206.089 166.019 203.165 162.705 C 200.241 159.391 195.184 159.076 191.870 162.000 C 185.890 167.269 177.684 169.225 169.970 167.221 C 162.255 165.217 156.039 159.514 153.380 152.000 L 208.000 152.000 C 212.418 152.000 216.000 148.418 216.000 144.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _behanceLogo!!
    }

private var _behanceLogo: ImageVector? = null
