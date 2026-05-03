package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AlignTop: ImageVector
    get() {
        if (_alignTop != null) return _alignTop!!
        _alignTop = phosphorThinIcon(
            name = "AlignTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.000 40.000 C 220.000 42.209 218.209 44.000 216.000 44.000 L 40.000 44.000 C 37.791 44.000 36.000 42.209 36.000 40.000 C 36.000 37.791 37.791 36.000 40.000 36.000 L 216.000 36.000 C 218.209 36.000 220.000 37.791 220.000 40.000 ZM 204.000 80.000 L 204.000 176.000 C 204.000 182.627 198.627 188.000 192.000 188.000 L 152.000 188.000 C 145.373 188.000 140.000 182.627 140.000 176.000 L 140.000 80.000 C 140.000 73.373 145.373 68.000 152.000 68.000 L 192.000 68.000 C 198.627 68.000 204.000 73.373 204.000 80.000 ZM 196.000 80.000 C 196.000 77.791 194.209 76.000 192.000 76.000 L 152.000 76.000 C 149.791 76.000 148.000 77.791 148.000 80.000 L 148.000 176.000 C 148.000 178.209 149.791 180.000 152.000 180.000 L 192.000 180.000 C 194.209 180.000 196.000 178.209 196.000 176.000 ZM 116.000 80.000 L 116.000 216.000 C 116.000 222.627 110.627 228.000 104.000 228.000 L 64.000 228.000 C 57.373 228.000 52.000 222.627 52.000 216.000 L 52.000 80.000 C 52.000 73.373 57.373 68.000 64.000 68.000 L 104.000 68.000 C 110.627 68.000 116.000 73.373 116.000 80.000 ZM 108.000 80.000 C 108.000 77.791 106.209 76.000 104.000 76.000 L 64.000 76.000 C 61.791 76.000 60.000 77.791 60.000 80.000 L 60.000 216.000 C 60.000 218.209 61.791 220.000 64.000 220.000 L 104.000 220.000 C 106.209 220.000 108.000 218.209 108.000 216.000 Z"),
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
        return _alignTop!!
    }

private var _alignTop: ImageVector? = null
