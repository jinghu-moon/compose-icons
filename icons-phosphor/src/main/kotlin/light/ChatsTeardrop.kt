package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatsTeardrop: ImageVector
    get() {
        if (_chatsTeardrop != null) return _chatsTeardrop!!
        _chatsTeardrop = phosphorLightIcon(
            name = "ChatsTeardrop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 168.160 74.420 C 154.016 39.956 117.476 20.304 80.924 27.504 C 44.373 34.704 18.016 66.746 18.000 104.000 L 18.000 168.000 C 18.000 175.732 24.268 182.000 32.000 182.000 L 88.000 182.000 C 100.143 211.040 128.524 229.960 160.000 230.000 L 224.000 230.000 C 231.732 230.000 238.000 223.732 238.000 216.000 L 238.000 152.000 C 238.004 112.078 207.863 78.596 168.160 74.420 ZM 30.000 168.000 L 30.000 104.000 C 30.000 67.549 59.549 38.000 96.000 38.000 C 132.451 38.000 162.000 67.549 162.000 104.000 C 162.000 140.451 132.451 170.000 96.000 170.000 L 32.000 170.000 C 30.895 170.000 30.000 169.105 30.000 168.000 ZM 226.000 216.000 C 226.000 217.105 225.105 218.000 224.000 218.000 L 160.000 218.000 C 135.126 217.972 112.372 203.989 101.110 181.810 C 123.815 180.333 144.739 169.005 158.389 150.802 C 172.040 132.599 177.052 109.339 172.110 87.130 C 203.347 92.961 225.995 120.223 226.000 152.000 Z"),
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
        return _chatsTeardrop!!
    }

private var _chatsTeardrop: ImageVector? = null
