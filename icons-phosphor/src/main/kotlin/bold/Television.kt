package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Television: ImageVector
    get() {
        if (_television != null) return _television!!
        _television = phosphorBoldIcon(
            name = "Television",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 60.000 L 157.000 60.000 L 184.520 32.480 C 189.214 27.786 189.214 20.174 184.520 15.480 C 179.826 10.786 172.214 10.786 167.520 15.480 L 128.000 55.000 L 88.490 15.510 C 83.796 10.816 76.184 10.816 71.490 15.510 C 66.796 20.204 66.796 27.816 71.490 32.510 L 99.000 60.000 L 40.000 60.000 C 28.954 60.000 20.000 68.954 20.000 80.000 L 20.000 200.000 C 20.000 211.046 28.954 220.000 40.000 220.000 L 216.000 220.000 C 227.046 220.000 236.000 211.046 236.000 200.000 L 236.000 80.000 C 236.000 68.954 227.046 60.000 216.000 60.000 ZM 44.000 84.000 L 128.000 84.000 L 128.000 196.000 L 44.000 196.000 ZM 212.000 196.000 L 152.000 196.000 L 152.000 84.000 L 212.000 84.000 ZM 168.000 116.000 C 168.000 107.163 175.163 100.000 184.000 100.000 C 192.837 100.000 200.000 107.163 200.000 116.000 C 200.000 124.837 192.837 132.000 184.000 132.000 C 175.163 132.000 168.000 124.837 168.000 116.000 ZM 200.000 164.000 C 200.000 172.837 192.837 180.000 184.000 180.000 C 175.163 180.000 168.000 172.837 168.000 164.000 C 168.000 155.163 175.163 148.000 184.000 148.000 C 192.837 148.000 200.000 155.163 200.000 164.000 Z"),
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
        return _television!!
    }

private var _television: ImageVector? = null
