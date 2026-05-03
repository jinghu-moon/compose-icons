package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FunnelSimpleX: ImageVector
    get() {
        if (_funnelSimpleX != null) return _funnelSimpleX!!
        _funnelSimpleX = phosphorThinIcon(
            name = "FunnelSimpleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 192.000 140.000 L 64.000 140.000 C 61.791 140.000 60.000 138.209 60.000 136.000 C 60.000 133.791 61.791 132.000 64.000 132.000 L 192.000 132.000 C 194.209 132.000 196.000 133.791 196.000 136.000 C 196.000 138.209 194.209 140.000 192.000 140.000 ZM 232.000 84.000 L 24.000 84.000 C 21.791 84.000 20.000 85.791 20.000 88.000 C 20.000 90.209 21.791 92.000 24.000 92.000 L 232.000 92.000 C 234.209 92.000 236.000 90.209 236.000 88.000 C 236.000 85.791 234.209 84.000 232.000 84.000 ZM 128.000 180.000 L 104.000 180.000 C 101.791 180.000 100.000 181.791 100.000 184.000 C 100.000 186.209 101.791 188.000 104.000 188.000 L 128.000 188.000 C 130.209 188.000 132.000 186.209 132.000 184.000 C 132.000 181.791 130.209 180.000 128.000 180.000 ZM 218.830 173.170 C 218.080 172.419 217.062 171.997 216.000 171.997 C 214.938 171.997 213.920 172.419 213.170 173.170 L 192.000 194.340 L 170.830 173.170 C 169.267 171.607 166.733 171.607 165.170 173.170 C 163.607 174.733 163.607 177.267 165.170 178.830 L 186.340 200.000 L 165.170 221.170 C 163.607 222.733 163.607 225.267 165.170 226.830 C 166.733 228.393 169.267 228.393 170.830 226.830 L 192.000 205.660 L 213.170 226.830 C 214.733 228.393 217.267 228.393 218.830 226.830 C 220.393 225.267 220.393 222.733 218.830 221.170 L 197.660 200.000 L 218.830 178.830 C 219.581 178.080 220.003 177.062 220.003 176.000 C 220.003 174.938 219.581 173.920 218.830 173.170 Z"),
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
        return _funnelSimpleX!!
    }

private var _funnelSimpleX: ImageVector? = null
