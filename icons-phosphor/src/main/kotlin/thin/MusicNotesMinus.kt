package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MusicNotesMinus: ImageVector
    get() {
        if (_musicNotesMinus != null) return _musicNotesMinus!!
        _musicNotesMinus = phosphorThinIcon(
            name = "MusicNotesMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.000 48.000 C 228.000 50.209 226.209 52.000 224.000 52.000 L 176.000 52.000 C 173.791 52.000 172.000 50.209 172.000 48.000 C 172.000 45.791 173.791 44.000 176.000 44.000 L 224.000 44.000 C 226.209 44.000 228.000 45.791 228.000 48.000 ZM 212.000 88.000 L 212.000 164.000 C 212.028 179.492 200.975 192.788 185.739 195.590 C 170.503 198.392 155.442 189.899 149.957 175.411 C 144.472 160.922 150.131 144.584 163.402 136.593 C 176.674 128.602 193.761 131.244 204.000 142.870 L 204.000 88.000 C 204.000 85.791 205.791 84.000 208.000 84.000 C 210.209 84.000 212.000 85.791 212.000 88.000 ZM 204.000 164.000 C 204.000 150.745 193.255 140.000 180.000 140.000 C 166.745 140.000 156.000 150.745 156.000 164.000 C 156.000 177.255 166.745 188.000 180.000 188.000 C 193.255 188.000 204.000 177.255 204.000 164.000 ZM 84.000 107.120 L 84.000 196.000 C 84.028 211.492 72.975 224.788 57.739 227.590 C 42.503 230.392 27.442 221.899 21.957 207.411 C 16.472 192.922 22.131 176.584 35.402 168.593 C 48.674 160.602 65.761 163.244 76.000 174.870 L 76.000 56.000 C 75.997 54.173 77.231 52.577 79.000 52.120 L 135.000 38.120 C 137.143 37.568 139.328 38.857 139.880 41.000 C 140.432 43.143 139.143 45.328 137.000 45.880 L 84.000 59.120 L 84.000 98.880 L 159.000 80.120 C 161.143 79.568 163.328 80.857 163.880 83.000 C 164.432 85.143 163.143 87.328 161.000 87.880 ZM 76.000 196.000 C 76.000 182.745 65.255 172.000 52.000 172.000 C 38.745 172.000 28.000 182.745 28.000 196.000 C 28.000 209.255 38.745 220.000 52.000 220.000 C 65.255 220.000 76.000 209.255 76.000 196.000 Z"),
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
        return _musicNotesMinus!!
    }

private var _musicNotesMinus: ImageVector? = null
