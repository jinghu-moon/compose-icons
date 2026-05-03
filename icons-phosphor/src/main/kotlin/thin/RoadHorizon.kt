package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.RoadHorizon: ImageVector
    get() {
        if (_roadHorizon != null) return _roadHorizon!!
        _roadHorizon = phosphorThinIcon(
            name = "RoadHorizon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 235.490 190.000 C 236.011 190.925 236.142 192.020 235.855 193.042 C 235.568 194.064 234.886 194.931 233.960 195.450 C 233.348 195.789 232.659 195.965 231.960 195.960 C 230.522 195.969 229.189 195.206 228.470 193.960 L 157.660 68.000 L 132.000 68.000 L 132.000 80.000 C 132.000 82.209 130.209 84.000 128.000 84.000 C 125.791 84.000 124.000 82.209 124.000 80.000 L 124.000 68.000 L 98.340 68.000 L 27.490 194.000 C 26.771 195.246 25.438 196.009 24.000 196.000 C 23.301 196.005 22.612 195.829 22.000 195.490 C 21.070 194.964 20.389 194.087 20.109 193.056 C 19.829 192.025 19.973 190.924 20.510 190.000 L 89.160 68.000 L 24.000 68.000 C 21.791 68.000 20.000 66.209 20.000 64.000 C 20.000 61.791 21.791 60.000 24.000 60.000 L 232.000 60.000 C 234.209 60.000 236.000 61.791 236.000 64.000 C 236.000 66.209 234.209 68.000 232.000 68.000 L 166.840 68.000 ZM 128.000 116.000 C 125.791 116.000 124.000 117.791 124.000 120.000 L 124.000 136.000 C 124.000 138.209 125.791 140.000 128.000 140.000 C 130.209 140.000 132.000 138.209 132.000 136.000 L 132.000 120.000 C 132.000 117.791 130.209 116.000 128.000 116.000 ZM 128.000 172.000 C 125.791 172.000 124.000 173.791 124.000 176.000 L 124.000 192.000 C 124.000 194.209 125.791 196.000 128.000 196.000 C 130.209 196.000 132.000 194.209 132.000 192.000 L 132.000 176.000 C 132.000 173.791 130.209 172.000 128.000 172.000 Z"),
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
        return _roadHorizon!!
    }

private var _roadHorizon: ImageVector? = null
