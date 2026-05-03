package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SignIn: ImageVector
    get() {
        if (_signIn != null) return _signIn!!
        _signIn = phosphorThinIcon(
            name = "SignIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 138.830 130.830 L 98.830 170.830 C 97.267 172.393 94.733 172.393 93.170 170.830 C 91.607 169.267 91.607 166.733 93.170 165.170 L 126.340 132.000 L 24.000 132.000 C 21.791 132.000 20.000 130.209 20.000 128.000 C 20.000 125.791 21.791 124.000 24.000 124.000 L 126.340 124.000 L 93.170 90.830 C 91.607 89.267 91.607 86.733 93.170 85.170 C 94.733 83.607 97.267 83.607 98.830 85.170 L 138.830 125.170 C 139.581 125.920 140.003 126.938 140.003 128.000 C 140.003 129.062 139.581 130.080 138.830 130.830 ZM 200.000 36.000 L 136.000 36.000 C 133.791 36.000 132.000 37.791 132.000 40.000 C 132.000 42.209 133.791 44.000 136.000 44.000 L 196.000 44.000 L 196.000 212.000 L 136.000 212.000 C 133.791 212.000 132.000 213.791 132.000 216.000 C 132.000 218.209 133.791 220.000 136.000 220.000 L 200.000 220.000 C 202.209 220.000 204.000 218.209 204.000 216.000 L 204.000 40.000 C 204.000 37.791 202.209 36.000 200.000 36.000 Z"),
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
        return _signIn!!
    }

private var _signIn: ImageVector? = null
