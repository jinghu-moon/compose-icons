package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BaseballHelmet: ImageVector
    get() {
        if (_baseballHelmet != null) return _baseballHelmet!!
        _baseballHelmet = phosphorBoldIcon(
            name = "BaseballHelmet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 120.000 156.000 C 120.000 138.327 105.673 124.000 88.000 124.000 C 70.327 124.000 56.000 138.327 56.000 156.000 C 56.000 173.673 70.327 188.000 88.000 188.000 C 105.673 188.000 120.000 173.673 120.000 156.000 ZM 80.000 156.000 C 80.000 151.582 83.582 148.000 88.000 148.000 C 92.418 148.000 96.000 151.582 96.000 156.000 C 96.000 160.418 92.418 164.000 88.000 164.000 C 83.582 164.000 80.000 160.418 80.000 156.000 ZM 244.000 116.000 L 227.340 116.000 C 221.010 59.008 171.245 16.898 113.991 20.089 C 56.737 23.279 11.958 70.657 12.000 128.000 L 12.000 152.000 C 12.044 193.955 46.045 227.956 88.000 228.000 L 128.000 228.000 C 169.955 227.956 203.956 193.955 204.000 152.000 L 204.000 140.000 L 244.000 140.000 C 250.627 140.000 256.000 134.627 256.000 128.000 C 256.000 121.373 250.627 116.000 244.000 116.000 ZM 36.000 152.000 L 36.000 128.000 C 35.958 83.911 70.009 47.292 113.985 44.135 C 157.961 40.978 196.894 72.357 203.150 116.000 L 152.000 116.000 C 145.373 116.000 140.000 121.373 140.000 128.000 L 140.000 152.000 C 140.000 180.719 116.719 204.000 88.000 204.000 C 59.281 204.000 36.000 180.719 36.000 152.000 ZM 180.000 152.000 C 179.975 173.637 166.571 193.004 146.330 200.650 C 157.759 187.016 164.015 169.790 164.000 152.000 L 164.000 140.000 L 180.000 140.000 Z"),
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
        return _baseballHelmet!!
    }

private var _baseballHelmet: ImageVector? = null
