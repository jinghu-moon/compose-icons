package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileZip: ImageVector
    get() {
        if (_fileZip != null) return _fileZip!!
        _fileZip = phosphorBoldIcon(
            name = "FileZip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 188.000 140.000 L 172.000 140.000 C 165.373 140.000 160.000 145.373 160.000 152.000 L 160.000 208.000 C 160.000 214.627 165.373 220.000 172.000 220.000 C 178.627 220.000 184.000 214.627 184.000 208.000 L 184.000 204.000 L 188.000 204.000 C 205.673 204.000 220.000 189.673 220.000 172.000 C 220.000 154.327 205.673 140.000 188.000 140.000 ZM 188.000 180.000 L 184.000 180.000 L 184.000 164.000 L 188.000 164.000 C 192.418 164.000 196.000 167.582 196.000 172.000 C 196.000 176.418 192.418 180.000 188.000 180.000 ZM 140.000 152.000 L 140.000 208.000 C 140.000 214.627 134.627 220.000 128.000 220.000 C 121.373 220.000 116.000 214.627 116.000 208.000 L 116.000 152.000 C 116.000 145.373 121.373 140.000 128.000 140.000 C 134.627 140.000 140.000 145.373 140.000 152.000 ZM 96.000 208.000 C 96.000 214.627 90.627 220.000 84.000 220.000 L 52.000 220.000 C 47.723 220.000 43.770 217.723 41.623 214.025 C 39.476 210.326 39.459 205.764 41.580 202.050 L 63.320 164.000 L 52.000 164.000 C 45.373 164.000 40.000 158.627 40.000 152.000 C 40.000 145.373 45.373 140.000 52.000 140.000 L 84.000 140.000 C 88.292 139.990 92.263 142.273 94.413 145.988 C 96.563 149.703 96.566 154.283 94.420 158.000 L 72.680 196.000 L 84.000 196.000 C 90.627 196.000 96.000 201.373 96.000 208.000 ZM 216.490 79.520 L 160.490 23.520 C 158.239 21.266 155.185 20.000 152.000 20.000 L 56.000 20.000 C 44.954 20.000 36.000 28.954 36.000 40.000 L 36.000 108.000 C 36.000 114.627 41.373 120.000 48.000 120.000 C 54.627 120.000 60.000 114.627 60.000 108.000 L 60.000 44.000 L 136.000 44.000 L 136.000 92.000 C 136.000 98.627 141.373 104.000 148.000 104.000 L 196.000 104.000 L 196.000 108.000 C 196.000 114.627 201.373 120.000 208.000 120.000 C 214.627 120.000 220.000 114.627 220.000 108.000 L 220.000 88.000 C 220.000 84.820 218.737 81.770 216.490 79.520 ZM 160.000 80.000 L 160.000 57.000 L 183.000 80.000 Z"),
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
        return _fileZip!!
    }

private var _fileZip: ImageVector? = null
