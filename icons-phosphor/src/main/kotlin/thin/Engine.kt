package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Engine: ImageVector
    get() {
        if (_engine != null) return _engine!!
        _engine = phosphorThinIcon(
            name = "Engine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 108.000 L 225.660 108.000 L 189.170 71.510 C 186.924 69.256 183.872 67.992 180.690 68.000 L 136.000 68.000 L 136.000 36.000 L 164.000 36.000 C 166.209 36.000 168.000 34.209 168.000 32.000 C 168.000 29.791 166.209 28.000 164.000 28.000 L 100.000 28.000 C 97.791 28.000 96.000 29.791 96.000 32.000 C 96.000 34.209 97.791 36.000 100.000 36.000 L 128.000 36.000 L 128.000 68.000 L 64.000 68.000 C 57.373 68.000 52.000 73.373 52.000 80.000 L 52.000 136.000 L 20.000 136.000 L 20.000 108.000 C 20.000 105.791 18.209 104.000 16.000 104.000 C 13.791 104.000 12.000 105.791 12.000 108.000 L 12.000 172.000 C 12.000 174.209 13.791 176.000 16.000 176.000 C 18.209 176.000 20.000 174.209 20.000 172.000 L 20.000 144.000 L 52.000 144.000 L 52.000 168.690 C 51.992 171.872 53.256 174.924 55.510 177.170 L 94.830 216.490 C 97.076 218.744 100.128 220.008 103.310 220.000 L 180.690 220.000 C 183.872 220.008 186.924 218.744 189.170 216.490 L 225.660 180.000 L 240.000 180.000 C 246.627 180.000 252.000 174.627 252.000 168.000 L 252.000 120.000 C 252.000 113.373 246.627 108.000 240.000 108.000 ZM 244.000 168.000 C 244.000 170.209 242.209 172.000 240.000 172.000 L 224.000 172.000 C 222.939 171.999 221.921 172.420 221.170 173.170 L 183.510 210.830 C 182.762 211.578 181.748 211.998 180.690 212.000 L 103.310 212.000 C 102.252 211.998 101.238 211.578 100.490 210.830 L 61.170 171.510 C 60.422 170.762 60.002 169.748 60.000 168.690 L 60.000 80.000 C 60.000 77.791 61.791 76.000 64.000 76.000 L 180.690 76.000 C 181.748 76.002 182.762 76.422 183.510 77.170 L 221.170 114.830 C 221.921 115.580 222.939 116.001 224.000 116.000 L 240.000 116.000 C 242.209 116.000 244.000 117.791 244.000 120.000 Z"),
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
        return _engine!!
    }

private var _engine: ImageVector? = null
