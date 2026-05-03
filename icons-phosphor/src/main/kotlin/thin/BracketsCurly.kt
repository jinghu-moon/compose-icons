package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BracketsCurly: ImageVector
    get() {
        if (_bracketsCurly != null) return _bracketsCurly!!
        _bracketsCurly = phosphorThinIcon(
            name = "BracketsCurly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 35.890 128.000 C 52.000 136.230 52.000 155.640 52.000 172.000 C 52.000 196.800 53.350 212.000 80.000 212.000 C 82.209 212.000 84.000 213.791 84.000 216.000 C 84.000 218.209 82.209 220.000 80.000 220.000 C 44.000 220.000 44.000 193.390 44.000 172.000 C 44.000 147.200 42.650 132.000 16.000 132.000 C 13.791 132.000 12.000 130.209 12.000 128.000 C 12.000 125.791 13.791 124.000 16.000 124.000 C 42.650 124.000 44.000 108.800 44.000 84.000 C 44.000 62.610 44.000 36.000 80.000 36.000 C 82.209 36.000 84.000 37.791 84.000 40.000 C 84.000 42.209 82.209 44.000 80.000 44.000 C 53.350 44.000 52.000 59.200 52.000 84.000 C 52.000 100.360 52.000 119.770 35.890 128.000 ZM 240.000 124.000 C 213.350 124.000 212.000 108.800 212.000 84.000 C 212.000 62.610 212.000 36.000 176.000 36.000 C 173.791 36.000 172.000 37.791 172.000 40.000 C 172.000 42.209 173.791 44.000 176.000 44.000 C 202.650 44.000 204.000 59.200 204.000 84.000 C 204.000 100.360 204.000 119.770 220.110 128.000 C 204.000 136.230 204.000 155.640 204.000 172.000 C 204.000 196.800 202.650 212.000 176.000 212.000 C 173.791 212.000 172.000 213.791 172.000 216.000 C 172.000 218.209 173.791 220.000 176.000 220.000 C 212.000 220.000 212.000 193.390 212.000 172.000 C 212.000 147.200 213.350 132.000 240.000 132.000 C 242.209 132.000 244.000 130.209 244.000 128.000 C 244.000 125.791 242.209 124.000 240.000 124.000 Z"),
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
        return _bracketsCurly!!
    }

private var _bracketsCurly: ImageVector? = null
