package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Folders: ImageVector
    get() {
        if (_folders != null) return _folders!!
        _folders = phosphorLightIcon(
            name = "Folders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 66.000 L 154.000 66.000 L 125.730 44.800 C 123.307 42.982 120.359 42.000 117.330 42.000 L 72.000 42.000 C 64.268 42.000 58.000 48.268 58.000 56.000 L 58.000 74.000 L 40.000 74.000 C 32.268 74.000 26.000 80.268 26.000 88.000 L 26.000 200.000 C 26.000 207.732 32.268 214.000 40.000 214.000 L 192.890 214.000 C 200.128 213.994 205.994 208.128 206.000 200.890 L 206.000 182.000 L 224.890 182.000 C 232.128 181.994 237.994 176.128 238.000 168.890 L 238.000 80.000 C 238.000 72.268 231.732 66.000 224.000 66.000 ZM 194.000 200.890 C 194.000 201.503 193.503 202.000 192.890 202.000 L 40.000 202.000 C 38.895 202.000 38.000 201.105 38.000 200.000 L 38.000 88.000 C 38.000 86.895 38.895 86.000 40.000 86.000 L 85.330 86.000 C 85.763 86.000 86.184 86.140 86.530 86.400 L 116.400 108.800 C 117.439 109.579 118.702 110.000 120.000 110.000 L 192.000 110.000 C 193.105 110.000 194.000 110.895 194.000 112.000 ZM 226.000 168.890 C 226.000 169.503 225.503 170.000 224.890 170.000 L 206.000 170.000 L 206.000 112.000 C 206.000 104.268 199.732 98.000 192.000 98.000 L 122.000 98.000 L 93.730 76.800 C 91.307 74.982 88.359 74.000 85.330 74.000 L 70.000 74.000 L 70.000 56.000 C 70.000 54.895 70.895 54.000 72.000 54.000 L 117.330 54.000 C 117.763 54.000 118.184 54.140 118.530 54.400 L 148.400 76.800 C 149.439 77.579 150.702 78.000 152.000 78.000 L 224.000 78.000 C 225.105 78.000 226.000 78.895 226.000 80.000 Z"),
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
        return _folders!!
    }

private var _folders: ImageVector? = null
