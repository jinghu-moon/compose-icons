package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bathtub: ImageVector
    get() {
        if (_bathtub != null) return _bathtub!!
        _bathtub = phosphorBoldIcon(
            name = "Bathtub",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 92.0f),
                    PathNode.LineTo(211.3f, 92.0f),
                    PathNode.CurveTo(209.60657f, 87.21018f, 205.08037f, 84.005806f, 200.0f, 84.0f),
                    PathNode.LineTo(136.0f, 84.0f),
                    PathNode.CurveTo(130.91963f, 84.005806f, 126.393456f, 87.21018f, 124.7f, 92.0f),
                    PathNode.LineTo(68.0f, 92.0f),
                    PathNode.LineTo(68.0f, 52.0f),
                    PathNode.CurveTo(68.0f, 47.581722f, 71.58172f, 44.0f, 76.0f, 44.0f),
                    PathNode.CurveTo(79.88401f, 43.997234f, 83.275856f, 46.627563f, 84.24f, 50.39f),
                    PathNode.CurveTo(85.55996f, 56.88487f, 91.895134f, 61.07996f, 98.39f, 59.76f),
                    PathNode.CurveTo(104.884865f, 58.44004f, 109.07996f, 52.10487f, 107.76f, 45.61f),
                    PathNode.CurveTo(104.394104f, 29.480465f, 89.40131f, 18.489365f, 73.00645f, 20.13245f),
                    PathNode.CurveTo(56.611588f, 21.775537f, 44.09811f, 35.523304f, 44.0f, 52.0f),
                    PathNode.LineTo(44.0f, 92.0f),
                    PathNode.LineTo(16.0f, 92.0f),
                    PathNode.CurveTo(9.372583f, 92.0f, 4.0f, 97.37258f, 4.0f, 104.0f),
                    PathNode.LineTo(4.0f, 144.0f),
                    PathNode.CurveTo(4.043069f, 175.56445f, 28.508047f, 201.7114f, 60.0f, 203.85f),
                    PathNode.LineTo(60.0f, 216.0f),
                    PathNode.CurveTo(60.0f, 222.62741f, 65.37258f, 228.0f, 72.0f, 228.0f),
                    PathNode.CurveTo(78.62742f, 228.0f, 84.0f, 222.62741f, 84.0f, 216.0f),
                    PathNode.LineTo(84.0f, 204.0f),
                    PathNode.LineTo(172.0f, 204.0f),
                    PathNode.LineTo(172.0f, 216.0f),
                    PathNode.CurveTo(172.0f, 222.62741f, 177.37259f, 228.0f, 184.0f, 228.0f),
                    PathNode.CurveTo(190.62741f, 228.0f, 196.0f, 222.62741f, 196.0f, 216.0f),
                    PathNode.LineTo(196.0f, 203.85f),
                    PathNode.CurveTo(227.49196f, 201.7114f, 251.95692f, 175.56445f, 252.0f, 144.0f),
                    PathNode.LineTo(252.0f, 104.0f),
                    PathNode.CurveTo(252.0f, 97.37258f, 246.62741f, 92.0f, 240.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 108.0f),
                    PathNode.LineTo(188.0f, 108.0f),
                    PathNode.LineTo(188.0f, 132.0f),
                    PathNode.LineTo(148.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 144.0f),
                    PathNode.CurveTo(228.0f, 163.88223f, 211.88223f, 180.0f, 192.0f, 180.0f),
                    PathNode.LineTo(64.0f, 180.0f),
                    PathNode.CurveTo(44.11775f, 180.0f, 28.0f, 163.88223f, 28.0f, 144.0f),
                    PathNode.LineTo(28.0f, 116.0f),
                    PathNode.LineTo(124.0f, 116.0f),
                    PathNode.LineTo(124.0f, 144.0f),
                    PathNode.CurveTo(124.0f, 150.62741f, 129.37259f, 156.0f, 136.0f, 156.0f),
                    PathNode.LineTo(200.0f, 156.0f),
                    PathNode.CurveTo(206.62741f, 156.0f, 212.0f, 150.62741f, 212.0f, 144.0f),
                    PathNode.LineTo(212.0f, 116.0f),
                    PathNode.LineTo(228.0f, 116.0f),
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
        return _bathtub!!
    }

private var _bathtub: ImageVector? = null
