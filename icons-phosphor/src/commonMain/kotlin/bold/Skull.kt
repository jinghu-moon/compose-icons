package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Skull: ImageVector
    get() {
        if (_skull != null) return _skull!!
        _skull = phosphorBoldIcon(
            name = "Skull",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(116.0f, 132.0f),
                    PathNode.CurveTo(116.0f, 145.25484f, 105.25484f, 156.0f, 92.0f, 156.0f),
                    PathNode.CurveTo(78.74516f, 156.0f, 68.0f, 145.25484f, 68.0f, 132.0f),
                    PathNode.CurveTo(68.0f, 118.74516f, 78.74516f, 108.0f, 92.0f, 108.0f),
                    PathNode.CurveTo(105.25484f, 108.0f, 116.0f, 118.74516f, 116.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 108.0f),
                    PathNode.CurveTo(150.74516f, 108.0f, 140.0f, 118.74516f, 140.0f, 132.0f),
                    PathNode.CurveTo(140.0f, 145.25484f, 150.74516f, 156.0f, 164.0f, 156.0f),
                    PathNode.CurveTo(177.25484f, 156.0f, 188.0f, 145.25484f, 188.0f, 132.0f),
                    PathNode.CurveTo(188.0f, 118.74516f, 177.25484f, 108.0f, 164.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 116.0f),
                    PathNode.CurveTo(236.0f, 145.85f, 222.95f, 173.78f, 200.0f, 193.52f),
                    PathNode.LineTo(200.0f, 216.0f),
                    PathNode.CurveTo(200.0f, 227.0457f, 191.0457f, 236.0f, 180.0f, 236.0f),
                    PathNode.LineTo(76.0f, 236.0f),
                    PathNode.CurveTo(64.95431f, 236.0f, 56.0f, 227.0457f, 56.0f, 216.0f),
                    PathNode.LineTo(56.0f, 193.52f),
                    PathNode.CurveTo(33.0f, 173.78f, 20.0f, 145.85f, 20.0f, 116.0f),
                    PathNode.CurveTo(20.0f, 58.65f, 68.45f, 12.0f, 128.0f, 12.0f),
                    PathNode.CurveTo(187.55f, 12.0f, 236.0f, 58.65f, 236.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 116.0f),
                    PathNode.CurveTo(212.0f, 71.89f, 174.32f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(81.68f, 36.0f, 44.0f, 71.89f, 44.0f, 116.0f),
                    PathNode.CurveTo(44.0f, 140.31f, 55.41f, 163.0f, 75.31f, 178.3f),
                    PathNode.CurveTo(78.26785f, 180.57204f, 80.00108f, 184.09026f, 80.0f, 187.82f),
                    PathNode.LineTo(80.0f, 212.0f),
                    PathNode.LineTo(96.0f, 212.0f),
                    PathNode.LineTo(96.0f, 192.0f),
                    PathNode.CurveTo(96.0f, 185.37259f, 101.37258f, 180.0f, 108.0f, 180.0f),
                    PathNode.CurveTo(114.62742f, 180.0f, 120.0f, 185.37259f, 120.0f, 192.0f),
                    PathNode.LineTo(120.0f, 212.0f),
                    PathNode.LineTo(136.0f, 212.0f),
                    PathNode.LineTo(136.0f, 192.0f),
                    PathNode.CurveTo(136.0f, 185.37259f, 141.37259f, 180.0f, 148.0f, 180.0f),
                    PathNode.CurveTo(154.62741f, 180.0f, 160.0f, 185.37259f, 160.0f, 192.0f),
                    PathNode.LineTo(160.0f, 212.0f),
                    PathNode.LineTo(176.0f, 212.0f),
                    PathNode.LineTo(176.0f, 187.82f),
                    PathNode.CurveTo(176.00201f, 184.09377f, 177.73494f, 180.5799f, 180.69f, 178.31f),
                    PathNode.CurveTo(200.59f, 163.0f, 212.0f, 140.31f, 212.0f, 116.0f),
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
        return _skull!!
    }

private var _skull: ImageVector? = null
