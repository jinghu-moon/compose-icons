package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AlignRight: ImageVector
    get() {
        if (_alignRight != null) return _alignRight!!
        _alignRight = phosphorThinIcon(
            name = "AlignRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.000 40.000 L 220.000 216.000 C 220.000 218.209 218.209 220.000 216.000 220.000 C 213.791 220.000 212.000 218.209 212.000 216.000 L 212.000 40.000 C 212.000 37.791 213.791 36.000 216.000 36.000 C 218.209 36.000 220.000 37.791 220.000 40.000 ZM 188.000 64.000 L 188.000 104.000 C 188.000 110.627 182.627 116.000 176.000 116.000 L 80.000 116.000 C 73.373 116.000 68.000 110.627 68.000 104.000 L 68.000 64.000 C 68.000 57.373 73.373 52.000 80.000 52.000 L 176.000 52.000 C 182.627 52.000 188.000 57.373 188.000 64.000 ZM 180.000 64.000 C 180.000 61.791 178.209 60.000 176.000 60.000 L 80.000 60.000 C 77.791 60.000 76.000 61.791 76.000 64.000 L 76.000 104.000 C 76.000 106.209 77.791 108.000 80.000 108.000 L 176.000 108.000 C 178.209 108.000 180.000 106.209 180.000 104.000 ZM 188.000 152.000 L 188.000 192.000 C 188.000 198.627 182.627 204.000 176.000 204.000 L 40.000 204.000 C 33.373 204.000 28.000 198.627 28.000 192.000 L 28.000 152.000 C 28.000 145.373 33.373 140.000 40.000 140.000 L 176.000 140.000 C 182.627 140.000 188.000 145.373 188.000 152.000 ZM 180.000 152.000 C 180.000 149.791 178.209 148.000 176.000 148.000 L 40.000 148.000 C 37.791 148.000 36.000 149.791 36.000 152.000 L 36.000 192.000 C 36.000 194.209 37.791 196.000 40.000 196.000 L 176.000 196.000 C 178.209 196.000 180.000 194.209 180.000 192.000 Z"),
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
        return _alignRight!!
    }

private var _alignRight: ImageVector? = null
