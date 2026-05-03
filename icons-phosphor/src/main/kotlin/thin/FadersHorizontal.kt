package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FadersHorizontal: ImageVector
    get() {
        if (_fadersHorizontal != null) return _fadersHorizontal!!
        _fadersHorizontal = phosphorThinIcon(
            name = "FadersHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 180.000 80.000 C 180.000 77.791 181.791 76.000 184.000 76.000 L 216.000 76.000 C 218.209 76.000 220.000 77.791 220.000 80.000 C 220.000 82.209 218.209 84.000 216.000 84.000 L 184.000 84.000 C 181.791 84.000 180.000 82.209 180.000 80.000 ZM 40.000 84.000 L 148.000 84.000 L 148.000 104.000 C 148.000 106.209 149.791 108.000 152.000 108.000 C 154.209 108.000 156.000 106.209 156.000 104.000 L 156.000 56.000 C 156.000 53.791 154.209 52.000 152.000 52.000 C 149.791 52.000 148.000 53.791 148.000 56.000 L 148.000 76.000 L 40.000 76.000 C 37.791 76.000 36.000 77.791 36.000 80.000 C 36.000 82.209 37.791 84.000 40.000 84.000 ZM 216.000 172.000 L 120.000 172.000 C 117.791 172.000 116.000 173.791 116.000 176.000 C 116.000 178.209 117.791 180.000 120.000 180.000 L 216.000 180.000 C 218.209 180.000 220.000 178.209 220.000 176.000 C 220.000 173.791 218.209 172.000 216.000 172.000 ZM 88.000 148.000 C 85.791 148.000 84.000 149.791 84.000 152.000 L 84.000 172.000 L 40.000 172.000 C 37.791 172.000 36.000 173.791 36.000 176.000 C 36.000 178.209 37.791 180.000 40.000 180.000 L 84.000 180.000 L 84.000 200.000 C 84.000 202.209 85.791 204.000 88.000 204.000 C 90.209 204.000 92.000 202.209 92.000 200.000 L 92.000 152.000 C 92.000 149.791 90.209 148.000 88.000 148.000 Z"),
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
        return _fadersHorizontal!!
    }

private var _fadersHorizontal: ImageVector? = null
