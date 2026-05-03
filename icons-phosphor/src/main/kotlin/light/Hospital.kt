package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Hospital: ImageVector
    get() {
        if (_hospital != null) return _hospital!!
        _hospital = phosphorLightIcon(
            name = "Hospital",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 248.000 210.000 L 238.000 210.000 L 238.000 128.000 C 238.000 120.268 231.732 114.000 224.000 114.000 L 166.000 114.000 L 166.000 48.000 C 166.000 40.268 159.732 34.000 152.000 34.000 L 56.000 34.000 C 48.268 34.000 42.000 40.268 42.000 48.000 L 42.000 210.000 L 32.000 210.000 C 28.686 210.000 26.000 212.686 26.000 216.000 C 26.000 219.314 28.686 222.000 32.000 222.000 L 248.000 222.000 C 251.314 222.000 254.000 219.314 254.000 216.000 C 254.000 212.686 251.314 210.000 248.000 210.000 ZM 224.000 126.000 C 225.105 126.000 226.000 126.895 226.000 128.000 L 226.000 210.000 L 166.000 210.000 L 166.000 126.000 ZM 54.000 48.000 C 54.000 46.895 54.895 46.000 56.000 46.000 L 152.000 46.000 C 153.105 46.000 154.000 46.895 154.000 48.000 L 154.000 210.000 L 134.000 210.000 L 134.000 160.000 C 134.000 156.686 131.314 154.000 128.000 154.000 L 80.000 154.000 C 76.686 154.000 74.000 156.686 74.000 160.000 L 74.000 210.000 L 54.000 210.000 ZM 122.000 210.000 L 86.000 210.000 L 86.000 166.000 L 122.000 166.000 ZM 74.000 96.000 C 74.000 92.686 76.686 90.000 80.000 90.000 L 98.000 90.000 L 98.000 72.000 C 98.000 68.686 100.686 66.000 104.000 66.000 C 107.314 66.000 110.000 68.686 110.000 72.000 L 110.000 90.000 L 128.000 90.000 C 131.314 90.000 134.000 92.686 134.000 96.000 C 134.000 99.314 131.314 102.000 128.000 102.000 L 110.000 102.000 L 110.000 120.000 C 110.000 123.314 107.314 126.000 104.000 126.000 C 100.686 126.000 98.000 123.314 98.000 120.000 L 98.000 102.000 L 80.000 102.000 C 76.686 102.000 74.000 99.314 74.000 96.000 Z"),
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
        return _hospital!!
    }

private var _hospital: ImageVector? = null
