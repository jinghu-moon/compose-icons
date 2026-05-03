package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SignIn: ImageVector
    get() {
        if (_signIn != null) return _signIn!!
        _signIn = phosphorBoldIcon(
            name = "SignIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 144.490 136.490 L 104.490 176.490 C 99.796 181.184 92.184 181.184 87.490 176.490 C 82.796 171.796 82.796 164.184 87.490 159.490 L 107.000 140.000 L 24.000 140.000 C 17.373 140.000 12.000 134.627 12.000 128.000 C 12.000 121.373 17.373 116.000 24.000 116.000 L 107.000 116.000 L 87.510 96.490 C 82.816 91.796 82.816 84.184 87.510 79.490 C 92.204 74.796 99.816 74.796 104.510 79.490 L 144.510 119.490 C 146.767 121.744 148.033 124.804 148.029 127.994 C 148.026 131.184 146.752 134.241 144.490 136.490 ZM 200.000 28.000 L 136.000 28.000 C 129.373 28.000 124.000 33.373 124.000 40.000 C 124.000 46.627 129.373 52.000 136.000 52.000 L 188.000 52.000 L 188.000 204.000 L 136.000 204.000 C 129.373 204.000 124.000 209.373 124.000 216.000 C 124.000 222.627 129.373 228.000 136.000 228.000 L 200.000 228.000 C 206.627 228.000 212.000 222.627 212.000 216.000 L 212.000 40.000 C 212.000 33.373 206.627 28.000 200.000 28.000 Z"),
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
        return _signIn!!
    }

private var _signIn: ImageVector? = null
