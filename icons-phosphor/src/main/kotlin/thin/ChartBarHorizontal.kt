package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChartBarHorizontal: ImageVector
    get() {
        if (_chartBarHorizontal != null) return _chartBarHorizontal!!
        _chartBarHorizontal = phosphorThinIcon(
            name = "ChartBarHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 100.000 L 180.000 100.000 L 180.000 56.000 C 180.000 53.791 178.209 52.000 176.000 52.000 L 52.000 52.000 L 52.000 40.000 C 52.000 37.791 50.209 36.000 48.000 36.000 C 45.791 36.000 44.000 37.791 44.000 40.000 L 44.000 216.000 C 44.000 218.209 45.791 220.000 48.000 220.000 C 50.209 220.000 52.000 218.209 52.000 216.000 L 52.000 204.000 L 144.000 204.000 C 146.209 204.000 148.000 202.209 148.000 200.000 L 148.000 156.000 L 224.000 156.000 C 226.209 156.000 228.000 154.209 228.000 152.000 L 228.000 104.000 C 228.000 101.791 226.209 100.000 224.000 100.000 ZM 172.000 60.000 L 172.000 100.000 L 52.000 100.000 L 52.000 60.000 ZM 140.000 196.000 L 52.000 196.000 L 52.000 156.000 L 140.000 156.000 ZM 220.000 148.000 L 52.000 148.000 L 52.000 108.000 L 220.000 108.000 Z"),
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
        return _chartBarHorizontal!!
    }

private var _chartBarHorizontal: ImageVector? = null
