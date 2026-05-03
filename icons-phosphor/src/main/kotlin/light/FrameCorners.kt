package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FrameCorners: ImageVector
    get() {
        if (_frameCorners != null) return _frameCorners!!
        _frameCorners = phosphorLightIcon(
            name = "FrameCorners",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 198.000 80.000 L 198.000 112.000 C 198.000 115.314 195.314 118.000 192.000 118.000 C 188.686 118.000 186.000 115.314 186.000 112.000 L 186.000 86.000 L 160.000 86.000 C 156.686 86.000 154.000 83.314 154.000 80.000 C 154.000 76.686 156.686 74.000 160.000 74.000 L 192.000 74.000 C 195.314 74.000 198.000 76.686 198.000 80.000 ZM 96.000 170.000 L 70.000 170.000 L 70.000 144.000 C 70.000 140.686 67.314 138.000 64.000 138.000 C 60.686 138.000 58.000 140.686 58.000 144.000 L 58.000 176.000 C 58.000 179.314 60.686 182.000 64.000 182.000 L 96.000 182.000 C 99.314 182.000 102.000 179.314 102.000 176.000 C 102.000 172.686 99.314 170.000 96.000 170.000 ZM 230.000 56.000 L 230.000 200.000 C 230.000 207.732 223.732 214.000 216.000 214.000 L 40.000 214.000 C 32.268 214.000 26.000 207.732 26.000 200.000 L 26.000 56.000 C 26.000 48.268 32.268 42.000 40.000 42.000 L 216.000 42.000 C 223.732 42.000 230.000 48.268 230.000 56.000 ZM 218.000 56.000 C 218.000 54.895 217.105 54.000 216.000 54.000 L 40.000 54.000 C 38.895 54.000 38.000 54.895 38.000 56.000 L 38.000 200.000 C 38.000 201.105 38.895 202.000 40.000 202.000 L 216.000 202.000 C 217.105 202.000 218.000 201.105 218.000 200.000 Z"),
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
        return _frameCorners!!
    }

private var _frameCorners: ImageVector? = null
