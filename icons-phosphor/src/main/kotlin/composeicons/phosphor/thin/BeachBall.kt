package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BeachBall: ImageVector
    get() {
        if (_beachBall != null) return _beachBall!!
        _beachBall = phosphorThinIcon(
            name = "BeachBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM216.14 101.64C199.647 95.817 182.446 92.239 165 91 163.745 73.565 160.153 56.378 154.32 39.9c29.656 8.911 52.87 32.095 61.82 61.74ZM145 37.58c5.67 14.692 9.466 30.039 11.3 45.68C136.879 66.022 114.232 52.807 89.67 44.38 101.689 38.843 114.767 35.984 128 36c5.703 .001 11.394 .53 17 1.58ZM79.86 49.63c26.893 8.03 51.648 21.978 72.45 40.82C110.599 90.086 69.857 103.025 36 127.39 36.221 95.638 52.801 66.244 79.86 49.63ZM36.44 137C71.097 110.542 113.867 96.94 157.44 98.52c1.58 43.573-12.022 86.343-38.48 121C75.325 215.147 40.813 180.635 36.44 137ZM128.61 220c24.363-33.854 37.302-74.592 36.94-116.3 18.842 20.802 32.79 45.557 40.82 72.45C189.753 203.206 160.36 219.781 128.61 220ZM211.61 166.34C203.187 141.775 189.976 119.125 172.74 99.7c15.641 1.834 30.988 5.63 45.68 11.3 1.05 5.606 1.579 11.297 1.58 17 .016 13.233-2.843 26.311-8.38 38.33Z"),
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
        return _beachBall!!
    }

private var _beachBall: ImageVector? = null
