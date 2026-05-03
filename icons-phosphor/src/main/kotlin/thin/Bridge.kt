package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bridge: ImageVector
    get() {
        if (_bridge != null) return _bridge!!
        _bridge = phosphorThinIcon(
            name = "Bridge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 164.000 L 196.000 164.000 L 196.000 88.090 C 203.499 102.157 215.714 113.133 230.500 119.090 C 232.549 119.918 234.882 118.929 235.710 116.880 C 236.538 114.831 235.549 112.498 233.500 111.670 C 210.777 102.547 195.917 80.486 196.000 56.000 C 196.000 53.791 194.209 52.000 192.000 52.000 C 189.791 52.000 188.000 53.791 188.000 56.000 C 188.000 89.137 161.137 116.000 128.000 116.000 C 94.863 116.000 68.000 89.137 68.000 56.000 C 68.000 53.791 66.209 52.000 64.000 52.000 C 61.791 52.000 60.000 53.791 60.000 56.000 C 60.071 80.475 45.213 102.521 22.500 111.640 C 20.451 112.468 19.462 114.801 20.290 116.850 C 21.118 118.899 23.451 119.888 25.500 119.060 C 40.286 113.103 52.501 102.127 60.000 88.060 L 60.000 164.000 L 24.000 164.000 C 21.791 164.000 20.000 165.791 20.000 168.000 C 20.000 170.209 21.791 172.000 24.000 172.000 L 60.000 172.000 L 60.000 200.000 C 60.000 202.209 61.791 204.000 64.000 204.000 C 66.209 204.000 68.000 202.209 68.000 200.000 L 68.000 172.000 L 188.000 172.000 L 188.000 200.000 C 188.000 202.209 189.791 204.000 192.000 204.000 C 194.209 204.000 196.000 202.209 196.000 200.000 L 196.000 172.000 L 232.000 172.000 C 234.209 172.000 236.000 170.209 236.000 168.000 C 236.000 165.791 234.209 164.000 232.000 164.000 ZM 148.000 121.000 L 148.000 164.000 L 108.000 164.000 L 108.000 121.000 C 121.032 125.010 134.968 125.010 148.000 121.000 ZM 68.000 88.000 C 75.086 101.240 86.330 111.782 100.000 118.000 L 100.000 164.000 L 68.000 164.000 ZM 156.000 164.000 L 156.000 118.000 C 169.670 111.782 180.914 101.240 188.000 88.000 L 188.000 164.000 Z"),
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
        return _bridge!!
    }

private var _bridge: ImageVector? = null
