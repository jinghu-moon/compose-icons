package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MouseRightClick: ImageVector
    get() {
        if (_mouseRightClick != null) return _mouseRightClick!!
        _mouseRightClick = phosphorThinIcon(
            name = "MouseRightClick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 144.000 20.000 L 112.000 20.000 C 78.879 20.039 52.039 46.879 52.000 80.000 L 52.000 176.000 C 52.039 209.121 78.879 235.961 112.000 236.000 L 144.000 236.000 C 177.121 235.961 203.961 209.121 204.000 176.000 L 204.000 80.000 C 203.961 46.879 177.121 20.039 144.000 20.000 ZM 196.000 80.000 L 196.000 108.000 L 153.660 108.000 L 194.410 67.250 C 195.470 71.417 196.004 75.700 196.000 80.000 ZM 191.490 58.850 L 142.340 108.000 L 132.000 108.000 L 132.000 81.660 L 175.220 38.440 C 182.275 43.765 187.871 50.785 191.490 58.850 ZM 168.300 34.050 L 132.000 70.340 L 132.000 28.000 L 144.000 28.000 C 152.474 27.991 160.820 30.069 168.300 34.050 ZM 112.000 28.000 L 124.000 28.000 L 124.000 108.000 L 60.000 108.000 L 60.000 80.000 C 60.033 51.295 83.295 28.033 112.000 28.000 ZM 144.000 228.000 L 112.000 228.000 C 83.295 227.967 60.033 204.705 60.000 176.000 L 60.000 116.000 L 196.000 116.000 L 196.000 176.000 C 195.967 204.705 172.705 227.967 144.000 228.000 Z"),
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
        return _mouseRightClick!!
    }

private var _mouseRightClick: ImageVector? = null
