package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PresentationChart: ImageVector
    get() {
        if (_presentationChart != null) return _presentationChart!!
        _presentationChart = phosphorThinIcon(
            name = "PresentationChart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 44.000 L 132.000 44.000 L 132.000 24.000 C 132.000 21.791 130.209 20.000 128.000 20.000 C 125.791 20.000 124.000 21.791 124.000 24.000 L 124.000 44.000 L 40.000 44.000 C 33.373 44.000 28.000 49.373 28.000 56.000 L 28.000 176.000 C 28.000 182.627 33.373 188.000 40.000 188.000 L 87.680 188.000 L 60.880 221.500 C 59.933 222.609 59.664 224.147 60.180 225.511 C 60.696 226.876 61.913 227.852 63.358 228.057 C 64.802 228.263 66.244 227.666 67.120 226.500 L 97.920 188.000 L 158.080 188.000 L 188.880 226.500 C 190.283 228.143 192.737 228.375 194.423 227.024 C 196.109 225.673 196.418 223.227 195.120 221.500 L 168.320 188.000 L 216.000 188.000 C 222.627 188.000 228.000 182.627 228.000 176.000 L 228.000 56.000 C 228.000 49.373 222.627 44.000 216.000 44.000 ZM 220.000 176.000 C 220.000 178.209 218.209 180.000 216.000 180.000 L 40.000 180.000 C 37.791 180.000 36.000 178.209 36.000 176.000 L 36.000 56.000 C 36.000 53.791 37.791 52.000 40.000 52.000 L 216.000 52.000 C 218.209 52.000 220.000 53.791 220.000 56.000 ZM 100.000 120.000 L 100.000 144.000 C 100.000 146.209 98.209 148.000 96.000 148.000 C 93.791 148.000 92.000 146.209 92.000 144.000 L 92.000 120.000 C 92.000 117.791 93.791 116.000 96.000 116.000 C 98.209 116.000 100.000 117.791 100.000 120.000 ZM 132.000 104.000 L 132.000 144.000 C 132.000 146.209 130.209 148.000 128.000 148.000 C 125.791 148.000 124.000 146.209 124.000 144.000 L 124.000 104.000 C 124.000 101.791 125.791 100.000 128.000 100.000 C 130.209 100.000 132.000 101.791 132.000 104.000 ZM 164.000 88.000 L 164.000 144.000 C 164.000 146.209 162.209 148.000 160.000 148.000 C 157.791 148.000 156.000 146.209 156.000 144.000 L 156.000 88.000 C 156.000 85.791 157.791 84.000 160.000 84.000 C 162.209 84.000 164.000 85.791 164.000 88.000 Z"),
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
        return _presentationChart!!
    }

private var _presentationChart: ImageVector? = null
