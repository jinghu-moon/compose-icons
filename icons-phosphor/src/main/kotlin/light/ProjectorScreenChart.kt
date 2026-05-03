package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ProjectorScreenChart: ImageVector
    get() {
        if (_projectorScreenChart != null) return _projectorScreenChart!!
        _projectorScreenChart = phosphorLightIcon(
            name = "ProjectorScreenChart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 90.000 144.000 L 90.000 128.000 C 90.000 124.686 92.686 122.000 96.000 122.000 C 99.314 122.000 102.000 124.686 102.000 128.000 L 102.000 144.000 C 102.000 147.314 99.314 150.000 96.000 150.000 C 92.686 150.000 90.000 147.314 90.000 144.000 ZM 128.000 150.000 C 131.314 150.000 134.000 147.314 134.000 144.000 L 134.000 120.000 C 134.000 116.686 131.314 114.000 128.000 114.000 C 124.686 114.000 122.000 116.686 122.000 120.000 L 122.000 144.000 C 122.000 147.314 124.686 150.000 128.000 150.000 ZM 160.000 150.000 C 163.314 150.000 166.000 147.314 166.000 144.000 L 166.000 112.000 C 166.000 108.686 163.314 106.000 160.000 106.000 C 156.686 106.000 154.000 108.686 154.000 112.000 L 154.000 144.000 C 154.000 147.314 156.686 150.000 160.000 150.000 ZM 214.000 78.000 L 214.000 178.000 L 224.000 178.000 C 227.314 178.000 230.000 180.686 230.000 184.000 C 230.000 187.314 227.314 190.000 224.000 190.000 L 134.000 190.000 L 134.000 210.840 C 144.564 213.835 151.302 224.159 149.791 235.035 C 148.279 245.910 138.980 254.006 128.000 254.006 C 117.020 254.006 107.721 245.910 106.209 235.035 C 104.698 224.159 111.436 213.835 122.000 210.840 L 122.000 190.000 L 32.000 190.000 C 28.686 190.000 26.000 187.314 26.000 184.000 C 26.000 180.686 28.686 178.000 32.000 178.000 L 42.000 178.000 L 42.000 78.000 L 40.000 78.000 C 32.268 78.000 26.000 71.732 26.000 64.000 L 26.000 48.000 C 26.000 40.268 32.268 34.000 40.000 34.000 L 216.000 34.000 C 223.732 34.000 230.000 40.268 230.000 48.000 L 230.000 64.000 C 230.000 71.732 223.732 78.000 216.000 78.000 ZM 128.000 222.000 C 122.477 222.000 118.000 226.477 118.000 232.000 C 118.000 237.523 122.477 242.000 128.000 242.000 C 133.523 242.000 138.000 237.523 138.000 232.000 C 138.000 226.477 133.523 222.000 128.000 222.000 ZM 40.000 66.000 L 216.000 66.000 C 217.105 66.000 218.000 65.105 218.000 64.000 L 218.000 48.000 C 218.000 46.895 217.105 46.000 216.000 46.000 L 40.000 46.000 C 38.895 46.000 38.000 46.895 38.000 48.000 L 38.000 64.000 C 38.000 65.105 38.895 66.000 40.000 66.000 ZM 202.000 78.000 L 54.000 78.000 L 54.000 178.000 L 202.000 178.000 Z"),
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
        return _projectorScreenChart!!
    }

private var _projectorScreenChart: ImageVector? = null
