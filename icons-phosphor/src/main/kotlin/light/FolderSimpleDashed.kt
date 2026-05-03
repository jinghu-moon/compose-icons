package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FolderSimpleDashed: ImageVector
    get() {
        if (_folderSimpleDashed != null) return _folderSimpleDashed!!
        _folderSimpleDashed = phosphorLightIcon(
            name = "FolderSimpleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 124.400 84.800 L 94.530 62.400 C 94.184 62.140 93.763 62.000 93.330 62.000 L 40.000 62.000 C 38.895 62.000 38.000 62.895 38.000 64.000 L 38.000 80.000 C 38.000 83.314 35.314 86.000 32.000 86.000 C 28.686 86.000 26.000 83.314 26.000 80.000 L 26.000 64.000 C 26.000 56.268 32.268 50.000 40.000 50.000 L 93.330 50.000 C 96.359 50.000 99.307 50.982 101.730 52.800 L 131.600 75.200 C 134.251 77.188 134.788 80.949 132.800 83.600 C 130.812 86.251 127.051 86.788 124.400 84.800 ZM 88.000 202.000 L 39.380 202.000 C 38.622 201.989 38.011 201.378 38.000 200.620 L 38.000 192.000 C 38.000 188.686 35.314 186.000 32.000 186.000 C 28.686 186.000 26.000 188.686 26.000 192.000 L 26.000 200.620 C 26.006 208.007 31.993 213.994 39.380 214.000 L 88.000 214.000 C 91.314 214.000 94.000 211.314 94.000 208.000 C 94.000 204.686 91.314 202.000 88.000 202.000 ZM 160.000 202.000 L 128.000 202.000 C 124.686 202.000 122.000 204.686 122.000 208.000 C 122.000 211.314 124.686 214.000 128.000 214.000 L 160.000 214.000 C 163.314 214.000 166.000 211.314 166.000 208.000 C 166.000 204.686 163.314 202.000 160.000 202.000 ZM 224.000 146.000 C 220.686 146.000 218.000 148.686 218.000 152.000 L 218.000 200.890 C 218.000 201.503 217.503 202.000 216.890 202.000 L 200.000 202.000 C 196.686 202.000 194.000 204.686 194.000 208.000 C 194.000 211.314 196.686 214.000 200.000 214.000 L 216.890 214.000 C 224.128 213.994 229.994 208.128 230.000 200.890 L 230.000 152.000 C 230.000 148.686 227.314 146.000 224.000 146.000 ZM 216.000 74.000 L 168.000 74.000 C 164.686 74.000 162.000 76.686 162.000 80.000 C 162.000 83.314 164.686 86.000 168.000 86.000 L 216.000 86.000 C 217.105 86.000 218.000 86.895 218.000 88.000 L 218.000 112.000 C 218.000 115.314 220.686 118.000 224.000 118.000 C 227.314 118.000 230.000 115.314 230.000 112.000 L 230.000 88.000 C 230.000 80.268 223.732 74.000 216.000 74.000 ZM 32.000 158.000 C 35.314 158.000 38.000 155.314 38.000 152.000 L 38.000 120.000 C 38.000 116.686 35.314 114.000 32.000 114.000 C 28.686 114.000 26.000 116.686 26.000 120.000 L 26.000 152.000 C 26.000 155.314 28.686 158.000 32.000 158.000 Z"),
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
        return _folderSimpleDashed!!
    }

private var _folderSimpleDashed: ImageVector? = null
