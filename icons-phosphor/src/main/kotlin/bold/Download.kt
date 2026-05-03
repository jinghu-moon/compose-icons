package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Download: ImageVector
    get() {
        if (_download != null) return _download!!
        _download = phosphorBoldIcon(
            name = "Download",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 71.510 88.490 C 66.816 83.796 66.816 76.184 71.510 71.490 C 76.204 66.796 83.816 66.796 88.510 71.490 L 116.000 99.000 L 116.000 24.000 C 116.000 17.373 121.373 12.000 128.000 12.000 C 134.627 12.000 140.000 17.373 140.000 24.000 L 140.000 99.000 L 167.510 71.480 C 172.204 66.786 179.816 66.786 184.510 71.480 C 189.204 76.174 189.204 83.786 184.510 88.480 L 136.510 136.480 C 134.258 138.739 131.200 140.009 128.010 140.009 C 124.820 140.009 121.762 138.739 119.510 136.480 ZM 224.000 116.000 L 188.000 116.000 C 181.373 116.000 176.000 121.373 176.000 128.000 C 176.000 134.627 181.373 140.000 188.000 140.000 L 220.000 140.000 L 220.000 196.000 L 36.000 196.000 L 36.000 140.000 L 68.000 140.000 C 74.627 140.000 80.000 134.627 80.000 128.000 C 80.000 121.373 74.627 116.000 68.000 116.000 L 32.000 116.000 C 20.954 116.000 12.000 124.954 12.000 136.000 L 12.000 200.000 C 12.000 211.046 20.954 220.000 32.000 220.000 L 224.000 220.000 C 235.046 220.000 244.000 211.046 244.000 200.000 L 244.000 136.000 C 244.000 124.954 235.046 116.000 224.000 116.000 ZM 204.000 168.000 C 204.000 159.163 196.837 152.000 188.000 152.000 C 179.163 152.000 172.000 159.163 172.000 168.000 C 172.000 176.837 179.163 184.000 188.000 184.000 C 196.837 184.000 204.000 176.837 204.000 168.000 Z"),
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
        return _download!!
    }

private var _download: ImageVector? = null
