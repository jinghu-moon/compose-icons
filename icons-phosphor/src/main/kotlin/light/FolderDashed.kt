package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FolderDashed: ImageVector
    get() {
        if (_folderDashed != null) return _folderDashed!!
        _folderDashed = phosphorLightIcon(
            name = "FolderDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 94.000 208.000 C 94.000 211.314 91.314 214.000 88.000 214.000 L 39.380 214.000 C 31.993 213.994 26.006 208.007 26.000 200.620 L 26.000 192.000 C 26.000 188.686 28.686 186.000 32.000 186.000 C 35.314 186.000 38.000 188.686 38.000 192.000 L 38.000 200.620 C 38.011 201.378 38.622 201.989 39.380 202.000 L 88.000 202.000 C 91.314 202.000 94.000 204.686 94.000 208.000 ZM 160.000 202.000 L 128.000 202.000 C 124.686 202.000 122.000 204.686 122.000 208.000 C 122.000 211.314 124.686 214.000 128.000 214.000 L 160.000 214.000 C 163.314 214.000 166.000 211.314 166.000 208.000 C 166.000 204.686 163.314 202.000 160.000 202.000 ZM 224.000 146.000 C 220.686 146.000 218.000 148.686 218.000 152.000 L 218.000 200.890 C 218.000 201.503 217.503 202.000 216.890 202.000 L 200.000 202.000 C 196.686 202.000 194.000 204.686 194.000 208.000 C 194.000 211.314 196.686 214.000 200.000 214.000 L 216.890 214.000 C 224.128 213.994 229.994 208.128 230.000 200.890 L 230.000 152.000 C 230.000 148.686 227.314 146.000 224.000 146.000 ZM 216.000 74.000 L 168.000 74.000 C 164.686 74.000 162.000 76.686 162.000 80.000 C 162.000 83.314 164.686 86.000 168.000 86.000 L 216.000 86.000 C 217.105 86.000 218.000 86.895 218.000 88.000 L 218.000 112.000 C 218.000 115.314 220.686 118.000 224.000 118.000 C 227.314 118.000 230.000 115.314 230.000 112.000 L 230.000 88.000 C 230.000 80.268 223.732 74.000 216.000 74.000 ZM 26.000 80.000 L 26.000 56.000 C 26.000 48.268 32.268 42.000 40.000 42.000 L 92.690 42.000 C 96.404 41.993 99.968 43.469 102.590 46.100 L 132.240 75.760 C 133.954 77.476 134.466 80.055 133.538 82.295 C 132.611 84.536 130.425 85.998 128.000 86.000 L 32.000 86.000 C 28.686 86.000 26.000 83.314 26.000 80.000 ZM 38.000 74.000 L 113.510 74.000 L 94.100 54.590 C 93.727 54.214 93.220 54.002 92.690 54.000 L 40.000 54.000 C 38.895 54.000 38.000 54.895 38.000 56.000 ZM 32.000 158.000 C 35.314 158.000 38.000 155.314 38.000 152.000 L 38.000 120.000 C 38.000 116.686 35.314 114.000 32.000 114.000 C 28.686 114.000 26.000 116.686 26.000 120.000 L 26.000 152.000 C 26.000 155.314 28.686 158.000 32.000 158.000 Z"),
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
        return _folderDashed!!
    }

private var _folderDashed: ImageVector? = null
