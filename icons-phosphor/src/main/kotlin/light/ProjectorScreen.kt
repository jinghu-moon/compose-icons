package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ProjectorScreen: ImageVector
    get() {
        if (_projectorScreen != null) return _projectorScreen!!
        _projectorScreen = phosphorLightIcon(
            name = "ProjectorScreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 78.000 C 223.732 78.000 230.000 71.732 230.000 64.000 L 230.000 48.000 C 230.000 40.268 223.732 34.000 216.000 34.000 L 40.000 34.000 C 32.268 34.000 26.000 40.268 26.000 48.000 L 26.000 64.000 C 26.000 71.732 32.268 78.000 40.000 78.000 L 42.000 78.000 L 42.000 178.000 L 32.000 178.000 C 28.686 178.000 26.000 180.686 26.000 184.000 C 26.000 187.314 28.686 190.000 32.000 190.000 L 122.000 190.000 L 122.000 210.840 C 111.436 213.835 104.698 224.159 106.209 235.035 C 107.721 245.910 117.020 254.006 128.000 254.006 C 138.980 254.006 148.279 245.910 149.791 235.035 C 151.302 224.159 144.564 213.835 134.000 210.840 L 134.000 190.000 L 224.000 190.000 C 227.314 190.000 230.000 187.314 230.000 184.000 C 230.000 180.686 227.314 178.000 224.000 178.000 L 214.000 178.000 L 214.000 78.000 ZM 138.000 232.000 C 138.000 237.523 133.523 242.000 128.000 242.000 C 122.477 242.000 118.000 237.523 118.000 232.000 C 118.000 226.477 122.477 222.000 128.000 222.000 C 133.523 222.000 138.000 226.477 138.000 232.000 ZM 38.000 64.000 L 38.000 48.000 C 38.000 46.895 38.895 46.000 40.000 46.000 L 216.000 46.000 C 217.105 46.000 218.000 46.895 218.000 48.000 L 218.000 64.000 C 218.000 65.105 217.105 66.000 216.000 66.000 L 40.000 66.000 C 38.895 66.000 38.000 65.105 38.000 64.000 ZM 202.000 178.000 L 54.000 178.000 L 54.000 78.000 L 202.000 78.000 Z"),
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
        return _projectorScreen!!
    }

private var _projectorScreen: ImageVector? = null
