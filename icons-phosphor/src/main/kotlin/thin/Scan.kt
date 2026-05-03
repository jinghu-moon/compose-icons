package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Scan: ImageVector
    get() {
        if (_scan != null) return _scan!!
        _scan = phosphorThinIcon(
            name = "Scan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.000 40.000 L 220.000 80.000 C 220.000 82.209 218.209 84.000 216.000 84.000 C 213.791 84.000 212.000 82.209 212.000 80.000 L 212.000 44.000 L 176.000 44.000 C 173.791 44.000 172.000 42.209 172.000 40.000 C 172.000 37.791 173.791 36.000 176.000 36.000 L 216.000 36.000 C 218.209 36.000 220.000 37.791 220.000 40.000 ZM 80.000 212.000 L 44.000 212.000 L 44.000 176.000 C 44.000 173.791 42.209 172.000 40.000 172.000 C 37.791 172.000 36.000 173.791 36.000 176.000 L 36.000 216.000 C 36.000 218.209 37.791 220.000 40.000 220.000 L 80.000 220.000 C 82.209 220.000 84.000 218.209 84.000 216.000 C 84.000 213.791 82.209 212.000 80.000 212.000 ZM 216.000 172.000 C 213.791 172.000 212.000 173.791 212.000 176.000 L 212.000 212.000 L 176.000 212.000 C 173.791 212.000 172.000 213.791 172.000 216.000 C 172.000 218.209 173.791 220.000 176.000 220.000 L 216.000 220.000 C 218.209 220.000 220.000 218.209 220.000 216.000 L 220.000 176.000 C 220.000 173.791 218.209 172.000 216.000 172.000 ZM 40.000 84.000 C 42.209 84.000 44.000 82.209 44.000 80.000 L 44.000 44.000 L 80.000 44.000 C 82.209 44.000 84.000 42.209 84.000 40.000 C 84.000 37.791 82.209 36.000 80.000 36.000 L 40.000 36.000 C 37.791 36.000 36.000 37.791 36.000 40.000 L 36.000 80.000 C 36.000 82.209 37.791 84.000 40.000 84.000 ZM 80.000 76.000 L 176.000 76.000 C 178.209 76.000 180.000 77.791 180.000 80.000 L 180.000 176.000 C 180.000 178.209 178.209 180.000 176.000 180.000 L 80.000 180.000 C 77.791 180.000 76.000 178.209 76.000 176.000 L 76.000 80.000 C 76.000 77.791 77.791 76.000 80.000 76.000 ZM 84.000 172.000 L 172.000 172.000 L 172.000 84.000 L 84.000 84.000 Z"),
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
        return _scan!!
    }

private var _scan: ImageVector? = null
