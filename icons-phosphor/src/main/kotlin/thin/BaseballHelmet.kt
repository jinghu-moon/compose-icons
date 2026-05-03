package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BaseballHelmet: ImageVector
    get() {
        if (_baseballHelmet != null) return _baseballHelmet!!
        _baseballHelmet = phosphorThinIcon(
            name = "BaseballHelmet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 88.000 132.000 C 74.745 132.000 64.000 142.745 64.000 156.000 C 64.000 169.255 74.745 180.000 88.000 180.000 C 101.255 180.000 112.000 169.255 112.000 156.000 C 112.000 142.745 101.255 132.000 88.000 132.000 ZM 88.000 172.000 C 79.163 172.000 72.000 164.837 72.000 156.000 C 72.000 147.163 79.163 140.000 88.000 140.000 C 96.837 140.000 104.000 147.163 104.000 156.000 C 104.000 164.837 96.837 172.000 88.000 172.000 ZM 248.000 124.000 L 219.920 124.000 C 217.742 69.594 172.438 26.930 118.000 28.019 C 63.561 29.108 20.000 73.551 20.000 128.000 L 20.000 152.000 C 20.039 189.539 50.461 219.961 88.000 220.000 L 128.000 220.000 C 165.539 219.961 195.961 189.539 196.000 152.000 L 196.000 132.000 L 248.000 132.000 C 250.209 132.000 252.000 130.209 252.000 128.000 C 252.000 125.791 250.209 124.000 248.000 124.000 ZM 188.000 152.000 C 187.961 185.121 161.121 211.961 128.000 212.000 L 120.000 212.000 C 142.148 200.170 155.985 177.109 156.000 152.000 L 156.000 132.000 L 188.000 132.000 ZM 152.000 124.000 C 149.791 124.000 148.000 125.791 148.000 128.000 L 148.000 152.000 C 148.000 185.137 121.137 212.000 88.000 212.000 C 54.863 212.000 28.000 185.137 28.000 152.000 L 28.000 128.000 C 28.037 77.996 68.007 37.177 117.999 36.090 C 167.992 35.002 209.699 74.045 211.910 124.000 Z"),
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
        return _baseballHelmet!!
    }

private var _baseballHelmet: ImageVector? = null
