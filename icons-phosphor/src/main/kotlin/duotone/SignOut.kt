package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SignOut: ImageVector
    get() {
        if (_signOut != null) return _signOut!!
        _signOut = phosphorDuotoneIcon(
            name = "SignOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 56.000 L 224.000 200.000 C 224.000 208.837 216.837 216.000 208.000 216.000 L 48.000 216.000 L 48.000 40.000 L 208.000 40.000 C 216.837 40.000 224.000 47.163 224.000 56.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 120.000 216.000 C 120.000 220.418 116.418 224.000 112.000 224.000 L 48.000 224.000 C 43.582 224.000 40.000 220.418 40.000 216.000 L 40.000 40.000 C 40.000 35.582 43.582 32.000 48.000 32.000 L 112.000 32.000 C 116.418 32.000 120.000 35.582 120.000 40.000 C 120.000 44.418 116.418 48.000 112.000 48.000 L 56.000 48.000 L 56.000 208.000 L 112.000 208.000 C 116.418 208.000 120.000 211.582 120.000 216.000 ZM 229.660 122.340 L 189.660 82.340 C 186.534 79.214 181.466 79.214 178.340 82.340 C 175.214 85.466 175.214 90.534 178.340 93.660 L 204.690 120.000 L 112.000 120.000 C 107.582 120.000 104.000 123.582 104.000 128.000 C 104.000 132.418 107.582 136.000 112.000 136.000 L 204.690 136.000 L 178.340 162.340 C 175.214 165.466 175.214 170.534 178.340 173.660 C 181.466 176.786 186.534 176.786 189.660 173.660 L 229.660 133.660 C 231.162 132.159 232.006 130.123 232.006 128.000 C 232.006 125.877 231.162 123.841 229.660 122.340 Z"),
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
        return _signOut!!
    }

private var _signOut: ImageVector? = null
