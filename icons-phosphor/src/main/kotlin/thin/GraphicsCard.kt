package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GraphicsCard: ImageVector
    get() {
        if (_graphicsCard != null) return _graphicsCard!!
        _graphicsCard = phosphorThinIcon(
            name = "GraphicsCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 52.000 L 16.000 52.000 C 13.791 52.000 12.000 53.791 12.000 56.000 L 12.000 208.000 C 12.000 210.209 13.791 212.000 16.000 212.000 C 18.209 212.000 20.000 210.209 20.000 208.000 L 20.000 188.000 L 44.000 188.000 L 44.000 208.000 C 44.000 210.209 45.791 212.000 48.000 212.000 C 50.209 212.000 52.000 210.209 52.000 208.000 L 52.000 188.000 L 76.000 188.000 L 76.000 208.000 C 76.000 210.209 77.791 212.000 80.000 212.000 C 82.209 212.000 84.000 210.209 84.000 208.000 L 84.000 188.000 L 108.000 188.000 L 108.000 208.000 C 108.000 210.209 109.791 212.000 112.000 212.000 C 114.209 212.000 116.000 210.209 116.000 208.000 L 116.000 188.000 L 232.000 188.000 C 238.627 188.000 244.000 182.627 244.000 176.000 L 244.000 64.000 C 244.000 57.373 238.627 52.000 232.000 52.000 ZM 236.000 176.000 C 236.000 178.209 234.209 180.000 232.000 180.000 L 20.000 180.000 L 20.000 60.000 L 232.000 60.000 C 234.209 60.000 236.000 61.791 236.000 64.000 ZM 176.000 84.000 C 156.118 84.000 140.000 100.118 140.000 120.000 C 140.000 139.882 156.118 156.000 176.000 156.000 C 195.882 156.000 212.000 139.882 212.000 120.000 C 212.000 100.118 195.882 84.000 176.000 84.000 ZM 148.000 120.000 C 147.995 113.956 149.953 108.075 153.580 103.240 L 192.760 142.420 C 184.273 148.762 172.933 149.770 163.460 145.025 C 153.987 140.280 148.004 130.595 148.000 120.000 ZM 198.420 136.760 L 159.240 97.580 C 170.387 89.281 185.933 90.414 195.760 100.240 C 205.586 110.067 206.719 125.613 198.420 136.760 ZM 80.000 84.000 C 60.118 84.000 44.000 100.118 44.000 120.000 C 44.000 139.882 60.118 156.000 80.000 156.000 C 99.882 156.000 116.000 139.882 116.000 120.000 C 116.000 100.118 99.882 84.000 80.000 84.000 ZM 52.000 120.000 C 51.995 113.956 53.953 108.075 57.580 103.240 L 96.760 142.420 C 88.273 148.762 76.933 149.770 67.460 145.025 C 57.987 140.280 52.004 130.595 52.000 120.000 ZM 102.420 136.760 L 63.240 97.580 C 74.387 89.281 89.933 90.414 99.760 100.240 C 109.586 110.067 110.719 125.613 102.420 136.760 Z"),
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
        return _graphicsCard!!
    }

private var _graphicsCard: ImageVector? = null
