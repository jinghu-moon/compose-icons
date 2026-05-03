package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FolderLock: ImageVector
    get() {
        if (_folderLock != null) return _folderLock!!
        _folderLock = phosphorLightIcon(
            name = "FolderLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 162.000 L 214.000 162.000 L 214.000 156.000 C 214.000 141.641 202.359 130.000 188.000 130.000 C 173.641 130.000 162.000 141.641 162.000 156.000 L 162.000 162.000 L 152.000 162.000 C 148.686 162.000 146.000 164.686 146.000 168.000 L 146.000 208.000 C 146.000 211.314 148.686 214.000 152.000 214.000 L 224.000 214.000 C 227.314 214.000 230.000 211.314 230.000 208.000 L 230.000 168.000 C 230.000 164.686 227.314 162.000 224.000 162.000 ZM 174.000 156.000 C 174.000 148.268 180.268 142.000 188.000 142.000 C 195.732 142.000 202.000 148.268 202.000 156.000 L 202.000 162.000 L 174.000 162.000 ZM 218.000 202.000 L 158.000 202.000 L 158.000 174.000 L 218.000 174.000 ZM 216.000 74.000 L 130.490 74.000 L 102.590 46.100 C 99.968 43.469 96.404 41.993 92.690 42.000 L 40.000 42.000 C 32.268 42.000 26.000 48.268 26.000 56.000 L 26.000 200.620 C 26.006 208.007 31.993 213.994 39.380 214.000 L 112.560 214.000 C 115.874 214.000 118.560 211.314 118.560 208.000 C 118.560 204.686 115.874 202.000 112.560 202.000 L 39.380 202.000 C 38.622 201.989 38.011 201.378 38.000 200.620 L 38.000 86.000 L 216.000 86.000 C 217.105 86.000 218.000 86.895 218.000 88.000 L 218.000 104.000 C 218.000 107.314 220.686 110.000 224.000 110.000 C 227.314 110.000 230.000 107.314 230.000 104.000 L 230.000 88.000 C 230.000 80.268 223.732 74.000 216.000 74.000 ZM 40.000 54.000 L 92.690 54.000 C 93.220 54.002 93.727 54.214 94.100 54.590 L 113.510 74.000 L 38.000 74.000 L 38.000 56.000 C 38.000 54.895 38.895 54.000 40.000 54.000 Z"),
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
        return _folderLock!!
    }

private var _folderLock: ImageVector? = null
