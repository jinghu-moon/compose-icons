package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Couch: ImageVector
    get() {
        if (_couch != null) return _couch!!
        _couch = phosphorThinIcon(
            name = "Couch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.000 108.700 L 236.000 72.000 C 236.000 65.373 230.627 60.000 224.000 60.000 L 32.000 60.000 C 25.373 60.000 20.000 65.373 20.000 72.000 L 20.000 108.700 C 15.210 110.393 12.006 114.920 12.000 120.000 L 12.000 168.000 C 12.000 174.627 17.373 180.000 24.000 180.000 L 36.000 180.000 L 36.000 200.000 C 36.000 202.209 37.791 204.000 40.000 204.000 C 42.209 204.000 44.000 202.209 44.000 200.000 L 44.000 180.000 L 212.000 180.000 L 212.000 200.000 C 212.000 202.209 213.791 204.000 216.000 204.000 C 218.209 204.000 220.000 202.209 220.000 200.000 L 220.000 180.000 L 232.000 180.000 C 238.627 180.000 244.000 174.627 244.000 168.000 L 244.000 120.000 C 243.994 114.920 240.790 110.393 236.000 108.700 ZM 228.000 72.000 L 228.000 108.000 L 216.000 108.000 C 209.373 108.000 204.000 113.373 204.000 120.000 L 204.000 140.000 L 132.000 140.000 L 132.000 68.000 L 224.000 68.000 C 226.209 68.000 228.000 69.791 228.000 72.000 ZM 32.000 68.000 L 124.000 68.000 L 124.000 140.000 L 52.000 140.000 L 52.000 120.000 C 52.000 113.373 46.627 108.000 40.000 108.000 L 28.000 108.000 L 28.000 72.000 C 28.000 69.791 29.791 68.000 32.000 68.000 ZM 236.000 168.000 C 236.000 170.209 234.209 172.000 232.000 172.000 L 24.000 172.000 C 21.791 172.000 20.000 170.209 20.000 168.000 L 20.000 120.000 C 20.000 117.791 21.791 116.000 24.000 116.000 L 40.000 116.000 C 42.209 116.000 44.000 117.791 44.000 120.000 L 44.000 144.000 C 44.000 146.209 45.791 148.000 48.000 148.000 L 208.000 148.000 C 210.209 148.000 212.000 146.209 212.000 144.000 L 212.000 120.000 C 212.000 117.791 213.791 116.000 216.000 116.000 L 232.000 116.000 C 234.209 116.000 236.000 117.791 236.000 120.000 Z"),
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
        return _couch!!
    }

private var _couch: ImageVector? = null
