package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Faders: ImageVector
    get() {
        if (_faders != null) return _faders!!
        _faders = phosphorBoldIcon(
            name = "Faders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(140.0f, 124.0f),
                    PathNode.LineTo(140.0f, 216.0f),
                    PathNode.CurveTo(140.0f, 222.62741f, 134.62741f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(121.37258f, 228.0f, 116.0f, 222.62741f, 116.0f, 216.0f),
                    PathNode.LineTo(116.0f, 124.0f),
                    PathNode.CurveTo(116.0f, 117.37258f, 121.37258f, 112.0f, 128.0f, 112.0f),
                    PathNode.CurveTo(134.62741f, 112.0f, 140.0f, 117.37258f, 140.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 192.0f),
                    PathNode.CurveTo(193.37259f, 192.0f, 188.0f, 197.37259f, 188.0f, 204.0f),
                    PathNode.LineTo(188.0f, 216.0f),
                    PathNode.CurveTo(188.0f, 222.62741f, 193.37259f, 228.0f, 200.0f, 228.0f),
                    PathNode.CurveTo(206.62741f, 228.0f, 212.0f, 222.62741f, 212.0f, 216.0f),
                    PathNode.LineTo(212.0f, 204.0f),
                    PathNode.CurveTo(212.0f, 197.37259f, 206.62741f, 192.0f, 200.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 152.0f),
                    PathNode.LineTo(212.0f, 152.0f),
                    PathNode.LineTo(212.0f, 40.0f),
                    PathNode.CurveTo(212.0f, 33.37258f, 206.62741f, 28.0f, 200.0f, 28.0f),
                    PathNode.CurveTo(193.37259f, 28.0f, 188.0f, 33.37258f, 188.0f, 40.0f),
                    PathNode.LineTo(188.0f, 152.0f),
                    PathNode.LineTo(176.0f, 152.0f),
                    PathNode.CurveTo(169.37259f, 152.0f, 164.0f, 157.37259f, 164.0f, 164.0f),
                    PathNode.CurveTo(164.0f, 170.62741f, 169.37259f, 176.0f, 176.0f, 176.0f),
                    PathNode.LineTo(224.0f, 176.0f),
                    PathNode.CurveTo(230.62741f, 176.0f, 236.0f, 170.62741f, 236.0f, 164.0f),
                    PathNode.CurveTo(236.0f, 157.37259f, 230.62741f, 152.0f, 224.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 160.0f),
                    PathNode.CurveTo(49.37258f, 160.0f, 44.0f, 165.37259f, 44.0f, 172.0f),
                    PathNode.LineTo(44.0f, 216.0f),
                    PathNode.CurveTo(44.0f, 222.62741f, 49.37258f, 228.0f, 56.0f, 228.0f),
                    PathNode.CurveTo(62.62742f, 228.0f, 68.0f, 222.62741f, 68.0f, 216.0f),
                    PathNode.LineTo(68.0f, 172.0f),
                    PathNode.CurveTo(68.0f, 165.37259f, 62.62742f, 160.0f, 56.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 120.0f),
                    PathNode.LineTo(68.0f, 120.0f),
                    PathNode.LineTo(68.0f, 40.0f),
                    PathNode.CurveTo(68.0f, 33.37258f, 62.62742f, 28.0f, 56.0f, 28.0f),
                    PathNode.CurveTo(49.37258f, 28.0f, 44.0f, 33.37258f, 44.0f, 40.0f),
                    PathNode.LineTo(44.0f, 120.0f),
                    PathNode.LineTo(32.0f, 120.0f),
                    PathNode.CurveTo(25.372583f, 120.0f, 20.0f, 125.37258f, 20.0f, 132.0f),
                    PathNode.CurveTo(20.0f, 138.62741f, 25.372583f, 144.0f, 32.0f, 144.0f),
                    PathNode.LineTo(80.0f, 144.0f),
                    PathNode.CurveTo(86.62742f, 144.0f, 92.0f, 138.62741f, 92.0f, 132.0f),
                    PathNode.CurveTo(92.0f, 125.37258f, 86.62742f, 120.0f, 80.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 72.0f),
                    PathNode.LineTo(140.0f, 72.0f),
                    PathNode.LineTo(140.0f, 40.0f),
                    PathNode.CurveTo(140.0f, 33.37258f, 134.62741f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(121.37258f, 28.0f, 116.0f, 33.37258f, 116.0f, 40.0f),
                    PathNode.LineTo(116.0f, 72.0f),
                    PathNode.LineTo(104.0f, 72.0f),
                    PathNode.CurveTo(97.37258f, 72.0f, 92.0f, 77.37258f, 92.0f, 84.0f),
                    PathNode.CurveTo(92.0f, 90.62742f, 97.37258f, 96.0f, 104.0f, 96.0f),
                    PathNode.LineTo(152.0f, 96.0f),
                    PathNode.CurveTo(158.62741f, 96.0f, 164.0f, 90.62742f, 164.0f, 84.0f),
                    PathNode.CurveTo(164.0f, 77.37258f, 158.62741f, 72.0f, 152.0f, 72.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _faders!!
    }

private var _faders: ImageVector? = null
