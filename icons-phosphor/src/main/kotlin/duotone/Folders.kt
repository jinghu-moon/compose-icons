package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Folders: ImageVector
    get() {
        if (_folders != null) return _folders!!
        _folders = phosphorDuotoneIcon(
            name = "Folders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 232.000 80.000 L 232.000 168.890 C 232.000 172.817 228.817 176.000 224.890 176.000 L 200.000 176.000 L 200.000 112.000 C 200.000 107.582 196.418 104.000 192.000 104.000 L 120.000 104.000 L 90.130 81.600 C 88.745 80.561 87.061 80.000 85.330 80.000 L 64.000 80.000 L 64.000 56.000 C 64.000 51.582 67.582 48.000 72.000 48.000 L 117.330 48.000 C 119.061 48.000 120.745 48.561 122.130 49.600 L 152.000 72.000 L 224.000 72.000 C 228.418 72.000 232.000 75.582 232.000 80.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 224.000 64.000 L 154.670 64.000 L 126.930 43.200 C 124.156 41.131 120.791 40.009 117.330 40.000 L 72.000 40.000 C 63.163 40.000 56.000 47.163 56.000 56.000 L 56.000 72.000 L 40.000 72.000 C 31.163 72.000 24.000 79.163 24.000 88.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 192.890 216.000 C 201.230 215.989 207.989 209.230 208.000 200.890 L 208.000 184.000 L 224.890 184.000 C 233.230 183.989 239.989 177.230 240.000 168.890 L 240.000 80.000 C 240.000 71.163 232.837 64.000 224.000 64.000 ZM 192.000 200.000 L 40.000 200.000 L 40.000 88.000 L 85.330 88.000 L 115.200 110.400 C 116.585 111.439 118.269 112.000 120.000 112.000 L 192.000 112.000 ZM 224.000 168.000 L 208.000 168.000 L 208.000 112.000 C 208.000 103.163 200.837 96.000 192.000 96.000 L 122.670 96.000 L 94.930 75.200 C 92.156 73.131 88.791 72.009 85.330 72.000 L 72.000 72.000 L 72.000 56.000 L 117.330 56.000 L 147.200 78.400 C 148.585 79.439 150.269 80.000 152.000 80.000 L 224.000 80.000 Z"),
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
        return _folders!!
    }

private var _folders: ImageVector? = null
