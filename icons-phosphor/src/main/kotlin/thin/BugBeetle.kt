package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BugBeetle: ImageVector
    get() {
        if (_bugBeetle != null) return _bugBeetle!!
        _bugBeetle = phosphorThinIcon(
            name = "BugBeetle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 204.000 148.000 L 224.000 148.000 C 226.209 148.000 228.000 146.209 228.000 144.000 C 228.000 141.791 226.209 140.000 224.000 140.000 L 204.000 140.000 L 204.000 116.000 L 224.000 116.000 C 226.209 116.000 228.000 114.209 228.000 112.000 C 228.000 109.791 226.209 108.000 224.000 108.000 L 203.890 108.000 C 202.874 88.686 194.513 70.491 180.520 57.140 L 202.830 34.830 C 204.393 33.267 204.393 30.733 202.830 29.170 C 201.267 27.607 198.733 27.607 197.170 29.170 L 174.440 51.900 C 147.109 30.700 108.891 30.700 81.560 51.900 L 58.830 29.170 C 57.267 27.607 54.733 27.607 53.170 29.170 C 51.607 30.733 51.607 33.267 53.170 34.830 L 75.480 57.140 C 61.487 70.491 53.126 88.686 52.110 108.000 L 32.000 108.000 C 29.791 108.000 28.000 109.791 28.000 112.000 C 28.000 114.209 29.791 116.000 32.000 116.000 L 52.000 116.000 L 52.000 140.000 L 32.000 140.000 C 29.791 140.000 28.000 141.791 28.000 144.000 C 28.000 146.209 29.791 148.000 32.000 148.000 L 52.000 148.000 L 52.000 160.000 C 52.013 164.020 52.347 168.033 53.000 172.000 L 32.000 172.000 C 29.791 172.000 28.000 173.791 28.000 176.000 C 28.000 178.209 29.791 180.000 32.000 180.000 L 54.690 180.000 C 63.723 213.043 93.745 235.959 128.000 235.959 C 162.255 235.959 192.277 213.043 201.310 180.000 L 224.000 180.000 C 226.209 180.000 228.000 178.209 228.000 176.000 C 228.000 173.791 226.209 172.000 224.000 172.000 L 203.000 172.000 C 203.653 168.033 203.987 164.020 204.000 160.000 ZM 128.000 44.000 C 163.981 44.046 193.714 72.083 195.870 108.000 L 60.130 108.000 C 62.286 72.083 92.019 44.046 128.000 44.000 ZM 132.000 227.870 L 132.000 144.000 C 132.000 141.791 130.209 140.000 128.000 140.000 C 125.791 140.000 124.000 141.791 124.000 144.000 L 124.000 227.870 C 88.083 225.714 60.046 195.981 60.000 160.000 L 60.000 116.000 L 196.000 116.000 L 196.000 160.000 C 195.954 195.981 167.917 225.714 132.000 227.870 Z"),
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
        return _bugBeetle!!
    }

private var _bugBeetle: ImageVector? = null
