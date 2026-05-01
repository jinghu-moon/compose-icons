package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Receipt: ImageVector
    get() {
        if (_receipt != null) return _receipt!!
        _receipt = phosphorBoldIcon(
            name = "Receipt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(68.0f, 100.0f),
                    PathNode.CurveTo(68.0f, 93.37258f, 73.37258f, 88.0f, 80.0f, 88.0f),
                    PathNode.LineTo(176.0f, 88.0f),
                    PathNode.CurveTo(182.62741f, 88.0f, 188.0f, 93.37258f, 188.0f, 100.0f),
                    PathNode.CurveTo(188.0f, 106.62742f, 182.62741f, 112.0f, 176.0f, 112.0f),
                    PathNode.LineTo(80.0f, 112.0f),
                    PathNode.CurveTo(73.37258f, 112.0f, 68.0f, 106.62742f, 68.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 152.0f),
                    PathNode.LineTo(176.0f, 152.0f),
                    PathNode.CurveTo(182.62741f, 152.0f, 188.0f, 146.62741f, 188.0f, 140.0f),
                    PathNode.CurveTo(188.0f, 133.37259f, 182.62741f, 128.0f, 176.0f, 128.0f),
                    PathNode.LineTo(80.0f, 128.0f),
                    PathNode.CurveTo(73.37258f, 128.0f, 68.0f, 133.37259f, 68.0f, 140.0f),
                    PathNode.CurveTo(68.0f, 146.62741f, 73.37258f, 152.0f, 80.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 56.0f),
                    PathNode.LineTo(236.0f, 208.0f),
                    PathNode.CurveTo(235.9995f, 212.15936f, 233.84518f, 216.02185f, 230.30653f, 218.20778f),
                    PathNode.CurveTo(226.7679f, 220.39372f, 222.34966f, 220.59131f, 218.63f, 218.73f),
                    PathNode.LineTo(192.0f, 205.42f),
                    PathNode.LineTo(165.37f, 218.73f),
                    PathNode.CurveTo(161.98979f, 220.42146f, 158.01021f, 220.42146f, 154.63f, 218.73f),
                    PathNode.LineTo(128.0f, 205.42f),
                    PathNode.LineTo(101.37f, 218.73f),
                    PathNode.CurveTo(97.98979f, 220.42146f, 94.01021f, 220.42146f, 90.63f, 218.73f),
                    PathNode.LineTo(64.0f, 205.42f),
                    PathNode.LineTo(37.37f, 218.73f),
                    PathNode.CurveTo(33.65035f, 220.59131f, 29.232105f, 220.39372f, 25.69346f, 218.20778f),
                    PathNode.CurveTo(22.154814f, 216.02185f, 20.000488f, 212.15936f, 20.0f, 208.0f),
                    PathNode.LineTo(20.0f, 56.0f),
                    PathNode.CurveTo(20.0f, 44.954304f, 28.954306f, 36.0f, 40.0f, 36.0f),
                    PathNode.LineTo(216.0f, 36.0f),
                    PathNode.CurveTo(227.0457f, 36.0f, 236.0f, 44.954304f, 236.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 60.0f),
                    PathNode.LineTo(44.0f, 60.0f),
                    PathNode.LineTo(44.0f, 188.58f),
                    PathNode.LineTo(58.63f, 181.27f),
                    PathNode.CurveTo(62.01021f, 179.57854f, 65.98979f, 179.57854f, 69.37f, 181.27f),
                    PathNode.LineTo(96.0f, 194.58f),
                    PathNode.LineTo(122.63f, 181.27f),
                    PathNode.CurveTo(126.01021f, 179.57854f, 129.98979f, 179.57854f, 133.37f, 181.27f),
                    PathNode.LineTo(160.0f, 194.58f),
                    PathNode.LineTo(186.63f, 181.27f),
                    PathNode.CurveTo(190.01021f, 179.57854f, 193.98979f, 179.57854f, 197.37f, 181.27f),
                    PathNode.LineTo(212.0f, 188.58f),
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
        return _receipt!!
    }

private var _receipt: ImageVector? = null
