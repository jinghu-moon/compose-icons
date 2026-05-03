package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CubeFocus: ImageVector
    get() {
        if (_cubeFocus != null) return _cubeFocus!!
        _cubeFocus = phosphorBoldIcon(
            name = "CubeFocus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.000 48.000 L 236.000 88.000 C 236.000 94.627 230.627 100.000 224.000 100.000 C 217.373 100.000 212.000 94.627 212.000 88.000 L 212.000 60.000 L 184.000 60.000 C 177.373 60.000 172.000 54.627 172.000 48.000 C 172.000 41.373 177.373 36.000 184.000 36.000 L 224.000 36.000 C 230.627 36.000 236.000 41.373 236.000 48.000 ZM 72.000 196.000 L 44.000 196.000 L 44.000 168.000 C 44.000 161.373 38.627 156.000 32.000 156.000 C 25.373 156.000 20.000 161.373 20.000 168.000 L 20.000 208.000 C 20.000 214.627 25.373 220.000 32.000 220.000 L 72.000 220.000 C 78.627 220.000 84.000 214.627 84.000 208.000 C 84.000 201.373 78.627 196.000 72.000 196.000 ZM 224.000 156.000 C 217.373 156.000 212.000 161.373 212.000 168.000 L 212.000 196.000 L 184.000 196.000 C 177.373 196.000 172.000 201.373 172.000 208.000 C 172.000 214.627 177.373 220.000 184.000 220.000 L 224.000 220.000 C 230.627 220.000 236.000 214.627 236.000 208.000 L 236.000 168.000 C 236.000 161.373 230.627 156.000 224.000 156.000 ZM 32.000 100.000 C 38.627 100.000 44.000 94.627 44.000 88.000 L 44.000 60.000 L 72.000 60.000 C 78.627 60.000 84.000 54.627 84.000 48.000 C 84.000 41.373 78.627 36.000 72.000 36.000 L 32.000 36.000 C 25.373 36.000 20.000 41.373 20.000 48.000 L 20.000 88.000 C 20.000 94.627 25.373 100.000 32.000 100.000 ZM 190.000 170.420 L 134.000 202.420 C 130.313 204.525 125.787 204.525 122.100 202.420 L 66.100 170.420 C 62.340 168.297 60.011 164.318 60.000 160.000 L 60.000 96.000 C 59.990 91.703 62.279 87.729 66.000 85.580 L 122.000 53.580 C 125.687 51.475 130.213 51.475 133.900 53.580 L 189.900 85.580 C 193.660 87.703 195.989 91.682 196.000 96.000 L 196.000 160.000 C 196.010 164.297 193.721 168.271 190.000 170.420 ZM 96.190 96.000 L 128.000 114.180 L 159.810 96.000 L 128.000 77.820 ZM 84.000 153.000 L 116.000 171.280 L 116.000 135.000 L 84.000 116.680 ZM 172.000 153.000 L 172.000 116.680 L 140.000 135.000 L 140.000 171.360 Z"),
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
        return _cubeFocus!!
    }

private var _cubeFocus: ImageVector? = null
