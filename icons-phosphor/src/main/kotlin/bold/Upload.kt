package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Upload: ImageVector
    get() {
        if (_upload != null) return _upload!!
        _upload = phosphorBoldIcon(
            name = "Upload",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 188.000 184.000 C 179.163 184.000 172.000 176.837 172.000 168.000 C 172.000 159.163 179.163 152.000 188.000 152.000 C 196.837 152.000 204.000 159.163 204.000 168.000 C 204.000 176.837 196.837 184.000 188.000 184.000 ZM 224.000 116.000 L 180.000 116.000 C 173.373 116.000 168.000 121.373 168.000 128.000 C 168.000 134.627 173.373 140.000 180.000 140.000 L 220.000 140.000 L 220.000 196.000 L 36.000 196.000 L 36.000 140.000 L 76.000 140.000 C 82.627 140.000 88.000 134.627 88.000 128.000 C 88.000 121.373 82.627 116.000 76.000 116.000 L 32.000 116.000 C 20.954 116.000 12.000 124.954 12.000 136.000 L 12.000 200.000 C 12.000 211.046 20.954 220.000 32.000 220.000 L 224.000 220.000 C 235.046 220.000 244.000 211.046 244.000 200.000 L 244.000 136.000 C 244.000 124.954 235.046 116.000 224.000 116.000 ZM 88.490 80.490 L 116.000 53.000 L 116.000 128.000 C 116.000 134.627 121.373 140.000 128.000 140.000 C 134.627 140.000 140.000 134.627 140.000 128.000 L 140.000 53.000 L 167.510 80.520 C 172.204 85.214 179.816 85.214 184.510 80.520 C 189.204 75.826 189.204 68.214 184.510 63.520 L 136.510 15.520 C 134.258 13.261 131.200 11.991 128.010 11.991 C 124.820 11.991 121.762 13.261 119.510 15.520 L 71.510 63.520 C 66.816 68.214 66.816 75.826 71.510 80.520 C 76.204 85.214 83.816 85.214 88.510 80.520 Z"),
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
        return _upload!!
    }

private var _upload: ImageVector? = null
