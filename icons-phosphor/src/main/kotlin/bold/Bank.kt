package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bank: ImageVector
    get() {
        if (_bank != null) return _bank!!
        _bank = phosphorBoldIcon(
            name = "Bank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(24.0f, 108.0f),
                    PathNode.LineTo(44.0f, 108.0f),
                    PathNode.LineTo(44.0f, 156.0f),
                    PathNode.LineTo(32.0f, 156.0f),
                    PathNode.CurveTo(25.372583f, 156.0f, 20.0f, 161.37259f, 20.0f, 168.0f),
                    PathNode.CurveTo(20.0f, 174.62741f, 25.372583f, 180.0f, 32.0f, 180.0f),
                    PathNode.LineTo(224.0f, 180.0f),
                    PathNode.CurveTo(230.62741f, 180.0f, 236.0f, 174.62741f, 236.0f, 168.0f),
                    PathNode.CurveTo(236.0f, 161.37259f, 230.62741f, 156.0f, 224.0f, 156.0f),
                    PathNode.LineTo(212.0f, 156.0f),
                    PathNode.LineTo(212.0f, 108.0f),
                    PathNode.LineTo(232.0f, 108.0f),
                    PathNode.CurveTo(237.36899f, 108.00044f, 242.0849f, 104.434494f, 243.54729f, 99.2685f),
                    PathNode.CurveTo(245.00966f, 94.10252f, 242.86258f, 88.593796f, 238.29f, 85.78f),
                    PathNode.LineTo(134.29f, 21.78f),
                    PathNode.CurveTo(130.43271f, 19.405851f, 125.56729f, 19.405851f, 121.71f, 21.78f),
                    PathNode.LineTo(17.71f, 85.78f),
                    PathNode.CurveTo(13.137416f, 88.593796f, 10.990335f, 94.10252f, 12.452714f, 99.2685f),
                    PathNode.CurveTo(13.915092f, 104.434494f, 18.631016f, 108.00044f, 24.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 108.0f),
                    PathNode.LineTo(92.0f, 108.0f),
                    PathNode.LineTo(92.0f, 156.0f),
                    PathNode.LineTo(68.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 108.0f),
                    PathNode.LineTo(140.0f, 156.0f),
                    PathNode.LineTo(116.0f, 156.0f),
                    PathNode.LineTo(116.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 156.0f),
                    PathNode.LineTo(164.0f, 156.0f),
                    PathNode.LineTo(164.0f, 108.0f),
                    PathNode.LineTo(188.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 46.09f),
                    PathNode.LineTo(189.6f, 84.0f),
                    PathNode.LineTo(66.4f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(252.0f, 208.0f),
                    PathNode.CurveTo(252.0f, 214.62741f, 246.62741f, 220.0f, 240.0f, 220.0f),
                    PathNode.LineTo(16.0f, 220.0f),
                    PathNode.CurveTo(9.372583f, 220.0f, 4.0f, 214.62741f, 4.0f, 208.0f),
                    PathNode.CurveTo(4.0f, 201.37259f, 9.372583f, 196.0f, 16.0f, 196.0f),
                    PathNode.LineTo(240.0f, 196.0f),
                    PathNode.CurveTo(246.62741f, 196.0f, 252.0f, 201.37259f, 252.0f, 208.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bank!!
    }

private var _bank: ImageVector? = null
