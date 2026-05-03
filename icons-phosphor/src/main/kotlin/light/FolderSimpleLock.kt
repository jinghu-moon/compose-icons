package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FolderSimpleLock: ImageVector
    get() {
        if (_folderSimpleLock != null) return _folderSimpleLock!!
        _folderSimpleLock = phosphorLightIcon(
            name = "FolderSimpleLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 230.000 88.000 L 230.000 104.000 C 230.000 107.314 227.314 110.000 224.000 110.000 C 220.686 110.000 218.000 107.314 218.000 104.000 L 218.000 88.000 C 218.000 86.895 217.105 86.000 216.000 86.000 L 130.670 86.000 C 127.641 86.000 124.693 85.018 122.270 83.200 L 94.530 62.400 C 94.184 62.140 93.763 62.000 93.330 62.000 L 40.000 62.000 C 38.895 62.000 38.000 62.895 38.000 64.000 L 38.000 200.000 C 38.000 201.105 38.895 202.000 40.000 202.000 L 112.000 202.000 C 115.314 202.000 118.000 204.686 118.000 208.000 C 118.000 211.314 115.314 214.000 112.000 214.000 L 40.000 214.000 C 32.268 214.000 26.000 207.732 26.000 200.000 L 26.000 64.000 C 26.000 56.268 32.268 50.000 40.000 50.000 L 93.330 50.000 C 96.359 50.000 99.307 50.982 101.730 52.800 L 129.470 73.600 C 129.816 73.860 130.237 74.000 130.670 74.000 L 216.000 74.000 C 223.732 74.000 230.000 80.268 230.000 88.000 ZM 230.000 168.000 L 230.000 208.000 C 230.000 211.314 227.314 214.000 224.000 214.000 L 152.000 214.000 C 148.686 214.000 146.000 211.314 146.000 208.000 L 146.000 168.000 C 146.000 164.686 148.686 162.000 152.000 162.000 L 162.000 162.000 L 162.000 156.000 C 162.000 141.641 173.641 130.000 188.000 130.000 C 202.359 130.000 214.000 141.641 214.000 156.000 L 214.000 162.000 L 224.000 162.000 C 227.314 162.000 230.000 164.686 230.000 168.000 ZM 174.000 162.000 L 202.000 162.000 L 202.000 156.000 C 202.000 148.268 195.732 142.000 188.000 142.000 C 180.268 142.000 174.000 148.268 174.000 156.000 ZM 218.000 174.000 L 158.000 174.000 L 158.000 202.000 L 218.000 202.000 Z"),
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
        return _folderSimpleLock!!
    }

private var _folderSimpleLock: ImageVector? = null
