package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AlignLeft: ImageVector
    get() {
        if (_alignLeft != null) return _alignLeft!!
        _alignLeft = phosphorThinIcon(
            name = "AlignLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 44.000 40.000 L 44.000 216.000 C 44.000 218.209 42.209 220.000 40.000 220.000 C 37.791 220.000 36.000 218.209 36.000 216.000 L 36.000 40.000 C 36.000 37.791 37.791 36.000 40.000 36.000 C 42.209 36.000 44.000 37.791 44.000 40.000 ZM 68.000 104.000 L 68.000 64.000 C 68.000 57.373 73.373 52.000 80.000 52.000 L 176.000 52.000 C 182.627 52.000 188.000 57.373 188.000 64.000 L 188.000 104.000 C 188.000 110.627 182.627 116.000 176.000 116.000 L 80.000 116.000 C 73.373 116.000 68.000 110.627 68.000 104.000 ZM 76.000 104.000 C 76.000 106.209 77.791 108.000 80.000 108.000 L 176.000 108.000 C 178.209 108.000 180.000 106.209 180.000 104.000 L 180.000 64.000 C 180.000 61.791 178.209 60.000 176.000 60.000 L 80.000 60.000 C 77.791 60.000 76.000 61.791 76.000 64.000 ZM 228.000 152.000 L 228.000 192.000 C 228.000 198.627 222.627 204.000 216.000 204.000 L 80.000 204.000 C 73.373 204.000 68.000 198.627 68.000 192.000 L 68.000 152.000 C 68.000 145.373 73.373 140.000 80.000 140.000 L 216.000 140.000 C 222.627 140.000 228.000 145.373 228.000 152.000 ZM 220.000 152.000 C 220.000 149.791 218.209 148.000 216.000 148.000 L 80.000 148.000 C 77.791 148.000 76.000 149.791 76.000 152.000 L 76.000 192.000 C 76.000 194.209 77.791 196.000 80.000 196.000 L 216.000 196.000 C 218.209 196.000 220.000 194.209 220.000 192.000 Z"),
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
        return _alignLeft!!
    }

private var _alignLeft: ImageVector? = null
