package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Cookie: ImageVector
    get() {
        if (_cookie != null) return _cookie!!
        _cookie = phosphorFillIcon(
            name = "Cookie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 120.000 C 201.909 120.000 184.000 102.091 184.000 80.000 C 184.000 75.582 180.418 72.000 176.000 72.000 C 153.909 72.000 136.000 54.091 136.000 32.000 C 136.000 27.582 132.418 24.000 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 232.000 123.582 228.418 120.000 224.000 120.000 ZM 75.510 99.510 C 80.201 94.836 87.791 94.844 92.471 99.530 C 97.150 104.215 97.150 111.805 92.471 116.490 C 87.791 121.176 80.201 121.184 75.510 116.510 C 73.251 114.258 71.981 111.200 71.981 108.010 C 71.981 104.820 73.251 101.762 75.510 99.510 ZM 100.510 172.510 C 95.819 177.184 88.229 177.176 83.549 172.490 C 78.870 167.805 78.870 160.215 83.549 155.530 C 88.229 150.844 95.819 150.836 100.510 155.510 C 102.761 157.763 104.023 160.819 104.019 164.004 C 104.016 167.189 102.746 170.242 100.490 172.490 ZM 123.510 132.510 C 118.836 127.819 118.844 120.229 123.530 115.549 C 128.215 110.870 135.805 110.870 140.490 115.549 C 145.176 120.229 145.184 127.819 140.510 132.510 C 138.256 134.767 135.196 136.033 132.006 136.029 C 128.816 136.026 125.759 134.752 123.510 132.490 ZM 164.510 180.510 C 159.819 185.184 152.229 185.176 147.549 180.490 C 142.870 175.805 142.870 168.215 147.549 163.530 C 152.229 158.844 159.819 158.836 164.510 163.510 C 166.761 165.763 168.023 168.819 168.019 172.004 C 168.016 175.189 166.746 178.242 164.490 180.490 Z"),
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
        return _cookie!!
    }

private var _cookie: ImageVector? = null
