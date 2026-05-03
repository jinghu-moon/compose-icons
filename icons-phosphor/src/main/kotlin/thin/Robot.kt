package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Robot: ImageVector
    get() {
        if (_robot != null) return _robot!!
        _robot = phosphorThinIcon(
            name = "Robot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 52.000 L 132.000 52.000 L 132.000 16.000 C 132.000 13.791 130.209 12.000 128.000 12.000 C 125.791 12.000 124.000 13.791 124.000 16.000 L 124.000 52.000 L 56.000 52.000 C 40.536 52.000 28.000 64.536 28.000 80.000 L 28.000 192.000 C 28.000 207.464 40.536 220.000 56.000 220.000 L 200.000 220.000 C 215.464 220.000 228.000 207.464 228.000 192.000 L 228.000 80.000 C 228.000 64.536 215.464 52.000 200.000 52.000 ZM 220.000 192.000 C 220.000 203.046 211.046 212.000 200.000 212.000 L 56.000 212.000 C 44.954 212.000 36.000 203.046 36.000 192.000 L 36.000 80.000 C 36.000 68.954 44.954 60.000 56.000 60.000 L 200.000 60.000 C 211.046 60.000 220.000 68.954 220.000 80.000 ZM 76.000 108.000 C 76.000 103.582 79.582 100.000 84.000 100.000 C 88.418 100.000 92.000 103.582 92.000 108.000 C 92.000 112.418 88.418 116.000 84.000 116.000 C 79.582 116.000 76.000 112.418 76.000 108.000 ZM 164.000 108.000 C 164.000 103.582 167.582 100.000 172.000 100.000 C 176.418 100.000 180.000 103.582 180.000 108.000 C 180.000 112.418 176.418 116.000 172.000 116.000 C 167.582 116.000 164.000 112.418 164.000 108.000 ZM 164.000 140.000 L 92.000 140.000 C 78.745 140.000 68.000 150.745 68.000 164.000 C 68.000 177.255 78.745 188.000 92.000 188.000 L 164.000 188.000 C 177.255 188.000 188.000 177.255 188.000 164.000 C 188.000 150.745 177.255 140.000 164.000 140.000 ZM 144.000 148.000 L 144.000 180.000 L 112.000 180.000 L 112.000 148.000 ZM 76.000 164.000 C 76.000 155.163 83.163 148.000 92.000 148.000 L 104.000 148.000 L 104.000 180.000 L 92.000 180.000 C 83.163 180.000 76.000 172.837 76.000 164.000 ZM 164.000 180.000 L 152.000 180.000 L 152.000 148.000 L 164.000 148.000 C 172.837 148.000 180.000 155.163 180.000 164.000 C 180.000 172.837 172.837 180.000 164.000 180.000 Z"),
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
        return _robot!!
    }

private var _robot: ImageVector? = null
